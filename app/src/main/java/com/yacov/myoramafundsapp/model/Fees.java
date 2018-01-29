package com.yacov.myoramafundsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by YacovR on 28-Jan-18.
 */

public class Fees {



    @SerializedName("administration_fee")
    @Expose
    private String administrationFee;
    @SerializedName("maximum_administration_fee")
    @Expose
    private String maximumAdministrationFee;
    @SerializedName("has_anticipated_retrieval")
    @Expose
    private Boolean hasAnticipatedRetrieval;
    @SerializedName("performance_fee")
    @Expose
    private String performanceFee;
    @SerializedName("anticipated_retrieval_fee")
    @Expose
    private String anticipatedRetrievalFee;

    /**
     * No args constructor for use in serialization
     *
     */
    public Fees() {
    }

    /**
     *
     * @param administrationFee
     * @param performanceFee
     * @param hasAnticipatedRetrieval
     * @param maximumAdministrationFee
     * @param anticipatedRetrievalFee
     */
    public Fees(String administrationFee, String maximumAdministrationFee, Boolean hasAnticipatedRetrieval, String performanceFee, String anticipatedRetrievalFee) {
        super();
        this.administrationFee = administrationFee;
        this.maximumAdministrationFee = maximumAdministrationFee;
        this.hasAnticipatedRetrieval = hasAnticipatedRetrieval;
        this.performanceFee = performanceFee;
        this.anticipatedRetrievalFee = anticipatedRetrievalFee;
    }

    public String getAdministrationFee() {
        return administrationFee;
    }

    public void setAdministrationFee(String administrationFee) {
        this.administrationFee = administrationFee;
    }

    public String getMaximumAdministrationFee() {
        return maximumAdministrationFee;
    }

    public void setMaximumAdministrationFee(String maximumAdministrationFee) {
        this.maximumAdministrationFee = maximumAdministrationFee;
    }

    public Boolean getHasAnticipatedRetrieval() {
        return hasAnticipatedRetrieval;
    }

    public void setHasAnticipatedRetrieval(Boolean hasAnticipatedRetrieval) {
        this.hasAnticipatedRetrieval = hasAnticipatedRetrieval;
    }

    public String getPerformanceFee() {
        return performanceFee;
    }

    public void setPerformanceFee(String performanceFee) {
        this.performanceFee = performanceFee;
    }

    public String getAnticipatedRetrievalFee() {
        return anticipatedRetrievalFee;
    }

    public void setAnticipatedRetrievalFee(String anticipatedRetrievalFee) {
        this.anticipatedRetrievalFee = anticipatedRetrievalFee;
    }
}
