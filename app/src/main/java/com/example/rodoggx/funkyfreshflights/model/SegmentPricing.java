
package com.example.rodoggx.funkyfreshflights.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SegmentPricing {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("fareId")
    @Expose
    private String fareId;
    @SerializedName("segmentId")
    @Expose
    private String segmentId;
    @SerializedName("freeBaggageOption")
    @Expose
    private List<FreeBaggageOption> freeBaggageOption = null;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFareId() {
        return fareId;
    }

    public void setFareId(String fareId) {
        this.fareId = fareId;
    }

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public List<FreeBaggageOption> getFreeBaggageOption() {
        return freeBaggageOption;
    }

    public void setFreeBaggageOption(List<FreeBaggageOption> freeBaggageOption) {
        this.freeBaggageOption = freeBaggageOption;
    }

}
