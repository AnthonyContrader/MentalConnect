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
  mind : MindElixir;

  constructor(private service: MapService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    
    this.route
    .queryParams
    .subscribe(params => {
      this.idMap = +params['idMap'] || 1;
    });

    this.read(this.idMap);
    
  }

  save() {
    this.map.elixirmap = this.mind.getAllDataString();
    this.service.update(this.map).subscribe(_ => console.log("Map saved") );
  }

  read(idMap: number) {
    this.service.read(idMap).subscribe(map => {
      this.map = map

      console.log(this.map.elixirmap);

      this.mind  = new MindElixir({
        el: '#map',
        direction: MindElixir.SIDE,
        data: JSON.parse(this.map.elixirmap),
        draggable: true, 
        contextMenu: true, 
        toolBar: true, 
        nodeMenu: true, 
        keypress: true,
      })

      this.mind.init()

      this.mind.bus.addListener('operation', operation => {
         this.save();
        
      });

    });
  }


}
