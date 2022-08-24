package com.example.restapi.controller;

import com.example.restapi.service.UserService;
import com.example.restapi.user.User;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController возвращает объект, а данные объекта напрямую записываются в HTTP-ответ в виде JSON или XML.
@RestController
//@RequestMapping аннотация, которая отображает http-запрос /user
@RequestMapping("/user")
@SecurityRequirement(name = "techgeeknext-api")

//Создание класса UserController
public class UserController {
    //Создаем экземпляр бина UserService c помощью аннотации @Autowired
    @Autowired
    UserService userService;

    //Создаем http-запрос GET, в котором переменной {id} присваевается значение и передается в метод
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        //Возврат значения переопределенного метода getUserById в классе UserServiceImpl
        return userService.getUserById(id);
    }

    @PostMapping("/post")
    //Описываем метод addUser, в который с помощью аннотации @RequestBody помещается объект user c типом данных User
    public User addUser(@RequestBody User user) {
        //Возврат метода переопределенного метода addUser, в который передается объект user
        return userService.addUser(user);
    }

    //Создаем http-запрос DELETE
    //С помощью аннотации @PathVariable переменной id присваивается значение http-запроса
    @DeleteMapping("/delete/{id}")
    public String deleteUserById(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }

    //Создаем http-запрос PUT
    @PutMapping("/putuser/{id}")
    //Описание метода putUser
    public User putUser(@PathVariable Integer id, @RequestBody User user) {
        //Возврат переопределенного метода putUser в классе UserServiceImpl
        return userService.putUser(id, user);
    }

    //Создаем http-запрос GET c url-адресом /user/getallusers
    @GetMapping("/getallusers")
    //Создание метода getAllUsers с типом List<User>
    public List<User> getAllUsers() {
        //Возврат значения метода userService.getAllUsers()
        return userService.getAllUsers();
    }

}
