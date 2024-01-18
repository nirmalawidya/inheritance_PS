/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_pson;

/**
 *
 * @author LENOVO LOQ
 */
public class Tabung extends BangunRuang {
    double r;
    double t;
    
    @Override
    double volume(){
        double volume = Math.PI * r * r * t;
        System.out.println("Masukkan volume tabung : " + volume);
        return volume;
    }
    
    @Override
    double luasPermukaan(){
        double luasPermukaan = 2 * (Math.PI * r * r) + 2 * (Math.PI * r * r);
        System.out.println("Masukkan luas permukaan : " + luasPermukaan);
        return luasPermukaan;
    }
}
