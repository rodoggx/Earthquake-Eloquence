
package com.example.rodoggx.funkyfreshflights.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TripOption {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("saleTotal")
    @Expose
    private String saleTotal;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("slice")
    @Expose
    private List<Slouse> slice = null;
    @SerializedName("pricing")
    @Expose
    private List<Pricing> pricing = null;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(String saleTotal) {
        this.saleTotal = saleTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Slouse> getSlice() {
        return slice;
    }

    public void setSlice(List<Slouse> slice) {
        this.slice = slice;
    }

    public List<Pricing> getPricing() {
        return pricing;
    }

    public void setPricing(List<Pricing> pricing) {
        this.pricing = pricing;
    }

}
