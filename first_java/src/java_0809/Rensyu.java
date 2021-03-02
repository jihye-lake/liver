package java_0809;

import javax.swing.*;

public class Rensyu 
{
	public static void main(String[] args) 
	{

		int answer = (int)(Math.random() * 100) +1;  //  1 부터 100까지 나온다. 더해주지 않으면 0부터 99까지 나옴

		int input = 0;
		String temp = "";
		int count = 0;
		
		do
		{
			// count ++;  //  여기서 카운트를 시켜주고 있음. 숫자를 맞추고 나면 맨 밑에 시도 횟수는 count 값에 들어가게 됨.
			temp = JOptionPane.showInputDialog(" 1 ~ 100 사이의 숫자를 입력하시오. " + "끝내려면 -1을 입력하시오." );  
			//  제공되는 툴임. 이게 '입력' 툴을 구현함. 이걸 만들기 위해서 위에 import 를 적어 줌

			if (temp == null || temp.equals("-1"))  //  null 이나 -1을 넣으면 끝내라는 뜻.
			{
				break;  // 파일문장을 벗어나라는 뜻.
			}
			
			System.out.println("입력 값 : " + temp);

			input = Integer.parseInt(temp);

			count++;

			if (answer > input)
			{
				System.out.println(" 더 큰 수를 입력하시오. ");
			}

			else if (answer < input) {
				System.out.println(" 더 작은 수를 입력하시오. ");

			}

			else {
				System.out.println(" 맞추었습니다. ");
				System.out.println(" 시도 횟수는 " + count + "번 입니다. ");
				break;
			}

		}
		while (true);

		System.out.println("Hello World!");
	}
}

