public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        //implement code here\
        this.calcModel = model;
        this.idNumber = id;
    }

    public Solution(int id) {
        //implement code here
        this.idNumber = id;
        this.calcModel = "TI-84";
    }

    public String getCalcModel() {
        //implement code here
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        //implement code here
        this.calcModel = newModel;
    }

    public int getIdNumber() {
        //implement code here
        return idNumber;
    }

    public void setIdNumber(int newId) {
        //implement code here
        idNumber = newId;
    }

    public void incrementId() {
        //implement code here
        idNumber ++;
    }

    public double add(double num1, double num2) {
        //implement code here
        return (num1+=num2);
    }

    public double subtract(double num1, double num2) {
        //implement code here
        return (num1-=num2);
    }

    public double multiply(double num1, double num2) {
        //implement code here
        return num1*=num2;
    }

    public int quotient(int num1, int num2) {
        //implement code here
        return num1/=num2;
    }

    public int remainder(int num1, int num2) {
        //implement code here
        return num1%=num2;
    }

    public String divisionResult(int num1, int num2) {
        //implement code here
        int quotient = num1 / num2;
        int remainder = num1 - quotient * num2; 
        return (quotient) + " R " + (remainder);
    }

    public String coordinatePair(int x, int y) {
        //implement code here
        return "(" + x + ", " + y + ")";
    }

    public int average(int num1, int num2) {
        //implement code here
        int average = (int)((double)(num1 + num2) / 2 + 0.5);
        return average;
    }

    public String info() {
        //implement code here

        return "This calculator is a model " + calcModel + " with id " + idNumber;
    }

}
