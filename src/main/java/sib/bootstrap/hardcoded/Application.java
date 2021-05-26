package sib.bootstrap.hardcoded;

import sib.bootstrap.Demo;

public class Application {

	public static void main(String[] args) {
		DevelopmentOnlyCustomerService customerService = new DevelopmentOnlyCustomerService();
		Demo.workWithCustomerService(Application.class, customerService);
	}

}
