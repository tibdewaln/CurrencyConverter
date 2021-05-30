package com.spring.app;

import java.util.Map;

public class CurrencyConverter {
	
	private Map<String, Integer> currency;
	

	public Map<String, Integer> getCurrency() {
		return currency;
	}


	public void setCurrency(Map<String, Integer> currency) {
		this.currency = currency;
	}


	public int getTotalCurrencyValue(String value)
	{
		String num = ""; 
		for(int i=0;i<value.length();i++)
		{
			if('0' <= value.charAt(i) && value.charAt(i) <= '9')
				num += value.charAt(i);
			else
				break;
		}
		String[] temp = value.split(num);
		int result = Integer.parseInt(num) * getCurrency().get(temp[1].toUpperCase());
        return result;
    }	
	
}
