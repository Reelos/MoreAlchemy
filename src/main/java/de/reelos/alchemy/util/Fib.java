package de.reelos.alchemy.util;

import java.util.ArrayList;
import java.util.List;

public class Fib {
	private List<Long> fibs = new ArrayList<>();
	
	public Fib(int maxLevel) {
		for(int i = 0; i < maxLevel; i++) {
			fibs.add(fib(i));
		}
	}
	
	private long fib(int maxLevel) {
		if(maxLevel == 0 || maxLevel == 1)
			return 1;
		else {
			return fib(maxLevel - 1) + fib(maxLevel - 2);
		}
	}
	
	public int getLevel(long exp) {
		int level = 0;
		long xp = 0;
		while(exp > xp && level < fibs.size()) {
			xp += fibs.get(level);
			level++;
		}
		return level;
	}
	
}
