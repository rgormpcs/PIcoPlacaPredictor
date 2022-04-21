package com.rgor.PicoPlacaPreditor.DAO;
import com.rgor.PicoPlacaPreditor.Entity.Vehicle;
/**
 *
 * @author rortiz
 */
public class VehicleImplements implements VehicleInterface{
    @Override
    public String getRestrictedDay(Vehicle vehicle) {
        Integer lastDigit=Integer.parseInt(extractNumberPlate(vehicle.getPlate()));
        String restrictDayOfVehicle="";
        
          if(lastDigit==1 || lastDigit==2){
            restrictDayOfVehicle="Lunes";
        }else if (lastDigit==3 || lastDigit==4){
            restrictDayOfVehicle= "Martes";
        }else if (lastDigit==5 || lastDigit==6){
            restrictDayOfVehicle= "Miercoles";
        }else if (lastDigit==7 || lastDigit==8){
            restrictDayOfVehicle= "Jueves";
        }else if (lastDigit==9 || lastDigit==0){
            restrictDayOfVehicle= "Viernes";
        }
        return restrictDayOfVehicle;
    }
    @Override
    public String extractNumberPlate(String plate){
        String response="";
        try {
            response =plate.substring(plate.length()-1);
            Integer.parseInt(response);
        } catch (Exception e) {
            response="No es un numero de placa permitido debe tener el formato EJ : AAA 0123";
        }
        return response;
    }
}
