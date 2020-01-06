package com.example.exportationapp.sort;

import com.example.exportationapp.Cultivo;
import java.util.ArrayList;

public class ShellSort {

    private ArrayList<Cultivo> list;
    public ShellSort(ArrayList<Cultivo> list){
        this.list = list;
    }

    public ArrayList<Cultivo> sort () {
        int size = this.list.size();

        for (int gap = size/2; gap > 0; gap /= 2) {
            for (int i = gap; i< size; i++) {
                Cultivo key = this.list.get(i);
                int j = i;
                while (j >= gap && this.list.get(j - gap).getTons() > key.getTons()) {
                    this.list.set(j, this.list.get(j - gap));
                    j -= gap;
                }
                this.list.set(j, key);
            }
        }
        return this.list;
    }
}
