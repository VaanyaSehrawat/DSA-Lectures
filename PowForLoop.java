public class PowForLoop {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        int output = 1;

        for (int i = 0; i < b; i++) {
            output = output * a;
        }

        System.out.println(output);
    }
}