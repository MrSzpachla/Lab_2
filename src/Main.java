import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        for(int i = 100; i > -1; i--){
            if(i%50 ==0)
            {
                System.out.println("liczba "+i+" podzielna przez 50");
            }
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        int[] tablica = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<5;i++)
        {
            System.out.println("Wpisz "+ i+" liczbę:");
            tablica[i] = scan.nextInt();
        }
        for(int zmienna : tablica)
        {
            System.out.print((zmienna+11)+" ");
        }

    }
}
