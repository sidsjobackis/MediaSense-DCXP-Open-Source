package communication;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment 
 */
public class Message {

	private short messageID;
	private String type;
	private String sendingCUA;
	private String data;
	
	public Message(short messageID, String type, String sendingCUA, String data) {
		this.messageID = messageID;
		this.type = type;
		this.sendingCUA = sendingCUA;
		this.data = data;
	}

	/**
	 * @return the messageID
	 */
	public short getMessageID() {
		return messageID;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the sendingCUA
	 */
	public String getSendingCUA() {
		return sendingCUA;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

}
