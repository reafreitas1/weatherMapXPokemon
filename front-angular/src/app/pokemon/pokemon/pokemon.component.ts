import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { Pok } from '../model/pok';
import { PokemonService } from '../services/pokemon.service';



@Component({
  selector: 'app-pokemon',
  templateUrl: './pokemon.component.html',
  styleUrls: ['./pokemon.component.scss']
})

export class PokemonComponent implements OnInit {


  items: Observable<Pok[]>;

  constructor(private pokemonService: PokemonService) {
    this.items = this.pokemonService.list()
    console.log(this.items)
  }


  ngOnInit(): void {

  }

}
