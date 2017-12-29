package com.github.gregwhitaker.ratpackservice.example.services;

import com.github.gregwhitaker.ratpackservice.example.config.ExampleServiceConfig;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ratpack.service.Service;
import ratpack.service.StartEvent;
import ratpack.service.StopEvent;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Service that will start when the Ratpack application starts.
 */
public class ExampleService implements Service {
    private static final Logger LOG = LoggerFactory.getLogger(ExampleService.class);

    @Inject
    private ExampleServiceConfig config;

    private final Timer timer = new Timer();

    @Override
    public String getName() {
        return "ExampleService";
    }

    @Override
    public void onStart(StartEvent event) throws Exception {
        LOG.info("Starting ExampleService");
        timer.schedule(new MessageTask(), 0, 1_000);
    }

    @Override
    public void onStop(StopEvent event) throws Exception {
        LOG.info("Stopping ExampleService");
        timer.cancel();
    }

    /**
     * Task that will run every second and print a message to the console.
     */
    class MessageTask extends TimerTask {

        @Override
        public void run() {
            LOG.info("{} - {}", config.message, System.currentTimeMillis());
        }
    }
}
