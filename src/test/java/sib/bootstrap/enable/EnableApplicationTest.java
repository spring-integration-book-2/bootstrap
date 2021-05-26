package sib.bootstrap.enable;

import org.junit.jupiter.api.Test;
import sib.bootstrap.ApplicationContextAwareBaseClass;
import sib.bootstrap.TransactionTestMixin;

/**
 * @author <a href="mailto:josh@joshlong.com">Josh Long</a>
 */
public class EnableApplicationTest extends ApplicationContextAwareBaseClass
		implements TransactionTestMixin {

	@Override
	@Test
	public void insert() {
		super.insert();

		this.testTransactionalityOfSave(getCustomerService());
	}

	@Override
	protected Class<?> getConfigurationClass() {
		return Application.class;
	}

}