public class AsalSayi
{
    public static void main(String[] args)
    {
        int sayac;
        int toplam=0;

        for(int i = 3; i < 100; i++)
        {
            sayac = 0;
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    sayac++;
                }
            }
            if(sayac == 0)
            {
                toplam +=i;
            }

        }
        System.out.println( toplam );
    }
}
