package com.epam.course.custom;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public class MyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry arg0) {
		arg0.registerCustomEditor(java.util.Date.class, new MyCustomDateEditor());
	}

}
