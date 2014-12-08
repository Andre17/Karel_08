 //A BoxTopRacer is a Racer that can jump over hurdles of any width.
 //@author <Andre Purits>
 
 import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
   
public class BoxTopRacer extends Racer {
	
	//TODO Subclasses do not inherit any constructors from their superclass
	//Consequently, you will need to provide a compatible constructor
public BoxTopRacer (int y) 
{
   super(y);
}

	
	 //Re-implement the method to allow for jumping hurdles of any width
	 
	@Override
	public void jumpRight() {
	
   turnLeft();
   while(!rightIsClear()) {
   move();
   }
   turnRight();
   move();
   while(!rightIsClear()) {
   move();
   }
   turnRight();
   move();
   while(!rightIsClear()  && frontIsClear()) {
   move();
   }
   turnLeft();
	  
}
}   