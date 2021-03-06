/*
 * OpsGenie REST API
 * OpsGenie API Description
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ifountain.opsgenie.client.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Returns list of alerts
 */
@ApiModel(description = "Returns list of alerts")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-13T16:12:27.505+03:00")
public class ListAlertsRequest {
    @JsonProperty("offset")
    private Integer offset = null;

    @JsonProperty("query")
    private String query = null;

    @JsonProperty("limit")
    private Integer limit = null;
    @JsonProperty("searchIdentifierType")
    private SearchIdentifierTypeEnum searchIdentifierType = SearchIdentifierTypeEnum.ID;
    @JsonProperty("sort")
    private SortEnum sort = SortEnum.CREATEDAT;
    @JsonProperty("searchIdentifier")
    private String searchIdentifier = null;
    @JsonProperty("order")
    private OrderEnum order = OrderEnum.DESC;

    public ListAlertsRequest offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Start index of the result set (to apply pagination). Minimum value (and also default value) is 0
     *
     * @return offset
     **/
    @ApiModelProperty(value = "Start index of the result set (to apply pagination). Minimum value (and also default value) is 0")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAlertsRequest query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Search query to apply while filtering the alerts
     *
     * @return query
     **/
    @ApiModelProperty(value = "Search query to apply while filtering the alerts")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ListAlertsRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Maximum number of items to provide in the result. Must be a positive integer value. Default value is 20 and maximum value is 100
     *
     * @return limit
     **/
    @ApiModelProperty(value = "Maximum number of items to provide in the result. Must be a positive integer value. Default value is 20 and maximum value is 100")
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAlertsRequest searchIdentifierType(SearchIdentifierTypeEnum searchIdentifierType) {
        this.searchIdentifierType = searchIdentifierType;
        return this;
    }

    /**
     * Identifier type of the saved search query. Possible values are 'id', or 'name'
     *
     * @return searchIdentifierType
     **/
    @ApiModelProperty(value = "Identifier type of the saved search query. Possible values are 'id', or 'name'")
    public SearchIdentifierTypeEnum getSearchIdentifierType() {
        return searchIdentifierType;
    }

    public void setSearchIdentifierType(SearchIdentifierTypeEnum searchIdentifierType) {
        this.searchIdentifierType = searchIdentifierType;
    }

    public ListAlertsRequest sort(SortEnum sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Name of the field that result set will be sorted by
     *
     * @return sort
     **/
    @ApiModelProperty(value = "Name of the field that result set will be sorted by")
    public SortEnum getSort() {
        return sort;
    }

    public void setSort(SortEnum sort) {
        this.sort = sort;
    }

    public ListAlertsRequest searchIdentifier(String searchIdentifier) {
        this.searchIdentifier = searchIdentifier;
        return this;
    }

    /**
     * Identifier of the saved search query to apply while filtering the alerts
     *
     * @return searchIdentifier
     **/
    @ApiModelProperty(value = "Identifier of the saved search query to apply while filtering the alerts")
    public String getSearchIdentifier() {
        return searchIdentifier;
    }

    public void setSearchIdentifier(String searchIdentifier) {
        this.searchIdentifier = searchIdentifier;
    }

    public ListAlertsRequest order(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * Sorting order of the result set
     *
     * @return order
     **/
    @ApiModelProperty(value = "Sorting order of the result set")
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlertsRequest listAlertsRequest = (ListAlertsRequest) o;
        return ObjectUtils.equals(this.offset, listAlertsRequest.offset) &&
                ObjectUtils.equals(this.query, listAlertsRequest.query) &&
                ObjectUtils.equals(this.limit, listAlertsRequest.limit) &&
                ObjectUtils.equals(this.searchIdentifierType, listAlertsRequest.searchIdentifierType) &&
                ObjectUtils.equals(this.sort, listAlertsRequest.sort) &&
                ObjectUtils.equals(this.searchIdentifier, listAlertsRequest.searchIdentifier) &&
                ObjectUtils.equals(this.order, listAlertsRequest.order);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(offset, query, limit, searchIdentifierType, sort, searchIdentifier, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertsRequest {\n");

        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchIdentifierType: ").append(toIndentedString(searchIdentifierType)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    searchIdentifier: ").append(toIndentedString(searchIdentifier)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Identifier type of the saved search query. Possible values are 'id', or 'name'
     */
    public enum SearchIdentifierTypeEnum {
        ID("id"),

        NAME("name");

        private String value;

        SearchIdentifierTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static SearchIdentifierTypeEnum fromValue(String text) {
            for (SearchIdentifierTypeEnum b : SearchIdentifierTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }


    /**
     * Name of the field that result set will be sorted by
     */
    public enum SortEnum {
        CREATEDAT("createdAt"),

        UPDATEDAT("updatedAt"),

        TINYID("tinyId"),

        ALIAS("alias"),

        MESSAGE("message"),

        STATUS("status"),

        ACKNOWLEDGED("acknowledged"),

        ISSEEN("isSeen"),

        SNOOZED("snoozed"),

        SNOOZEDUNTIL("snoozedUntil"),

        COUNT("count"),

        LASTOCCURREDAT("lastOccurredAt"),

        SOURCE("source"),

        OWNER("owner"),

        INTEGRATION_NAME("integration.name"),

        INTEGRATION_TYPE("integration.type"),

        REPORT_ACKTIME("report.ackTime"),

        REPORT_CLOSETIME("report.closeTime"),

        REPORT_ACKNOWLEDGEDBY("report.acknowledgedBy"),

        REPORT_CLOSEDBY("report.closedBy");

        private String value;

        SortEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static SortEnum fromValue(String text) {
            for (SortEnum b : SortEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Sorting order of the result set
     */
    public enum OrderEnum {
        ASC("asc"),

        DESC("desc");

        private String value;

        OrderEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static OrderEnum fromValue(String text) {
            for (OrderEnum b : OrderEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
        }
      }
      return null;
    }

    public String getValue() {
      return this.value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }
  
}

