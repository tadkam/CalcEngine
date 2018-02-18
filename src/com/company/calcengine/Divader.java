package com.company.calcengine;

/**
 * Created by Admin on 2018-02-18.
 */
public class Divader extends CalculateBase{
        public Divader(){}
        public Divader(double leftVal, double rightVal){
            super(leftVal, rightVal);
        }

        @Override
        public void calculate(){
            double value = getLeftVal() / getRightVal();
            setResult(value);
        }
    }

