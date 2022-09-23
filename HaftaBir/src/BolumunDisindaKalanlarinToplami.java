public class BolumunDisindaKalanlarinToplami
{
    public static void Bolum(int sayi1, int sayi2)
    {

        for(int i = sayi1; i < sayi2; i++)
        {
            if (i % 3 != 0)
            {
                System.out.println(+i);
            }
        }
    }
    public static void main(String[] args)
    {
        Bolum(200,500);
    }
}
