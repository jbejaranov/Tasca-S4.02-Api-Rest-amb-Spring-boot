package cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.domain.Fruit;

public interface FruitService {

	List<Fruit> findAllFruits();
	
	Fruit findFruitById(Long id);

	public String deleteFruit(Long id);

	public String updateFruit(Fruit fruit);

	Fruit saveFruit(Fruit fruitNew);

	
}
