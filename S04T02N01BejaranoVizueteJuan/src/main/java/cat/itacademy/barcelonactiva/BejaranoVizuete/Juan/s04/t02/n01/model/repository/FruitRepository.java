package cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.domain.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
	
}
