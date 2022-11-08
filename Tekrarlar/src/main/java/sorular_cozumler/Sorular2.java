package sorular_cozumler;

import java.util.Scanner;

public class Sorular2 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = input.nextInt();
        if (yas<0){
            System.out.println("Gecerli yas giriniz");
        } else if (yas>-1){
            System.out.println("bebek");
        } else if (yas>4) {
            System.out.println("cocuk");
        } else if (yas>12) {
            System.out.println("genc");
        } else if (yas>21) {
            System.out.println("yetiskin");
        }else System.out.println("Tanımlanmamıs evre");


    }
}
