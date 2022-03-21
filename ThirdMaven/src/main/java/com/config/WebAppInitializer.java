package com.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebApplicationInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] configFiles= {MyAppConfig.class};
		
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping = {"/"};
		return mapping;
	}

}
