/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_pson;

/**
 *
 * @author LENOVO LOQ
 */
public class Bola extends BangunRuang {
    double r;
    
    @Override
    double volume(){
        double volume = 4/3 * Math.PI * r * r * r;
        System.out.println("Volume bola : " + volume);
        return volume;
    }
    
    @Override
    double luasPermukaan(){
        double luasPermukaan = 4 * Math.PI * r * r;
        System.out.println("Luas Permukaan bola : " + luasPermukaan);
        return luasPermukaan;
    }
}
