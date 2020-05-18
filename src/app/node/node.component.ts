import { Component, OnInit } from '@angular/core';
import { NodeService } from 'src/service/node.service';
import { NodeDTO } from 'src/dto/nodedto';
@Component({
  selector: 'app-node',
  templateUrl: './node.component.html',
  styleUrls: ['./node.component.css']
})
export class NodeComponent implements OnInit {

  nodes: NodeDTO[];
  nodetoinsert: NodeDTO = new NodeDTO(0, 0, "");

  constructor(private service: NodeService) { }

  ngOnInit() {

    this.getNodes();
  }

  getNodes() {
    this.service.getAll().subscribe(nodes => this.nodes = nodes);
  }

  getNodesByIdMap(idMap : number) {
    this.service.getAllByidMap(idMap).subscribe(nodes => this.nodes = nodes);
  }

  delete(node: NodeDTO) {
    this.service.delete(node.idNode).subscribe(() => this.getNodes());
  }

  update(node: NodeDTO) {
    this.service.update(node).subscribe(() => this.getNodes());
  }

  insert(node: NodeDTO) {
    this.service.insert(node).subscribe(() => this.getNodes());
  }

  clear(){
    this.nodetoinsert = new NodeDTO(0, 0, "");
  }

}
