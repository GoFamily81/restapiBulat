package com.example.restapi.controller;

import com.example.restapi.service.CardService;
import com.example.restapi.user.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping("/getcard/{id}")
    public Card getCard(@PathVariable Integer id) {
        cardService.getCard(id);
        return cardService.getCard(id);
    }

    @GetMapping("/getallcards")
    public List<Card> getAllCard() {
        return cardService.getAllCards();
    }
    @PostMapping("/postcard")
    public Card addCard(Card card){
        return cardService.addCard(card);
    }
    @PutMapping("/putcard/{id}")
    public Card putCardById(Integer id,Card card){
        return cardService.putCard(id,card);
    }
}
