/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        System.out.println(p.getMaas());
        p=new Isci();
        System.out.println(p.getMaas());
        p=new Memur();
        System.out.println(p.getMaas()); 
        Isci i=new Isci();
        
    }
}
