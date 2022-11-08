package youtube.vid1;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int Fizik,Matematik,Turkce,Kimya,Muzik,Tarih;

        System.out.println("Fizik notunu giriniz");
        Fizik= input.nextInt();

        System.out.println("Matematik notunu giriniz");
        Matematik= input.nextInt();

        System.out.println("Türkce notunu giriniz");
        Turkce= input.nextInt();

        System.out.println("Kimya notunu giriniz");
        Kimya= input.nextInt();

        System.out.println("Müzik notunu giriniz");
        Muzik= input.nextInt();

        System.out.println("Tarih notunu giriniz");
        Tarih= input.nextInt();

       System.out.println("Not ortalamanız"+(Fizik+Matematik+Turkce+Tarih+Kimya+Muzik)/6.0);





    }

}
