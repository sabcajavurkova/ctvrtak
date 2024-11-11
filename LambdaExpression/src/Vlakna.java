public class Vlakna {
    public static void main(String[] args) {
        // Kratsi a kratsi zapisy vlaken:

        Runnable vlakno1 = new Runnable() {
            public void run() {
                for(int i = 0; i<=100; i++)
                    System.out.println(i);
            }
        };
        Thread tr1 = new Thread(vlakno1);

        Runnable vlakno2 = () -> {
            for(int i = 'a'; i<='z'; i++)
                System.out.println(i);
        };
        Thread tr2 = new Thread(vlakno2);


        Thread tr3 = new Thread(() -> {
            for(int i = -1; i>-100; i--)
                System.out.println(i);
        });

        tr1.start();
        tr2.start();
        tr3.start();
    }
}
