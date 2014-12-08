/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <AndrePurits>
 * @version <...>
 *
 */
 import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
public class SteepleChaseRacer extends Racer {
	
	//TODO Subclasses do not inherit any constructors from their superclass
	//Consequently, you will need to provide a compatible constructor
	public SteepleChaseRacer (int y) 
{
   super(y);
}
	@Override
	public void jumpRight() {
	
   turnLeft();
   while(!rightIsClear()) {
   move();
   }
   turnRight();
   move();
   turnRight();
   move();
   while(!rightIsClear()  && frontIsClear()) {
   move();
   }
   turnLeft();
	  
}
}   
   
  

