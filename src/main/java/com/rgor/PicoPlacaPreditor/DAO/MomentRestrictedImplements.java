/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rgor.PicoPlacaPreditor.DAO;

import com.rgor.PicoPlacaPreditor.Entity.MomentRestricted;

/**
 *
 * @author rortiz
 */
public class MomentRestrictedImplements implements MomentRestrictedInterface {

    @Override
    public String dayOfMomentRestricted(MomentRestricted momentRestricted) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
