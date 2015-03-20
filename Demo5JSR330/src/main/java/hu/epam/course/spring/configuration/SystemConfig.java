package hu.epam.course.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {

	@Value("${timeout}")
	private String timeout;

	public String getTimeout() {
		return timeout;
	}

}
