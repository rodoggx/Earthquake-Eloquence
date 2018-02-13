
package com.example.rodoggx.funkyfreshflights.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pricing {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("fare")
    @Expose
    private List<Fare> fare = null;
    @SerializedName("segmentPricing")
    @Expose
    private List<SegmentPricing> segmentPricing = null;
    @SerializedName("baseFareTotal")
    @Expose
    private String baseFareTotal;
    @SerializedName("saleFareTotal")
    @Expose
    private String saleFareTotal;
    @SerializedName("saleTaxTotal")
    @Expose
    private String saleTaxTotal;
    @SerializedName("saleTotal")
    @Expose
    private String saleTotal;
    @SerializedName("passengers")
    @Expose
    private Passengers passengers;
    @SerializedName("tax")
    @Expose
    private List<Tax_> tax = null;
    @SerializedName("fareCalculation")
    @Expose
    private String fareCalculation;
    @SerializedName("latestTicketingTime")
    @Expose
    private String latestTicketingTime;
    @SerializedName("ptc")
    @Expose
    private String ptc;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public List<Fare> getFare() {
        return fare;
    }

    public void setFare(List<Fare> fare) {
        this.fare = fare;
    }

    public List<SegmentPricing> getSegmentPricing() {
        return segmentPricing;
    }

    public void setSegmentPricing(List<SegmentPricing> segmentPricing) {
        this.segmentPricing = segmentPricing;
    }

    public String getBaseFareTotal() {
        return baseFareTotal;
    }

    public void setBaseFareTotal(String baseFareTotal) {
        this.baseFareTotal = baseFareTotal;
    }

    public String getSaleFareTotal() {
        return saleFareTotal;
    }

    public void setSaleFareTotal(String saleFareTotal) {
        this.saleFareTotal = saleFareTotal;
    }

    public String getSaleTaxTotal() {
        return saleTaxTotal;
    }

    public void setSaleTaxTotal(String saleTaxTotal) {
        this.saleTaxTotal = saleTaxTotal;
    }

    public String getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(String saleTotal) {
        this.saleTotal = saleTotal;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public List<Tax_> getTax() {
        return tax;
    }

    public void setTax(List<Tax_> tax) {
        this.tax = tax;
    }

    public String getFareCalculation() {
        return fareCalculation;
    }

    public void setFareCalculation(String fareCalculation) {
        this.fareCalculation = fareCalculation;
    }

    public String getLatestTicketingTime() {
        return latestTicketingTime;
    }

    public void setLatestTicketingTime(String latestTicketingTime) {
        this.latestTicketingTime = latestTicketingTime;
    }

    public String getPtc() {
        return ptc;
    }

    public void setPtc(String ptc) {
        this.ptc = ptc;
    }

}
