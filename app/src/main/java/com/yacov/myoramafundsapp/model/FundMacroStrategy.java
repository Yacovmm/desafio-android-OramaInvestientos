package com.yacov.myoramafundsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by YacovR on 28-Jan-18.
 */

public class FundMacroStrategy {

    @SerializedName("explanation")
    @Expose
    private String explanation;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public FundMacroStrategy() {
    }

    /**
     *
     * @param id
     * @param name
     * @param explanation
     */
    public FundMacroStrategy(String explanation, Integer id, String name) {
        super();
        this.explanation = explanation;
        this.id = id;
        this.name = name;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
