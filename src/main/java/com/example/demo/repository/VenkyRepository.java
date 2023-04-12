package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.VenkyModel;

@Repository
public interface VenkyRepository extends JpaRepository<VenkyModel, Long> {

}
