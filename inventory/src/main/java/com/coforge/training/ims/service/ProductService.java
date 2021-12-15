package com.coforge.training.ims.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.ims.model.Product;
import com.coforge.training.ims.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	//Useing Meathod Of Crud/JPA Repositary
	public List<Product> listAll() {
		return pRepo.findAll(); // defined in JPA repo
		}

		public void save(Product product) { // save is userdefined
			pRepo.save(product); // save method defined in JPA repo
		}

		public Product get(long id) {
		return pRepo.findById(id).get(); // defined in JPA repo
		}

		public void delete(long id) {
			pRepo.deleteById(id); // defined in JPA repo
		}

}
