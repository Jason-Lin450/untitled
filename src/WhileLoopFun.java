public class WhileLoopFun {

    public WhileLoopFun() { }

    public void printDigits(int number) {
        while (number > 0) {
            System.out.println(number % 10);
            number /= 10;
        }
    }

    public int countLetter(String word, String letter) {
        int i = 0;
        int count = 0;
        while (i < word.length()) {
            if (word.substring(i, i + 1).equals(letter)) {
                count++;
            }
            i++;
        }
        return count;
    }

    public int maxDoubles(int number, int threshold) {
        int count = 0;
        number *= 2;
        while (number <= threshold) {
            count++;
            number *= 2;
        }
        return count;
    }

    public boolean isPrime(int number) {
        int divisor = 1;
        int count = 0;
        while (divisor <= number) {
            if (number % divisor == 0) {
                count++;
            }
            divisor++;
        }
        return (count == 2);
    }
}
