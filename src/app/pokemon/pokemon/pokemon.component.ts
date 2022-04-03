import { Pok } from './../model/pok';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.scss']
})

export class PokemonComponent implements OnInit {

  pok: Pok[] = [];

  constructor() {
    // this.pok = [];
   }

    ngOnInit(): void{

    }

  }
