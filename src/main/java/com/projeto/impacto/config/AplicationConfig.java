package com.projeto.impacto.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AplicationConfig {

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
