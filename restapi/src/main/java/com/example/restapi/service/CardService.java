package com.example.restapi.service;

import com.example.restapi.user.Card;

import java.util.List;

public interface CardService {
    Card addCard(Card card);

    String putCard();

    Card getCard(Integer id);

    String deleteCard(Integer id);

    public List<Card> addCardToList();
}
