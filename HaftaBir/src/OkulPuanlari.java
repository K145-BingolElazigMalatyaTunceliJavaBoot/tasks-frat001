import java.util.Scanner;

public class OkulPuanlari
{
    public static void main(String[] args)        //İf Else Yapısıyla Notların Harf Değerini Bulma Programı
    {
        System.out.println("Okul Puanınızı Giriniz:");
        Scanner scan= new Scanner(System.in);
        int not= scan.nextInt();
        if (not>101){
            System.out.println("Geçersiz Not");
        }
        else if (not>70 && not<=100){
            System.out.println("Harf notu AA");
        }
        else if (not>50 && not<=70) {
            System.out.println("Harf notu BB");
        }
        else if (not>35 && not<=50) {
            System.out.println("Harf notu DC");
        }
        else if (not>=0 && not<=35) {
            System.out.println("Harf notu FF");
        }
    }
}
