
package com.example.rodoggx.EarthquakeEloquence.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trips {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("requestId")
    @Expose
    private String requestId;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("tripOption")
    @Expose
    private List<TripOption> tripOption = null;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<TripOption> getTripOption() {
        return tripOption;
    }

    public void setTripOption(List<TripOption> tripOption) {
        this.tripOption = tripOption;
    }

}
