package sib.bootstrap.basicdi;

import sib.bootstrap.BaseCustomerService;

import javax.sql.DataSource;

class DataSourceCustomerService extends BaseCustomerService {

	// <1>
	DataSourceCustomerService(DataSource ds) {
		super(ds);
	}

}
