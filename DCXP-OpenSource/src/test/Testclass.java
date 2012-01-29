package test;

import communication.CUA;
import dcxp.DCXP;
import dcxp.callbacks.Callback;

public class Testclass {

	public static void main() {
		
		CUA sendingCUA = new CUA("127.0.0.1", 8080);

		//Simulating new node that create a new DCXP network
		DCXP dcxp1 = new DCXP( "127.0.0.1", 8080 );
		if( !dcxp1.joinNetwork() )
			System.out.println("Failed to start DCXP network");

		//Simulating a second node that connect to the network create above
		DCXP dcxp2 = new DCXP( "127.0.0.1", 8081 );
		if( !dcxp2.joinNetwork("127.0.0.1", 8080) )
			System.out.println("Failed to join the DCXP network");

		//Create callback functions for returning data to the sensor
		Callback callbackTest1 = new CallbackImpl();
		Callback callbackTest2 = new CallbackImpl();
		
		//Register new sensors with corresponing callbackfunctions
		dcxp1.REGISTER("uci://test1@miun.se/test1", callbackTest1 );
		dcxp2.REGISTER("uci://test2@miun.se/test2", callbackTest2 );
		
		//Set and Get sensor values
		dcxp1.SET( "uci://test1@miun.se/test1", "temperature=5" );
		dcxp1.GET( "uci://test2@miun.se/test2");
	}

	/*
	When a new Message is placed in the ArrayList, the listeners are triggered to check the new Message.
	NotifyGetListener - of which there are one per sent out Get request - check if the Message’s MessageID 
	is equal to the ID set in the listener, notifySubscribeListeners check if the Message’s MessageID is 
	equal to the specific subscribe ID of 1, getHandler (listens to get requests from the outside) checks 
	the type of the Message to see if it’s GET, setHandler checks the type of the Message to see if it’s SET.
	A listener that finds a match will use the data in the Message and the callbacks to send the appropriate 
	information to the right place.

	Overview of this can be seen in the project report [p.19, section 4.3.4]

	*/
	
}