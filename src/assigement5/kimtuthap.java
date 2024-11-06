
package assigement5;

import java.util.Scanner;

public class kimtuthap {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap phan tu n cho kim tu thap: ");
        int n= scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
