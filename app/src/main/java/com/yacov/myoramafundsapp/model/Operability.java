package com.yacov.myoramafundsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by YacovR on 28-Jan-18.
 */

public class Operability {


    @SerializedName("has_operations_on_thursdays")
    @Expose
    private Boolean hasOperationsOnThursdays;
    @SerializedName("retrieval_liquidation_days_type")
    @Expose
    private String retrievalLiquidationDaysType;
    @SerializedName("application_quotation_days_type")
    @Expose
    private String applicationQuotationDaysType;
    @SerializedName("retrieval_quotation_days")
    @Expose
    private Integer retrievalQuotationDays;
    @SerializedName("anticipated_retrieval_quotation_days_str")
    @Expose
    private String anticipatedRetrievalQuotationDaysStr;
    @SerializedName("retrieval_quotation_days_type")
    @Expose
    private String retrievalQuotationDaysType;
    @SerializedName("anticipated_retrieval_quotation_days")
    @Expose
    private Integer anticipatedRetrievalQuotationDays;
    @SerializedName("has_operations_on_wednesdays")
    @Expose
    private Boolean hasOperationsOnWednesdays;
    @SerializedName("minimum_balance_permanence")
    @Expose
    private String minimumBalancePermanence;
    @SerializedName("has_operations_on_tuesdays")
    @Expose
    private Boolean hasOperationsOnTuesdays;
    @SerializedName("minimum_initial_application_amount")
    @Expose
    private String minimumInitialApplicationAmount;
    @SerializedName("application_time_limit")
    @Expose
    private String applicationTimeLimit;
    @SerializedName("has_operations_on_mondays")
    @Expose
    private Boolean hasOperationsOnMondays;
    @SerializedName("retrieval_time_limit")
    @Expose
    private String retrievalTimeLimit;
    @SerializedName("has_operations_on_fridays")
    @Expose
    private Boolean hasOperationsOnFridays;
    @SerializedName("retrieval_special_type")
    @Expose
    private String retrievalSpecialType;
    @SerializedName("application_quotation_days_str")
    @Expose
    private String applicationQuotationDaysStr;
    @SerializedName("retrieval_quotation_days_str")
    @Expose
    private String retrievalQuotationDaysStr;
    @SerializedName("retrieval_liquidation_days_str")
    @Expose
    private String retrievalLiquidationDaysStr;
    @SerializedName("application_quotation_days")
    @Expose
    private Integer applicationQuotationDays;
    @SerializedName("retrieval_liquidation_days")
    @Expose
    private Integer retrievalLiquidationDays;
    @SerializedName("anticipated_retrieval_quotation_days_type")
    @Expose
    private String anticipatedRetrievalQuotationDaysType;
    @SerializedName("minimum_subsequent_application_amount")
    @Expose
    private String minimumSubsequentApplicationAmount;

    /**
     * No args constructor for use in serialization
     *
     */
    public Operability() {
    }


    public Operability(Boolean hasOperationsOnThursdays, String retrievalLiquidationDaysType, String applicationQuotationDaysType, Integer retrievalQuotationDays, String anticipatedRetrievalQuotationDaysStr, String retrievalQuotationDaysType, Integer anticipatedRetrievalQuotationDays, Boolean hasOperationsOnWednesdays, String minimumBalancePermanence, Boolean hasOperationsOnTuesdays, String minimumInitialApplicationAmount, String applicationTimeLimit, Boolean hasOperationsOnMondays, String retrievalTimeLimit, Boolean hasOperationsOnFridays, String retrievalSpecialType, String applicationQuotationDaysStr, String retrievalQuotationDaysStr, String retrievalLiquidationDaysStr, Integer applicationQuotationDays, Integer retrievalLiquidationDays, String anticipatedRetrievalQuotationDaysType, String minimumSubsequentApplicationAmount) {
        super();
        this.hasOperationsOnThursdays = hasOperationsOnThursdays;
        this.retrievalLiquidationDaysType = retrievalLiquidationDaysType;
        this.applicationQuotationDaysType = applicationQuotationDaysType;
        this.retrievalQuotationDays = retrievalQuotationDays;
        this.anticipatedRetrievalQuotationDaysStr = anticipatedRetrievalQuotationDaysStr;
        this.retrievalQuotationDaysType = retrievalQuotationDaysType;
        this.anticipatedRetrievalQuotationDays = anticipatedRetrievalQuotationDays;
        this.hasOperationsOnWednesdays = hasOperationsOnWednesdays;
        this.minimumBalancePermanence = minimumBalancePermanence;
        this.hasOperationsOnTuesdays = hasOperationsOnTuesdays;
        this.minimumInitialApplicationAmount = minimumInitialApplicationAmount;
        this.applicationTimeLimit = applicationTimeLimit;
        this.hasOperationsOnMondays = hasOperationsOnMondays;
        this.retrievalTimeLimit = retrievalTimeLimit;
        this.hasOperationsOnFridays = hasOperationsOnFridays;
        this.retrievalSpecialType = retrievalSpecialType;
        this.applicationQuotationDaysStr = applicationQuotationDaysStr;
        this.retrievalQuotationDaysStr = retrievalQuotationDaysStr;
        this.retrievalLiquidationDaysStr = retrievalLiquidationDaysStr;
        this.applicationQuotationDays = applicationQuotationDays;
        this.retrievalLiquidationDays = retrievalLiquidationDays;
        this.anticipatedRetrievalQuotationDaysType = anticipatedRetrievalQuotationDaysType;
        this.minimumSubsequentApplicationAmount = minimumSubsequentApplicationAmount;
    }

    public Boolean getHasOperationsOnThursdays() {
        return hasOperationsOnThursdays;
    }

    public void setHasOperationsOnThursdays(Boolean hasOperationsOnThursdays) {
        this.hasOperationsOnThursdays = hasOperationsOnThursdays;
    }

    public String getRetrievalLiquidationDaysType() {
        return retrievalLiquidationDaysType;
    }

    public void setRetrievalLiquidationDaysType(String retrievalLiquidationDaysType) {
        this.retrievalLiquidationDaysType = retrievalLiquidationDaysType;
    }

    public String getApplicationQuotationDaysType() {
        return applicationQuotationDaysType;
    }

    public void setApplicationQuotationDaysType(String applicationQuotationDaysType) {
        this.applicationQuotationDaysType = applicationQuotationDaysType;
    }

    public Integer getRetrievalQuotationDays() {
        return retrievalQuotationDays;
    }

    public void setRetrievalQuotationDays(Integer retrievalQuotationDays) {
        this.retrievalQuotationDays = retrievalQuotationDays;
    }

    public String getAnticipatedRetrievalQuotationDaysStr() {
        return anticipatedRetrievalQuotationDaysStr;
    }

    public void setAnticipatedRetrievalQuotationDaysStr(String anticipatedRetrievalQuotationDaysStr) {
        this.anticipatedRetrievalQuotationDaysStr = anticipatedRetrievalQuotationDaysStr;
    }

    public String getRetrievalQuotationDaysType() {
        return retrievalQuotationDaysType;
    }

    public void setRetrievalQuotationDaysType(String retrievalQuotationDaysType) {
        this.retrievalQuotationDaysType = retrievalQuotationDaysType;
    }

    public Integer getAnticipatedRetrievalQuotationDays() {
        return anticipatedRetrievalQuotationDays;
    }

    public void setAnticipatedRetrievalQuotationDays(Integer anticipatedRetrievalQuotationDays) {
        this.anticipatedRetrievalQuotationDays = anticipatedRetrievalQuotationDays;
    }

    public Boolean getHasOperationsOnWednesdays() {
        return hasOperationsOnWednesdays;
    }

    public void setHasOperationsOnWednesdays(Boolean hasOperationsOnWednesdays) {
        this.hasOperationsOnWednesdays = hasOperationsOnWednesdays;
    }

    public String getMinimumBalancePermanence() {
        return minimumBalancePermanence;
    }

    public void setMinimumBalancePermanence(String minimumBalancePermanence) {
        this.minimumBalancePermanence = minimumBalancePermanence;
    }

    public Boolean getHasOperationsOnTuesdays() {
        return hasOperationsOnTuesdays;
    }

    public void setHasOperationsOnTuesdays(Boolean hasOperationsOnTuesdays) {
        this.hasOperationsOnTuesdays = hasOperationsOnTuesdays;
    }

    public String getMinimumInitialApplicationAmount() {
        return minimumInitialApplicationAmount;
    }

    public void setMinimumInitialApplicationAmount(String minimumInitialApplicationAmount) {
        this.minimumInitialApplicationAmount = minimumInitialApplicationAmount;
    }

    public String getApplicationTimeLimit() {
        return applicationTimeLimit;
    }

    public void setApplicationTimeLimit(String applicationTimeLimit) {
        this.applicationTimeLimit = applicationTimeLimit;
    }

    public Boolean getHasOperationsOnMondays() {
        return hasOperationsOnMondays;
    }

    public void setHasOperationsOnMondays(Boolean hasOperationsOnMondays) {
        this.hasOperationsOnMondays = hasOperationsOnMondays;
    }

    public String getRetrievalTimeLimit() {
        return retrievalTimeLimit;
    }

    public void setRetrievalTimeLimit(String retrievalTimeLimit) {
        this.retrievalTimeLimit = retrievalTimeLimit;
    }

    public Boolean getHasOperationsOnFridays() {
        return hasOperationsOnFridays;
    }

    public void setHasOperationsOnFridays(Boolean hasOperationsOnFridays) {
        this.hasOperationsOnFridays = hasOperationsOnFridays;
    }

    public String getRetrievalSpecialType() {
        return retrievalSpecialType;
    }

    public void setRetrievalSpecialType(String retrievalSpecialType) {
        this.retrievalSpecialType = retrievalSpecialType;
    }

    public String getApplicationQuotationDaysStr() {
        return applicationQuotationDaysStr;
    }

    public void setApplicationQuotationDaysStr(String applicationQuotationDaysStr) {
        this.applicationQuotationDaysStr = applicationQuotationDaysStr;
    }

    public String getRetrievalQuotationDaysStr() {
        return retrievalQuotationDaysStr;
    }

    public void setRetrievalQuotationDaysStr(String retrievalQuotationDaysStr) {
        this.retrievalQuotationDaysStr = retrievalQuotationDaysStr;
    }

    public String getRetrievalLiquidationDaysStr() {
        return retrievalLiquidationDaysStr;
    }

    public void setRetrievalLiquidationDaysStr(String retrievalLiquidationDaysStr) {
        this.retrievalLiquidationDaysStr = retrievalLiquidationDaysStr;
    }

    public Integer getApplicationQuotationDays() {
        return applicationQuotationDays;
    }

    public void setApplicationQuotationDays(Integer applicationQuotationDays) {
        this.applicationQuotationDays = applicationQuotationDays;
    }

    public Integer getRetrievalLiquidationDays() {
        return retrievalLiquidationDays;
    }

    public void setRetrievalLiquidationDays(Integer retrievalLiquidationDays) {
        this.retrievalLiquidationDays = retrievalLiquidationDays;
    }

    public String getAnticipatedRetrievalQuotationDaysType() {
        return anticipatedRetrievalQuotationDaysType;
    }

    public void setAnticipatedRetrievalQuotationDaysType(String anticipatedRetrievalQuotationDaysType) {
        this.anticipatedRetrievalQuotationDaysType = anticipatedRetrievalQuotationDaysType;
    }

    public String getMinimumSubsequentApplicationAmount() {
        return minimumSubsequentApplicationAmount;
    }

    public void setMinimumSubsequentApplicationAmount(String minimumSubsequentApplicationAmount) {
        this.minimumSubsequentApplicationAmount = minimumSubsequentApplicationAmount;
    }
}
