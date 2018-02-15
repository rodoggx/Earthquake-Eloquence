
package com.example.rodoggx.EarthquakeEloquence.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("airport")
    @Expose
    private List<Airport> airport = null;
    @SerializedName("city")
    @Expose
    private List<City> city = null;
    @SerializedName("aircraft")
    @Expose
    private List<Aircraft> aircraft = null;
    @SerializedName("tax")
    @Expose
    private List<Tax> tax = null;
    @SerializedName("carrier")
    @Expose
    private List<Carrier> carrier = null;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public List<Airport> getAirport() {
        return airport;
    }

    public void setAirport(List<Airport> airport) {
        this.airport = airport;
    }

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }

    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    public List<Tax> getTax() {
        return tax;
    }

    public void setTax(List<Tax> tax) {
        this.tax = tax;
    }

    public List<Carrier> getCarrier() {
        return carrier;
    }

    public void setCarrier(List<Carrier> carrier) {
        this.carrier = carrier;
    }

}
