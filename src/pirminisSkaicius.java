public class pirminisSkaicius {

    public static void main (String[] args)
    {
        int i =0;
        int skaicius =0;
        String  pirminisSkaicius = "";

        for (i = 1; i <= 100; i++)
          {
              int suma=0;
              for(skaicius =i; skaicius>=1; skaicius--)
            {
               if(i%skaicius==0)
               {
               suma = suma + 1;
               }
            }
               if (suma ==2)
               {
                  pirminisSkaicius = pirminisSkaicius + i + " ";
                }
           }
                System.out.println("Pirminis skaičius nuo 1 to 100 yra :");
                System.out.println(pirminisSkaicius);
    }
    }




