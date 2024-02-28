package net.larrys.gestionsalle.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Prof {
    @Id
    private String codeProf;
    private String name;
    private String firstName;
    private String grade;
}
