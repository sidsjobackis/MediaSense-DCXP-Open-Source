package dcxp;


/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment UpdateManager determines the form for which sensors send new data
 * 			to their controlling CUA. When the CUA receives an UPDATE message,
 * 			it sends out a NOTIFY message to each subscribing CUA.
 */
public interface UpdateManager {
	
	/**
	 * 
	 * @param UCI
	 * @param data
	 */
	public void update( String UCI, String data );
	
}
