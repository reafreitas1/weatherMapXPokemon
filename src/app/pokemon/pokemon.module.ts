import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';

import { PokemonRoutingModule } from './pokemon-routing.module';
import { PokemonComponent } from './pokemon/pokemon.component';


@NgModule({
  declarations: [
    PokemonComponent,
  ],
  imports: [
    CommonModule,
    PokemonRoutingModule,
    MatInputModule,
    MatCardModule
  ]
})
export class PokemonModule { }
