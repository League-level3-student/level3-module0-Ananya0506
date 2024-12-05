package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
public static void main(String[] args) {
	

        // 2. create an array of 5 robots.
	Robot[] robots = new Robot[5];

        // 3. use a for loop to initialize the robots.
	
	for(int i = 0; i<robots.length; i++) {
		robots[i] = new Robot("rob");
		robots[i].setSpeed(100);
		robots[i].setY(500);
		robots[i].setX(50);
	}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    	
	Robot.setWindowSize(1920, 1000);
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
		//boolean crossed = false;
		//while (crossed == false) {
		//	Random ran = new Random();
		//	for (int i = 0; i < robots.length; i++) {
		//		int a = ran.nextInt(50);
		//		robots[i].move(a);
		//		if (robots[i].getY() < 0) {
		//			crossed = true;
		//			JOptionPane.showMessageDialog(null, "Robot " + (i + 1) + " won!");
		//			break;
		//		}
		//	}
		//} // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
		boolean crossing = false;
		while (crossing == false) {
			Random ran = new Random();
			for (int i = 0; i < robots.length; i++) {
				if(ran.nextBoolean() == true) {
				
				robots[i].move(40);
				robots[i].turn(5);
				if (robots[i].getY() == 500 && robots[i].getX() == 50) {
					crossing = true;
					JOptionPane.showMessageDialog(null, "Robot " + (i + 1) + " won!");
					break;
				}
				}
				
			}
		}
}
}