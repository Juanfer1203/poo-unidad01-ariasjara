/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tarea1;

/**
 *
 * @author PC-19
 */
public class Tarea01 {

    public static void main(String[] args) {
        System.out.println("Clase01_01_02");
        
        var perro1= new Perro();
        var perro2= new Perro();
        var perro3= new Perro();
        
        perro1.nombre="pepe";
        perro1.edad=5;
        perro1.raza="mestizo";
        
        perro2.nombre="locky";
        perro2.edad=4;
        perro2.raza="bulldog";
        
        perro3.nombre="rocky";
        perro3.edad=3;
        perro3.raza="poodle";
        
        var auto1= new Auto();
        var auto2= new Auto();
        var auto3= new Auto();
        
        auto1.marca="Hyundai";
        auto1.año=2015;
        auto1.placa="ABC123";
        
        auto2.marca="Kya";
        auto2.año=2005;
        auto2.placa="AOP567";
        
        auto3.marca="Toyota";
        auto3.año=2018;
        auto3.placa="PPD234";
        
        var computador1= new Computador();
        var computador2= new Computador();
        var computador3= new Computador();
        
        computador1.marca="ASUS";
        computador1.modelo="rog";
        computador1.capacidad=500;
        
        computador2.marca="LENOVO";
        computador2.modelo="FLEX5";
        computador2.capacidad=1000;
        
        computador3.marca="HP";
        computador3.modelo="ZBOOK";
        computador3.capacidad=800;
        
        
        
        
        
        System.out.println("Mi perro se llama: "+ perro1.nombre + " tiene "
                + perro1.edad + " años " + " y es un " + perro1.raza);
        
        
                
                
        
        
        
    }
}
