import { Component, OnInit } from '@angular/core';
import { FolderService } from 'src/service/folder.service';
import { FolderDTO } from 'src/dto/folderdto';


@Component({
  selector: 'app-folder',
  templateUrl: './folder.component.html',
  styleUrls: ['./folder.component.css']
})
export class FolderComponent implements OnInit {

  folders: FolderDTO[];
  foldertoinsert: FolderDTO = new FolderDTO(0,0,"" );

  constructor(private service: FolderService) { }

  ngOnInit() {
    this.getFolders();
  }

  getFolders() {
    this.service.getAll().subscribe(folders => this.folders = folders);
  }

  getFoldersby(idUser : number){
    this.service.getAllBy(idUser).subscribe(folders => this.folders = folders);
  }

  delete(folder: FolderDTO) {
    this.service.delete(folder.idFolder).subscribe(() => this.getFolders());
  }

  update(folder: FolderDTO) {
    this.service.update(folder).subscribe(() => this.getFolders());
  }

  insert(folder: FolderDTO) {
    this.service.insert(folder).subscribe(() => this.getFolders());
  }

  clear(){
    this.foldertoinsert = new FolderDTO(0,0,"");
  }

}
