package com.crudTienda.crudTienda.util.mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class MapperBean {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setAmbiguityIgnored(true); // Ignorar ambigüedades

        //modelMapper.getConfiguration();
        return modelMapper;
    }
}
