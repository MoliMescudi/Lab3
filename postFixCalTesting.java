public class postFixCalTesting {
    public double precision(IStack stack, IPostFixCal calc) {
        int count = 0;

        String[] postfix = {
                "12+3*",
                "23+4*",
                "72-5/",
                "97+2*",
                "55/2*"

        };
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
