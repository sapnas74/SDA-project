package sdaakademija.sandbox;

public class SandBoxMe {

    public static void main(String[] args) {

        int sveikasSkaicius = 2;
        double skaiciusPerKableli = 3.14;
        // cia double domenu tipas
        int naujasVienas = 192;
        int naujasDu = 168;
        int naujasTris = 1 ;
        int naujasKeturi = 10;
        double doubleNum = 23.363736;
        int x = 4;
        int y = 10;

        double z = 89.383;
        int k = (int) z ;
        // kastini (cast) kintamaji



        System.out.println( sveikasSkaicius );
        System.out.println( skaiciusPerKableli );
        System.out.println( Integer.MAX_VALUE);
        System.out.println( Integer.MIN_VALUE);
        System.out.println( Double.MAX_VALUE);
        System.out.println( Double.MIN_VALUE);
        // Sitoje vietoje Double - yra objektas ! Kreipiamias is sita objekta
        // pasitrniruok dadek + 1 pvz. Surask vysu Byte , BigDecimal ir t.t.

        System.out.printf( "%x:%x:%x:%x", naujasVienas, naujasDu, naujasTris, naujasKeturi );
        // %x - 16tainiu sakiciu formatas

        System.out.printf("%.2f", doubleNum );
        // apvalinam sakiciu iki 2ju skaitmenu po kablelio

        System.out.println( x == 10 && y <= 5 );
        System.out.println( x <= 10 && y > 5 );
        System.out.println( x==10 || y >= 5 );

        System.out.println( k );
        // kastinamas - vieno domenu tipo pavertimas kitu.

    }
}
