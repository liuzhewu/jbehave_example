package com.liu.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class 乘法
{
	private int workDay=0;
	private int salary=0;
	
	@Given("xiaoming's salary is $salary RMB")
	public void setSalary(int salary) {
		this.salary=salary;
	}

	@When("workday is ${day}")
	public void setWorkDay(int day) 
	{
		this.workDay=day;
	}
	
	@Then("result is $pay")
	public void testPay(int pay) 
	{
		int money=salary*workDay;
		assertThat(pay).as("工资计算错误").isEqualTo(money);
	}
	
	
}
