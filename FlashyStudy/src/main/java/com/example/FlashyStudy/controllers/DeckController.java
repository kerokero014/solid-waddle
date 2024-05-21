package com.example.FlashyStudy.controllers;


import com.example.FlashyStudy.Models.Deck;
import com.example.FlashyStudy.Service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/decks")
public class DeckController {

    @Autowired
    private DeckService deckService;

    @GetMapping
    public ResponseEntity<List<Deck>> getAllDecks() {
        return new ResponseEntity<List<Deck>>(deckService.findAllDecks(), HttpStatus.OK);
    }

}
