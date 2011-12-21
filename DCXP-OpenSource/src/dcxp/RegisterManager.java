package dcxp;

import dcxp.callbacks.Callback;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment RegisterManager determines the form for which the above layer 
 * 			registers a sensor with the CUA. The callBackFunction is used 
 * 			by the CUA to reach the sensor when it receives a SET request. 
 */
public interface RegisterManager {

	/**
	 * 
	 * @param UCI
	 * @param callback
	 */
	public void register( String UCI, Callback callback );
	
}
