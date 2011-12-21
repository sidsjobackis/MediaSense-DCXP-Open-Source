package dcxp;

import dcxp.callbacks.Callback;


/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment SubscribeManager determines the form for which signing up for 
 * 			continuous updates of sensor data is handled. Once subscribed, 
 * 			the CUA will receive a NOTIFY message every time the sensor 
 * 			value is updated until the time-to-live (TTL) has run out. If 
 * 			no TTL is specified a default value of 24 h will be applied.
 */
public interface SubscribeManager {

	/**
	 * 
	 * @param UCI
	 * @param callback
	 */
	public void subscribe( String UCI, Callback callback );
	
	/**
	 * 
	 * @param UCI
	 * @param callback
	 * @param TTL
	 */
	public void subscribe( String UCI, Callback callback, int TTL );
	
}
