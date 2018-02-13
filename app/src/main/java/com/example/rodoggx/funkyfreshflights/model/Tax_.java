
package com.example.rodoggx.funkyfreshflights.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tax_ {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("chargeType")
    @Expose
    private String chargeType;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("salePrice")
    @Expose
    private String salePrice;

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

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

}
