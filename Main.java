package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Использование лямбда-выражения без параметров");
        LmbdSimple lam1 = new LmbdSimple();
        lam1.First();

        System.out.println("\nИспользование лямбда-выражения с одним параметром");
        LmbdOneParam lam2 = new LmbdOneParam();
        lam2.Second();

        System.out.println("\nИспользование лямбда-выражения с двумя параметрами");
        LmbdTwoParam lam3 = new LmbdTwoParam();
        lam3.Therd();

        System.out.println("\nИспользование блочного лямбда-выражения");
        new LmbdBloc().Four();

        System.out.println("\nИспользование еще одного блочного лямбда-выражения");
        new LmbdBloc2().Five();
    }
}
