package ua.edu.ucu.apps.flowerstoreweb.database;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.ucu.apps.flowerstoreweb.models.Flower;


public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}

