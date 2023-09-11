public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;

        while (n > 0) {
            boolean isEven =  n % 2 == 0;

            if (isEven) {
                n /= 2;
            } else {
                n--;
            }
            count++;
        }

        System.out.println(count);
    }
}
