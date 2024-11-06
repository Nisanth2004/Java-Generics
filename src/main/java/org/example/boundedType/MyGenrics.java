package org.example.boundedType;

public class MyGenrics {
    public static void main(String[] args)
    {
      GenricsDemo<String> gd1=new GenricsDemo<String>("Preethika");
      gd1.show();

        GenricsDemo<Integer> gd2=new GenricsDemo<Integer>(123456);
        gd2.show();
    }
}
