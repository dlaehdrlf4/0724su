package prec1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class BroadcastSend {

	public static void main(String[] args) {
		try {
			//UDP 전송을 위한 소켓 생성
			DatagramSocket ds = new DatagramSocket();
			Scanner sc = new Scanner(System.in);
			System.out.println("닉네임을 입력:");
			String nick = sc.nextLine();
			String msg = nick + "님이 전송할 준비가 되었습니다.";
			//닉네임 전송
			DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("192.168.0.255"),7777);
			ds.send(dp);
			
			while(true) {
				System.out.print("메시지:");
				msg = sc.nextLine();
				msg = nick + ":" + msg;
				DatagramPacket dp1 = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("192.168.0.255"),7777);
				ds.send(dp1);
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
