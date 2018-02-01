package ru.sbt.samokhvalova.child;

import ru.sbt.samokhvalova.person.Parent;

/**
 * Created by SBT-Samokhvalova-OV on 01.02.2018.
 */
public class Child extends Parent{

    public Integer Amountofchildren;

    public Child (String FIO, String DR, String Male, Integer Amountofchildren){
        this.FIO = FIO;
        this.Male = Male;
        setDR(DR);
        this.Amountofchildren = Amountofchildren;
    }
}
