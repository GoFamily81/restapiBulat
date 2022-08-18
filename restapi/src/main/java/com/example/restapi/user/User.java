package com.example.restapi.user;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Аннотация @AllArgsConstructor заменяет конструктор со всеми полями класса

//Аннотация @Data заменяет геттеры, сеттеры и метод toString(), а также @EqualsAndHashCode и @RequiredArgsConstructor

//Аннотация @NoArgsConstructor заменяет пустой конструктор
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
//Создание публичного класса User
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Создание приватного поля id с типом данных Integer
    private Integer id;
    @Column(name = "first_name")
    //Создание приватного поля name с типом данных String
    private String firstName;
    @Column(name = "last_name")
    //Создание приватного поля surname с типом данных String
    private String lastName;

    //Создание приватного поля card с типом данных Card

}
