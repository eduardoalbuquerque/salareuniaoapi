package br.com.solucitiva.saladereuniao.domain.service;

import br.com.solucitiva.saladereuniao.domain.entity.Room;

import java.util.List;

public interface IRoom {

    List<Room> listAll();
    Room findById(Long roomId);
    Room insert(Room room);
    void delete(Long roomId);

}
