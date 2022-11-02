package cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.domain.Fruit;

public interface FruitService {
/*
	public List<Fruit> getAll();

	public Fruit getOne(Long id);

	public Fruit addFruit(Fruit fruit);

	public void deleteFruit(Long id);

	public Fruit updateFruit(Fruit fruit);

	*/
	
	
	//
	List<Fruit> findAllFruits();
	
	Fruit findFruitById(Long id);

	public String deleteFruit(Long id);

	public String updateFruit(Fruit fruit);

	Fruit saveFruit(Fruit fruitNew);

	
}
