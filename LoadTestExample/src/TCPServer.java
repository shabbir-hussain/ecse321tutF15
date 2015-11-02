import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Code obtained from: https://systembash.com/a-simple-java-tcp-server-and-tcp-client/
 * @author shabbir
 *
 */
public class TCPServer {
	
	int sPort;
	public TCPServer(int port){
		sPort = port;
	}
	
	public void serve() throws IOException{
		ServerSocket sSocket = new ServerSocket(sPort);
		int count = 0;
		double avg = 0;
		
		System.out.println("ServerStarted!\n\n");
		
		while(true){
			long start = System.currentTimeMillis();
			Socket connectionSocket = sSocket.accept();
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			outToClient.writeBytes(getWebpage());
			connectionSocket.close();	
			long stop = System.currentTimeMillis();
			long serviceTime = stop-start;
			if(count==0){
				avg = serviceTime;
				count++;
			}else{
				avg = (avg*count + serviceTime)/(++count);
			}
			System.out.println("Serviced Request in: "+serviceTime+" ms Avg: "+avg+ " ms/req Total: "+count+" req");
		}
	}
	
	public String getWebpage() throws IOException{
		String fileName ="Website.html";
		String site = "";
		String line;
		
		FileReader fileReader = 
            new FileReader(fileName);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = 
            new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
            site += line;
        }
        
        // Always close files.
        bufferedReader.close();         
		return site;
	}

	public static void main(String args[]) throws IOException{
		new TCPServer(8520).serve();
	}
}
