package lookupservice.subscribers;

import java.util.ArrayList;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment Fetch and set subscribers matching with given sensor UCI. 
 */
public class SubscriptionListManagerImpl implements SubscriptionListManager {

	SubscriberMultimap map = null;
	
	/**
	 * Default constructor
	 */
	public SubscriptionListManagerImpl() {
		map = new SubscriberMultimap();
	}

	
	/**
	 * Returns a list containing all the subscriber UCI's
	 * @param sensorUCI
	 * @return subscriber UCI's
	 */
	@Override
	public ArrayList<String> getSubscribers(String sensorUCI) {
		return (ArrayList<String>) map.get( sensorUCI );
	}

	
	/**
	 * Add subscriber UCI mapping to sensor UCI
	 * @param sensorUCI
	 * @param subscribingUCI
	 */
	@Override
	public void setSubscriber(String sensorUCI, String subscribingUCI) {
		map.add( sensorUCI, subscribingUCI);
	}

}
