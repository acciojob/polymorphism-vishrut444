package com.driver;

public class Main {
    static class Product{
        public int product(int x,int y){
        }
        public int product(int x,int y,int z) {
        }
        public double product(double x,double y){
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(2,3);
        p.product(2,3,4);
        p.product(4,5);


    }

}