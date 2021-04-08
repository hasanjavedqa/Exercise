package exercise.qa;


public class Cat extends Animal{

	private String colour;

	public Cat(boolean veg, String food, int legs) {
		super(veg, food, legs);
		this.colour="White";
	}

	public Cat(boolean veg, String food, int legs, String color){
		super(veg, food, legs);
		this.colour=color;
	}

	public String getColor() {
		return colour;
	}

	public void setColor(String color) {
		this.colour = color;
	}

}

