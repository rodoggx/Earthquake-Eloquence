
package com.example.rodoggx.EarthquakeEloquence.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("trips")
    @Expose
    private Trips trips;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Trips getTrips() {
        return trips;
    }

    public void setTrips(Trips trips) {
        this.trips = trips;
    }

}
