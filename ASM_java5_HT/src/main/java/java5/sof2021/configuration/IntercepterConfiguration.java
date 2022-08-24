package java5.sof2021.configuration;

import org.aopalliance.intercept.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java5.sof2021.interceptor.DemoLogIntroceptor;

@Configuration
public class IntercepterConfiguration implements WebMvcConfigurer {
	@Autowired
	private DemoLogIntroceptor demologinterceptor;
	
	@Override
	public void addInerceptor(InterceptorRegistry registry) {	
		registry.addInterceptor(demologinterceptor).addPathPatterns("hello");

	}
	

}
