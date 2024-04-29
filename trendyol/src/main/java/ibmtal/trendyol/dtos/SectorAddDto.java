package ibmtal.trendyol.dtos;

public class SectorAddDto {
	private String name;
	private double rating;
	public SectorAddDto() {
		super();
	}
	public SectorAddDto(String name, double rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
}
