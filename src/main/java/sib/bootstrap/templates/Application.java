package sib.bootstrap.templates;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;
import sib.bootstrap.DataSourceUtils;
import sib.bootstrap.Demo;

import javax.sql.DataSource;

public class Application {

	public static void main(String args[]) {

		DataSource dataSource = new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2).build();
		DataSource initializedDataSource = DataSourceUtils.initializeDdl(dataSource); // <1>
		PlatformTransactionManager dsTxManager = new DataSourceTransactionManager(
				initializedDataSource);// <2>
		TransactionTemplate tt = new TransactionTemplate(dsTxManager); // <3>
		// <4>
		TransactionTemplateCustomerService customerService = new TransactionTemplateCustomerService(
				initializedDataSource, tt);
		Demo.workWithCustomerService(Application.class, customerService);
	}

}
