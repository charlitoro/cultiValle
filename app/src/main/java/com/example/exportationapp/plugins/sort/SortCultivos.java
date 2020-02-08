package com.example.exportationapp.plugins.sort;

import com.example.exportationapp.utils.Cultivo;
import com.example.exportationapp.models.Frutal;
import com.example.exportationapp.models.Permanente;
import com.example.exportationapp.models.Transitorio;

import java.util.ArrayList;
import java.util.List;

public class SortCultivos {

    private final static String[] CULTIVOS_FRUTALES = {"Aguacate", "Bananito", "Banano", "Borojó", "Chontaduro",
            "Citricos", "Coco", "Granadilla", "Guanabana", "Lulo", "Mango", "Maracuyá",
            "Melón A", "Melón B", "Mora", "Papaya", "Piña", "Pitaya", "Tomate Arbol", "Vid"
    };
    private final static String[] CULTIVOS_PERMANENTES = { "Cacao", "Café", "Caña de azucar",
            "Caña Panelera", "Platano"
    };
    private final static String[] CULTIVOS_TRANSITORIOS = { "Algodón a", "Arroz a",
            "Arroz", "Frijol a", "Frijol b", "Maiz Tecnificado a", "Maiz Tecnificado b", "Maiz Tradicional a",
            "Maiz Tradicional b", "Sorgo a", "Sorgo b", "Soya a", "Soya b", "Tabaco a", "Tabaco b"
    };

    public void sortCultivosFrutales(List<Frutal> frutales, ArrayList<String> cultivos, ArrayList<Double> hectare) {

        ArrayList<Cultivo> cultivosHectares = cleanArrayCultivos(CULTIVOS_FRUTALES);
        Cultivo tmpCultivo;

        for(int i = 0; i < frutales.size(); i++) {
            Frutal report = frutales.get(i);
            tmpCultivo = cultivosHectares.get(0); tmpCultivo.sumHectares(report.getAguacate()); cultivosHectares.set(0, tmpCultivo);
            tmpCultivo = cultivosHectares.get(1); tmpCultivo.sumHectares(report.getBananito()); cultivosHectares.set(1, tmpCultivo);
            tmpCultivo = cultivosHectares.get(2); tmpCultivo.sumHectares(report.getBanano()); cultivosHectares.set(2, tmpCultivo);
            tmpCultivo = cultivosHectares.get(3); tmpCultivo.sumHectares(report.getBoroj()); cultivosHectares.set(3, tmpCultivo);
            tmpCultivo = cultivosHectares.get(4); tmpCultivo.sumHectares(report.getChontaduro()); cultivosHectares.set(4, tmpCultivo);
            tmpCultivo = cultivosHectares.get(5); tmpCultivo.sumHectares(report.getCitricos()); cultivosHectares.set(5, tmpCultivo);
            tmpCultivo = cultivosHectares.get(6); tmpCultivo.sumHectares(report.getCoco()); cultivosHectares.set(6, tmpCultivo);
            tmpCultivo = cultivosHectares.get(7); tmpCultivo.sumHectares(report.getGranadilla()); cultivosHectares.set(7, tmpCultivo);
            tmpCultivo = cultivosHectares.get(8); tmpCultivo.sumHectares(report.getGuanaBana()); cultivosHectares.set(8, tmpCultivo);
            tmpCultivo = cultivosHectares.get(9); tmpCultivo.sumHectares(report.getLulo()); cultivosHectares.set(9, tmpCultivo);
            tmpCultivo = cultivosHectares.get(10); tmpCultivo.sumHectares(report.getMango()); cultivosHectares.set(10, tmpCultivo);
            tmpCultivo = cultivosHectares.get(11); tmpCultivo.sumHectares(report.getMaracuy()); cultivosHectares.set(11, tmpCultivo);
            tmpCultivo = cultivosHectares.get(12); tmpCultivo.sumHectares(report.getMelNA()); cultivosHectares.set(12, tmpCultivo);
            tmpCultivo = cultivosHectares.get(13); tmpCultivo.sumHectares(report.getMelNB()); cultivosHectares.set(13, tmpCultivo);
            tmpCultivo = cultivosHectares.get(14); tmpCultivo.sumHectares(report.getMora()); cultivosHectares.set(14, tmpCultivo);
            tmpCultivo = cultivosHectares.get(15); tmpCultivo.sumHectares(report.getPapaya()); cultivosHectares.set(15, tmpCultivo);
            tmpCultivo = cultivosHectares.get(16); tmpCultivo.sumHectares(report.getPiA()); cultivosHectares.set(16, tmpCultivo);
            tmpCultivo = cultivosHectares.get(17); tmpCultivo.sumHectares(report.getPitaya()); cultivosHectares.set(17, tmpCultivo);
            tmpCultivo = cultivosHectares.get(18); tmpCultivo.sumHectares(report.getTomateArbol()); cultivosHectares.set(18, tmpCultivo);
            tmpCultivo = cultivosHectares.get(19); tmpCultivo.sumHectares(report.getVid()); cultivosHectares.set(19, tmpCultivo);
        }

        ShellSort shell = new ShellSort(cultivosHectares);
        cultivosHectares = shell.sort();
        for ( int i = cultivosHectares.size()-1; i >= cultivosHectares.size()-5; i--) {
            Cultivo cultivo = cultivosHectares.get(i);
            cultivos.add(cultivo.getName());
            hectare.add(cultivo.getHectares());
        }
    }

    public void sortCultivosPermanentes(List<Permanente> permanentes, ArrayList<String> cultivos, ArrayList<Double> hectare){
        ArrayList<Cultivo> cultivosHectares = cleanArrayCultivos(CULTIVOS_PERMANENTES);
        Cultivo tmpCultivo;

        for(int i = 0; i < permanentes.size(); i++) {
            Permanente report = permanentes.get(i);

            tmpCultivo = cultivosHectares.get(0); tmpCultivo.sumHectares(report.getCacao()); cultivosHectares.set(0, tmpCultivo);
            tmpCultivo = cultivosHectares.get(1); tmpCultivo.sumHectares(report.getCaf()); cultivosHectares.set(1, tmpCultivo);
            tmpCultivo = cultivosHectares.get(2); tmpCultivo.sumHectares(report.getCaADeAzucar1()); cultivosHectares.set(2, tmpCultivo);
            tmpCultivo = cultivosHectares.get(3); tmpCultivo.sumHectares(report.getCaAPanelera1()); cultivosHectares.set(3, tmpCultivo);
            tmpCultivo = cultivosHectares.get(4); tmpCultivo.sumHectares(report.getPlTano2()); cultivosHectares.set(4, tmpCultivo);
        }

        ShellSort shell = new ShellSort(cultivosHectares);
        cultivosHectares = shell.sort();
        for ( int i = 0; i < cultivosHectares.size(); i++) {
            Cultivo cultivo = cultivosHectares.get(i);
            cultivos.add(cultivo.getName());
            hectare.add(cultivo.getHectares());
        }
    }

    public void sortCultivosTransitorios(List<Transitorio> transitorios, ArrayList<String> cultivos, ArrayList<Double> hectare){
        ArrayList<Cultivo> cultivosHectares = cleanArrayCultivos(CULTIVOS_TRANSITORIOS);
        Cultivo tmpCultivo;

        for(int i = 0; i < transitorios.size(); i++) {
            Transitorio report = transitorios.get(i);

            tmpCultivo = cultivosHectares.get(0); tmpCultivo.sumHectares(report.getAlgodNA()); cultivosHectares.set(0, tmpCultivo);
            tmpCultivo = cultivosHectares.get(1); tmpCultivo.sumHectares(report.getArrozA()); cultivosHectares.set(1, tmpCultivo);
            tmpCultivo = cultivosHectares.get(2); tmpCultivo.sumHectares(report.getArroz()); cultivosHectares.set(2, tmpCultivo);
            tmpCultivo = cultivosHectares.get(3); tmpCultivo.sumHectares(report.getFrijolA()); cultivosHectares.set(3, tmpCultivo);
            tmpCultivo = cultivosHectares.get(4); tmpCultivo.sumHectares(report.getFrijolB()); cultivosHectares.set(4, tmpCultivo);
            tmpCultivo = cultivosHectares.get(5); tmpCultivo.sumHectares(report.getMaZTecnificadoA()); cultivosHectares.set(5, tmpCultivo);
            tmpCultivo = cultivosHectares.get(6); tmpCultivo.sumHectares(report.getMaZTecnificadoB()); cultivosHectares.set(6, tmpCultivo);
            tmpCultivo = cultivosHectares.get(7); tmpCultivo.sumHectares(report.getMaZTradicionalA()); cultivosHectares.set(7, tmpCultivo);
            tmpCultivo = cultivosHectares.get(8); tmpCultivo.sumHectares(report.getMaZTradicionalB()); cultivosHectares.set(8, tmpCultivo);
            tmpCultivo = cultivosHectares.get(9); tmpCultivo.sumHectares(report.getSorgoA()); cultivosHectares.set(9, tmpCultivo);
            tmpCultivo = cultivosHectares.get(10); tmpCultivo.sumHectares(report.getSorgoB()); cultivosHectares.set(10, tmpCultivo);
            tmpCultivo = cultivosHectares.get(11); tmpCultivo.sumHectares(report.getSoyaA()); cultivosHectares.set(11, tmpCultivo);
            tmpCultivo = cultivosHectares.get(12); tmpCultivo.sumHectares(report.getSoyaB()); cultivosHectares.set(12, tmpCultivo);
            tmpCultivo = cultivosHectares.get(13); tmpCultivo.sumHectares(report.getTabacoA()); cultivosHectares.set(13, tmpCultivo);
            tmpCultivo = cultivosHectares.get(14); tmpCultivo.sumHectares(report.getTabacoB()); cultivosHectares.set(14, tmpCultivo);
        }

        ShellSort shell = new ShellSort(cultivosHectares);
        cultivosHectares = shell.sort();
        for ( int i = 0; i < cultivosHectares.size(); i++) {
            Cultivo cultivo = cultivosHectares.get(i);
            cultivos.add(cultivo.getName());
            hectare.add(cultivo.getHectares());
        }
    }

    public ArrayList<Cultivo> cleanArrayCultivos(String[] typeCultivos) {
        ArrayList<Cultivo> cultivos = new ArrayList<Cultivo>();
        for (int i = 0; i < typeCultivos.length; i++) {
            cultivos.add(new Cultivo(typeCultivos[i], 0.0));
        }
        return cultivos;
    }
}
