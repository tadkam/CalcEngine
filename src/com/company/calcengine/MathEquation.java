package com.company.calcengine;


public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result ;

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResult() {
        return result;
    }

    public MathEquation(){

    }



    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        execute();
    }




    public void execute(){
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                if(rightVal != 0){
                    result = leftVal/rightVal;
                } else {
                    result = 0;
                } break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0;
                break;
        }
    }
}
