class SimpleCalculator {
    // Implement your methods here
    public static long subtractTwoNumbers(Long a, long b) {
        System.out.println(a - b);
        return (a - b);
    }

    public static long sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
        return (a + b);
    }


    public static long divideTwoNumbers(long a, long b) {
        if (b == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(a / b);
            return a / b;
        }
        return 0;
    }

    public static long multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
        return a * b;
    }
}