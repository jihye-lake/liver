package java_0816;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class InetAddress_3 { // 라고 썼지만, InetAddress_2_1 와 마찬가지.
// 규모가 큰 사이트(daum, google 등)는 IP를 하나만 갖고 있지 않다. 어떻게 하면 여러 개가 나오는 지 보자.
	public static void main(String[] args) throws Exception {

		String url = null;

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("웹사이트 이름을 입력하시오. ");
		url = read.readLine();

		InetAddress[] addr = InetAddress.getAllByName(url);  // 여러 개가 배열속에 다 들어간다는 뜻.

		System.out.println("==============================");

		System.out.println(url + "는 " + addr.length + "개의 IP 주소를 갖고 있습니다.");

		for (int i = 0; i < addr.length; i++) {
			System.out.println((i + 1) + "번 IP 번호 : " + addr[i].getHostAddress());
			// goggle 이나 oracle 같은 사이트는 IP 주소가 하나만 뜨게끔 막아놓은 모양
		}
	}

}
