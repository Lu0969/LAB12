package com.company;

public class LmbdOneParam {
    NumericTest newNumericTest;

    public void Second(){
        NumericTest isEnen = (n) -> (n % 2) == 0;
        if (isEnen.test(10)) System.out.println("Число 10 четное");
        if (!isEnen.test(9)) System.out.println("Число 9 нечетное");
        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("Число 1 неотрицательное");
        if (!isNonNeg.test(-1)) System.out.println("Число -1 отрицательное");
    }
}
