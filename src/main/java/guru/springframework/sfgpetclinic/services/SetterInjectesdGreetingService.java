package guru.springframework.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectesdGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Setting";
    }
}
