package dk.mmr.easyjet.entity;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Offers {
    private final String CompanyName = "EasyJet";
    private ArrayList<FlightBooking> list;

    public Offers(ArrayList<FlightBooking> list) {
        this.list = list;
    }
}
