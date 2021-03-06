package sib.bootstrap.bootiful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sib.bootstrap.Customer;
import sib.bootstrap.CustomerService;

import java.util.Collection;

// <1>
@RestController
public class BootifulRestController {

	private final CustomerService customerService;

	public BootifulRestController(CustomerService customerService) {
		this.customerService = customerService;
	}

	// <2>
	@GetMapping("/customers")
	Collection<Customer> get() {
		return this.customerService.findAll();
	}

}
