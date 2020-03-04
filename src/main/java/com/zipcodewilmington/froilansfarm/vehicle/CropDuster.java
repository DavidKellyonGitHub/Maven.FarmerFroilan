package com.zipcodewilmington.froilansfarm.vehicle;


import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.person.Rider;

import java.util.logging.Logger;

public class CropDuster extends Aircraft implements FarmVehicle, Rideable {

    private static final Logger LOGGER = Logger.getLogger(CropDuster.class.getName());

    public CropDuster(Rider rider){
        super(rider);
    }

    public void operate(Field field) {
        if (!(rider instanceof Pilot)){
            LOGGER.info("\nYou must be a pilot to pilot this!");
        }
        else {

        }
    }



    @Override
    public String makeNoise() {
        return "bzzzzzzzzzzz";
    }
}
