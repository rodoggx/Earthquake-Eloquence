
package com.example.rodoggx.EarthquakeEloquence.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Passengers {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("adultCount")
    @Expose
    private Integer adultCount;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getAdultCount() {
        return adultCount;
    }

    public void setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
    }

}
