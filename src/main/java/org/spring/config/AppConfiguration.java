package org.spring.config;

import org.spring.Implements.Vietnamese;
import org.spring.lang.Language;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.spring.beans"})
public class AppConfiguration {
    @Bean(name = "language")
    public Language getLanguage() {
        return new Vietnamese();
    }
}
