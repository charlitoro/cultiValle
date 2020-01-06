package com.example.exportationapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Frutal {

    @SerializedName("municipios")
    @Expose
    private String municipios;
    @SerializedName("a_o")
    @Expose
    private String aO;
    @SerializedName("aguacate")
    @Expose
    private String aguacate;
    @SerializedName("bananito")
    @Expose
    private String bananito;
    @SerializedName("banano")
    @Expose
    private String banano;
    @SerializedName("boroj")
    @Expose
    private String boroj;
    @SerializedName("chontaduro")
    @Expose
    private String chontaduro;
    @SerializedName("citricos")
    @Expose
    private String citricos;
    @SerializedName("coco")
    @Expose
    private String coco;
    @SerializedName("granadilla")
    @Expose
    private String granadilla;
    @SerializedName("guana_bana")
    @Expose
    private String guanaBana;
    @SerializedName("lulo")
    @Expose
    private String lulo;
    @SerializedName("mango")
    @Expose
    private String mango;
    @SerializedName("maracuy")
    @Expose
    private String maracuy;
    @SerializedName("mel_n_a")
    @Expose
    private String melNA;
    @SerializedName("mel_n_b")
    @Expose
    private String melNB;
    @SerializedName("mora")
    @Expose
    private String mora;
    @SerializedName("papaya")
    @Expose
    private String papaya;
    @SerializedName("pi_a")
    @Expose
    private String piA;
    @SerializedName("pitaya")
    @Expose
    private String pitaya;
    @SerializedName("tomate_arbol")
    @Expose
    private String tomateArbol;
    @SerializedName("vid")
    @Expose
    private String vid;

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

    public Double getAguacate() {
        return Double.parseDouble(aguacate);
    }

    public void setAguacate(Double aguacate) {
        this.aguacate = aguacate.toString();
    }

    public Double getBananito() {
        return Double.parseDouble(bananito);
    }

    public void setBananito(Double bananito) {
        this.bananito = bananito.toString();
    }

    public Double getBanano() {
        return Double.parseDouble(banano);
    }

    public void setBanano(Double banano) {
        this.banano = banano.toString();
    }

    public Double getBoroj() {
        return Double.parseDouble(boroj);
    }

    public void setBoroj(Double boroj) {
        this.boroj = boroj.toString();
    }

    public Double getChontaduro() {
        return Double.parseDouble(chontaduro);
    }

    public void setChontaduro(Double chontaduro) {
        this.chontaduro = chontaduro.toString();
    }

    public Double getCitricos() {
        return Double.parseDouble(citricos);
    }

    public void setCitricos(Double citricos) {
        this.citricos = citricos.toString();
    }

    public Double getCoco() {
        return Double.parseDouble(coco);
    }

    public void setCoco(Double coco) {
        this.coco = coco.toString();
    }

    public Double getGranadilla() {
        return Double.parseDouble(granadilla);
    }

    public void setGranadilla(Double granadilla) {
        this.granadilla = granadilla.toString();
    }

    public Double getGuanaBana() {
        return Double.parseDouble(guanaBana);
    }

    public void setGuanaBana(Double guanaBana) {
        this.guanaBana = guanaBana.toString();
    }

    public Double getLulo() {
        return Double.parseDouble(lulo);
    }

    public void setLulo(Double lulo) {
        this.lulo = lulo.toString();
    }

    public Double getMango() {
        return Double.parseDouble(mango);
    }

    public void setMango(Double mango) {
        this.mango = mango.toString();
    }

    public Double getMaracuy() {
        return Double.parseDouble(maracuy);
    }

    public void setMaracuy(Double maracuy) {
        this.maracuy = maracuy.toString();
    }

    public Double getMelNA() {
        return Double.parseDouble(melNA);
    }

    public void setMelNA(Double melNA) {
        this.melNA = melNA.toString();
    }

    public Double getMelNB() {
        return Double.parseDouble(melNB);
    }

    public void setMelNB(Double melNB) {
        this.melNB = melNB.toString();
    }

    public Double getMora() {
        return Double.parseDouble(mora);
    }

    public void setMora(Double mora) {
        this.mora = mora.toString();
    }

    public Double getPapaya() {
        return Double.parseDouble(papaya);
    }

    public void setPapaya(Double papaya) {
        this.papaya = papaya.toString();
    }

    public Double getPiA() {
        return Double.parseDouble(piA);
    }

    public void setPiA(Double piA) {
        this.piA = piA.toString();
    }

    public Double getPitaya() {
        return Double.parseDouble(pitaya);
    }

    public void setPitaya(Double pitaya) {
        this.pitaya = pitaya.toString();
    }

    public Double getTomateArbol() {
        return Double.parseDouble(tomateArbol);
    }

    public void setTomateArbol(Double tomateArbol) {
        this.tomateArbol = tomateArbol.toString();
    }

    public Double getVid() {
        return Double.parseDouble(vid);
    }

    public void setVid(Double vid) {
        this.vid = vid.toString();
    }

}
