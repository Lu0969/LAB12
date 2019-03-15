package com.company;

public class LmbdBloc2 {
    StringFunc newStringFunc;

    public void Five(){
        StringFunc reverse = (str)->{
            String result="";
            int i;
            for(i=str.length()-1; i>=0; i--)
                result+= str.charAt(i);
            return result;
        };
        System.out.println("Лямбда обращается на "+reverse.func("Лямбда"));
        System.out.println("Выражение обращается на "+reverse.func("Выражение"));
    }
}
