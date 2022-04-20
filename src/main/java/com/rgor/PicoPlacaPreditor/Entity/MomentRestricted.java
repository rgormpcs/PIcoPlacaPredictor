package com.rgor.PicoPlacaPreditor.Entity;

import lombok.Data;


import java.time.DateTimeException;
import java.util.Date;

@Data
public class MomentRestricted {
    private String date;
    private String time;

   
    public  MomentRestricted(String date, String time){
    this.date=date;
    this.time=time;
    }
}
