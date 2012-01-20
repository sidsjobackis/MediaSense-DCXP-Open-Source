package communication;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment This object contains the required information for sending messages
 */
public class Message {

	private short messageID;
	private String type;
	private CUA sendingCUA;
	private String data;
	
	public Message(short messageID, String type, CUA sendingCUA, String data) {
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
	public CUA getSendingCUA() {
		return sendingCUA;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

}
