package com.github.gregwhitaker.ratpackservice.example.services;

import com.google.inject.AbstractModule;

public class ServicesModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ExampleService.class);
    }
}
