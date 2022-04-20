package com.rgor.PicoPlacaPreditor.Entity;

import lombok.Data;


import java.time.DateTimeException;
import java.util.Date;

@Data
public class Moment {
    private Date date;
    private void Moment(){
        System.out.println(date);
    }
}
