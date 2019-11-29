package com.example.exportationapp.models;

public class Cafe {

    private String anio;
    private String mes;
    private String codigopais;
    private String paisdestino;
    private String codigodepto;
    private String departamentoorigen;
    private String partida;
    private String cadena;
    private String producto;
    private String codigounidad;
    private String cantidadunidades;
    private String valormilesfobdol;
    private String valormilespesos;
    private String volumentoneladas;

    public Cafe(String anio, String mes, String codigopais, String paisdestino, String codigodepto,
                   String departamentoorigen, String partida, String cadena, String producto, String codigounidad,
                   String cantidadunidades, String valormilesfobdol, String valormilespesos, String volumentoneladas) {
        super();
        this.anio = anio;
        this.mes = mes;
        this.codigopais = codigopais;
        this.paisdestino = paisdestino;
        this.codigodepto = codigodepto;
        this.departamentoorigen = departamentoorigen;
        this.partida = partida;
        this.cadena = cadena;
        this.producto = producto;
        this.codigounidad = codigounidad;
        this.cantidadunidades = cantidadunidades;
        this.valormilesfobdol = valormilesfobdol;
        this.valormilespesos = valormilespesos;
        this.volumentoneladas = volumentoneladas;
    }

    public Integer getAnio() {
        return Integer.parseInt(anio);
    }

    public void setAnio(Integer anio) {
        this.anio = anio.toString();
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getCodigopais() {
        return Integer.parseInt(codigopais);
    }

    public void setCodigopais(Integer codigopais) {
        this.codigopais = codigopais.toString();
    }

    public String getPaisdestino() {
        return paisdestino;
    }

    public void setPaisdestino(String paisdestino) {
        this.paisdestino = paisdestino;
    }

    public Integer getCodigodepto() {
        return Integer.parseInt(codigodepto);
    }

    public void setCodigodepto(Integer codigodepto) {
        this.codigodepto = codigodepto.toString();
    }

    public String getDepartamentoorigen() {
        return departamentoorigen;
    }

    public void setDepartamentoorigen(String departamentoorigen) {
        this.departamentoorigen = departamentoorigen;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCodigounidad() {
        return codigounidad;
    }

    public void setCodigounidad(String codigounidad) {
        this.codigounidad = codigounidad;
    }

    public Double getCantidadunidades() {
        return Double.parseDouble(cantidadunidades);
    }

    public void setCantidadunidades(Double cantidadunidades) {
        this.cantidadunidades = cantidadunidades.toString();
    }

    public Double getValormilesfobdol() {
        return Double.parseDouble(valormilesfobdol);
    }

    public void setValormilesfobdol(Double valormilesfobdol) {
        this.valormilesfobdol = valormilesfobdol.toString();
    }

    public Double getValormilespesos() {
        return Double.parseDouble(valormilespesos);
    }

    public void setValormilespesos(Double valormilespesos) {
        this.valormilespesos = valormilespesos.toString();
    }

    public Double getVolumentoneladas() {
        return Double.parseDouble(volumentoneladas);
    }

    public void setVolumentoneladas(Double volumentoneladas) {
        this.volumentoneladas = volumentoneladas.toString();
    }
}
