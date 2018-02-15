
package com.example.rodoggx.EarthquakeEloquence.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Slouse {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("segment")
    @Expose
    private List<Segment> segment = null;

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

    public List<Segment> getSegment() {
        return segment;
    }

    public void setSegment(List<Segment> segment) {
        this.segment = segment;
    }

}
