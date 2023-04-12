package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.VenkyModel;
import com.example.demo.service.VenkyService;

@RestController
public class VenkyController {
	@Autowired
	VenkyService venkyService;

	@PostMapping("/save")
	public VenkyModel saveDet(@RequestBody VenkyModel venkyModel) {
		VenkyModel hope = venkyService.save(venkyModel);
		return hope;
	}

	@GetMapping("/get")
	public List<VenkyModel> getDe() {
		List<VenkyModel> venky = venkyService.findAll();

		return venky;

	}

	@GetMapping("/get/{Id}")
	public VenkyModel getByDe(@PathVariable Long Id) {
		VenkyModel vm = venkyService.findById(Id);
		return vm;

	}

	@DeleteMapping("/del/{Id}")
	public void deleteBy(@PathVariable Long Id) {
		venkyService.deleteBy(Id);
	}

	@PutMapping("/upd/{Id}")
	public VenkyModel upBy(@RequestBody VenkyModel venkyModel, @PathVariable Long Id) {
		VenkyModel vl = venkyService.updateBy(venkyModel, Id);
		return vl;

	}
//	// update the employee by using the id
//		@PutMapping("/update/{Id}")
//		public Employee updateById(@ModelAttribute EmpPojo empp, @PathVariable Long Id) throws IOException {
//			return employeeService.update(empp, Id);
//
//		}

}
