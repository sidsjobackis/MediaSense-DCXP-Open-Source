package lookupservice.callbacks.subscribers;

import java.util.ArrayList;

import dcxp.callbacks.Callback;


/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment Fetch and set subscriber callbacks matching given sensor UCI.
 */
public interface SubscriberCallbackManager {

	/**
	 * Returns a list containing all the subscribers callbacks
	 * @param sensorUCI
	 * @return List containing all the subscribers callbacks
	 */
	public ArrayList<Callback> getSubscriberCallbacks( String sensorUCI );
	
	
	/**
	 * Add callback mapping to sensor UCI
	 * @param sensorUCI
	 * @param callback
	 */
	public void setSubscriberCallback( String sensorUCI, Callback callback );
	
}
