package sib.bootstrap.context;

import sib.bootstrap.ApplicationContextAwareBaseClass;

public class ContextTest extends ApplicationContextAwareBaseClass {

	@Override
	protected Class<?> getConfigurationClass() {
		return Application.class;
	}

}
