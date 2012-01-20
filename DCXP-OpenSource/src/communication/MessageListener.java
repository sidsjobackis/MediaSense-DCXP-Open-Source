/**
 * 
 */
package communication;

import java.net.*;
import java.io.*;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment This class sets up a server socket and wait for a connection to be made to it
 * 			When a connection is discovered a new thread is started to handle the connection
 */
public class MessageListener {
	/**
	 * This function starts a new thread that handles the connecting socket
	 * @param URI
	 * @param port
	 */
	public MessageListener(String URI, int port) {
		ServerSocket serverSocket = null;
		boolean listening = true;
		try{
			serverSocket = new ServerSocket(port);
		}
		catch(IOException e) {
			System.out.println("Can not create socket");
		}
		try{
			while(listening){
				new MessageListenerThread(serverSocket.accept()).start();
			}
			serverSocket.close();
		}
		catch(IOException f) {
			System.out.println("Can not create thread");
		}
	}
	

}
