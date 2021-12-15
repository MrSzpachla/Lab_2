public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for(int i = 0; i < 10; i++)
        {
            if(i==3)
                break;
            System.out.println("tak");
        }
        System.out.println("\n");
        for(int i = 10; i < 15; i++)
        {
            if(i==12)
                continue;
            System.out.println("Nie");
        }
        System.out.println("\n");
        for(int i = 0; i < 10; i++)
        {
            if(i==3)
                return;
            System.out.println("Moze");
        }

    }
}
