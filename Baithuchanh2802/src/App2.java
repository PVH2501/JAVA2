import static java.lang.System.out;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

		System.out.printf("Nhap so thuc a: ");
		int a =sc.nextInt();
		System.out.printf("Nhap so thuc b: ");
		int b =sc.nextInt();
		System.out.printf("Nhap so thuc c: ");
		int c =sc.nextInt();

		if( a<b+c && b<a+c && c<a+b ){
            if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                out.println("Day la tam giac vuong");
            else if(a==b && b==c)

                out.println("Day la tam giac deu");
            else if(a==b || a==c || b==c){
                if ( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
                    out.println("Day la tam giac vuông can");
                else
                out.println("Day la tam giac can");
            }
            else
                out.println("Day la tam giac thuong");
        }
        else
            out.println("Ba so a, b, c khong phai la ba canh cua mot tam giac");

    }}