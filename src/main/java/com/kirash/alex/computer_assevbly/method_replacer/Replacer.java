package com.kirash.alex.computer_assevbly.method_replacer;

import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

public class Replacer implements MethodReplacer {
	
	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Create new action!");
		return null;
	}

}
