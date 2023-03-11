package day7;

import java.util.List;

public class Nation_0 {
	public enum Type {
		LAND, ISLAND
	};

	private final String name;
	private final Type type;
	private final double population;
	private final int gdpRank;

	public Nation_0(String name, Type type, double population, int gdpRank) {
		super();
		this.name = name;
		this.type = type;
		this.population = population;
		this.gdpRank = gdpRank;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public double getPopulation() {
		return population;
	}

	public int getGdpRank() {
		return gdpRank;
	}

	public static final List<Nation_0> nations = List.of(
			new Nation_0("ROK", Nation_0.Type.LAND, 51.4, 11),
			new Nation_0("New Zealand", Type.ISLAND, 4.5, 49), 
			new Nation_0("USA", Type.LAND, 318.9, 1),
			new Nation_0("China", Type.LAND, 1355.7, 2), 
			new Nation_0("Philiphine", Type.ISLAND, 107.7, 36),
			new Nation_0("United Kingdom", Type.ISLAND, 63.7, 5), 
			new Nation_0("Sri Lanka", Type.ISLAND, 21.9, 63),
			new Nation_0("Morocco", Type.LAND, 33.0, 60)
			);

}
