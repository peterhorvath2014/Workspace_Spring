package hu.epam.course.spring.common;

public class Configuration {

	public static final int TIMEOUT = 3000;

	public static class InnerConfig {

		public static final String WELCOME_FROM_INNER_BEAN = "Welcome from inner Bean!";
	}

	public enum SystemMode {

		DEVELOPMENT, BUSINESS
	}
}
