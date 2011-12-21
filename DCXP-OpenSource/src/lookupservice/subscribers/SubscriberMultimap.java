package lookupservice.subscribers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dcxp.callbacks.Callback;


/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment Hashmap container for callbacks on the form:
 * 			Map< UCI, List< Callback > >
 */
public class SubscriberMultimap {
	
	private Map<String, List<String>> multiMap = new HashMap<String, List<String>>();
	
	/**
	 * Add new mapping to map
	 * @param UCI
	 * @param callback
	 */
	public void add( String sensorUCI, String subscribingUCI ) {
	    List<String> list;
	    
	    if ( multiMap.containsKey( sensorUCI ) ) {
		   	list = multiMap.get( sensorUCI );
		  	list.add( subscribingUCI );
	    } else {
		    list = new ArrayList<String>();
		    list.add( subscribingUCI );
		    multiMap.put( sensorUCI, list );
	    }
	}
	
	
	/**
	 * Fetch all callbacks mapped to the given UCI
	 * @param UCI
	 * @return List of callbacks
	 */
	public List<String> get( String sensorUCI ) {
		return multiMap.get( sensorUCI );
	}
}
