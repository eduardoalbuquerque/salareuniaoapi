package br.com.solucitiva.saladereuniao.api.assembler;

import br.com.solucitiva.saladereuniao.api.model.input.RoomModelInput;
import br.com.solucitiva.saladereuniao.api.model.output.RoomModelOutput;
import br.com.solucitiva.saladereuniao.domain.entity.Room;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@AllArgsConstructor
@Component
public class RoomAssembler {

    private ModelMapper modelMapper;

    public RoomModelOutput toModelOutput(Room room){

        LocalDate roomDate = modelMapper.map(room.getDate(), LocalDate.class);

        return modelMapper.map(roomDate, RoomModelOutput.class);

    }

}
