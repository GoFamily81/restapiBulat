package com.example.restapi.user;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Аннотация @AllArgsConstructor заменяет конструктор со всеми полями класса
@NoArgsConstructor
@Data
@Entity
@Table(name = "cards")
//Создание публичного класса User
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //Создание приватного поля cardNumber с типом данных String
    private String cardNumber;

    //Создание приватного поля cardUsername с типом данных String
    private String cardUsername;

    //Создание приватного поля cardSurname с типом данных String
    private String cardSurname;

    //Создание приватного поля bankName с типом данных String
    private String bankName;
}
