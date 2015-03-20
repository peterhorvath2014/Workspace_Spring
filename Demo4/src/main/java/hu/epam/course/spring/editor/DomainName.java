package hu.epam.course.spring.editor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainName {

	private Pattern pattern;

	public boolean domainNameIsValid(String host) {

		Matcher matcher = pattern.matcher(host);

		return matcher.matches() ? true : false;
	}

	public Pattern getPattern() {
		return pattern;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
}