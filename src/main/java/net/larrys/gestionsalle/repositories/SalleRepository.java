package net.larrys.gestionsalle.repositories;

import net.larrys.gestionsalle.models.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle, String> {
}
