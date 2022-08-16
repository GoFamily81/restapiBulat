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

//Создание публичного класса User
public class User {
    //Создание приватного поля id с типом данных Integer
    private Integer id;

    //Создание приватного поля name с типом данных String
    private String name;

    //Создание приватного поля surname с типом данных String
    private String surname;

    //Создание приватного поля card с типом данных Card
    private Card card;
}
