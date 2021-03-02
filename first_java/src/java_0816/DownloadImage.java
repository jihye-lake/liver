package java_0816;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {

		String website = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGZUkhY4bkaLxkzDXsI0k_dVgunJ4Iy6dcV_txDfv39lXBmqjXwA";
		System.out.println("" + website + "사이트에서 이미지를 다운로드합니다.");

		URL url = new URL(website);
		byte[] buffer = new byte[2048];

		try (InputStream in = url.openStream(); OutputStream out = new FileOutputStream("car_1_1_2.jpg");) {
			int length = 0;

			while ((length = in.read(buffer)) != -1) {
				System.out.println("" + length + "바이트 만큼 읽었음!");
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}

	}

}
