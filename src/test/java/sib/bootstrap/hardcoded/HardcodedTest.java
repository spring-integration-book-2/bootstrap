package sib.bootstrap.hardcoded;

import sib.bootstrap.BaseClass;
import sib.bootstrap.CustomerService;

public class HardcodedTest extends BaseClass {

	private final CustomerService customerService;

	public HardcodedTest() {
		this.customerService = new DevelopmentOnlyCustomerService();
	}

	@Override
	public CustomerService getCustomerService() {
		return this.customerService;
	}

}
