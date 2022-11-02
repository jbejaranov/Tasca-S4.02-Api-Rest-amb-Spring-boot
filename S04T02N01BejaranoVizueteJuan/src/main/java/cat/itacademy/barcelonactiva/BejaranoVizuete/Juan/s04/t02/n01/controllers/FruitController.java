package cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.repository.FruitRepository;
import cat.itacademy.barcelonactiva.BejaranoVizuete.Juan.s04.t02.n01.model.services.FruitServiceImp;

@RestController
@RequestMapping("/fruits")
public class FruitController {

	@Autowired
	private FruitServiceImp fruitService;

	@PostMapping("/save")
	public ResponseEntity<Fruit> save(@RequestBody Fruit fruit) {
		return new ResponseEntity<>(fruitService.save(fruit), HttpStatus.CREATED);
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<Fruit>> findAll() {
		return new ResponseEntity<>(fruitService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/findById/{id}")
	public Optional<Fruit> findById(@PathVariable Integer id) {
		// return new ResponseEntity<Fruit>(fruitService.findById(id),HttpStatus.OK);
		return fruitService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		fruitService.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PATCH)
	public String update(Fruit fruit) {
		return fruitService.updateFruit(fruit);
	}

}
