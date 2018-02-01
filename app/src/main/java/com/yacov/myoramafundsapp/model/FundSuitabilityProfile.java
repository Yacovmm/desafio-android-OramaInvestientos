package com.yacov.myoramafundsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by YacovR on 01-Feb-18.
 */

public class FundSuitabilityProfile {

    @SerializedName("score_range_order")
    @Expose
    private Integer scoreRangeOrder;
    @SerializedName("name")
    @Expose
    private String name;

    public FundSuitabilityProfile() {
    }

    public FundSuitabilityProfile(Integer scoreRangeOrder, String name) {
        this.scoreRangeOrder = scoreRangeOrder;
        this.name = name;
    }

    public Integer getScoreRangeOrder() {
        return scoreRangeOrder;
    }

    public void setScoreRangeOrder(Integer scoreRangeOrder) {
        this.scoreRangeOrder = scoreRangeOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
