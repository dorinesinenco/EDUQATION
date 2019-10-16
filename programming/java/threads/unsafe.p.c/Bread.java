package unsafe;

import java.util.Random;

public class Bread {
	private String name;
	private Integer  weight;
	public Bread(String name) {
		super();
		this.name = name;
		this.weight = new Random().nextInt(50) + 400;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Bread [name=" + name + ", weight=" + weight + "g]";
	}
}
