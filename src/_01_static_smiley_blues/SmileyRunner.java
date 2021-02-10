package _01_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyRunner {
	public static void main(String[] args) {
		// 1. Make a new JFrame and set it to be visible
		JFrame j = new JFrame();
		j.setVisible(true);
		// Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2. Make a new JPanel
		JPanel p = new JPanel();
		// 3. Add your panel to your frame
		j.add(p);
		// 7. Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green!
		Smiley.setColor("yellow");
		// 4. Make three Smiley objects and add them to your panel
		Smiley smile1 = new Smiley();
		Smiley smile2 = new Smiley();
		Smiley smile3 = new Smiley();
		p.add(smile1);
		p.add(smile2);
		p.add(smile3);
		j.pack();
		// 5. Pack your frame

		// 6. Run the program and make sure you see three blue Smileys!
	}
}
