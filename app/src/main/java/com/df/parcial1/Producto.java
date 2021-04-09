package com.df.parcial1;

public class Producto {
    String Nombre;
    String Codigo;
    int Valor;
    String IvaSoN;
    String DesCateg;

    public Producto(String nombre, String codigo, int valor, String ivaSoN, String desCateg) {
        Nombre = nombre;
        Codigo = codigo;
        Valor = valor;
        IvaSoN = ivaSoN;
        DesCateg = desCateg;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    public String getIvaSoN() {
        return IvaSoN;
    }

    public void setIvaSoN(String ivaSoN) {
        IvaSoN = ivaSoN;
    }

    public String getDesCateg() {
        return DesCateg;
    }

    public void setDesCateg(String desCateg) {
        DesCateg = desCateg;
    }

    @Override
    public String toString() {
        return
                "Nombre=" + Nombre + "\n" +
                        "Codigo=" + Codigo + "\n" +
                        "Valor=" + Valor + "\n" +
                        "Con iva o sin iva =" + IvaSoN + "\n" +
                        "Descripcion o categoria=" + DesCateg;
    }
}
