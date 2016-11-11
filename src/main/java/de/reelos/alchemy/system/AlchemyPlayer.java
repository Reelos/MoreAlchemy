package de.reelos.alchemy.system;

import java.util.UUID;

import de.reelos.alchemy.util.Fib;

public class AlchemyPlayer {
	private static final Fib fib = new Fib(50);
	private final UUID uuid;
	private long energy = 0, experience = 0;
	
	public AlchemyPlayer(UUID uuid) {
		this.uuid = uuid;
	}
	
	public long getExperience() {
		return experience;
	}
	
	public long getEnergy() {
		return energy;
	}
	
	public int getLevel() {
		return fib.getLevel(experience);
	}
	
	public int getMaxEnergy() {
		return (int)(Math.pow(1 + getLevel() , 2));
	}
}
