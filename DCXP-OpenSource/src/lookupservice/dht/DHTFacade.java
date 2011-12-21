package lookupservice.dht;


/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment 
 */
public interface DHTFacade {

	/**
	 * 
	 * @param UCI
	 */
	public void registerNewUCI( String UCI );
	
	
	/**
	 * 
	 * @param UCI
	 * @return
	 */
	public String resolve( String UCI );
	
	
	/**
	 * 
	 */
	public void join();
	
	
	/**
	 * 
	 * @param ip
	 * @param port
	 */
	public void join( String ip, String port );
	
}
