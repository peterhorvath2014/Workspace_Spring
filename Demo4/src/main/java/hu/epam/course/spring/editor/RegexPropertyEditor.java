package hu.epam.course.spring.editor;

import java.beans.PropertyEditorSupport;
import java.util.regex.Pattern;

public class RegexPropertyEditor extends PropertyEditorSupport {

	public void setAsText(String regex) {
		Pattern pattern = Pattern.compile(regex);
		setValue(pattern);
	}
}