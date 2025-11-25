public class Loops {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 5) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("final counter: " + counter);
        counter = 0;
        while (counter < 5) {
            counter++;
            System.out.println(counter);
        }
        System.out.println("final counter: " + counter);
        counter = 10;
        while (counter < 5) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("final counter: " + counter);
        counter = 0;
        while (counter >= 0) {
            counter++;
        }
        System.out.println("final counter: " + counter);
    }
}
