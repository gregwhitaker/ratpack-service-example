package com.github.gregwhitaker.ratpackservice.example;

import com.github.gregwhitaker.ratpackservice.example.config.ExampleServiceConfig;
import com.github.gregwhitaker.ratpackservice.example.services.ServicesModule;
import ratpack.guice.Guice;
import ratpack.handling.Context;
import ratpack.handling.Handler;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

/**
 * Starts the ratpack-service-example application.
 */
public class Main {

    public static void main(String... args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> c
                        .yaml("config.yaml")
                        .require("/services/example", ExampleServiceConfig.class)
                        .baseDir(BaseDir.find()).build())
                .registry(Guice.registry(b -> b
                        .module(ServicesModule.class)))
                .handlers(chain -> chain.get((Handler) ctx -> {
                    ctx.render("Hello World!");
                }))
        );
    }
}
