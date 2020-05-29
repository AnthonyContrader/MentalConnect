import { Component, OnInit } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { IUtente, Utente } from 'app/shared/model/microserviziapp/utente.model';
import { UtenteService } from './utente.service';

@Component({
  selector: 'jhi-utente-update',
  templateUrl: './utente-update.component.html',
})
export class UtenteUpdateComponent implements OnInit {
  isSaving = false;

  editForm = this.fb.group({
    id: [],
    username: [null, [Validators.required]],
    password: [null, [Validators.required]],
    usertype: [],
  });

  constructor(protected utenteService: UtenteService, protected activatedRoute: ActivatedRoute, private fb: FormBuilder) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ utente }) => {
      this.updateForm(utente);
    });
  }

  updateForm(utente: IUtente): void {
    this.editForm.patchValue({
      id: utente.id,
      username: utente.username,
      password: utente.password,
      usertype: utente.usertype,
    });
  }

  previousState(): void {
    window.history.back();
  }

  save(): void {
    this.isSaving = true;
    const utente = this.createFromForm();
    if (utente.id !== undefined) {
      this.subscribeToSaveResponse(this.utenteService.update(utente));
    } else {
      this.subscribeToSaveResponse(this.utenteService.create(utente));
    }
  }

  private createFromForm(): IUtente {
    return {
      ...new Utente(),
      id: this.editForm.get(['id'])!.value,
      username: this.editForm.get(['username'])!.value,
      password: this.editForm.get(['password'])!.value,
      usertype: this.editForm.get(['usertype'])!.value,
    };
  }

  protected subscribeToSaveResponse(result: Observable<HttpResponse<IUtente>>): void {
    result.subscribe(
      () => this.onSaveSuccess(),
      () => this.onSaveError()
    );
  }

  protected onSaveSuccess(): void {
    this.isSaving = false;
    this.previousState();
  }

  protected onSaveError(): void {
    this.isSaving = false;
  }
}
