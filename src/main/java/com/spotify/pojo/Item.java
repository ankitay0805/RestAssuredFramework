package com.spotify.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "collaborative",
    "description",
    "external_urls",
    "href",
    "id",
    "images",
    "name",
    "owner",
    "primary_color",
    "public",
    "snapshot_id",
    "tracks",
    "type",
    "uri"
})
public class Item {

    @JsonProperty("collaborative")
    private Boolean collaborative;
    @JsonProperty("description")
    private String description;
    @JsonProperty("external_urls")
    private ExternalUrls externalUrls;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("images")
    private List<Object> images;
    @JsonProperty("name")
    private String name;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("primary_color")
    private Object primaryColor;
    @JsonProperty("public")
    private Boolean _public;
    @JsonProperty("snapshot_id")
    private String snapshotId;
    @JsonProperty("tracks")
    private Tracks tracks;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;

    @JsonProperty("collaborative")
    public Boolean getCollaborative() {
        return collaborative;
    }

    @JsonProperty("collaborative")
    public Item setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("external_urls")
    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    @JsonProperty("external_urls")
    public Item setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
        return this;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public Item setHref(String href) {
        this.href = href;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public Item setId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("images")
    public List<Object> getImages() {
        return images;
    }

    @JsonProperty("images")
    public Item setImages(List<Object> images) {
        this.images = images;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public Item setName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public Item setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    @JsonProperty("primary_color")
    public Object getPrimaryColor() {
        return primaryColor;
    }

    @JsonProperty("primary_color")
    public Item setPrimaryColor(Object primaryColor) {
        this.primaryColor = primaryColor;
        return this;
    }

    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    @JsonProperty("public")
    public Item setPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    @JsonProperty("snapshot_id")
    public String getSnapshotId() {
        return snapshotId;
    }

    @JsonProperty("snapshot_id")
    public Item setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    @JsonProperty("tracks")
    public Tracks getTracks() {
        return tracks;
    }

    @JsonProperty("tracks")
    public Item setTracks(Tracks tracks) {
        this.tracks = tracks;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public Item setType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public Item setUri(String uri) {
        this.uri = uri;
        return this;
    }

}
