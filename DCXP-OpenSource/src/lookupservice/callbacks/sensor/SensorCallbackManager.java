package lookupservice.callbacks.sensor;

import dcxp.callbacks.Callback;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment Fetch callback matching given sensor UCI. 
 */
public interface SensorCallbackManager {

	/**
	 * Fetch the callback mapped to the given sensorUCI
	 * @param sensorUCI
	 * @return Sensor callback
	 */
	public Callback getSensorCallback( String sensorUCI );
	
	
	/**
	 * Define a map between the sensor UCI and callback
	 * @param sensorUCI
	 * @param callback
	 */
	public void setSensorCallback( String sensorUCI, Callback callback );
	
}
