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
public interface GetManager {

	/**
	 * 
	 * @param UCI
	 */
	public void get( String UCI, CUA sendingCUA, MessageManagerImpl communicationHandler );
	
	public void getListener();
}
