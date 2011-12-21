package lookupservice.callbacks.subscribers;

import java.util.ArrayList;

import lookupservice.callbacks.container.CallbackMultimap;

import dcxp.callbacks.Callback;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment Fetch and set subscriber callbacks matching given sensor UCI.
 */
public class SubscriberCallbackManagerImpl implements SubscriberCallbackManager {

	//Contain a map between the sensor sensorUCI and the subscribers callbacks
	private CallbackMultimap map = null;
	
	/**
	 * Returns a list containing all the subscribers callbacks
	 * @param sensorUCI
	 * @return List containing all the subscribers callbacks
	 */
	@Override
	public ArrayList<Callback> getSubscriberCallbacks( String sensorUCI ) {
		return (ArrayList<Callback>) map.get( sensorUCI );
	}

	
	/**
	 * Add callback mapping to sensor UCI
	 * @param sensorUCI
	 * @param callback
	 */
	@Override
	public void setSubscriberCallback(String sensorUCI, Callback callback) {
		map.add(sensorUCI, callback);
	}

}
