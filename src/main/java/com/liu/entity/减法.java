package com.liu.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class 减法 
{
	private int num=0;
	
	@Given("there are $number persons")
	public void initPersons(int number) 
	{
		num=number;
	}
	
	@When("$number persons leave")
	public void changeNumber(int number) 
	{
		num-=number;
	}
	
	@Then("$number  is result")
	public void assertNumber(int number) 
	{
		assertThat(number).as("减法计算错误").isEqualTo(num);
	}
	
}
