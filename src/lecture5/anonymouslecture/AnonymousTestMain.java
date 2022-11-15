package lecture5.anonymouslecture;

public class AnonymousTestMain {
    public static void main(String[] args) {

        // basic type
        Animal animal1 = new Cat();

        // example of Anonymous Class
        Animal animal2 = new Animal() {
            @Override
            public void run1() {

            }
        };
    }
}
