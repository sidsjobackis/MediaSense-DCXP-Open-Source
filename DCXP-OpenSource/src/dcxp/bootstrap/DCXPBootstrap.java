package dcxp.bootstrap;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment 
 */
public interface DCXPBootstrap {

	/**
	 * 
	 */
	public void start();
	
	
	/**
	 * 
	 * @param ip
	 * @param port
	 */
	public void start( String ip, String port );
	
}
