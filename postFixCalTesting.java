/*
@author Jere Perisic
@version October 2, 2023
postFixCalTesting class iterates over two arrays of strings. Array postfix contains strings with
operands. Array resultArr has results each corresponding to for the index position in postfix array.
 */
public class postFixCalTesting {
    /*
    @param IStack stack
    @param IPostFixCal
    @return number of correct results divided by 5
     */
    public double precision(IStack stack, IPostFixCal calc) {
        int count = 0;

        String[] postfix = { "12+3*", "23+4*", "72-5/", "97+2*", "55/2*" };
        int[] resultArr = {9,20,1,32,2};

        for (int i = 0; i < postfix.length; i++) {
            int result = calc.calculate(stack, postfix[i]);
            if (result == resultArr[i]) {
                count++;
            }
        }
        return (double) count/5;
    }

}
