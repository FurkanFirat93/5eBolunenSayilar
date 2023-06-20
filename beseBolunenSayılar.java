import java.rmi.server.RMIFailureHandler;
import java.util.Scanner;

public class beseBolunenSayılar {
public static void main(String[] args) {
	//Verilen iki int sayı arasındaki 5'e bölünen sayıları yazdıran program
	Scanner s = new Scanner(System.in);
	System.out.println("Lütfen 2 sayı giriniz: ");
	System.out.print("Birinci Sayı: ");
	int a = s.nextInt();
	System.out.print("İkinci Sayı: ");
	int b = s.nextInt();
	int i;
	
	if(a>b) {
		for(i=b+1;i<a;i++) {
			if((i%5)==0) {
				System.out.println("5'e bölünen sayılar: " + i);
			}
		}
	}
	else if(b>a) {
		for(i=a+1;i<b;i++) {
			if((i%5)==0) {
				System.out.println("5'e bölünen sayılar: " + i);
			}
		}
	}
	else {
		System.out.println("Girilen Sayılar birbirine eşittir.");
	}
}
}
