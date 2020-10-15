package com.example.pokemon.controller;

import com.example.pokemon.model.Pokemon;
import com.example.pokemon.repository.PokemonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class PokemonController {

    PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository){this.pokemonRepository = pokemonRepository;}

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("pokemon",pokemonRepository.findAll());
        return "index";}

        @GetMapping("/create")
    public String create(){return "create";}

    @PostMapping("/create")
    public String addPokemon(@ModelAttribute Pokemon pokemon){
        pokemonRepository.save(new Pokemon());

    return "redirect:/";}

}
