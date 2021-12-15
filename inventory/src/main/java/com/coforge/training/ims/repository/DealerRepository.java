package com.coforge.training.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.ims.model.Dealer;

public interface DealerRepository extends JpaRepository<Dealer, Long> {

	//This interface has save(),findAll(),findById(),deleteById(),count()
	//etc.. inbuilt methods of jpa repository for various db operations.
	// This interface will be implemented by class automatically
	
}
