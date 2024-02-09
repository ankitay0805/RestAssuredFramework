package com.spotify.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "limit",
    "next",
    "offset",
    "previous",
    "href",
    "total",
    "items"
})

public class Tracks {

    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("next")
    private Object next;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("previous")
    private Object previous;
    @JsonProperty("href")
    private String href;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("items")
    private List<Object> items;

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public Tracks setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @JsonProperty("next")
    public Object getNext() {
        return next;
    }

    @JsonProperty("next")
    public Tracks setNext(Object next) {
        this.next = next;
        return this;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public Tracks setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    @JsonProperty("previous")
    public Object getPrevious() {
        return previous;
    }

    @JsonProperty("previous")
    public Tracks setPrevious(Object previous) {
        this.previous = previous;
        return this;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public Tracks setHref(String href) {
        this.href = href;
        return this;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public Tracks setTotal(Integer total) {
        this.total = total;
        return this;
    }

    @JsonProperty("items")
    public List<Object> getItems() {
        return items;
    }

    @JsonProperty("items")
    public Tracks setItems(List<Object> items) {
        this.items = items;
        return this;
    }

}
