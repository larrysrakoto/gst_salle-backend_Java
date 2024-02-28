package net.larrys.gestionsalle.repositories;

import net.larrys.gestionsalle.models.Occupation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OccupationRepository extends JpaRepository<Occupation, String> {
}
