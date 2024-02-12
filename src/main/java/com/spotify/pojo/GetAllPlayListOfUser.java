package com.spotify.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "href",
    "items",
    "limit",
    "next",
    "offset",
    "previous",
    "total"
})

public class GetAllPlayListOfUser {

    @JsonProperty("href")
    private String href;
    @JsonProperty("items")
    private List<Item> items;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("next")
    private String next;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("previous")
    private Object previous;
    @JsonProperty("total")
    private Integer total;

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public GetAllPlayListOfUser setHref(String href) {
        this.href = href;
        return this;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public GetAllPlayListOfUser setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public GetAllPlayListOfUser setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @JsonProperty("next")
    public String getNext() {
        return next;
    }

    @JsonProperty("next")
    public GetAllPlayListOfUser setNext(String next) {
        this.next = next;
        return this;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public GetAllPlayListOfUser setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    @JsonProperty("previous")
    public Object getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public GetAllPlayListOfUser setPrevious(Object previous) {
        this.previous = previous;
        return this;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public GetAllPlayListOfUser setTotal(Integer total) {
        this.total = total;
        return this;
    }

}
