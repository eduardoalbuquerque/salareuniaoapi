package br.com.solucitiva.saladereuniao.api.controller;

import br.com.solucitiva.saladereuniao.api.assembler.RoomAssembler;
import br.com.solucitiva.saladereuniao.api.disassembler.RoomDisassembler;
import br.com.solucitiva.saladereuniao.api.model.input.RoomModelInput;
import br.com.solucitiva.saladereuniao.api.model.output.RoomModelOutput;
import br.com.solucitiva.saladereuniao.domain.entity.Room;
import br.com.solucitiva.saladereuniao.domain.service.RoomService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {

    private RoomService roomService;

    private RoomAssembler roomAssembler;
    private RoomDisassembler roomDisassembler;

    @GetMapping
    public ResponseEntity<List<Room>> listAll(){
        return ResponseEntity.ok(roomService.listAll());
    }

    @GetMapping("/{roomId}")
    public ResponseEntity<Room> findById(@PathVariable Long roodId){
        return ResponseEntity.ok(roomService.findById(roodId));
    }

    @PostMapping
    public ResponseEntity<RoomModelOutput> save(@RequestBody RoomModelInput roomModelInput) {
        try {
            Room room = roomService.save(roomDisassembler.toModelInput(roomModelInput));

            return ResponseEntity.ok(roomAssembler.toModelOutput(room));

        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

}
