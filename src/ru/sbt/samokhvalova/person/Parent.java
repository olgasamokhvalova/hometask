package ru.sbt.samokhvalova.person;

/**
 * Created by SBT-Samokhvalova-OV on 01.02.2018.
 */
public class Parent {
    public String FIO;
    String DR;
    protected String Male;
    private Integer Amountofchildren;

    public Integer getAmountofchildren() {
        return Amountofchildren;
    }

    public Parent () {};

    public Parent (String FIO, String DR, String Male, Integer Amountofchildren){
        this.FIO = FIO;
        this.DR = DR;
        this.Male = Male;
        this.Amountofchildren = Amountofchildren;
    }

    public Integer Getamoutofchildren () {
        return Amountofchildren;
    }

    public void setDR(String DR) {
        this.DR = DR;
    }


}
