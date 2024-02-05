package ibmtal.trendyol.dtos;

public class TestUserAddDto {
	private String name;
	private String surname;
	private int grade;
	public TestUserAddDto() {
		super();
	}
	public TestUserAddDto(String name, String surname, int grade) {
		super();
		this.name = name;
		this.surname = surname;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
