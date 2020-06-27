package hello.world.server.service;

import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;

@Primary
@Singleton
public class SpanishGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hola ";
    }
}