package br.com.solucitiva.saladereuniao.api.controller;

import br.com.solucitiva.saladereuniao.domain.entity.Room;
import br.com.solucitiva.saladereuniao.domain.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    private RoomService roomService;

    @GetMapping
    public ResponseEntity<List<Room>> listAll(){
        return ResponseEntity.ok(roomService.listAll());
    }

}
