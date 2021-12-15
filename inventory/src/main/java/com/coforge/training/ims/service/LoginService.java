package com.coforge.training.ims.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.ims.model.Dealer;
import com.coforge.training.ims.repository.DealerRepository;
import com.coforge.training.ims.repository.UserRepository;


/*Spring Service annotation can be applied only to classes. It is used to mark the class as a service provider.
Spring @Service annotation is used with classes that provide some business functionalities. Spring context will autodetect these classes when annotation-based configuration and classpath scanning is used.
*/

/*The @Transactional annotation, which provides broad support for transaction management and allows developers to concentrate on business logic rather than worrying
 *  about data integrity in the event of system failures. */
@Service
@Transactional
public class LoginService {

	
	//Annotation for Dependancy Injection
	// Inject Dealer REopsitory
	
	@Autowired
	private DealerRepository dRepo;
	
	@Autowired
	private UserRepository uRepo;
	
	public void saveDealer(Dealer dealer) {
		
		dRepo.save(dealer); // Invoke Save() Method of JPA Repository
		
	}
	
	public Dealer findbyEmail(String email)
	{
		return uRepo.findByEmail(email);
	}
	
}
