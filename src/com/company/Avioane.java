package com.company;
//Clasa parinte pentru Arme
class AvionMilitar {
    public float marimea;
    public String tipul;
    public String producatorul;
    public int viteza;
    AvionMilitar(float marimea,String tipul,String producatorul,int viteza){
        this.marimea=marimea;
        this.setTipul(tipul);
        this.producatorul=producatorul;
        this.viteza=viteza;
    }
    public float getMarimea(){
        return this.marimea;
    }
    public String getTipul() {
        return this.tipul;
    }
    public String getProducatorul() {
        return this.producatorul;
    }
    public int getViteza(){
        return this.viteza;
    }
    public void setMarimea(float marimea) {
        this.marimea=marimea;
    }
    public void setTipul(String tipul) {
        this.tipul=tipul;
    }
    public void setProducatorul(String producatorul)
    { this.producatorul=producatorul;
    }

    public void setViteza(int viteza)
    { this.viteza=viteza;
    }
}
