package br.com.solucitiva.saladereuniao.domain.service;

import br.com.solucitiva.saladereuniao.domain.entity.Room;
import br.com.solucitiva.saladereuniao.domain.repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RoomService  implements IRoom{

    private RoomRepository repository;

    @Override
    public List<Room> listAll() {
        return null;
    }

    @Override
    public Room findById(Long roomId) {
        return null;
    }

    @Override
    public Room insert(Room room) {
        return null;
    }

    @Override
    public void delete(Long roomId) {

    }
}
