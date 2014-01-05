/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataservisnapostaji;

import java.util.Date;
import java.util.NavigableMap;

/**
 *
 * @author kraljevic
 */
public class Kanal {
    NavigableMap<Date, Zapis> zapisi;
    private String oznaka;

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public NavigableMap<Date, Zapis> getZapisi() {
        return zapisi;
    }

    public void setZapisi(NavigableMap<Date, Zapis> zapisi) {
        this.zapisi = zapisi;
    }

}
