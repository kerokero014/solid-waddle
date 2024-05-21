package com.example.FlashyStudy.controllers;

import com.example.FlashyStudy.Models.Card;
import com.example.FlashyStudy.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping
    public ResponseEntity<List<Card>> getAllCards() {
        return new ResponseEntity<List<Card>>(cardService.findAllCards(), HttpStatus.OK);
    }
}
