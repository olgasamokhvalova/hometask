package ru.sbt.samokhvalova.person;

import com.sun.javafx.collections.SourceAdapterChange;
import com.sun.security.auth.SolarisNumericUserPrincipal;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import ru.sbt.samokhvalova.child.Child;

/**
 * Created by SBT-Samokhvalova-OV on 01.02.2018.
 */
public class Person {

    public static void main(String[] args) {
        Parent petay = new Parent("Petay", "20.01.1990", "Male", 3);
        Child vasay = new Child("Vasay", "20.02.2012", "Male", 1);
        System.out.println(petay.FIO);
        System.out.println(vasay.Amountofchildren);
        System.out.println(petay.Getamoutofchildren());
    }


}
