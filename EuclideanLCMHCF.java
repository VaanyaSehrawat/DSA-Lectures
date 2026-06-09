public class EuclideanLCMHCF {

    // Function to find HCF (GCD) using Euclidean Algorithm
    public static int hcf(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    // Function to find LCM using HCF
    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int hcfValue = hcf(a, b);
        int lcmValue = lcm(a, b);

        System.out.println("HCF = " + hcfValue);
        System.out.println("LCM = " + lcmValue);
    }
}