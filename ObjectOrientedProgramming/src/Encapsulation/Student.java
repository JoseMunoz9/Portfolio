package Encapsulation;

public class Student {
	
	private String name;
	private String profession;
	private String nationality;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String newProfession) {
		profession = newProfession;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String newNationality) {
		nationality = newNationality;
	}
}
