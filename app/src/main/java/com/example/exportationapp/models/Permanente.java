package com.example.exportationapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permanente {

    @SerializedName("municipios")
    @Expose
    private String municipios;
    @SerializedName("a_o")
    @Expose
    private String aO;
    @SerializedName("cacao")
    @Expose
    private String cacao;
    @SerializedName("caf")
    @Expose
    private String caf;
    @SerializedName("ca_a_de_azucar_1")
    @Expose
    private String caADeAzucar1;
    @SerializedName("ca_a_panelera_1")
    @Expose
    private String caAPanelera1;
    @SerializedName("pl_tano_2")
    @Expose
    private String plTano2;

    public String getMunicipios() {
        return municipios;
    }

    public void setMunicipios(String municipios) {
        this.municipios = municipios;
    }

    public Integer getAO() {
        return Integer.parseInt(aO);
    }

    public void setAO(Integer aO) {
        this.aO = aO.toString();
    }


    public Double getCacao() {
        return Double.parseDouble(cacao.replace(",", ""));
    }

    public void setCacao(Double cacao) {
        this.cacao = cacao.toString();
    }

    public Double getCaf() {
        return Double.parseDouble(caf.replace(",", ""));
    }

    public void setCaf(Double caf) {
        this.caf = caf.toString();
    }

    public Double getCaADeAzucar1() {
        return Double.parseDouble(caADeAzucar1.replace(",", ""));
    }

    public void setCaADeAzucar1(Double caADeAzucar1) {
        this.caADeAzucar1 = caADeAzucar1.toString();
    }

    public Double getCaAPanelera1() {
        return Double.parseDouble(caAPanelera1.replace(",", ""));
    }

    public void setCaAPanelera1(Double caAPanelera1) {
        this.caAPanelera1 = caAPanelera1.toString();
    }

    public Double getPlTano2() {
        return Double.parseDouble(plTano2.replace(",", ""));
    }

    public void setPlTano2(Double plTano2) {
        this.plTano2 = plTano2.toString();
    }

}
