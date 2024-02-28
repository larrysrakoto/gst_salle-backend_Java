package net.larrys.gestionsalle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Occupation {
    @Id
    private String id;
    private Date date;
    @ManyToOne
    private Prof prof;
    @ManyToOne
    private Salle salle;
}
