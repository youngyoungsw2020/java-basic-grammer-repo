package lecture5.anonymouslecture.main;

import lecture5.anonymouslecture.Animal;
import lecture5.anonymouslecture.Cat;

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
