package br.com.solucitiva.saladereuniao.Core.modelmapper;

import br.com.solucitiva.saladereuniao.api.model.input.RoomModelInput;
import br.com.solucitiva.saladereuniao.api.model.output.RoomModelOutput;
import br.com.solucitiva.saladereuniao.domain.entity.Room;
import org.modelmapper.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Configuration
public class ModelMapperConfig {


    @Bean
    public ModelMapper modelMapper(){

        var modelMapper = new ModelMapper();

        Provider<LocalDate> localDateProvider = new AbstractProvider<LocalDate>() {
            @Override
            protected LocalDate get() {
                return LocalDate.now();
            }
        };

        Converter<String,LocalDate> toStringDate = new AbstractConverter<String, LocalDate>() {
            @Override
            protected LocalDate convert(String source) {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate localDate = LocalDate.parse(source, format);
                return localDate;
            }
        };

        modelMapper.createTypeMap(String.class,LocalDate.class);
        modelMapper.addConverter(toStringDate);
        modelMapper.getTypeMap(String.class, LocalDate.class)
                .setProvider(localDateProvider);

        return modelMapper;
    }
}
