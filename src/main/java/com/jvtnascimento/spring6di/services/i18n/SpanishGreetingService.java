package com.jvtnascimento.spring6di.services.i18n;

import com.jvtnascimento.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola mundo! - ES";
    }
}
