package communication;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment 
 */
public interface MessageManager {
	
	/**
	 * 
	 * @param receivingCUA
	 * @param message
	 */
	public void sendMessage( String receivingCUA, Message message );
	
	
	/**
	 * 
	 * @param messageID
	 * @param type
	 * @param sendingCUA
	 * @param data
	 * @return
	 */
	public Message createMessage( short messageID, String type, String sendingCUA, String data );
	
	
	/**
	 * 
	 * @return
	 */
	public short getMessageID();
	
}
