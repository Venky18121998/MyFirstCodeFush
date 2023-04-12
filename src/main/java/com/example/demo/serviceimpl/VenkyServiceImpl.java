package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.VenkyModel;
import com.example.demo.repository.VenkyRepository;
import com.example.demo.service.VenkyService;

@Service
public class VenkyServiceImpl implements VenkyService {
	@Autowired
	VenkyRepository venkyRepository;

	@Override
	public VenkyModel save(VenkyModel venkyModel) {
		VenkyModel ven = venkyRepository.save(venkyModel);
		return ven;
	}

	@Override
	public List<VenkyModel> findAll() {
		List<VenkyModel> venky = venkyRepository.findAll();
		return venky;
	}

	@Override
	public VenkyModel findById(Long Id) {
		if (venkyRepository.findById(Id).isEmpty()) {
			throw new UserNotFoundException("user not found in database can you give the correct number or name");
			
		}
		VenkyModel venk = venkyRepository.findById(Id).get();
		return venk;
	}

	@Override
	public void deleteBy(Long Id) {
		venkyRepository.deleteById(Id);

	}

	@Override
	public VenkyModel updateBy(VenkyModel venkyModel, Long Id) {
		VenkyModel vm = venkyRepository.findById(Id).get();
		vm.setName(venkyModel.getName());
		vm.setAddress(venkyModel.getAddress());
		vm.setPhoneNumber(venkyModel.getPhoneNumber());
		return venkyRepository.save(vm);

	}
//	public Employee update(EmpPojo empp, Long Id) throws IOException {
//		Employee em = employeeRepository.findById(Id).get();
//		em.setFirstName(empp.getFirstName());
//		em.setLastName(empp.getLastName());
//		em.setEmail(empp.getEmail());
//		em.setFileType(empp.getMulti().getContentType());
//		em.setFileName(StringUtils.cleanPath(empp.getMulti().getOriginalFilename()));
//		em.setFileData(empp.getMulti().getBytes());
//
//		return employeeRepository.save(em);
//
//	}

}
