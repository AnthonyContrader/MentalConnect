import { Component, OnInit } from '@angular/core';
import MindElixir, { E } from 'mind-elixir'

@Component({
  selector: 'app-elixirmap',
  templateUrl: './elixirmap.component.html',
  styleUrls: ['./elixirmap.component.css']
})
export class ElixirmapComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {

    let mind = new MindElixir({
      el: '#map',
      direction: MindElixir.LEFT,
      data: MindElixir.new('new topic'),
      draggable: true, // default true
      contextMenu: true, // default true
      toolBar: true, // default true
      nodeMenu: true, // default true
      keypress: true, // default true
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

}
