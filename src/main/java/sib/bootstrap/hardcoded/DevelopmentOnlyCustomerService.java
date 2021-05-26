package sib.bootstrap.hardcoded;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import sib.bootstrap.BaseCustomerService;
import sib.bootstrap.DataSourceUtils;

import javax.sql.DataSource;

class DevelopmentOnlyCustomerService extends BaseCustomerService {

	DevelopmentOnlyCustomerService() {
		super(buildDataSource());
	}

	private static DataSource buildDataSource() { // <1>
		DataSource dataSource = new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2).build();
		return DataSourceUtils.initializeDdl(dataSource);
	}

}
