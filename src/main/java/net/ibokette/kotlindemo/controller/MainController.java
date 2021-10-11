package net.ibokette.kotlindemo.controller;

import net.ibokette.kotlindemo.entity.Car;
import net.ibokette.kotlindemo.entity.House;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    String helloWorld() {
        return "It's me!!!!";
    }

    @RequestMapping("/nautilus")
    Car showNautilus() {
        return new Car("Lincoln", "Nautilus", 2021, "Grey");
    }

    // Note: comment out these 4 lines to run a pure Java project
//    @RequestMapping("/ironstone")
//    KHouse showIronstone() {
//        return new KHouse("Ironstone", "Grey and Black", 2917, 2001);
//    }
//
    @RequestMapping("/brimfield")
    House showBrimfield() {
        return new House("Ironstone", "Grey and Black", 2917, 2001);
    }
}
