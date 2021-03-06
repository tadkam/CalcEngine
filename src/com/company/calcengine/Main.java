package com.company.calcengine;

public class Main {

    public static void main(String[] args) {
//        double[] leftVals = {100, 25, 225, 11};
//        double[] rightVals = {50, 92, 17, 3};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];


        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100, 50);
        equations[1] = new MathEquation('a', 25, 92);
        equations[2] = new MathEquation('s', 225, 17);
        equations[3] = new MathEquation('m', 11, 3);


//	    double val1 = 100.0;
//      double val2 = 50.0;
//      double result;
//      char opCode = 'd';


        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divader(100, 50),
                new Adder(25.0, 92.0),
                new Subtracter(225.0, 17),
                new Multiplier(11.0, 3.0)
        };

        for(CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.print("result=");
            System.out.println(calculator.getResult());
        }



    }
}
