import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestFtpRequest extends TestCase {
	
		Socket sock;
		FtpRequest ftp;
		
	@Before
	public void initialize() throws IOException {
		sock = Mockito.mock(Socket.class);
		ftp = Mockito.spy(new FtpRequest(sock,""));
	}
	
	@Test
	public void testProcessRequestUser(){
		ftp.processRequest("USER name"); 
		Mockito.verify(ftp).processUser("name");
	}
	
	@Test
	public void testProcessRequestPass(){
		ftp.processRequest("PASS pwd"); 
		Mockito.verify(ftp).processPass("pwd");
	}
	
	@Test
	public void testProcessRequestRetr(){
		ftp.processRequest("RETR name"); 
		Mockito.verify(ftp).processRetr("name");
	}
	
	@Test
	public void testProcessRequestStor(){
		ftp.processRequest("STOR name"); 
		Mockito.verify(ftp).processStor("name");
	}
	
	@Test
	public void testProcessRequestList(){
		ftp.processRequest("LIST"); 
		Mockito.verify(ftp).processList();
	}
	
	@Test
	public void testProcessRequestQuit(){
		ftp.processRequest("QUIT"); 
		Mockito.verify(ftp).processQuit();
	}
	
	@Test
	public void testProcessRequestUnkownCMDError(){
		ftp.processRequest("Hibou"); 
		
		// erreur 500
		;
	}
	
	@Test
	public void testProcessUserRenvoie331(){
		final String rep = ftp.processUser("antoine");
		assertTrue(rep.startsWith("331"));		
	}
	
	@Test
	public void testProcessPassRenvoie530SiUtilisateurNonInitialise(){
		final String rep = ftp.processPass("truc");
		assertTrue(rep.startsWith("530"));		
	}
	
	@Test
	public void testProcessPassRenvoie257SiUtilisateurBienConnecte(){
		ftp.processUser("test");
		final String rep = ftp.processPass("test");
		assertTrue(rep.startsWith("257")); // TODO A ameliorer
	}
	
	@Test
	public void testProcessPassRenvoie230SiUtilisateurDejaConnecte(){
		ftp.processUser("test");
		ftp.processPass("test");
		final String rep = ftp.processPass("test"); 
		assertTrue(rep.startsWith("230")); // TODO A ameliorer
	}
	
}
