package lab3;



public class lab3 {
    public static void main(String[] args) {

        IStack myStackInstance = new myStack();
        IPostFixCal myPostFixCalInstance = new myPostFixCal();


        postFixCalTesting tester = new postFixCalTesting();


        System.out.println("Precision: " + tester.precision(myStackInstance, myPostFixCalInstance));
    }
}
