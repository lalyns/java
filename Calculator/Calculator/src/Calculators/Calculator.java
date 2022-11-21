package Calculators;

public class Calculator {
    int m_value;

    public Calculator() {
        this.m_value = 0;
    }

    public void add(int val) {
        this.m_value += val;
        if(this.m_value > 100) {
            this.m_value = 100;
            System.out.println("Value can't exceed 100");
        }
    }

    public float avg(int[] values){
        float avg = 0;

        for(int i = 0; i < values.length; i++){
            avg += (float)values[i];
        }

        avg /= values.length;

        return avg;
    }

    public int getValue() {
        return this.m_value;
    }
    
    public boolean getIsOdd() {
        return this.getValue() % 2 != 0;
    }

    public void Minus(int val) {}

    
}
