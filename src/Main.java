import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number ;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        number = input.nextInt();

        int total = 0;
        int basamak;

        while(number != 0 ) {
            basamak = number %10;
            number /= 10;
            total += basamak ;
        }
        System.out.println(total);
    }
}