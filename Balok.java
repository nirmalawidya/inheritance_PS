/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_pson;

/**
 *
 * @author LENOVO LOQ
 */
public class Balok extends BangunRuang{
    double p;
    double l;
    double t;
    
   @Override
   double volume(){
       double volume = p * l * t;
       System.out.println("Masukkan volume balok : " + volume);
       return volume;
   }
   
   @Override
    double luasPermukaan(){
        double luasPermukaan = 2 * p * l * t;
        System.out.println("Masukkan luas permukaan balok : " + luasPermukaan);
        return luasPermukaan;   
    }
}
