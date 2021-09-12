package com.fairplay.web.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring Boot configuration class.
 *
 * @author Stavros Grigoriou
 */
@Configuration
@EntityScan(basePackages = "com.fairplay.domain")
@EnableJpaRepositories(basePackages = "com.fairplay.domain")
@ComponentScan(basePackages = {"com.fairplay.service", "com.fairplay.domain"})
public class SpringBootConfig {

}
