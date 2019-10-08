package com.company;
//Mostenirea
public class Arme extends AvionMilitar{
    public double calibrul;
    public String culoarea;

    Arme( double calibrul,String tipul,int marimea,String producatorul,int viteza,String culoarea) {
        super(marimea, tipul, producatorul,viteza);
        this.calibrul=calibrul;
        this.culoarea=culoarea;
    }
    public double getCalibrul(){
        return this.calibrul;
    }
    public String getCuloarea(){
        return this.culoarea;
    }
    public void setCalibrul(float calibrul)
    { this.calibrul=calibrul;
    }
    public void setCuloarea(String culoarea)
    { this.culoarea=culoarea;
    }
}