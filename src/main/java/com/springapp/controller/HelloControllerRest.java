package com.springapp.controller;

import com.springapp.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloControllerRest {
    @RequestMapping(value = "/api")
    public List<Person> getPerson(){
        System.out.println("Mapped to here");
        List<Person> LP = new ArrayList<Person>();

        Person p1 = new Person();
        p1.setName("Thanh");
        LP.add(p1);

        Person p2 = new Person();
        p2.setName("Tuan");
        LP.add(p2);
        return LP;
    }
}
