import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void wypisz(List<String> lista)
    {
        for(String zmienna : lista) {
            System.out.print(zmienna+" ");
        }
    }

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

      /*  List<String> lista1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++)
        {
            System.out.println("Wpisz "+ i+" słowo: ");
            lista1.add(sc.nextLine());
        }

        wypisz(lista1);

        System.out.println("\n");
        lista1.remove(4);
        lista1.remove(3);
        lista1.add("Krowa");
        lista1.add("Kurczak");
        lista1.add("Jeleń");

        wypisz(lista1);
        System.out.println("\nWielkość listy: "+lista1.size());
        System.out.println("\n");

        Collections.sort(lista1, Collections.reverseOrder());

        wypisz(lista1);*/

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Set<String> liczby = new TreeSet<>();

        Scanner scl = new Scanner(System.in);
        for(int i = 0;i<10;i++)
        {
            System.out.println("Wpisz "+ i+" liczbe: ");
            liczby.add(scl.nextLine());
        }
        List<String> list = new ArrayList<String>(liczby);
        Collections.sort(list);
        liczby = new LinkedHashSet<>(list);
        System.out.print(liczby+" ");

        System.out.println("\n");
        List<String> list2 = new ArrayList<String>(liczby);
        Collections.sort(list2, Collections.reverseOrder());
        liczby = new LinkedHashSet<>(list2);
        for(String zmienna : liczby) {
            System.out.print(zmienna+" ");
        }
    }

}
