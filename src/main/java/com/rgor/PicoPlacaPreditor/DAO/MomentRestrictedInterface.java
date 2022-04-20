/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rgor.PicoPlacaPreditor.DAO;
import com.rgor.PicoPlacaPreditor.Entity.MomentRestricted;
/**
 *
 * @author rortiz
 */
public interface MomentRestrictedInterface {
    public String dayOfMomentRestricted(MomentRestricted momentRestricted);
    public boolean  restrictedTime(MomentRestricted momentRestricted);
    
}
