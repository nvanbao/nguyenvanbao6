
package assigement5;

import java.util.Scanner;

public class finaboci {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu n cho finaboci: ");
        int n = scanner.nextInt();
        int fi1=0 , fi2=1;
        for(int i=1 ; i<=n ; i++){
            System.out.print(fi1+ " ");
            int next = fi1+fi2;
            fi1=fi2;
            fi2=next;
        }
    }
}
