package ibmtal.trendyol.dtos;

public class JobAddDto {
	private String name;
	private int sector;
	private String description;
	public JobAddDto() {
		super();
	}
	public JobAddDto(String name, int sector, String description) {
		super();
		this.name = name;
		this.sector = sector;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSector() {
		return sector;
	}
	public void setSector(int sector) {
		this.sector = sector;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
