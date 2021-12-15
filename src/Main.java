import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void uzup(int tab[])
    {
        int a = 40;
        for(int i = 0;i<20;i++)
        {
            tab[i] =a;
            a--;
        }
        return;
    }

    public static void wypisz(int tab[])
    {
        for(int zmienna : tab)
        {
            System.out.print(zmienna+" ");
        }
        return;
    }

    public static void wpiszs(String tab[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<6;i++)
        {
            System.out.println("Wpisz "+ i+" słowo: ");
            tab[i] = sc.nextLine();
        }return;
    }
    public static void wypiszs(String tab[])
    {
        for(int z = 5; z>=0;z--)
        {
            System.out.print(tab[z]+" ");
        }return;
    }

    public static void wy(String i)
    {
        System.out.println(i);
    }
    public static void wy(String i,String b)
    {
        System.out.println(i+" "+b);
    }
    public static void wy(String i, String b, int x)
    {
        System.out.println(i+" "+b+" "+x);
    }
    public static int suma(int x, int y)
    {
        int c = x+y;
        return c;
    }
    public static int suma(int x, int y,int z)
    {
        int c = x+y+z;
        return c;
    }

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        int[] tablica = new int[20];
        uzup(tablica);
        wypisz(tablica);
        System.out.print("\n");

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String[] Tab2 = new String[6];
        wpiszs(Tab2);
        wypiszs(Tab2);
        System.out.print("\n");

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        String Imie = "Kamil";
        String Nazwisko = "Paszkiet";
        int wiek = 24;
        wy(Imie);
        wy(Imie,Nazwisko);
        wy(Imie,Nazwisko,wiek);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        System.out.print("\n");
        System.out.println("wynik: " + (suma(8, 9) + suma(2, 3, 4)));


    }

}
