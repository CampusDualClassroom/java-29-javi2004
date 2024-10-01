package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try{
            throw new Exception("Excepcion dentro de main");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
