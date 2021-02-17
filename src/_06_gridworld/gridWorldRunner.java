package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridWorldRunner {
	public static void main(String[] args) {
		World w = new World();
		w.show();
		
		Bug b = new Bug();
		Location l = new Location(2,8);
		b.turn();
		w.add(l, b );
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				Location l1 = new Location(i,j);
				Flower f = new Flower();
				
				
				w.add(l1, f);
			}
			
		}
	}
}
