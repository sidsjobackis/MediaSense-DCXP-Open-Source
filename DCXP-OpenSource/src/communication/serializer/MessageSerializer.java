package communication.serializer;

import communication.Message;

/**
 * @author 	Jonas B�ckstr�m & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment 
 */
public interface MessageSerializer {
	
	/**
	 * Returns a serialized version of the message.
	 * @param message
	 * @return String representation of Message
	 */
	public String serializeMessage( Message message );
	
	
	/**
	 * Converts the string representation to a Message.
	 * @param stringRepresentation 
	 * @return Message object
	 */
	public Message deserializeMessage( String stringRepresentation );

}
