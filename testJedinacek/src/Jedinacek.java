public class Jedinacek {
    private static Jedinacek singletonInstance;
    private static int counter = 0;

    // private Jedinacek() {}

    public static Jedinacek getInstance() {
        if (null == singletonInstance) {
            singletonInstance = new Jedinacek();
        }
        return singletonInstance;
    }

    public void increaseCounter(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}