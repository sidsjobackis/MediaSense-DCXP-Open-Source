package dcxp;

import communication.CUA;
import communication.MessageListener;
import communication.MessageManagerImpl;
import dcxp.callbacks.Callback;

import lookupservice.callbacks.sensor.SensorCallbackManager;
import lookupservice.callbacks.sensor.SensorCallbackManagerImpl;
import lookupservice.callbacks.subscribers.SubscriberCallbackManager;
import lookupservice.callbacks.subscribers.SubscriberCallbackManagerImpl;
import lookupservice.dht.DHTFacade;
import lookupservice.subscribers.SubscriptionListManager;
import lookupservice.subscribers.SubscriptionListManagerImpl;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment Test class showing how to implement the missing parts.
 */
public class DCXP {

	//Instantiate DCXP core functions
	private GetManager getManager = new GetManagerImpl();
	private SetManager setManager = new SetManagerImpl();
	private RegisterManager registerManager = new RegisterManagerImpl();	
	private SubscribeManager subscribeManager = new SubscribeManagerImpl();
	private UpdateManager updateManager = new UpdateManagerImpl();

	//Instantiate DCXP Lookup service 
	private DHTFacade DHT = new DHTFacadeImpl();
	private SensorCallbackManager sensorCallbackManager = new SensorCallbackManagerImpl();
	private SubscriberCallbackManager subscriberCallbackManager = new SubscriberCallbackManagerImpl();
	private SubscriptionListManager subscriberListManager = new SubscriptionListManagerImpl();

	//Instantiate DCXP Communication
	private CUA currentCUA = null;
	private MessageManagerImpl communicationHandler = new MessageManagerImpl();
	private MessageListener communicationListener = null;

	/**
	* Default constructor
	*/
	public DCXP(String currentCUAIP, int port) {
		currentCUA = new CUA(currentCUAIP, port);
		communicationListener = new MessageListener(currentCUA.getURI(), currentCUA.getPort(), communicationHandler);
	}
	
	/**
	 * Join non-existing network, i.e. start as bootstrap
	 */
	public boolean joinNetwork() {
		//Instantiate default ip and port 
	if(DHT.join())
		return true;
	else
		return false;
	}
	
	/**
	 * Join existing network.
	 */
	public boolean joinNetwork(String bootstrapIP, int port ) {
		if(DHT.join( bootstrapIP, port ))
			return true;
		else
			return false;
	}
		
	
		/***** Public functions called from Add-in layer *****/
	
		public void GET( String UCI ){
		getManager.get( UCI, this.currentCUA, this.communicationHandler );
	};
		
	public void SET( String UCI, String value ){
		setManager.set( UCI, value, this.currentCUA, this.communicationHandler );
	};
		
	public void REGISTER( String UCI, Callback callback ){
	 	registerManager.register( UCI, callback );
	};
	
	public void SUBSCRIBE( String UCI, Callback callback ){
		subscribeManager.subscribe( UCI, callback );
	};
	
		public void SUBSCRIBE( String UCI, Callback callback, int TTL ){
			subscribeManager.subscribe( UCI, callback, TTL );
	};
		
	public void UPDATE( String UCI, String data ){
		updateManager.update( UCI, data );
	};
}