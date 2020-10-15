package com.example.pokemon.controller;

import com.example.pokemon.repository.PokemonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokemonController {

    PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository){this.pokemonRepository = pokemonRepository;}

    @GetMapping("/")
    public String index(){return "index";}

}
