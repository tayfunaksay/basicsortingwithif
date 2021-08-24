import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayı(a) : ");
        int a = sc.nextInt();
        System.out.print("2. sayı(b) : ");
        int b = sc.nextInt();
        System.out.print("3. sayı(c) : ");
        int c = sc.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.printf("a<c<b");
            }
        } else if ((a > b) && (a > c)) {
            if (b < c) {
                System.out.println("b<c<a");
            } else {
                System.out.println("c<b<a");
            }
        } else {
            if (c<b){
                System.out.println("c<a<b");
            }else  {
                System.out.println("b<a<c");
            }
        }

    }
}
