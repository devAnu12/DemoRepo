package com.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JTCWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" ** getRootConfigClasses **");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println(" ** getServletConfigClasses **");
		return new Class[] { JTCWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println(" ** getServletMappings **");
		return new String[] { "*.jtc" };
	}
}
