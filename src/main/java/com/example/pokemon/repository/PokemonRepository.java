package com.example.pokemon.repository;

import com.example.pokemon.model.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<Pokemon, Integer>{

}
