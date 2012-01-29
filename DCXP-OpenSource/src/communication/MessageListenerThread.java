/**
 * 
 */
package communication;

import communication.serializer.MessageSerializerImpl;
import java.net.*;
import java.io.*;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment This thread is started by MessageListener when a new connection has been made to the server socket
 */
public class MessageListenerThread extends Thread{
	
	private Socket socket = null;
	private Message message = null;
	private MessageManagerImpl msgManager = null;
	public MessageListenerThread(Socket socket, MessageManagerImpl msgManager){
		this.socket = socket;
		this.msgManager = msgManager;
	}
	
	/**
	 * This thread initializes an in and out writer to be able to communicate in both ways
	 * It then takes the message sent and converts it to a message object 
	 * @param 
	 */
	public void run(){
		try{
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()));
			String inputline;
			
			while((inputline = in.readLine()) != null){
				message = new MessageSerializerImpl().deserializeMessage(inputline);
				msgManager.setLatestMessage(message);
			}
			out.close();
			in.close();
			socket.close();
		}
		catch(IOException e){
			System.out.println("Can not establish connection");
		}
	}

}
