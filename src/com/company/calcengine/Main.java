package com.company.calcengine;

public class Main {

    public static void main(String[] args) {
	    double val1 = 100.0;
        double val2 = 50.0;
        double result;
        char opCode = 'd';

        if(opCode == 'a'){
            result = val1 + val2;
        } else if(opCode == 's'){
            result = val1 - val2;
        } else if(opCode == 'd'){
            if(val2 != 0){
                result = val1/val2;
            } else {
                result = 0;
            }
        } else if (opCode == 'm'){ //zakomentowana linia na github.com 
            result = val1 * val2;
        } else {
            result = 0.0;
        }

        System.out.println(result);
    }
}
