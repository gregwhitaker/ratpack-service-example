package com.github.gregwhitaker.ratpackservice.example.services;

import com.github.gregwhitaker.ratpackservice.example.config.ExampleServiceConfig;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ratpack.service.Service;
import ratpack.service.StartEvent;
import ratpack.service.StopEvent;

/**
 * Service that will start when the Ratpack application starts.
 */
public class ExampleService implements Service {
    private static final Logger LOG = LoggerFactory.getLogger(ExampleService.class);

    @Inject
    private ExampleServiceConfig config;

    @Override
    public String getName() {
        return "ExampleService";
    }

    @Override
    public void onStart(StartEvent event) throws Exception {
        LOG.info("Starting ExampleService");
        LOG.info("Message from ExampleService: {}", config.message);
    }

    @Override
    public void onStop(StopEvent event) throws Exception {
        LOG.info("Stopping ExampleService");
    }
}
