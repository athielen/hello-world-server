package hello.world.server.controller;

import hello.world.server.service.GreetingService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

import javax.inject.Inject;

@Controller("/async/greet")
public class AsyncGreetController {

    @Inject
    private GreetingService greetingService;

    @Get("/{name}")
    public Single<String> greet(String name) {
        return Single.just(greetingService.getGreeting() + name);
    }
}
