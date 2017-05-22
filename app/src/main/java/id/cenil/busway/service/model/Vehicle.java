package id.cenil.busway.service.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by iamnubs on 5/22/17.
 */

@IgnoreExtraProperties
public class Vehicle {
    public double altitude;
    public double latitude;
    public double longitude;
    public int fix;
    public int heading;

    public Vehicle(){

    };
}
