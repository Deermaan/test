package genel_tekrar;

public class GenelTekrar {

    /*
                                         Variables



   Variable oluştururken;
   1)Access modifier          2) Data type             3) Variable name         4)=     5) Deger        6);

   Data Types;
                                     Primitive Data Types
        1) byte: Tamsayılar icin kullanılır. 8 bit kullanır.
        2) short: Tamsayılar icin kullanılır. 16 bit kullanır.
        3) int: Tamsayılar icin kullanılı. 32 bit kullanılır.
        4) long: Tamsayılar icin kullanılır. 64 bit kullanır.
        5) float: Ondalıklı sayılar icindir. 32 bit kullanır.
            *"float"tan sonra ya 'f' ya da 'F' kullanılmalıdır
        6) double: Ondalıklı sayılar ıcın kullanılır 64 bit kullanır.
        7) boolean: "true" veya "false" degeri icin kullanılır. 1 bit kullanır.
        8) char: Tek karakterler icin kullanılır. 16 bit kullanır
            * "char"lara değer verirken, degeri tek tırnak arasına koymalıyız.

                                        Non-Primitive
        String: Isım, adres, kimlik no gibi bir veya birden fazla karakter iceren degerlerde kullanılır.
             **String degerleri çift tırnak arasına konulmalıdır.


        Primitive ile Non-Primitive lerin farki nedir?
              1)Non-primitive data type'larinda degerin yaninda method'lar vardir.
                Primitive data type'larinda ise sadece deger vardir, method yoktur.
              2)Primitive data type'lari  Java tarafindan olusturulmustur, toplam 8 tanedir, biz Primitive data olusturamayiz
                Non-Primitve data type'lari Java tarafindan da olusturulmustur, biz de olusturabiliriz. Non-Primitive sayilamayacak
                kadar coktur, cunku her developer Non-Primitive data type olusturabilir.
              3)Primitive data type isimleri kucuk harflerle baslar
                Non-Primitive data type isimleri buyuk harfle baslar
              4)Primitive data type'lar memory'de farkli buyuklukte yerler kullanir.
                Non-Primitive'lerin hepsi memory'de ayni buyuklukte yer kullanirlar.

             ** Siz "long" demenize ragmen Java verilen sayiyi "int" kabul eder
             ** Bu yuzden, long bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz
       --public long populationOfWorld = 7000000000L;

             **Note: "main method" arabanin motoru gibidir."main method" calismadan hicbirsey calismaz.



                                        Method Creation
              **Main method icinde kullanacağımız herşey "static" olmalıdır.

      i)System.out.println() ==> Satirbasi yapar
      ii)System.out.print() ==> Satirbasi yapmaz

//Example : Toplama islemi yapan bir method olusturunuz
    public static double toplamaYap(double a, double b){return a+b;}

      Object nasil olusturulur?

      1)Class ismini yaziniz     2)Objeye bir isim veriniz     3) =        4)new keyword'unu kullan        5)Class ismi parantezle beraber(Constructor)


                                    Memory Kullanımı

        1) Java da iki türlü memory vardır.
                 i)Stack Memory:
                         a) Kücük memorydir
                         b)Primitive ve Non-Primitivelerin referencelerini icerir.
                 ii)Heap Memory:
                         a) Büyük memorydir.
                         b) Non-Primitiveleri icerir.
         2) Java Heap Memorye yerkeştşrşlen her non-primitive data icin bir reference olusturur ve bu reference, Stack Memorye koyar.
            Herhangi bir sebepten reference silinirse Java referencesi olmayan Heapteki non-primitive datayı otomatik siler.
            Memorynin temizliğini sağlayan "Garbage Collector" vardır.




                                              Type Casting
        Type casting : Bir numerik data typeını diğer numerik data typea çevirmek demektir.
            **byte<short<int<long<float<double
            **Kücük data typeı büyük data typea çevirmeye Auto Widening denir.
            **Büyük data typeı kücük data typea cevirmeye Explicit Narrowing denir.

//Example : short'u double'a ceviren kodu yaziniz. (auto widening)

    short cevirme = 233;
    double cevrilmiş = cevirme

// Example 2: float'i byte yapan kodu yaziniz. (explicit widening)
    float price = 12.99F;
    byte newPrice = (byte)price;

    sout(newPrice); //12 return eder. Neden 12.99 değil ;

    **Java ondalıklı sayıları tam sayıya cevirirken yuvarlama islemi yapmaz.
    **Java ondalıklı sayıyı, tam sayıya cevirirken ondalık kısmını siler.

    int number = 515;
    byte newNumber = (byte)number;
    Sout(newNumber); //3 ==> Java 515'i 256(byte daki sayilarin sayisi)'ya boldu kalani return etti.



                                        Wrapper Class
        Java primitivelere methodlar ekleyerek yeni bir yapı olusturdu bu yapıya wrapper class denir.

                Primitive                   Wrapper

                byte                        Byte
                short                       Short
                int                         Integer
                long                        Long
                float                       Float
                double                      Double
                boolean                     Boolean
                char                        Character

        Mesela normalde byte yazıp "nokta" koyarsak herhangi bir method görmeyiz ama Byte yazarsak görürüz

//Example 1: byte data type'inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.
    System.out.println(Byte.MIN_VALUE);//-128
    System.out.println(Byte.MAX_VALUE);//127

      **"primitive"ler nasil "wrapper"lara cevrilir(Autoboxing)
    float f1 = 13.99F;
    Float wrapperF1 = f1;

      **"wrapper"lar nasil "primitive"lere cevrilir(Unboxing)
    Character w1 = 's';
    char primitiveW1 = w1;

      **Note: Autoboxing ve Unboxing Java tarafindan otomatik olarak yapilir


                                          Scanner
        Scanner kullanıcıdan data almaya yarar, kullanıcı ile etkileşim kurmamıza olanak sağlar.
        Scanner bir Java Classıdır bu Classı kullanabilmek icin import etmek gerekir.
        Scanner Classı javanın util kutuphanesindedir.

        --Kullanicidan data almak icin yapilmasi gerekenler;

        1.Adim: Scanner Class'indan object olusturun
        2.Adim:Kullaniciya ne yapacagini soyle
        3.Adim: Kullanicidan aldiginiz data'yi bir variable'in icine koyun

//Example : Sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz

    Scanner input = new Scanner(System.in);

    sout("İlk sayıyı giriniz");
    double sayı1 = input.nextDouble();

    sout("ikinci sayıyı giriniz");
    doble sayı2 = input.nextDouble();

    sout(sayı1+sayı2);


//Example: Kullanıcıdan bir dikdörtgenin en ve boyunu alıp alan ve cevresini hesaplayan kodu yazınız.

    Scanner input = new Scanner (System.in);

    sout("kisa kenari giriniz");
    double En = input.nextDouble();

    sout("uzun kenari giriniz");
    double Boy = input.nextDouble();

    sout("Alan :" + En*Boy);
    sout("Çevre "+ 2*(En+Boy));




            Kullanicidan ilk, orta ve soy ismini, kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
            Ali Mert Can
            123456789

       Scanner input = new Scanner(System.in);

         1. Yol
        System.out.println("Ilk isminizi giriniz...");
        String ilkIsim = input.next();

        **next() methodu kullanicidan String datasi almak icin kullanilir

        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = input.next();

        System.out.println("Soy isminizi giriniz...");
        String soyIsim = input.next();

        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);

        2.Yol:

        System.out.println("Ilk, orta, soy isminizi ve kimlik numaranizi giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

           **next() ile nextLine() in farki nedir?
           **next() methodu kulanicidan gelen String'in sadece ilk kelimeisni alir.
           **nextLine() methodu kulanicidan gelen String'in tamamini alir.

        3. Yol:
        sout("ilk,orta,soy isminizi giriniz");
        String tamIsim = input.nextLine();
        sout(tamIsım);

        sout("Kimlik no giriniz")
        String kimlik= input.next();
        sout(kimlik);

        **Not: char variableları matematiksel işlerde kullanılırsa java onların ASCII degerlerini alır
            Orneğin ; sout('A'+'C'); ekrana AC yerine 132 yazdırır.
        **Not: Java da + sembolünün iki anlamı vardır.
                    i)Toplama
                    ii)Birleştirme
        **Java + görünce önce toplama yapmaya çalışır yapamazsa birleştirme işlemi yapar, ikisi de olmazsa hata verir


//Example: Kullanıcıdan ilk ve soy ismini alınız, ilk ve soy isminin ilk harflerini ekrana yazdıınız.

            Scanner input= new Scanner(System.in);



            1.yol

            sout("İlk adınızı giriniz");
            char ilk= input.next().charAt(0);
            sout("Soy adınızı giriniz.");
            char son= input.next().charAt(0);
            sout(""+ilk+son);


            2. yol

            sout("Tam isminizi giriniz");
            String tam =input.nextline();

            char ilkHarf = tam.charAt(0);
            sout(ilkHarf);

            char soyIsım = tam.split(" ")[1].charAt(0);
            ** spaceden iki ismi kesti ilkini attı 2.yi 1.olarak belirledi yeni 1.nin 0. indexini aldı. yani soyadın ilk harfini
            sout(soyIsım);


                                                     If Statement

































     */












































































































































































    //bitti
}
