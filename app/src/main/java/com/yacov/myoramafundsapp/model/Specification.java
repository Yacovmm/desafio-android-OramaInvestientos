package com.yacov.myoramafundsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by YacovR on 28-Jan-18.
 */

public class Specification {





    @SerializedName("is_qualified")
    @Expose
    private Boolean isQualified;
    @SerializedName("fund_type")
    @Expose
    private String fundType;
    @SerializedName("fund_class")
    @Expose
    private String fundClass;
    @SerializedName("fund_macro_strategy")
    @Expose
    private FundMacroStrategy fundMacroStrategy;
    @SerializedName("fund_main_strategy")
    @Expose
    private FundMainStrategy fundMainStrategy;


    public Specification() {
    }

    public Specification(Boolean isQualified, String fundType, String fundClass, FundMacroStrategy fundMacroStrategy, FundMainStrategy fundMainStrategy) {
        this.isQualified = isQualified;
        this.fundType = fundType;
        this.fundClass = fundClass;
        this.fundMacroStrategy = fundMacroStrategy;
        this.fundMainStrategy = fundMainStrategy;
    }

    public Boolean getQualified() {
        return isQualified;
    }

    public void setQualified(Boolean qualified) {
        isQualified = qualified;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getFundClass() {
        return fundClass;
    }

    public void setFundClass(String fundClass) {
        this.fundClass = fundClass;
    }

    public FundMacroStrategy getFundMacroStrategy() {
        return fundMacroStrategy;
    }

    public void setFundMacroStrategy(FundMacroStrategy fundMacroStrategy) {
        this.fundMacroStrategy = fundMacroStrategy;
    }

    public FundMainStrategy getFundMainStrategy() {
        return fundMainStrategy;
    }

    public void setFundMainStrategy(FundMainStrategy fundMainStrategy) {
        this.fundMainStrategy = fundMainStrategy;
    }
}
