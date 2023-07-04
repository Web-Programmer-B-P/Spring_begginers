package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "spring_introduction")
@PropertySource("classpath:app.properties")
public class Config {

    @Bean
//    @Scope(value = "singleton")
//    @Scope("prototype")
    public Pet cat() {
        return new Cat();
    }

    @Bean
    public Person person() {
        return new Person(cat());
    }

}
