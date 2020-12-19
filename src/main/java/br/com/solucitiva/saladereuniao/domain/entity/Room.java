package br.com.solucitiva.saladereuniao.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Room {

    @Id
    private long id;
    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate date;
    @Column(columnDefinition = "DATE" , nullable = false)
    private LocalDate startHour;
    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate endHours;

    public Period timeOfLocation(){
        Period period = Period.between(startHour,endHours);
        return period;
    }

}
