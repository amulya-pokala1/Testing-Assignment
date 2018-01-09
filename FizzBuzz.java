package com.accolite.mini_au;

public class FizzBuzz {
	
	String produceOutput(int num)
	{
		if(num%15==0) return "FizzBuzz";
		if(num%5==0) return "Buzz";
		if(num%3==0) return "Fizz";
		return null;
	}
	String takeInputAndProduceOutput(int num)
	{
		return produceOutput(num);
	}
	

}
