package org.apache.maven.myspace.elevator;

/**
 * Hello world!
 *
 */
public class Elevator 
{
    private static boolean doorOpen;
    private static boolean doorClose;
    private static boolean goingUp;
    private boolean goingDown;
    private int totalNumberOfFloors;
    
    public Elevator(int totalNumberOfFloors){
    	this.totalNumberOfFloors = totalNumberOfFloors;
    }
    
    public void printFloorNumber(int floorNum){
    	System.out.println("I am at Floor Number - " + floorNum);
    }
    
    public void doorOpen(){
    	doorOpen = true;
    }
    
    public void doorClose(){
    	doorClose = true;
    }
    
    public void elevatorGoingUp(int floorNumber){
    	if(floorNumber >= 1 && floorNumber <= totalNumberOfFloors){
    		goingUp = true;
    		System.out.println("Going Up.");
    		printFloorNumber(floorNumber);
    	}
    }
    public void elevtorGoingDown(int floorNumber){
    	if(floorNumber <= totalNumberOfFloors && floorNumber <= 1){
    		goingDown = true;
    		System.out.println("Going Down.");
    		printFloorNumber(floorNumber);
    	}
    }
}
