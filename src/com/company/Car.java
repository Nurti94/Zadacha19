package com.company;

public class Car implements AutoCloseable {


    public void driving(){
        System.out.println("Mashina jurup jatat");
    }


    @Override
    public void close() throws Exception {
        System.out.println("Mashina jabylyp jatat");
    }
}

