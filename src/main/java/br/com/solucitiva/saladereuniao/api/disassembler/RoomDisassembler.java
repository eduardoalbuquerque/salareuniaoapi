package br.com.solucitiva.saladereuniao.api.disassembler;

import br.com.solucitiva.saladereuniao.api.model.input.RoomModelInput;
import br.com.solucitiva.saladereuniao.domain.entity.Room;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class RoomDisassembler {

    private ModelMapper modelMapper;

    public Room toModelInput(RoomModelInput roomModelInput){
        return modelMapper.map(roomModelInput, Room.class);
    }

}
