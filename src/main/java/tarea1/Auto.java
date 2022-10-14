/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1;

/**
 *
 * @author PC-19
 */
public class Auto {

    String marca;
    int year;
    String placa;
    String modelo;
    String nombrePropietario;
    String color;
    int precio;
    int cilindraje;

    public String mostrarInfo() {

        var retorno = "El auto tiene placa; " + this.placa + " es de marca: "
                + this.marca;

        return retorno;

    }

    public String getProvincia() {

        var retorno = "";

        var primeraLetra = "";

        primeraLetra = this.placa.substring(0, 1);
        switch (primeraLetra) {

            case "A":
                retorno = "Azuay";
                break;
            case "P":
                retorno = "Pichincha";
                break;
            case "G":
                retorno = "Guayas";
                break;
            case "U":
                retorno = "Cañar";
                break;
            default:
                retorno = "Provincia no definida";

        }
        return retorno;
    }

    public int getNumeroContinente() {

        var retorno = 0;
        var marcaPais = this.getPaisMarca();
        switch (marcaPais) {

            case "EE.UU":
                retorno = 2;
                break;

            case "Japon":
                retorno = 3;
                break;

            default:
                retorno = 0;
                break;

        }

        return retorno;

    }

    public double calcularIVA() {

        var retorno = 0.0d;

        retorno = this.precio * 0.12;

        return retorno;
    }

    public int calcularEdad(int yearActual) {
        var retorno = 0;

        retorno = yearActual - this.year;

        return retorno;

    }

    // 10% cada año de uso
    //la depreciacion no puede exceder el precio
    public double calcularDepreciacion(int yearActual) {
        var retorno = 0.0d;
        var edad = this.calcularEdad(yearActual);
        retorno = edad * 0.1 * this.precio;

        return retorno;
    }

    public double calcularCostoMatricula(int yearActual) {
        var retorno = 0.0d;
        var edad = this.calcularEdad(yearActual);

        retorno = edad * 0.1;
        return retorno;

    }
    //edad 0-5 precio de 10000 SI
    //edad 10-15 precio de 10000 a 20000 SI 
    //edad mayor a 15 y de 20000 a 30000  SI 
    //edad mayor a 15 NO 

    public boolean sePuedeAsegurar(int yearActual) {
        var retorno = false;

        var edad = this.calcularEdad(yearActual);
        if (edad <= 5 && this.precio < 10000) {
            retorno = true;
        } else {

        }
        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";

        if (this.marca.equals("Chevrolet")) {
            retorno = "EE.UU";
        } else {

            if (this.marca.equals("Toyota")) {
                retorno = "Japon";
            } else {

                if (this.marca.equals("Jetour")) {
                    retorno = "China";

                } else {
                    if (this.marca.equals("Mercedes Benz")) {
                        retorno = "Alemania";

                    } else {
                        retorno = "No definido";
                    }

                }

            }

        }
        return retorno;
    }

    public double calcularTasaSolidaria(int yearActual, double limitePrecio) {

        var retorno = 0.0d;

        var edad = this.calcularEdad(yearActual);

        if ((edad >= 0) && (edad <= 5) && (cilindraje > 1500)) {
            retorno = precio * 0.15;
        }
        if ((edad >= 0) && (edad <= 5) && (cilindraje > 1500) && (cilindraje < 2000)) {
            retorno = precio * 0.20;
        }
        if ((edad >= 0) && (edad <= 5) && (cilindraje > 2000)) {
            retorno = precio * 0.25;
        }
        if ((edad >= 5) && (edad <= 15) && (cilindraje < 1500)) {
            retorno = precio * 0.10;
        }
        if ((edad >= 5) && (edad <= 15) && (cilindraje > 1500) && (cilindraje < 2000)) {
            retorno = precio * 0.15;
        }
        if ((edad >= 5) && (edad <= 15) && (cilindraje > 2000)) {
            retorno = precio * 0.18;
        }
        if ((edad > 20)) {
            retorno = precio * 0;

        }
        return retorno;
    }

    public boolean esPlacaValida() {
        var retorno = false;
        var longitud = this.placa.length();
        if (longitud == 7) {
            var caracter1 = this.placa.charAt(0);
            var caracter2 = this.placa.charAt(1);
            var caracter3 = this.placa.charAt(2);
            var caracter4 = this.placa.charAt(3);
            var caracter5 = this.placa.charAt(4);
            var caracter6 = this.placa.charAt(5);
            var caracter7 = this.placa.charAt(6);

            if (Character.isDigit(caracter7) && Character.isDigit(caracter6)
                    && Character.isDigit(caracter5) && Character.isDigit(caracter4)
                    && Character.isLetter(caracter3) && Character.isLetter(caracter2)
                    && Character.isLetter(caracter1)) {
                retorno = true;
            } else {
                retorno = false;
            }
        }

        return retorno;
    }

}
g
