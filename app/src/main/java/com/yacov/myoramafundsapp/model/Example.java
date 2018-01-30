package com.yacov.myoramafundsapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by YacovR on 28-Jan-18.
 */

public class Example {

    @SerializedName("initial_date")
    @Expose
    private String initialDate;

    @SerializedName("operability")
    @Expose
    private Operability operability;

    @SerializedName("full_name")
    @Expose
    private String fullName;

    @SerializedName("fees")
    @Expose
    private Fees fees;



    @SerializedName("is_closed")
    @Expose
    private Boolean isClosed;

    @SerializedName("simple_name")
    @Expose
    private String simpleName;

    @SerializedName("target_fund")
    @Expose
    private Object targetFund;


    @SerializedName("specification")
    @Expose
    private Specification specification;



    @SerializedName("tax_classification")
    @Expose
    private String taxClassification;

    @SerializedName("cnpj")
    @Expose
    private String cnpj;

    @SerializedName("description")
    @Expose
    private Description description;

    @SerializedName("profitabilities")
    @Expose
    private Profitabilities profitabilities;

    @SerializedName("quota_date")
    @Expose
    private String quotaDate;

    @SerializedName("is_active")
    @Expose
    private Boolean isActive;

    @SerializedName("slug")
    @Expose
    private String slug;

    @SerializedName("volatility_12m")
    @Expose
    private String volatility12m;

    @SerializedName("net_patrimony_12m")
    @Expose
    private String netPatrimony12m;

    @SerializedName("is_closed_to_capture")
    @Expose
    private Boolean isClosedToCapture;

    @SerializedName("fund_manager")
    @Expose
    private FundManager fundManager;

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    public Example(String initialDate, Operability operability, String fullName, Fees fees, Boolean isClosed, String simpleName, Object targetFund, Specification specification, String taxClassification, String cnpj, Description description, Profitabilities profitabilities, String quotaDate, Boolean isActive, String slug, String volatility12m, String netPatrimony12m, Boolean isClosedToCapture, FundManager fundManager) {
        this.initialDate = initialDate;
        this.operability = operability;
        this.fullName = fullName;
        this.fees = fees;
        this.isClosed = isClosed;
        this.simpleName = simpleName;
        this.targetFund = targetFund;
        this.specification = specification;
        this.taxClassification = taxClassification;
        this.cnpj = cnpj;
        this.description = description;
        this.profitabilities = profitabilities;
        this.quotaDate = quotaDate;
        this.isActive = isActive;
        this.slug = slug;
        this.volatility12m = volatility12m;
        this.netPatrimony12m = netPatrimony12m;
        this.isClosedToCapture = isClosedToCapture;
        this.fundManager = fundManager;
    }

    public Profitabilities getProfitabilities() {
        return profitabilities;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public Operability getOperability() {
        return operability;
    }

    public void setOperability(Operability operability) {
        this.operability = operability;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Fees getFees() {
        return fees;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public Boolean getClosed() {
        return isClosed;
    }

    public void setClosed(Boolean closed) {
        isClosed = closed;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public Object getTargetFund() {
        return targetFund;
    }

    public void setTargetFund(Object targetFund) {
        this.targetFund = targetFund;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String getTaxClassification() {
        return taxClassification;
    }

    public void setTaxClassification(String taxClassification) {
        this.taxClassification = taxClassification;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getQuotaDate() {
        return quotaDate;
    }

    public void setQuotaDate(String quotaDate) {
        this.quotaDate = quotaDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getVolatility12m() {
        return volatility12m;
    }

    public void setVolatility12m(String volatility12m) {
        this.volatility12m = volatility12m;
    }

    public String getNetPatrimony12m() {
        return netPatrimony12m;
    }

    public void setNetPatrimony12m(String netPatrimony12m) {
        this.netPatrimony12m = netPatrimony12m;
    }

    public Boolean getClosedToCapture() {
        return isClosedToCapture;
    }

    public void setClosedToCapture(Boolean closedToCapture) {
        isClosedToCapture = closedToCapture;
    }

    public FundManager getFundManager() {
        return fundManager;
    }

    public void setFundManager(FundManager fundManager) {
        this.fundManager = fundManager;
    }
}
