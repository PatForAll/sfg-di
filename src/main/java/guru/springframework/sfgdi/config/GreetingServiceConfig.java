package guru.springframework.sfgdi.config;

import com.springframework.property.PropertyServiceFactory;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    PropertyServiceFactory propertyServiceFactory() { return new PropertyServiceFactory(); }

    @Profile({"first", "default"})
    @Bean("propertyGreetingService")
    GreetingService propertyGreetingService(PropertyServiceFactory propertyServiceFactory) { return propertyServiceFactory.getPropertyService("first"); }

    @Profile("second")
    @Bean("propertyGreetingService")
    GreetingService secondPropertyGreetingService(PropertyServiceFactory propertyServiceFactory) { return propertyServiceFactory.getPropertyService("second"); }

    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN | default")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile("ES")
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }
}
