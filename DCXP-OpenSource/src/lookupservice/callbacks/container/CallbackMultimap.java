package lookupservice.callbacks.container;

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
public class CallbackMultimap {
	
	private Map<String, List<Callback>> multiMap = new HashMap<String, List<Callback>>();
	
	/**
	 * Add new mapping to map
	 * @param UCI
	 * @param callback
	 */
	public void add( String UCI, Callback callback ) {
	    List<Callback> list;
	    
	    if ( multiMap.containsKey( UCI ) ) {
		   	list = multiMap.get( UCI );
		  	list.add( callback );
	    } else {
		    list = new ArrayList<Callback>();
		    list.add( callback );
		    multiMap.put( UCI, list );
	    }
	}
	
	
	/**
	 * Fetch all callbacks mapped to the given UCI
	 * @param UCI
	 * @return List of callbacks
	 */
	public List<Callback> get( String UCI ) {
		return multiMap.get( UCI );
	}
}
