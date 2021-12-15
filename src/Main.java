public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */


        int i = 1000;
        do{
            if(i%50 ==0)
            {
                System.out.println("liczba "+i+" podzielna przez 50");
            }
            else
            {
                System.out.println(i);
            }

        }while(--i > -1);


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        int a = 0;
        System.out.println("\n\nA)");
        int[] TabA = {5,8,21,684,14};
        while(a<5)
        {
            System.out.print(TabA[a] + "  ");
            a++;
        }System.out.println("\n\nB)");
        double[] TabB = {45.5,52.12,464.47,489.2,123.9};
        a=0;
        while(a<5)
        {
            System.out.print(TabB[a] + "  ");
            a++;
        }System.out.println("\n\nC)");
        String[] TabC = {"Tak","Nie","Może","Albo","Wiem"};
        a=0;
        while(a<5)
        {
            System.out.print(TabC[a] + "  ");
            a++;
        }System.out.println("\n\n");

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        while(true)
        {
            System.out.println("tak");
        }
       /* while(false)
        {
            System.out.println("nie");
        }
        */

    }
}
