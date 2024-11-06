package org.example.why_genrics;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args)
    {
        ArrayList<String> stringArrayList=new ArrayList<String>();
        stringArrayList.add("Nisanth");
        stringArrayList.add("Preethika");

        GenericsDemo genericsDemo=new GenericsDemo();
       // genericsDemo.display(stringArrayList);


        ArrayList<Integer> integerArrayList=new ArrayList<Integer>();
        integerArrayList.add(12);
        integerArrayList.add(36);
        genericsDemo.display(integerArrayList);

    }

    // interest - datatype --> Number -> byte,short,int,float,short,byte,double,long
    // String,character
    public void display(ArrayList<? extends Number> stringArrayList) { // wild card chararcter -> any datatype under Number
        System.out.println(stringArrayList);
    }
}
