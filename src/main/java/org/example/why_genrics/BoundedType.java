package org.example.why_genrics;

// genric classes
public class BoundedType<T extends  Alpha> { // accepting any type (bounded type)
    public static void main(String[] args)
    {
        //BoundedType<String> boundedType=new BoundedType();
        BoundedType<Alpha> boundedType1=new BoundedType<Alpha>();

        // datatype of the object
        System.out.println(boundedType1.getClass().getTypeName());
    }
}
