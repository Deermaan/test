package loop;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1 ; i<6  ; i++ ){
            System.out.println("Hi");// Yukarıdaki koşullar altında 5 kere Hi yazdırmış olduk.
        }
        System.out.println();
        for (int i = 4; i <8 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 14; i >5 ; i--) {
            System.out.print(i +" "); //14ten 5e kadar 5 dahil olmayacak şekilde yazdırdık
        }
        System.out.println();

        //Example : 13 den 5 e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        //1. yol
        for (int i = 14; i >5  ; i=i-2) {
            System.out.print(i + " ");//14 12 10 8 6

        }
        //2. yol
        for (int i = 14; i >4 ; i--) {
            if (i%2==0){ // i nin 2ye bölümünden kalan sıfırsa ekrana i yi yazdıracak
                System.out.println(i + " ");
            }

        }
        System.out.println();
        //Example : 28 den 157 e kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 28; i <158 ; i++) {
            if (i%2==1){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //Example : "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz
        String str = "Java";
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i)+ "*");
        }

        System.out.println();
        //Example 8: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
        //           "Hellooo Ali" ==> He Ai
        String str2 = "Hellooo Ali";
        for (int i = 0; i <str2.length(); i++) {
            char c = str2.charAt(i);
            if(str2.indexOf(c)==str2.lastIndexOf(c)){
                System.out.print(c);
            }
        }

        System.out.println();

        //Example : 3 den 6 a kadar tamsayilarin toplamini bulan kodu yaziniz
        int sum = 0;
        for (int i = 3; i <7 ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //Example : 6 den 3 a kadar tamsayilarin carpimini bulan kodu yaziniz
        int carp = 1;
        for (int i = 6; i >2 ; i--) {
            carp = carp * i;
        }
        System.out.println(carp);
        System.out.println();

        //**Example : Size verilen bir tamsaya 124 arttırılana kadar bir arttırarak sayı ekleyin
        int SAYi = -2000;
        for (int i = 0; i <124 ; i++) {
            SAYi = SAYi + i;
            System.out.println(SAYi);
        }

        //Example : Size verilen bir tamsayinin rakamlari toplamini bulunuz
        int sayi = 385;
        int sonuc = 0;
        for (int i = sayi; i >0 ; i=i/10) {
                sonuc = sonuc+ i%10;
        }
        //Example 4: Size verilen bir String'i ters ceviren kodu yaziniz.
        //           "Kaba" ==> "abaK"
        String kaba= "Kaba";
        //Concatenation yapacaksaniz empty String ("") kullanin
        String ters = "";
        for (int i = kaba.length()-1; i >=0 ; i--) {
            char c = kaba.charAt(i);
            ters = ters + c;

        }
        System.out.println(ters);

        System.out.println();

        //Example  : Bir String'deki "m" karakteri haric tum karakterleri yazdiriniz
        //Andromeda == Adroeda
        String m = "madam";

        // 1. yol

        for (int i = 0; i <m.length() ; i++) {
            char c = m.charAt(i);
            if (c!='m'){
                System.out.println(c);
            }
        }

        //2. yol
        for (int i = 0; i <m.length() ; i++) {
            char c = m.charAt(i);
            if (c=='m'){
                continue;   //Bosveeeer! ==> Loop'un icinde bazi degerler icin Loop'un calismamasini isterseniz "continue" kullaniniz
            }
            System.out.println(c);
        }


        //Example : 1'den 100 kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz
        for (int i = 1; i <101 ; i++) {
            if (i%6==0){
                continue;
            }
            System.out.print(i + " ");

        }

        System.out.println();


        //Example 3: Size verilen bir String'deki 'm' den onceki karakterleri yazdiriniz
        //           Luxemburg ==> Luxe
        String s = "Luxemburg";

        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if (c=='m'){
                break;
            }
            System.out.println(c);
        }
    }
}
