package com.example.restapi.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Аннотация @AllArgsConstructor заменяет конструктор со всеми полями класса
@AllArgsConstructor
//Аннотация @Data заменяет геттеры, сеттеры и метод toString(), а также @EqualsAndHashCode и @RequiredArgsConstructor
@Data
//Аннотация @NoArgsConstructor заменяет пустой конструктор
@NoArgsConstructor

public class Card {
    //Создание приватного поля cardNumber с типом данных String
    private String cardNumber;

    //Создание приватного поля cardUsername с типом данных String
    private String cardUsername;

    //Создание приватного поля cardSurname с типом данных String
    private String cardSurname;

    //Создание приватного поля bankName с типом данных String
    private String bankName;
}
