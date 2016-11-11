package de.reelos.alchemy.system;

import org.bukkit.Material;

public enum AlchemyItems {
	;
	
	private final Material mat;
	private final int energy;
	
	private AlchemyItems(Material mat, int energy){
		this.mat = mat;
		this.energy = energy;
	}
	
	public Material getMaterial() {
		return mat;
	}
	
	public int getEnergy() {
		return energy;
	}
}
