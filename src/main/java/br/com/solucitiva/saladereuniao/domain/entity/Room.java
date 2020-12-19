package br.com.solucitiva.saladereuniao.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "DATE", nullable = false)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonDeserialize(as = LocalDate.class)
    private LocalDate date;
//    @Column(columnDefinition = "DATE" , nullable = false)
//    @JsonDeserialize(as = LocalDate.class)
//    private LocalDate startHour;
//    @Column(columnDefinition = "DATE", nullable = false)
//    @JsonDeserialize(as = LocalDate.class)
//    private LocalDate endHours;
//
//    public Period timeOfLocation(){
//        Period period = Period.between(startHour,endHours);
//        return period;
//    }

}
