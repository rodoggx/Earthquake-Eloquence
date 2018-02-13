
package com.example.rodoggx.funkyfreshflights.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FreeBaggageOption {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("pieces")
    @Expose
    private Integer pieces;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

}
