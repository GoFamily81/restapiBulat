package com.example.restapi.service.impl;

import com.example.restapi.service.UserService;
import com.example.restapi.user.Card;
import com.example.restapi.user.User;
import org.springframework.stereotype.Service;

//Объявление класса UserServiceImpl - Сервисом
@Service
//Создание класса UserServiceImpl, который реализует методы интерфейса UserService
public class UserServiceImpl implements UserService {

    //Создание экземпляра класса Card Алексей Алексеев и заполнение конструктора
    Card cardAlexey = new Card("4420 2200 4578 3486",
            "Алексей",
            "Алексеев",
            "Tinkoff");

    //Создание экземпляра класса User и заполнение конструктора
    User userAlexey = new User(1,
            cardAlexey.getCardUsername(),
            cardAlexey.getCardSurname(),
            cardAlexey);

    //аннотация @Override проверяет переопределен ли метод
    @Override
    //Реализация метода addUser c входящим параметром user типа User
    public User addUser(User user) {
        //Вывод на экран: User добавлен и вывод объекта с заполненными полями
        System.out.println("User добавлен " + user.toString());
        //вовзрат объекта user
        return user;
    }

    @Override
    //Реализация метода deleteUserById c входящим параметром id типа String
    public String deleteUserById(String id) {
        //Возврат строки: User was been deleted with id: cо значением входящей переменной id
        return "User was been deleted with id: " + id;
    }

    @Override
    //Реализация метода putUser без входящих параметров
    public String putUser() {
        //Возврат строки:User was changed
        return "User was changed";
    }

    @Override
    //Реализация метода getUserById с входящим параметром id типом данных Integer
    public User getUserById(Integer id) {
        //Вовзрат объекта userAlexey
        return userAlexey;
    }

    @Override
    //Реализация метода getUserByFlow с входящими параметрами flow, slovo типа данных String
    public String getUserByFlow(String flow, String slovo) {
        //Возврат строки: User was add и значений переменных flow и slovo
        return "User was add " + flow + " " + slovo;
    }
}
