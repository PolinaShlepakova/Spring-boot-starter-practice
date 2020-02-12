package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "default")
    MyLibraryClass myLibraryClassDefault() {
        return new MyLibraryClass("default");
    }

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "custom")
    MyLibraryClass myLibraryClassCustom() {
        return new MyLibraryClass("custom");
    }
}
