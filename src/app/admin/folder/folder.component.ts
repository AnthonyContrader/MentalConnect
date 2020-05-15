import { Component, OnInit } from '@angular/core';
import { FolderService } from 'src/service/folder.service';
import { FolderDTO } from 'src/dto/folderdto';
import { UserDTO } from 'src/dto/userdto';


@Component({
  selector: 'app-folder',
  templateUrl: './folder.component.html',
  styleUrls: ['./folder.component.css']
})
export class FolderComponent implements OnInit {

  folders: FolderDTO[];
  user: UserDTO;
  foldertoinsert: FolderDTO = new FolderDTO(0,0,"" );

  constructor(private service: FolderService) { }

  ngOnInit() {
    
    this.user = <UserDTO> JSON.parse(localStorage.getItem('currentUser'));

    this.getAllBy();
  }

  getFolders() {
    this.service.getAll().subscribe(folders => this.folders = folders);
  }

  getAllBy(){
    this.service.getAllBy().subscribe(folders => this.folders = folders);
  }

  delete(folder: FolderDTO) {
    this.service.delete(folder.idFolder).subscribe(() => this.getAllBy());
  }

  update(folder: FolderDTO) {
    this.service.update(folder).subscribe(() => this.getAllBy());
  }

  insert(folder: FolderDTO) {
    folder.idUser = this.user.id;
    this.service.insert(folder).subscribe(() => this.getAllBy());
  }

  clear(){
    this.foldertoinsert = new FolderDTO(0,0,"");
  }

}
