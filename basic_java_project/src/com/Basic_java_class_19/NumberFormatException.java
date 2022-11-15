package com.Basic_java_class_19;

public class NumberFormatException {

    public static void main(String[] args) {
        String name = "Hurricane";

        try {
            System.out.println(Integer.parseInt(name));
        }catch (Exception e){
            System.out.println("Message :"+e);
        }

        int [] data= {1,2,3};
        try {
            System.out.println(data[3]);
        }catch(Exception e){
            System.out.println("Message :"+e.getMessage());
        }
    }
}
