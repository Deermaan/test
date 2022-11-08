package loop;

import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {

        // Ekrana 10 kere "java güzeldir" yazdırın.

        for (int i = 0; i <10 ; i++) {

            System.out.println("java güzeldir");
        }
        System.out.println();

        // 10 ile 30 arasındaki sayıları aralarında virgul olarak aynı satırda yazdır.
        for (int i = 10; i <31 ; i++) {
            System.out.print(i+ ",");
        }
        System.out.println();
        //100den başlayarak 50ye (dahil) kadar olan sayıları aralarında vir. olc. şek. yan yana yaz
        for (int i = 100; i >49 ; i--) {
            System.out.print(i+",");
        }
        System.out.println();
        // Kullanıcıdan 100den küçük bir tamsayı isteyin. 1 den başlayarak girilen sayiya kadar 3ün katı olanları yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("LÜtfen 100den kucuk bir tam sayı giriniz.");


        int sayi = input.nextInt();
        for (int i = 1; i <sayi ; i++) {

            if (sayi>101){
                System.out.println(" 100den kucuk bir tam sayı gir. program kapanıyor.");
                break;

            } else if (i%3==0) {
                
            }

            System.out.println(i);
        }
        System.out.println();
//Kullanıcıdan 100den kücük bir tamsayı isteyin 1 den başlayarak girilen sayıya kadar üc veya beşin katı olan sayıları yaz
        Scanner input1 = new Scanner(System.in);
        System.out.println("LÜtfen 100den kucuk bir tam sayı giriniz.");


        int sayi1 = input1.nextInt();
        for (int i = 1; i <sayi1 ; i++) {
                if (i%5==0 || i%3==0){
                    System.out.println(i);
                }
        }








    }
}
