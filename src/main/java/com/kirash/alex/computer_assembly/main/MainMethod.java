package com.kirash.alex.computer_assembly.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.kirash.alex.computer_assembly.myversion.*;

public class MainMethod {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		ComputerReleaseVersion myVersion = (ComputerReleaseVersion) context.getBean("myVersion");
		myVersion.actionWithoutLoad();

	}
}
