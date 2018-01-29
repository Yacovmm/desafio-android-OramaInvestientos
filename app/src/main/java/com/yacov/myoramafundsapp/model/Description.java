package com.yacov.myoramafundsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by YacovR on 28-Jan-18.
 */

public class Description {



    @SerializedName("objective")
    @Expose
    private String objective;
    @SerializedName("movie_url")
    @Expose
    private String movieUrl;
    @SerializedName("target_audience")
    @Expose
    private String targetAudience;
    @SerializedName("strengths")
    @Expose
    private String strengths;
    @SerializedName("strategy")
    @Expose
    private String strategy;

    /**
     * No args constructor for use in serialization
     *
     */
    public Description() {
    }

    /**
     *
     * @param objective
     * @param movieUrl
     * @param targetAudience
     * @param strategy
     * @param strengths
     */
    public Description(String objective, String movieUrl, String targetAudience, String strengths, String strategy) {
        super();
        this.objective = objective;
        this.movieUrl = movieUrl;
        this.targetAudience = targetAudience;
        this.strengths = strengths;
        this.strategy = strategy;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

}
