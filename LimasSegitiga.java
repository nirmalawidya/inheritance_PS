/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_pson;

/**
 *
 * @author LENOVO LOQ
 */
public class LimasSegitiga extends BangunRuang{
    double a;
    double t;
    double tLimas;
    double lSisiTegak;
    
    @Override
    double volume(){
        double volume = 1/3 * 1/2 * (a*t) * tLimas;
        System.out.println("Masukkan volume limas segitiga : " + volume);
        return volume;
    }
    
    @Override
    double luasPermukaan(){
        double luasPermukaan = (1/2*a*t) + (3*lSisiTegak);
        System.out.println("Masukkan luas permukaan limas segitiga : " + luasPermukaan);
        return luasPermukaan;
    }
}
