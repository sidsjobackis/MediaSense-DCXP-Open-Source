package communication;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment This interface determines how the message sending is to be done
 */
public interface MessageManager {
	
	/**
	 * 
	 * @param receivingCUA
	 * @param message
	 */
	public void sendMessage( CUA receivingCUA, Message message );
	
	
	/**
	 * 
	 * @param messageID
	 * @param type
	 * @param sendingCUA
	 * @param data
	 * @return
	 */
	public Message createMessage( short messageID, String type, CUA sendingCUA, String data );
	
	
	/**
	 * 
	 * @return
	 */
	public short getMessageID();
	
}
