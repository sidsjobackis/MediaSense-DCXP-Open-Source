/**
 * 
 */
package communication;

import communication.serializer.MessageSerializerImpl;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment This class implements the MessageManager interface
 * 			A new message is assigned a messageID, converted inte a message object
 * 			and sent in a new thread
 */
public class MessageManagerImpl implements MessageManager {
	private String messageToSend;
	private CUA receivingCUA;
	private short messageID;
	MessageSerializerImpl msgSrl = new MessageSerializerImpl();
	/**
	 * This function starts a new thread that handles the sending of the message
	 * @param receivingCUA
	 * @param message
	 */
	@Override
	public void sendMessage(CUA receivingCUA, Message message) {
		this.receivingCUA = receivingCUA;
		this.messageToSend = msgSrl.serializeMessage(message);
		new MessageSenderThread(this.messageToSend, this.receivingCUA).start();

	}
	
	/**
	 * This class takes all information we want in a message and generates a Message object
	 * containing that information
	 * @param messageID
	 * @param type
	 * @param sendingCUA
	 * @param data
	 */
	@Override
	public Message createMessage(short messageID, String type,
			CUA sendingCUA, String data) {
		Message result = new Message(messageID, type, sendingCUA, data);
		return result;
	}

	/**
	 * This function returns a new messageID to be used by the new message
	 * @param 
	 * @return short
	 */
	@Override
	public short getMessageID() {
		short result = messageID++;
		if(messageID <= 10){
			messageID = 11;
		}
		return result;
	}

}
