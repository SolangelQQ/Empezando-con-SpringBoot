package com.ucb.producto;

import org.springframework.web.bind.annotation.RestController;

import io.sentry.Sentry;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class
HelloController implements IHelloApi {

    @GetMapping("/")
    public String index() {

        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
        return "Greetings from Spring boot";
    }


}