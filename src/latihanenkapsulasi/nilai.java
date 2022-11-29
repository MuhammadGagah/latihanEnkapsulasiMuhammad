/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanenkapsulasi;

/**
 *
 * @author muhammad
 */
public class nilai {
    private int nilaiPraktek;
    private int nilaiTiori;
    public int getNP() {
        return nilaiPraktek;
    }
    public int getNT() {
        return nilaiTiori;
    }
    public void setNilaiPraktek (int nilaiPraktek) {
        this.nilaiPraktek = nilaiPraktek;
    }
    public void setNilaiTiori (int nilaiTiori) {
        this.nilaiTiori = nilaiTiori;
    }
    public nilai() {
        int np = 0;
        int nt = 0;
    }
    public int na (int np, int nt) {
        return np+nt/2;
    }
    public int getNa() {
        return na(nilaiPraktek, nilaiTiori);
    }
}
