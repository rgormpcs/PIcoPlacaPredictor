/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rgor.PicoPlacaPreditor.DAO;

import com.rgor.PicoPlacaPreditor.Entity.MomentRestricted;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rortiz
 */
public class MomentRestrictedImplements implements MomentRestrictedInterface {

    @Override
    public String dayOfMomentRestricted(MomentRestricted momentRestricted) {
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        String dayOfMoment="";
        try {
            Date dateTransform = format.parse(momentRestricted.getDate());
            switch (dateTransform.getDay()){
                case 1: dayOfMoment="Lunes";
                    break;
                case 2: dayOfMoment="Martes";
                    break;
                case 3: dayOfMoment="Miercoles";
                    break;
                case 4: dayOfMoment="Jueves";
                    break;
                case 5: dayOfMoment="Viernes";
                    break;
                case 6: dayOfMoment="Sabado";
                    break;
                case 0: dayOfMoment="Domingo";
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dayOfMoment;

}

    @Override
    public boolean restrictedTime(MomentRestricted momentRestricted) {
        String[] timeSplit = momentRestricted.getTime().split(":");
        boolean virified=false;
        try {
            int hour = Integer.parseInt(timeSplit[0]);//try
            int minutes = Integer.parseInt(timeSplit[1]);
            if ((hour >= 7 && hour <= 9) || (hour >= 16 && hour <= 19)) {
                if (hour == 9 || hour == 19) {
                    if ((minutes > 0 && minutes <= 30)) {
                        virified=true;
                    } else {
                        virified=false;
                    }
                } else {
                    virified=true;
                }
            } else {
                virified=false;
            }
        } catch (Exception e) {
            virified=false;
            e.printStackTrace();
        }
        return virified;
    }

}
