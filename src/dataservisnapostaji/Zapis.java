/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataservisnapostaji;

import java.util.Date;

/**
 *
 * @author kraljevic
 */
public class Zapis {
    
    private Date vrijeme;
    private Integer vrijednost;
    private Integer eksponent;
    private String[] flagovi;

    /**
     * Get the value of flagovi
     *
     * @return the value of flagovi
     */
    public String[] getFlagovi() {
        return flagovi;
    }

    /**
     * Set the value of flagovi
     *
     * @param flagovi new value of flagovi
     */
    public void setFlagovi(String[] flagovi) {
        this.flagovi = flagovi;
    }

    /**
     * Get the value of flagovi at specified index
     *
     * @param index the index of flagovi
     * @return the value of flagovi at specified index
     */
    public String getFlagovi(int index) {
        return this.flagovi[index];
    }

    /**
     * Set the value of flagovi at specified index.
     *
     * @param index the index of flagovi
     * @param flagovi new value of flagovi at specified index
     */
    public void setFlagovi(int index, String flagovi) {
        this.flagovi[index] = flagovi;
    }


    public Integer getEksponent() {
        return eksponent;
    }

    public void setEksponent(Integer eksponent) {
        this.eksponent = eksponent;
    }

    public Integer getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(Integer vrijednost) {
        this.vrijednost = vrijednost;
    }

    public Date getVrijeme() {
        return vrijeme;
    }

    public void setVrijeme(Date vrijeme) {
        this.vrijeme = vrijeme;
    }

}
