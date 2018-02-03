package com.company.calcengine;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100, 25, 225, 11};
        double[] rightVals = {50, 92, 17, 3};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];


//	    double val1 = 100.0;
//      double val2 = 50.0;
//      double result;
//      char opCode = 'd';

        for (int i=0; i<opCodes.length; i++){
            switch(opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    if(rightVals[i] != 0){
                        results[i] = leftVals[i]/rightVals[i];
                    } else {
                        results[i] = 0;
                    } break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0;
                    break;
            }
        }
        for (double theResult : results){
            System.out.print("result = ");
            System.out.println(theResult);
        }
    }
}
