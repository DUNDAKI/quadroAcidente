import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class BuscarIP {

	public static void main(String[] args) throws UnknownHostException {
		
		ip3();
	}
	public static void ip3() throws UnknownHostException {
		InetAddress[] localaddr;

		try {
		    localaddr = InetAddress.getAllByName("Host.name");

		    for(int i = 0; i < localaddr.length; i++){
		        System.out.println("\n" + localaddr[i].getHostAddress());
		    }
		} catch (UnknownHostException e) {
		    e.printStackTrace();
		}
	
	}
	
	public static void ip2() {
		InetAddress ia = null;
		try {
		ia = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
		e.printStackTrace();
		}

		System.out.println("IP: " + ia.getHostAddress());
		System.out.println("Nome: " + ia.getHostName());
	}
	
	public static void ip() {
		Enumeration nis = null;
		try {
		nis = NetworkInterface.getNetworkInterfaces();
		} catch (SocketException e) {
		e.printStackTrace();
		}
		while (nis.hasMoreElements()) {
		NetworkInterface ni = (NetworkInterface) nis.nextElement();
		Enumeration ias = ni.getInetAddresses();
		while (ias.hasMoreElements()) {
		InetAddress ia = (InetAddress) ias.nextElement();
		System.out.println(ni.getName() + " -> ip: " + ia.getHostAddress() + " - hostname: " + ia.getHostName());
		}
		}
	}

}