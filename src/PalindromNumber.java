import java.io.BufferedReader;
import java.io.Reader;
import java.util.Scanner;

import org.testng.Assert;

import io.netty.channel.unix.Buffer;

public class PalindromNumber {

	
	public static void main(String[] args) {
		System.out.println("original palindrom started ");
		Scanner sc = new Scanner(System.in);
		int PlindromOriginal = sc.nextInt();

		System.out.println("original palindrom number is " + PlindromOriginal);

		StringBuffer br = new StringBuffer(String.valueOf(PlindromOriginal));
		StringBuffer PlindromReverse = br.reverse();

		if(PlindromOriginal==PlindromReverse) {
			
		}
		System.out.println("this is the pilindrom number");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
