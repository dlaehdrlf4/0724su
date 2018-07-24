package prec1;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSend {

	public static void main(String[] args) {
		try {
			// 보내는 멀티캐스트 소켓을 생성
			MulticastSocket ms = new MulticastSocket();
			// 문자열을 입력받기 위한 스캐너 만들기
			Scanner sc = new Scanner(System.in);
			// 닉네임 설정하기
			System.out.print("닉네임 입력:");
			String nick = sc.nextLine();
			while (true) {
				System.out.print("메시지(종료는 ff):");
				String msg = sc.nextLine();
				if (msg.equals("ff")) {
					msg = nick + "님이 퇴장함";
					// 보내는 패킷 만들기 - 내용,길이,받을곳의 주소, 포트번호
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(),
							InetAddress.getByName("230.100.50.5"), 9999);
					// 데이터 전송
					ms.send(dp);
					// 소켓과 스캐너 닫기
					ms.close();
					sc.close();
					break;
				} else {
					// 메시지 만들기
					msg = nick + ":" + msg;
					// 전송할 패킷 만들기
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(),
							InetAddress.getByName("230.100.50.5"), 9999);
					// 데이터 전송
					ms.send(dp);
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
