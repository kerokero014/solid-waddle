package com.example.FlashyStudy.Service;

import com.example.FlashyStudy.Models.Deck;
import com.example.FlashyStudy.Repositories.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeckService {

    @Autowired
    private DeckRepository deckRepository;

    public List<Deck> findAllDecks() {
        return deckRepository.findAll();
    }

}
