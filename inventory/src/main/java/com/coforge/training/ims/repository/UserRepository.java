package com.coforge.training.ims.repository;

import org.springframework.data.repository.CrudRepository;

import com.coforge.training.ims.model.Dealer;

public interface UserRepository extends CrudRepository<Dealer, Long> {
	/*JPA finder methods are the most powerful methods, we can create finder methods to select the records from the database without writing SQL queries.
	To create finder methods in Data JPA, we need to follow a certain naming convention. To create finder methods for the entity class field name, we need to create a method starting with findBy followed by field name.
	*/
	public Dealer findByEmail(String email); //Custom Repositary

}
