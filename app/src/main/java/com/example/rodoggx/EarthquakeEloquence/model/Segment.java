
package com.example.rodoggx.EarthquakeEloquence.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Segment {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("flight")
    @Expose
    private Flight flight;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("cabin")
    @Expose
    private String cabin;
    @SerializedName("bookingCode")
    @Expose
    private String bookingCode;
    @SerializedName("bookingCodeCount")
    @Expose
    private Integer bookingCodeCount;
    @SerializedName("marriedSegmentGroup")
    @Expose
    private String marriedSegmentGroup;
    @SerializedName("leg")
    @Expose
    private List<Leg> leg = null;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Integer getBookingCodeCount() {
        return bookingCodeCount;
    }

    public void setBookingCodeCount(Integer bookingCodeCount) {
        this.bookingCodeCount = bookingCodeCount;
    }

    public String getMarriedSegmentGroup() {
        return marriedSegmentGroup;
    }

    public void setMarriedSegmentGroup(String marriedSegmentGroup) {
        this.marriedSegmentGroup = marriedSegmentGroup;
    }

    public List<Leg> getLeg() {
        return leg;
    }

    public void setLeg(List<Leg> leg) {
        this.leg = leg;
    }

}
