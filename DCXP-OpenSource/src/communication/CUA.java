package communication;

/**
 * @author 	Jonas Bäckström & Henrik Hagsved
 * 			Institution of Information Technology and Media
 * 			Mid Sweden University
 *
 * @Comment This object contains the information required to send messages to a CUA
 */
public class CUA {

	private String URI;
	private int port;
	
	
	public CUA(String URI, int port){
		this.URI = URI;
		this.port = port;
	}
	
	public int getPort(){
		return this.port;
	}
	
	public String getURI(){
		return this.URI;
	}
}
