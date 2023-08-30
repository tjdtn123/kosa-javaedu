package day10;
import java.net.*;
public class InetAddressTest {
	public static void main(String[] args) throws Exception {
		InetAddress inet = InetAddress.getLocalHost(); //내 pc 시스템 IP    팩토리매서드
		System.out.println(inet);
		inet = InetAddress.getByName("www.naver.com"); 
		System.out.println(inet);
	}
}
