package com.epam.course.custom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;

public class MyCustomDateEditor extends CustomDateEditor {
	public MyCustomDateEditor() {
		super(new SimpleDateFormat("yyyy-MM-dd"), true);
	}

	public MyCustomDateEditor(DateFormat dateFormat, boolean allowEmpty) {
		super(dateFormat, allowEmpty);
	}

}
