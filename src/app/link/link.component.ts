import { Component, OnInit } from '@angular/core';
import { LinkService } from 'src/service/link.service';
import { LinkDTO } from 'src/dto/linkdto';

@Component({
  selector: 'app-link',
  templateUrl: './link.component.html',
  styleUrls: ['./link.component.css']
})
export class LinkComponent implements OnInit {

  links: LinkDTO[];
  linktoinsert: LinkDTO = new LinkDTO(0, "", "");

  constructor(private service: LinkService) { }

  ngOnInit() {
    this.getLinks();
  }

  getLinks() {
    this.service.getAll().subscribe(links => this.links = links);
  }

  getLinksByIdMap(idMap : number) {
    this.service.getAllByidMap(idMap).subscribe(links => this.links = links);
  }

  delete(link: LinkDTO) {
    this.service.delete(link.id).subscribe(() => this.getLinks());
  }

  update(link: LinkDTO) {
    this.service.update(link).subscribe(() => this.getLinks());
  }

  insert(link: LinkDTO) {
    this.service.insert(link).subscribe(() => this.getLinks());
  }

  clear(){
    this.linktoinsert = new LinkDTO(0, "", "");
  }

}
