package dcxp.callbacks;


/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment The callback instance that return data to the higher 
 * 			layers Callback-implementation.  
 */
public interface Callback {

	/**
	 * The function to be executed returning the data to the upper layer.
	 * @param data
	 */
	public void callbackFunction( String data );
	
}
