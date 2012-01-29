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
 * @Comment GetManager determines the form for which data requests are sent. 
 * 			A CUA that wants to get some sensor value sends a GET request to
 * 			the UCI which responds with a NOTIFY message containing the 
 * 			requested data.
 */
public class GetManagerImpl implements GetManager {

	/**
	 * 
	 */
	public GetManagerImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see dcxp.GetManager#get(java.lang.String)
	 */
	@Override
	public void get(String UCI, CUA sendingCUA, MessageManagerImpl communicationHandler ) {
		// TODO Auto-generated method stub
		//DHTFacadeImpl DHT = new DHTFacadeImpl();
		//CUA receivingCUA = DHT.resolve(UCI);
		//short ID = communicationHandler.getMessageID();
		//Start a notifyListener with this ID
		//Message myMessage = communicationHandler.createMessage(ID, "GET", sendingCUA, UCI);
		//communicationHandler.sendMessage(receivingCUA, myMessage);

	}
	@Override
	public void getListener(){
		//start getListener thread (not implemented yet)
	}
}
