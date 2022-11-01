package calculate;


public class Calculator {
    int a;
    int b;

    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is :" + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of " + a + "and " + b + " is :" + result);
    }

    public void division(int a, int b) {
        int result = a / b;
        System.out.println("Division of " + a + "and " + b + " is :" + result);

    }


    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of" + a + " and " + b + " is :" + result);

    }

    public void calculateResult(int a, int b, char c) {

        if (c == '+') {
            addition(this.a = a, this.b = b);
        } else if (c == '-') {
            subtraction(this.a = a, this.b = b);
        } else if (c == '/')
            division(this.a = a, this.b = b);

        {

            multiplication(this.a = a, this.b = b);
        }
    }
}


