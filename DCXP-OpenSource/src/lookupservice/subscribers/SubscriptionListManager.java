package lookupservice.subscribers;

import java.util.ArrayList;


/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment Fetch and set subscribers matching with given sensor UCI. 
 */
public interface SubscriptionListManager {

	/**
	 * Returns a list containing all the subscriber UCI's
	 * @param sensorUCI
	 * @return subscriber UCI's
	 */
	public ArrayList<String> getSubscribers( String sensorUCI );
	
	
	/**
	 * Add subscriber UCI mapping to sensor UCI
	 * @param sensorUCI
	 * @param subscribingUCI
	 */
	public void setSubscriber( String sensorUCI, String subscribingUCI );
	
}
