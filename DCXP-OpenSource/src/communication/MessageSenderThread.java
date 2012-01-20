package communication;

import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment This thread is responsible for sending a message
 */

public class MessageSenderThread extends Thread{
	private String messageToSend;
	private CUA receivingCUA;
	
	MessageSenderThread(String messageToSend, CUA receivingCUA){
		this.messageToSend = messageToSend;
		this.receivingCUA = receivingCUA;
	}
	
	/**
	 * When the thread starts it will handle sending the message
	 * @param
	 */
	public void run(){
		try{
			Socket skt = new Socket(receivingCUA.getURI(), receivingCUA.getPort());
			PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
			out.print(messageToSend);
			out.close();
			skt.close();
		}
		catch(Exception e){
			System.out.println("Can not connect to server");
		}
	}
	
}
