
class Calculator{
  
    public int subtract(int a,int b){
        return a - b;
    }
    
    public int mult(int a,int b){
        return a * b;
    }
}


public  class CalculatorTest{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // System.out.println("Result" + calc.add(10,20));
        System.out.println("Result" + calc.subtract(20,10));
        System.out.println("Result" + calc.mult(20,10));
    }
}
