package communication.serializer;

import com.google.gson.Gson;

import communication.Message;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment This implementation use the Google GSON library which is 
 * 			used to convert Java Objects into their JSON representation
 * 			and back again. This could be switched to a pure XML 
 * 			representation to avoid the Apache license (version 2.0).
 * 
 *   		More info: 	http://code.google.com/p/google-gson/
 */
public class MessageSerializerImpl implements MessageSerializer {
	
	/**
	 * Returns a serialized version of the message.
	 * @param message
	 * @return String representation of Message
	 */
	@Override
	public Message deserializeMessage( String stringRepresentation ) {
		Gson gson = new Gson();
		Message message = gson.fromJson( stringRepresentation, Message.class );
		
		return message;
	}
		
	
	/**
	 * Converts the string representation to a Message.
	 * @param stringRepresentation 
	 * @return Message object
	 */
	@Override
	public String serializeMessage( Message message ) {
		Gson gson = new Gson();
		String JSONRepresentation = gson.toJson( message );  
				  
		return JSONRepresentation;
	}

}
