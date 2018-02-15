
package com.example.rodoggx.EarthquakeEloquence.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Leg {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("aircraft")
    @Expose
    private String aircraft;
    @SerializedName("arrivalTime")
    @Expose
    private String arrivalTime;
    @SerializedName("departureTime")
    @Expose
    private String departureTime;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("originTerminal")
    @Expose
    private String originTerminal;
    @SerializedName("destinationTerminal")
    @Expose
    private String destinationTerminal;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("onTimePerformance")
    @Expose
    private Integer onTimePerformance;
    @SerializedName("mileage")
    @Expose
    private Integer mileage;
    @SerializedName("secure")
    @Expose
    private Boolean secure;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOriginTerminal() {
        return originTerminal;
    }

    public void setOriginTerminal(String originTerminal) {
        this.originTerminal = originTerminal;
    }

    public String getDestinationTerminal() {
        return destinationTerminal;
    }

    public void setDestinationTerminal(String destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getOnTimePerformance() {
        return onTimePerformance;
    }

    public void setOnTimePerformance(Integer onTimePerformance) {
        this.onTimePerformance = onTimePerformance;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Boolean getSecure() {
        return secure;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

}
