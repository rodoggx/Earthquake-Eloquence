
package com.example.rodoggx.EarthquakeEloquence.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Aircraft {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
