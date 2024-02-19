package ibmtal.trendyol.dtos;

public class TownAddDto {
	private String name;

	private int city;
	
	public TownAddDto() {
		super();
	}

	public TownAddDto(String name, int city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

}
