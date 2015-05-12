package org.apache.maven.myspace.elevator;

/**
 * Hello world!
 *
 */
public class Elevator 
{
    static boolean doorOpen;
    boolean doorClose;
    boolean goingUp;
    boolean goingDown;
    
    public void printFloorNumber(int floorNum){
    	System.out.println("I am at Floor Number - " + floorNum);
    }
    
    public void doorOpen(){
    	doorOpen = true;
    }
    
    public void doorClose(){
    	doorClose = true;
    }
    
}
