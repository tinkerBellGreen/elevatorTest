package org.apache.maven.myspace.elevator;

public class ElevatorControllerClass {

	public static void main(String[] args) {
		int totalNumberOfFloors = 10;
		Elevator e1 = new Elevator(totalNumberOfFloors);		
		//Going Up from Ground to Top Floor
		for(int i = 0; i < 10; i++){
			e1.elevatorGoingUp(i+1);
		}
		//Going Down from Top to Ground
		for(int i = 10; i <= 1; i--){
			e1.elevtorGoingDown(i);
		}
		
	}

}
