package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void sayHello() {
        System.out.println(controller.getGreeting());
    }
}