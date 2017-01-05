package org.lla_private.service;

import com.google.inject.AbstractModule;

public class SentenceServiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ISentenceTest.class).to(SentenceImplTest.class);
	}

}
