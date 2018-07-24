package prec1;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastRecieve {

	public static void main(String[] args) {
		try {
			//�޴� ��Ƽĳ��Ʈ ���� �����
			MulticastSocket ms = new MulticastSocket(9999);
			//�׷쿡 ���� - 224.0.0.0 ���� 239.255.255.255 ������ �ּ�
			ms.joinGroup(InetAddress.getByName("230.100.50.5"));
			//���� �ݺ��ؼ� �޽��� �ޱ�
			while(true) {
				//����Ʈ �迭 ����
				byte [] b = new byte[512];
				//�����͸� ���۹��� ��Ŷ �����
				DatagramPacket dp = new DatagramPacket(b,512);
				//������ �ޱ� - �����Ͱ� �ö����� ���
				ms.receive(dp);
				//����Ʈ �迭�� ���ڿ��� ��ȯ�ϱ�
				String msg = new String(b);
				//ȭ�鿡 ������ �����ϰ� ���
				System.out.println(msg.trim());
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
