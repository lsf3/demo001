package com.example.demo;

public class empoyee {
	private int age;
	private int empid;
	private int gender;
	private int dept;
	private int phoneNumber;
	private String name;
	private String address;
	private String habby;
	public empoyee() {
		super();
		//无参构造
	}
	public empoyee(int age, int empid, int gender, int dept, int phoneNumber, String name, String address,
			String habby) {
		super();
		this.age = age;
		this.empid = empid;
		this.gender = gender;//男女
		this.dept = dept;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
		this.habby = habby;
	}

	public String toString() {
		return "empoyee [age=" + age + ", empid=" + empid + ", gender=" + gender + ", dept=" + dept + ", phoneNumber="
				+ phoneNumber + ", name=" + name + ", address=" + address + ", habby=" + habby + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHabby() {
		return habby;
	}
	public void setHabby(String habby) {
		this.habby = habby;
	}
	
	//哈希算法
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + dept;
		result = prime * result + empid;
		result = prime * result + gender;
		result = prime * result + ((habby == null) ? 0 : habby.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phoneNumber;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		empoyee other = (empoyee) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (dept != other.dept)
			return false;
		if (empid != other.empid)
			return false;
		if (gender != other.gender)
			return false;
		if (habby == null) {
			if (other.habby != null)
				return false;
		} else if (!habby.equals(other.habby))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}
	
	
	
	
	

}
