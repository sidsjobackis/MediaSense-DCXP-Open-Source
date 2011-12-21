package dcxp.callbacks;

import java.util.ArrayList;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment Execute requested callback with the given data.
 */
public class CallbackManager {

	/**
	 * Run the callback-function for a single callback instance.
	 * @param callback		The callback instance
	 * @param data			The data to be returned
	 */
	public void doCallback( Callback callback, String data ) {
		callback.callbackFunction(data);
	}
	
	
	/**
	 * Run the callback-function for a multiple callback instances.
	 * @param callbacks		Array containing callback instances
	 * @param data			The data to be returned
	 */
	public void doCallback( ArrayList<Callback> callbacks, String data ) {
		for( Callback callback : callbacks ) {
			callback.callbackFunction(data);
		}
	}
	
}
