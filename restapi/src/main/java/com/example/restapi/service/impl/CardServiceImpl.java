package com.example.restapi.service.impl;


import com.example.restapi.repository.CardRepository;
import com.example.restapi.service.CardService;
import com.example.restapi.user.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public Card addCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card putCard(Integer id,Card card) {
        card.setId(id);
        cardRepository.save(card);
        return getCard(id) ;
    }

    @Override
    public Card getCard(Integer id) {
        return cardRepository.getById(id);
    }

    @Override
    public String deleteCard(Integer id) {
        cardRepository.deleteById(id);
        return "Card has been deleted with id " + id;
    }

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

}
