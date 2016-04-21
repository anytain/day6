package com.frist.day6;
public class Teacher
{
	private long id;
	private String name;
	private int age;
	private double salary;
	private char gender;

	public Teacher(long id,String name,int age,double salary,char gender)
	{
	  this.id=id;
	  this.name=name;
	  this.age=age;
	  this.salary=salary;
	  this.gender=gender;
	}
//公共的setter,getter方法
	public void setId(long id)
	{this.id=id;}
	public long getId()
	{return this.id;}
	public void setName(String name)
	{this.name=name;}
	public String getName()
	{return this.name;}
	public void setAge(int age)
	{this.age=age;}
	public int getAge()
	{return this.age;}
	public void setSalary(double salary)
	{this.salary=salary;}
	public double getSalary()
	{return this.salary=salary;}
	public void setGender(char gender)
	{this.gender=gender;}
	public char getGender()
	{return this.gender=gender;}

  public String toString()
	{
	  return "Teacher[id:"+this.id
		  +",name:"+this.name
		  +",age:"+this.age
		  +",salary:"+this.salary
		  +",gender:"+this.gender
		  +"]";
  }
}
