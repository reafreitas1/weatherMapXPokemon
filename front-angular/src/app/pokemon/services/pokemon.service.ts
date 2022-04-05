import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pok } from '../model/pok';



@Injectable({
  providedIn: 'root'
})
export class PokemonService {

  private readonly API = '/assets/pokemon_J.json';

  constructor(private httpClient: HttpClient) {}

  list(){
    return this.httpClient.get<Pok[]>(this.API);
  }

}
