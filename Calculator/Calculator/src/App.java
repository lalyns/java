import java.util.List;

import Calculators.Calculator;
import Calculators.UpgradeCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator cal = new UpgradeCalculator();
        cal.add(10);
        System.out.println(cal.getValue());

        cal.Minus(5);
        System.out.println(cal.getValue());

        System.out.println(cal.getIsOdd());


        int[] values = new int[] {1,2,3,4,5,6};

        System.out.println(cal.avg(values));
        
        
    }
}
