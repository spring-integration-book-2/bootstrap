package sib.bootstrap.basicdi;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import sib.bootstrap.BaseClass;
import sib.bootstrap.CustomerService;
import sib.bootstrap.DataSourceUtils;

import javax.sql.DataSource;

public class DataSourceCustomerServiceTest extends BaseClass {

	private final DataSourceCustomerService customerService;

	public DataSourceCustomerServiceTest() {
		DataSource dataSource = new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2).build();
		this.customerService = new DataSourceCustomerService(
				DataSourceUtils.initializeDdl(dataSource));
	}

	@Override
	public CustomerService getCustomerService() {
		return this.customerService;
	}

}