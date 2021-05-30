package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext ("beans.xml");
		CurrencyConverter cc = (CurrencyConverter)ac.getBean("currencyconverter");
		System.out.println(cc.getTotalCurrencyValue("5Dollar"));
	}
}
