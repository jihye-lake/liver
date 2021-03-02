package java_0816;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CaesarCipher {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("src\\txts\\input_1.txt");
		BufferedReader br = new BufferedReader(fr);
		String plaintext = br.readLine();

		System.out.println(CaesarCipher.encode(plaintext, 3));
		System.out.println(CaesarCipher.decode(CaesarCipher.encode(plaintext, 3), 3));
		fr.close();
	}

	public static String decode(String enc, int offset) {
		return encode(enc, 26 - offset);
	}

	public static String encode(String enc, int offset) {
		offset = offset % 26 + 26;
		StringBuilder encoded = new StringBuilder();
		for (char i : enc.toCharArray()) {
			if (Character.isLetter(i)) {
				if (Character.isUpperCase(i)) {
					encoded.append((char) ('A' + (i - 'A' + offset) % 26));
				} else {
					encoded.append((char) ('a' + (i - 'a' + offset) % 26));
				}

			} else {
				encoded.append(i);
			}
		}
		return encoded.toString();
	}

}
