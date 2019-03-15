package com.company;

public class LmbdTwoParam {
    NumericTest2 newNumericTest2;

    public void Therd(){
        NumericTest2 isFactor =(n, d)->(n%d)==0;
        if(isFactor.test(10, 2)) System.out.println("Число 2 является делителем числа 10");
        if(!isFactor.test(10, 3))System.out.println("Число 3 не является делителем числа 10");
    }
}
