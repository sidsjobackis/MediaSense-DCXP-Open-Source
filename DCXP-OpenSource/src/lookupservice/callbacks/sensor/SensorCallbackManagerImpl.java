package lookupservice.callbacks.sensor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import lookupservice.callbacks.container.CallbackMultimap;

import dcxp.callbacks.Callback;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment Fetch and set callback matching given sensor UCI.
 */
public class SensorCallbackManagerImpl implements SensorCallbackManager {

	//Contain a map between the sensor sensorUCI and the sensor callback
	private CallbackMultimap map = null; 
	
	
	/**
	 * Default constructor
	 */
	public SensorCallbackManagerImpl() {
		map = new CallbackMultimap();
	}
	
	
	/**
	 * Fetch the callback mapped to the given sensorUCI
	 * @param sensorUCI
	 * @return Sensor callback
	 */
	@Override
	public Callback getSensorCallback( String sensorUCI ) {
		return map.get(sensorUCI).get(0);
	}

	
	/**
	 * Define a map between the sensor UCI and callback
	 * @param sensorUCI
	 * @param callback
	 */
	@Override
	public void setSensorCallback( String sensorUCI, Callback callback ) {
		map.add(sensorUCI, callback);
	}

}
