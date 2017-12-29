# ratpack-service-example
[![Build Status](https://travis-ci.org/gregwhitaker/ratpack-service-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/ratpack-service-example)

An example showing how to start long-running services on application startup with [Ratpack](http://www.ratpack.io).

This example starts a long-running service in the background, on Ratpack application startup, that prints the message configured in `config.yaml` to the console.

## Running the Example
Start the example by running the following Gradle command:

    $ ./gradlew run
    
Once the application is running you should see something similar to the following in your console:

    [main] INFO ratpack.server.RatpackServer - Starting server...
    [main] INFO ratpack.server.RatpackServer - Building registry...
    [main] INFO ratpack.server.RatpackServer - Initializing 1 services...
    [ratpack-compute-1-1] INFO com.github.gregwhitaker.ratpackservice.example.services.ExampleService - Starting ExampleService
    [Timer-0] INFO com.github.gregwhitaker.ratpackservice.example.services.ExampleService - Hello from the ExampleService! - 1514513619293
    [main] INFO ratpack.server.RatpackServer - Ratpack started for http://localhost:5050
    [Timer-0] INFO com.github.gregwhitaker.ratpackservice.example.services.ExampleService - Hello from the ExampleService! - 1514513620298
    [Timer-0] INFO com.github.gregwhitaker.ratpackservice.example.services.ExampleService - Hello from the ExampleService! - 1514513621301
    [Timer-0] INFO com.github.gregwhitaker.ratpackservice.example.services.ExampleService - Hello from the ExampleService! - 1514513622304
    [Timer-0] INFO com.github.gregwhitaker.ratpackservice.example.services.ExampleService - Hello from the ExampleService! - 1514513623308

Point your web browser to [http://localhost:5050](http://localhost:5050) to access the test endpoint.

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/ratpack-service-example/issues).

## License
MIT License

Copyright (c) 2017 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
