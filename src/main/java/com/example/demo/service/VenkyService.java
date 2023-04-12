package com.example.demo.service;

import java.util.List;

import com.example.demo.model.VenkyModel;

public interface VenkyService {
	public VenkyModel save(VenkyModel venkyModel);

	public List<VenkyModel> findAll();

	public VenkyModel findById(Long Id);

	public void deleteBy(Long Id);

	public VenkyModel updateBy(VenkyModel venkyModel, Long Id);

}
