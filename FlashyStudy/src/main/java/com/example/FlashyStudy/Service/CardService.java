package com.example.FlashyStudy.Service;

import com.example.FlashyStudy.Models.Card;
import com.example.FlashyStudy.Repositories.CardRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRespository cardRespository;

    public List<Card> findAllCards(){
        return cardRespository.findAll();
    }
}
