public class Main {
    public static void main(String[] args) {
        var result = d2b(10);
        System.out.println(result);
    }

    //Question 1 - Sum of Digits
    public static int sumOfDigits(int n){
        if(n==0 || n<0) return 0;
        return n%10 + sumOfDigits(n/10);
    }

    //Question 2 Power
    public static int power(int base, int exp) {
        if(exp<0) return -1;
        if(exp==0) return 1;
//        if(exp==1) return base;
        return base * power(base, exp-1);
    }

    // Question 3 GCD
    public static int gcd(int a, int b){
        if(a<0 || b<0) return -1;
        if(b==0) return a;
        return gcd(b, a%b);
    }

    //Question 4 Decimal to Binary
    public static int d2b(int n){
        if (n<0) return -1;
        if (n==0) return 0;
        return n%2 + 10*d2b(n/2);
    }
}