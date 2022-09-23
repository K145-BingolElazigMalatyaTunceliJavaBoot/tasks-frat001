import java.util.Random;

public class RastgeleSayi
{
    public static void main (String args [] )
    {
        Random random = new Random();
        int sayi = random.nextInt( 500);
        if (sayi>50 && sayi<100)
        {
             System.out.println(sayi);
        }
        else {
            System.out.println(sayi);
        }

    }
}
