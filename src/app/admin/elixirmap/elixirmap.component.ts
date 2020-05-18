import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import MindElixir, { E } from 'mind-elixir'
import { MapService } from 'src/service/map.service';
import { MapDTO } from 'src/dto/mapdto';

@Component({
  selector: 'app-elixirmap',
  templateUrl: './elixirmap.component.html',
  styleUrls: ['./elixirmap.component.css']
})
export class ElixirmapComponent implements OnInit {

  idMap : number;
  map : MapDTO;

  constructor(private service: MapService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    
    this.route
    .queryParams
    .subscribe(params => {
      this.idMap = +params['idMap'] || 1;
    });

    this.read(this.idMap);

    let mind = new MindElixir({
      el: '#map',
      direction: MindElixir.LEFT,
      data: JSON.parse(this.map.mapName),
      draggable: true, 
      contextMenu: true, 
      toolBar: true, 
      nodeMenu: true, 
      keypress: true,
    })
    mind.init()
     
    // get a node
    E('node-id')
    
    mind.bus.addListener('operation', operation => {
      console.log(operation)
      // return {
      //   name: action name,
      //   obj: target object
      // }
     
      // name: [insertSibling|addChild|removeNode|beginEdit|finishEdit]
      // obj: target
     
      // name: moveNode
      // obj: {from:target1,to:target2}
    })
    mind.bus.addListener('selectNode', node => {
      console.log(node)
    })

  }

  read(idMap: number) {
    this.service.read(idMap).subscribe(map => this.map = map);
  }


}
