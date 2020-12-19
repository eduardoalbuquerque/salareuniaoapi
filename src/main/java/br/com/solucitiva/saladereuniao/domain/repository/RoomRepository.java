package br.com.solucitiva.saladereuniao.domain.repository;

import br.com.solucitiva.saladereuniao.domain.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {


}
