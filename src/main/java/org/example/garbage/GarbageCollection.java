package org.example.garbage;

public class GarbageCollection {
    public static void main(String[] args)
    {
        GarbageCollection garbageCollection=new GarbageCollection();
        GarbageCollection garbageCollection2=new GarbageCollection();
        GarbageCollection garbageCollection3=new GarbageCollection();

       // garbageCollection=null;
        /*garbageCollection=garbageCollection2;
        System.out.println(garbageCollection);
        System.out.println(garbageCollection2);
        System.out.println(garbageCollection3);*/


        garbageCollection=null;
        System.gc(); // static method

        Runtime rt=Runtime.getRuntime(); // SIngleton class
        rt.gc();
        System.out.println(rt.freeMemory());
        System.out.println(rt.totalMemory());





    }
    @Override
    public void finalize()
    {
        System.out.println("I am called this method for gc");
    }
}
