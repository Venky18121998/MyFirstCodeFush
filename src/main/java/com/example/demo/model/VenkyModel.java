package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenkyModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private Long id;
	private String name;
	private String address;
	private String phoneNumber;
}
