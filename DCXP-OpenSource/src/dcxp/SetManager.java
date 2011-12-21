package dcxp;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment SetManager determines the form for which sensor commands are sent. 
 * 			A CUA that wants a sensor to update some parameter sends a SET 
 * 			request to the UCI which communicates with the sensor.
 */
public interface SetManager {

	/**
	 * 
	 * @param UCI
	 * @param value
	 */
	public void set( String UCI, String value );
	
}
