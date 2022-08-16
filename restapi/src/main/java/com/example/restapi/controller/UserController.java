package com.example.restapi.controller;

import com.example.restapi.service.UserService;
import com.example.restapi.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RestController возвращает объект, а данные объекта напрямую записываются в HTTP-ответ в виде JSON или XML.
@RestController
//@RequestMapping аннотация, которая отображает http-запрос /user
@RequestMapping("/user")

//Создание класса UserController
public class UserController {
    //Создаем экземпляр бина UserService c помощью аннотации @Autowired
    @Autowired
    UserService userService;

    //Создаем http-запрос GET, в котором переменной {id} присваевается значение и передается в метод
    @GetMapping("/{id}")
    //Описание метода getUserById, который возвращает переопределенный метод getUserById
    //Аннотация @PathVariable передает значение из url'ы в переменную Integer id
    public User getUserById(@PathVariable Integer id) {
        //Возврат значения переопределенного метода getUserById в классе UserServiceImpl
        return userService.getUserById(id);
    }

    //Создаем http-запрос GET, в котором переменным flow и slovo присваевается значение из url-адреса в виде:
    // localhost:8080/user/book/?flow=5555&slovo=книг
    //аннотация @RequestParam дает возможность взять несколько параметров из url запроса и поместить в метод
    @GetMapping("/book/")
    public String getUserByFlow(@RequestParam("flow") String flow, @RequestParam("slovo") String slovo) {
        //Возврат значения переопределенного метода getUserByFlow в классе UserServiceImpl
        return userService.getUserByFlow(flow, slovo);
    }

    //Создаем http-запрос POST, который отправляет тело запроса
    @PostMapping("/post")
    //Описываем метод addUser, в который с помощью аннотации @RequestBody помещается объект user c типом данных User
    public User addUser(@RequestBody User user) {
        //Возврат метода переопределенного метода addUser в , в который передается объект user
        return userService.addUser(user);
    }

    //Создаем http-запрос DELETE
    //С помощью аннотации @PathVariable переменной id присваивается значение http-запроса
    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable String id) {
        //Возврат переопределенного метода deleteUserById, описанного в классе UserServiceImpl,
        // в который присваивается значение переменной id
        return userService.deleteUserById(id);
    }

    //Создаем http-запрос PUT
    @PutMapping("/put")
    //Описание метода putUser
    public String putUser() {
        //Возврат переопределенного метода putUser в классе UserServiceImpl
        return userService.putUser();
    }


}
