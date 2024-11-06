package org.example.boundedType;

public class GenricsDemo<T> { // access any datatype

    T t;

    // create the constructor
    public GenricsDemo(T ob)
    {
        this.t=ob;
    }


    public void show()
    {
        System.out.println("Class of the Object is:");
        System.out.println();
        // here we check the "Preethika" data type
        System.out.println(t.getClass().getTypeName());
    }


}
