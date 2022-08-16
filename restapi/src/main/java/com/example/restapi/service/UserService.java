package com.example.restapi.service;

import com.example.restapi.user.User;
//Создание интерейса UserService
public interface UserService {
    //Создание метода addUser типа User с входящим параметром user типа User
    User addUser(User user);

    //Создание метода deleteUserById типа String с входящим параметром id типа String
    String deleteUserById(String id);

    //Создание метода putUser типа String
    String putUser();

    //Создание метода getUserById типа User с входящим параметром id типа Integer
    User getUserById(Integer id);

    //Создание метода getUserByFlow типа String с входящими парматрами flow и slovo типа String
    String getUserByFlow(String flow, String slovo);
}
