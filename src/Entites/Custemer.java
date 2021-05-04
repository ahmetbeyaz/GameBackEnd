package Entites;

import java.time.LocalDate;

public class Custemer {
	int id;
	String firstName;
	String lastName;
	LocalDate dateofBirthDate;
	Long nationalityId;
	double money;
	public Custemer(int id, String firstName, String lastName, LocalDate dateofBirthDate, Long nationalityId,double money) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirthDate = dateofBirthDate;
		this.nationalityId = nationalityId;
		this.money=money;
	}
	public Custemer() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateofBirthDate() {
		return dateofBirthDate;
	}
	public void setDateofBirthDate(LocalDate dateofBirthDate) {
		this.dateofBirthDate = dateofBirthDate;
	}
	public Long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	

}
