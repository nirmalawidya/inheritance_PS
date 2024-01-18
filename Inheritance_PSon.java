/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance_pson;

/**
 *
 * @author LENOVO LOQ
 */
public class Inheritance_PSon {

    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();
       
        Bola bola = new Bola();
        bola.r = 22; 
        
        Balok balok = new Balok();
        balok.p = 20;
        balok.l = 10;
        balok.t = 2;
        
        LimasSegitiga limasSegitiga = new LimasSegitiga();
        limasSegitiga.a = 6;
        limasSegitiga.t = 15;
        limasSegitiga.tLimas = 25;
        limasSegitiga.lSisiTegak = 10;       
                
        Tabung tabung = new Tabung();
        tabung.r = 10;
        tabung.t = 30;
        
        bangunRuang.volume();
        bangunRuang.luasPermukaan();
        
        bola.volume();
        bola.luasPermukaan();
        
        balok.volume();
        balok.luasPermukaan();
        
        limasSegitiga.volume();
        limasSegitiga.luasPermukaan();
        
        tabung.volume();
        tabung.luasPermukaan();
    }
}
