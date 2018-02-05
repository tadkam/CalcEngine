package com.company.calcengine;

public class Main {

    public static void main(String[] args) {
//        double[] leftVals = {100, 25, 225, 11};
//        double[] rightVals = {50, 92, 17, 3};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];


        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100, 50, 'd');
        equations[1] = create(25, 92, 'a');
        equations[2] = create(225, 17, 's');
        equations[3] = create(11, 3, 'm');


//	    double val1 = 100.0;
//      double val2 = 50.0;
//      double result;
//      char opCode = 'd';


        for (MathEquation equation: equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.result);
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode ){
        MathEquation equation = new MathEquation();

        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return equation;
    }



}
