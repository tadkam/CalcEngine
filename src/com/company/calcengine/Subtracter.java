package com.company.calcengine;

/**
 * Created by Admin on 2018-02-18.
 */
public class Subtracter extends CalculateBase {
        public Subtracter(){}
        public Subtracter(double leftVal, double rightVal){
            super(leftVal, rightVal);
        }

        @Override
        public void calculate(){
            double value = getLeftVal() - getRightVal();
            setResult(value);
        }
}
