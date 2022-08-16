package com.example.restapi.service.impl;



import com.example.restapi.service.CardService;
import com.example.restapi.user.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    //Создание листа карт

    public static List<Card> cardList = new ArrayList<Card>();

    //Создание экземпляра класса Card Алексей Алексеев и заполнение конструктора
    public Card cardAlexey = new Card("4420 2200 4578 3486",
            "Алексей",
            "Алексеев",
            "Tinkoff");
    public Card cardEduard = new Card("4587 3422 5678 2200",
            "Эдуард",
            "Хусаинов",
            "Tinkoff");


    @Override
    public Card addCard(Card card) {
        return null;
    }

    @Override
    public String putCard() {
        return null;
    }

    @Override
    public Card getCard(Integer id) {
        return cardList.get(id);
    }

    @Override
    public String deleteCard(Integer id) {
        return null;
    }

    @Override
    public List<Card> addCardToList(){
        cardList.add(0,cardAlexey);
        cardList.add(1,cardEduard);
        return cardList;
    }

}
