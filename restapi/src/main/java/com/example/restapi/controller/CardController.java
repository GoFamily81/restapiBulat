package com.example.restapi.controller;

import com.example.restapi.service.CardService;
import com.example.restapi.service.impl.CardServiceImpl;
import com.example.restapi.user.Card;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping("/getcard/{id}")
    public Card getCard(@PathVariable Integer id) {
        cardService.addCardToList();
        return cardService.getCard(id);
    }
}
