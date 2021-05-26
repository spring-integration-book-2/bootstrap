package sib.bootstrap.enable;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sib.bootstrap.BaseCustomerService;
import sib.bootstrap.Customer;

import javax.sql.DataSource;
import java.util.Collection;

@Service
@Transactional // <1>
public class TransactionalCustomerService extends BaseCustomerService {

	public TransactionalCustomerService(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	public Collection<Customer> save(String... names) {
		return super.save(names);
	}

	@Override
	public Customer findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Collection<Customer> findAll() {
		return super.findAll();
	}

}
