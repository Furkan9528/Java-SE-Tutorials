package com.furkankara.matematik;

public class Matematik implements IMatematik{

    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplama Sonucu : " + (a+ b));
        
    }

    @Override
    public void cikarma(int a, int b) {
        System.out.println("Çıkarma Sonucu : " + (a - b));

    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Çarpma Sonucu : " + (a * b));

    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bölme Sonucu : " + ((double)a / b));

    }

}
