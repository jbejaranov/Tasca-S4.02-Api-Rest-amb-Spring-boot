package cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.repository.FruitRepository;

@Service
public class FruitServiceImp {

	@Autowired
	private FruitRepository fruitRepository;

	public Fruit save(Fruit fruit) {
		return fruitRepository.save(fruit);
	}

	public List<Fruit> findAll() {
		return fruitRepository.findAll();
	}

	public Optional<Fruit>findById(Integer id){
		return fruitRepository.findById(id);
	}

	public void delete(Integer id) {
		fruitRepository.deleteById(id);
	}
	
	public void update(Integer id) {
		fruitRepository.deleteById(id);
	}
	
	public String updateFruit(Fruit fruitUpdated) {
		Integer num = fruitUpdated.getId();
		if (fruitRepository.findById(num).isPresent()) {
			Fruit customerToUpdate = new Fruit();
			customerToUpdate.setId(fruitUpdated.getId());
			customerToUpdate.setNom(fruitUpdated.getNom());
			customerToUpdate.setQuantitatQuilos(fruitUpdated.getQuantitatQuilos());

			fruitRepository.save(customerToUpdate);
			return "Fruita modificada";
		}
		return "Error al modificar la fruita";
	}
}
