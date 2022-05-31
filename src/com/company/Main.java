package com.company;

public class Main {

    public static void main(String[] args) {

        try(Car car=new Car()){
            car.driving();

        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
