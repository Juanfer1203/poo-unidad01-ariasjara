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
        perro1.color="café";
        
        perro2.nombre="locky";
        perro2.edad=4;
        perro2.raza="bulldog";
        perro2.color="negro";
        
        perro3.nombre="rocky";
        perro3.edad=3;
        perro3.raza="poodle";
        perro3.color="Blanco";
        
        //----------------------------------------------------------------------
        var auto1= new Auto();
        var auto2= new Auto();
        var auto3= new Auto();
        
        auto1.marca="Hyundai";
        auto1.año=2015;
        auto1.placa="ABC123";
        auto1.modelo="Tucson";
        
        auto2.marca="Kya";
        auto2.año=2005;
        auto2.placa="AOP567";
        auto2.modelo="Picanto";
        
        auto3.marca="Toyota";
        auto3.año=2018;
        auto3.placa="PPD234";
        auto3.modelo="Yaris";
        
        //----------------------------------------------------------------------
        
        var computador1= new Computador();
        var computador2= new Computador();
        var computador3= new Computador();
        
        computador1.marca="ASUS";
        computador1.modelo="rog";
        computador1.capacidad=500;
        computador1.ram=16;
        
        computador2.marca="LENOVO";
        computador2.modelo="FLEX5";
        computador2.capacidad=1000;
        computador2.ram=64;
        
        computador3.marca="HP";
        computador3.modelo="ZBOOK";
        computador3.capacidad=800;
        computador3.ram=8;
        
        //----------------------------------------------------------------------
        
        var persona1= new Persona();
        var persona2= new Persona();
        var persona3= new Persona();
        
        persona1.nombre="Marco";
        persona1.cédula=01234;
        persona1.altura=170;
        persona1.peso=60;
        
        persona2.nombre="Maria";
        persona2.cédula=01255;
        persona2.altura=159;
        persona2.peso=55;
        
        persona3.nombre="Javier";
        persona3.cédula=01224;
        persona3.altura=180;
        persona3.peso=78;
        
        //----------------------------------------------------------------------
        
        var ropa1= new Ropa();
        var ropa2= new Ropa();
        var ropa3= new Ropa();
        
        ropa1.marca="GAP";
        ropa1.talla="M";
        ropa1.color="Negro";
        ropa1.material="Algodón";
        
        ropa1.marca="Nike";
        ropa1.talla="S";
        ropa1.color="Azul";
        ropa1.material="Seda";
        
        ropa1.marca="Adidas";
        ropa1.talla="L";
        ropa1.color="Rojo";
        ropa1.material="Nylon";
        
        //----------------------------------------------------------------------
        
        var teléfono1 = new Teléfono();
        var teléfono2 = new Teléfono();
        var teléfono3 = new Teléfono();
        
        teléfono1.marca="Sony";
        teléfono1.memoria=64;
        teléfono1.modelo="Xperia";
        teléfono1.numeroCámaras=2;
        
        teléfono1.marca="iPhone";
        teléfono1.memoria=128;
        teléfono1.modelo="X";
        teléfono1.numeroCámaras=1;
        
        teléfono1.marca="Samsung";
        teléfono1.memoria=258;
        teléfono1.modelo="Galaxy";
        teléfono1.numeroCámaras=3;
        
        
        //Perro
        
        System.out.println("Mi perro se llama: "+ perro1.nombre + " tiene "
                + perro1.edad + " años " + ", es un " + perro1.raza +
                "y es de color " + perro1.color);
        
        System.out.println("Mi perro se llama: "+ perro2.nombre + " tiene "
                + perro2.edad + " años " + ", es un " + perro2.raza + 
                "y es de color " + perro2.color);
                
                
        System.out.println("Mi perro se llama: "+ perro3.nombre + " tiene "
                + perro3.edad + " años " + ", es un " + perro3.raza + 
                "y es de color " + perro3.color);
        
        
        //Auto
        
        System.out.println("El auto es de marca " + auto1.marca + ", modelo " 
                + auto1.modelo+  ", es del año " + auto1.año +
                ", tiene la placa " + auto1.placa);
        
         System.out.println("El auto es de marca " + auto2.marca + ", modelo " 
                + auto2.modelo+  ", es del año " + auto2.año +
                ", tiene la placa " + auto2.placa);
         
          System.out.println("El auto es de marca " + auto3.marca + ", modelo " 
                + auto3.modelo+  ", es del año " + auto3.año +
                ", tiene la placa " + auto3.placa);
        
        //Computador
        
        System.out.println("El computador es de marca " + computador1.marca + 
                "modelo " + computador1.modelo + " tiene una capacidad de " +
                computador1.capacidad +" gb, con una ram de" + computador1.ram
                + "gb" );
        
          System.out.println("El computador es de marca " + computador2.marca + 
                "modelo " + computador2.modelo + " tiene una capacidad de " +
                computador2.capacidad +" gb, con una ram de" + computador2.ram
                + "gb" );
          
            System.out.println("El computador es de marca " + computador3.marca + 
                "modelo " + computador3.modelo + " tiene una capacidad de " +
                computador3.capacidad +" gb, con una ram de" + computador3.ram
                + "gb" );
            
        //Teléfono
        
        System.out.println("El teléfono es de marca"  + teléfono1.marca + 
                "con una memoria de " + teléfono1.memoria + "gb," +
                "su modelo es" + teléfono1.modelo + "y tiene " + 
                teléfono1.numeroCámaras + "cámaras." );
        
        System.out.println("El teléfono es de marca"  + teléfono2.marca + 
                "con una memoria de " + teléfono2.memoria + "gb," +
                "su modelo es" + teléfono2.modelo + "y tiene " + 
                teléfono2.numeroCámaras + "cámaras." );
        
        System.out.println("El teléfono es de marca"  + teléfono3.marca + 
                "con una memoria de " + teléfono3.memoria + "gb," +
                "su modelo es" + teléfono3.modelo + "y tiene " + 
                teléfono3.numeroCámaras + "cámaras." );
        
        
        //Persona
        
        System.out.println("Su nombre es " + persona1.nombre + 
                ", su numero de cédula es " + persona1.cédula + " mide "
                + persona1.altura + "cm y tiene un peso de" + persona1.peso);
        
        System.out.println("Su nombre es " + persona2.nombre + 
                ", su numero de cédula es " + persona2.cédula + " mide "
                + persona2.altura + "cm y tiene un peso de" + persona2.peso);
         
        System.out.println("Su nombre es " + persona3.nombre + 
                ", su numero de cédula es " + persona3.cédula + " mide "
                + persona3.altura + "cm y tiene un peso de" + persona3.peso);
        
        
        //Ropa
        
        System.out.println("La prenda es de marca " + ropa1.marca +
                " de talla " + ropa1.talla + "de color " + ropa1.color + 
                "hecho de " + ropa1.material );
          
        System.out.println("La prenda es de marca " + ropa2.marca +
                " de talla " + ropa2.talla + "de color " + ropa2.color + 
                "hecho de " + ropa2.material );
         
        System.out.println("La prenda es de marca " + ropa3.marca +
                " de talla " + ropa3.talla + "de color " + ropa3.color + 
                "hecho de " + ropa3.material );
        
    }
}
