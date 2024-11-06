
package assigement5;

import java.util.Scanner;

public class bangcuuchuong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so n de ra bang cuu chuong tu 1 den 10: ");
        int n = scanner.nextInt();
        for(int i=1; i<=10;i++){
            int next = n*i;
            System.out.println("Bang cuu chuong " + i + " la: "+ next);
        }
    }
}
