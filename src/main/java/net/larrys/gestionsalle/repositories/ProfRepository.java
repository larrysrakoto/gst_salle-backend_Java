package net.larrys.gestionsalle.repositories;

import net.larrys.gestionsalle.models.Prof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfRepository extends JpaRepository<Prof, String>{
    List<Prof> findByName(String name);
    @Query(value = "Select * from prof where name like concat('%',:q, '%')", nativeQuery = true)
    List<Prof> search(String q);
}
