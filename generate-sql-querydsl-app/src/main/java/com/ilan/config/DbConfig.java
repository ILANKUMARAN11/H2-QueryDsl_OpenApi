package com.ilan.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "${jpa.repositories.base-package:}")
//@EntityScan
public class DbConfig {


    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Value("${jpa.entities.base-package:}") String[] entityBasePackages, EntityManagerFactoryBuilder builder, DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages(entityBasePackages)
                .build();
    }
}