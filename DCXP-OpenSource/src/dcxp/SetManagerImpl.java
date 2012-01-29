/**
 * 
 */
package dcxp;

import communication.CUA;
import communication.MessageManagerImpl;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment 
 */
public class SetManagerImpl implements SetManager {

	/**
	 * 
	 */
	public SetManagerImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see dcxp.SetManager#set(java.lang.String, java.lang.String)
	 */
	@Override
	public void set(String UCI, String value, CUA sendingCUA, MessageManagerImpl communicationHandler ) {
		// TODO Auto-generated method stub
		//DHTFacadeImpl DHT = new DHTFacadeImpl();
		//CUA receivingCUA = DHT.resolve(UCI);
		//short ID = communicationHandler.getMessageID();
		//Message myMessage = communicationHandler.createMessage(ID, "SET", sendingCUA, UCI+","+value);
		//communicationHandler.sendMessage(receivingCUA, myMessage);
	}

}
