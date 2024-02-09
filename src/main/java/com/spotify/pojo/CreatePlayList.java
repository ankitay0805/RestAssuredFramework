package com.spotify.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

//@Getter @Setter
@Value
@Jacksonized
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true,value = {"collaborative",
        "external_urls",
        "followers",
        "href",
        "id",
        "images",
        "owner",
        "primary_color",
        "snapshot_id",
        "tracks",
        "type",
        "uri"},allowGetters = true,allowSetters = true)
@JsonPropertyOrder({
    "collaborative",
    "description",
    "external_urls",
    "followers",
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

public final class CreatePlayList {


    @JsonProperty("collaborative")
    private final
    Boolean collaborative;
    @JsonProperty("description")
    private final
    String description;


    @JsonProperty("external_urls")
    private final ExternalUrls externalUrls;

    @JsonProperty("followers")
    private final Followers followers;

    @JsonProperty("href")
    private final String href;

    @JsonProperty("id")
    private final String id;

    @JsonProperty("images")
    private final List<Object> images;
    @JsonProperty("name")
    private final String name;

    @JsonProperty("owner")
    private final Owner owner;

    @JsonProperty("primary_color")
    private final Object primaryColor;
    @JsonProperty("public")
    private final boolean _public;

    @JsonProperty("snapshot_id")
    private final String snapshotId;

    @JsonProperty("tracks")
    private final Tracks tracks;

    @JsonProperty("type")
    private final String type;

    @JsonProperty("uri")
    private final String uri;

    CreatePlayList(Boolean collaborative, String description, ExternalUrls externalUrls, Followers followers, String href, String id, List<Object> images, String name, Owner owner, Object primaryColor, Boolean _public, String snapshotId, Tracks tracks, String type, String uri) {
        this.collaborative = collaborative;
        this.description = description;
        this.externalUrls = externalUrls;
        this.followers = followers;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.owner = owner;
        this.primaryColor = primaryColor;
        this._public = _public;
        this.snapshotId = snapshotId;
        this.tracks = tracks;
        this.type = type;
        this.uri = uri;
    }

    public static CreatePlayListBuilder builder() {
        return new CreatePlayListBuilder();
    }


    public Boolean getCollaborative() {
        return this.collaborative;
    }

    public String getDescription() {
        return this.description;
    }

    public ExternalUrls getExternalUrls() {
        return this.externalUrls;
    }

    public Followers getFollowers() {
        return this.followers;
    }

    public String getHref() {
        return this.href;
    }

    public String getId() {
        return this.id;
    }

    public List<Object> getImages() {
        return this.images;
    }

    public String getName() {
        return this.name;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public Object getPrimaryColor() {
        return this.primaryColor;
    }

    public boolean get_public() {
        return this._public;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public Tracks getTracks() {
        return this.tracks;
    }

    public String getType() {
        return this.type;
    }

    public String getUri() {
        return this.uri;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CreatePlayList)) return false;
        final CreatePlayList other = (CreatePlayList) o;
        final Object this$collaborative = this.getCollaborative();
        final Object other$collaborative = other.getCollaborative();
        if (this$collaborative == null ? other$collaborative != null : !this$collaborative.equals(other$collaborative))
            return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$externalUrls = this.getExternalUrls();
        final Object other$externalUrls = other.getExternalUrls();
        if (this$externalUrls == null ? other$externalUrls != null : !this$externalUrls.equals(other$externalUrls))
            return false;
        final Object this$followers = this.getFollowers();
        final Object other$followers = other.getFollowers();
        if (this$followers == null ? other$followers != null : !this$followers.equals(other$followers)) return false;
        final Object this$href = this.getHref();
        final Object other$href = other.getHref();
        if (this$href == null ? other$href != null : !this$href.equals(other$href)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$images = this.getImages();
        final Object other$images = other.getImages();
        if (this$images == null ? other$images != null : !this$images.equals(other$images)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$owner = this.getOwner();
        final Object other$owner = other.getOwner();
        if (this$owner == null ? other$owner != null : !this$owner.equals(other$owner)) return false;
        final Object this$primaryColor = this.getPrimaryColor();
        final Object other$primaryColor = other.getPrimaryColor();
        if (this$primaryColor == null ? other$primaryColor != null : !this$primaryColor.equals(other$primaryColor))
            return false;
        final Object this$_public = this.get_public();
        final Object other$_public = other.get_public();
        if (this$_public == null ? other$_public != null : !this$_public.equals(other$_public)) return false;
        final Object this$snapshotId = this.getSnapshotId();
        final Object other$snapshotId = other.getSnapshotId();
        if (this$snapshotId == null ? other$snapshotId != null : !this$snapshotId.equals(other$snapshotId))
            return false;
        final Object this$tracks = this.getTracks();
        final Object other$tracks = other.getTracks();
        if (this$tracks == null ? other$tracks != null : !this$tracks.equals(other$tracks)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$uri = this.getUri();
        final Object other$uri = other.getUri();
        if (this$uri == null ? other$uri != null : !this$uri.equals(other$uri)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $collaborative = this.getCollaborative();
        result = result * PRIME + ($collaborative == null ? 43 : $collaborative.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $externalUrls = this.getExternalUrls();
        result = result * PRIME + ($externalUrls == null ? 43 : $externalUrls.hashCode());
        final Object $followers = this.getFollowers();
        result = result * PRIME + ($followers == null ? 43 : $followers.hashCode());
        final Object $href = this.getHref();
        result = result * PRIME + ($href == null ? 43 : $href.hashCode());
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $images = this.getImages();
        result = result * PRIME + ($images == null ? 43 : $images.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $owner = this.getOwner();
        result = result * PRIME + ($owner == null ? 43 : $owner.hashCode());
        final Object $primaryColor = this.getPrimaryColor();
        result = result * PRIME + ($primaryColor == null ? 43 : $primaryColor.hashCode());
        final Object $_public = this.get_public();
        result = result * PRIME + ($_public == null ? 43 : $_public.hashCode());
        final Object $snapshotId = this.getSnapshotId();
        result = result * PRIME + ($snapshotId == null ? 43 : $snapshotId.hashCode());
        final Object $tracks = this.getTracks();
        result = result * PRIME + ($tracks == null ? 43 : $tracks.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $uri = this.getUri();
        result = result * PRIME + ($uri == null ? 43 : $uri.hashCode());
        return result;
    }

    public String toString() {
        return "CreatePlayList(collaborative=" + this.getCollaborative() + ", description=" + this.getDescription() + ", externalUrls=" + this.getExternalUrls() + ", followers=" + this.getFollowers() + ", href=" + this.getHref() + ", id=" + this.getId() + ", images=" + this.getImages() + ", name=" + this.getName() + ", owner=" + this.getOwner() + ", primaryColor=" + this.getPrimaryColor() + ", _public=" + this.get_public() + ", snapshotId=" + this.getSnapshotId() + ", tracks=" + this.getTracks() + ", type=" + this.getType() + ", uri=" + this.getUri() + ")";
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Jacksonized
    public static class CreatePlayListBuilder {
        private Boolean collaborative;
        private String description;
        private ExternalUrls externalUrls;
        private Followers followers;
        private String href;
        private String id;
        private List<Object> images;
        private String name;
        private Owner owner;
        private Object primaryColor;
        private boolean _public;
        private String snapshotId;
        private Tracks tracks;
        private String type;
        private String uri;

        CreatePlayListBuilder() {
        }

        public CreatePlayListBuilder collaborative(Boolean collaborative) {
            this.collaborative = collaborative;
            return this;
        }

        public CreatePlayListBuilder description(String description) {
            this.description = description;
            return this;
        }

        public CreatePlayListBuilder externalUrls(ExternalUrls externalUrls) {
            this.externalUrls = externalUrls;
            return this;
        }

        public CreatePlayListBuilder followers(Followers followers) {
            this.followers = followers;
            return this;
        }

        public CreatePlayListBuilder href(String href) {
            this.href = href;
            return this;
        }

        public CreatePlayListBuilder id(String id) {
            this.id = id;
            return this;
        }

        public CreatePlayListBuilder images(List<Object> images) {
            this.images = images;
            return this;
        }

        public CreatePlayListBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CreatePlayListBuilder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public CreatePlayListBuilder primaryColor(Object primaryColor) {
            this.primaryColor = primaryColor;
            return this;
        }

        public CreatePlayListBuilder _public(Boolean _public) {
            this._public = _public;
            return this;
        }

        public CreatePlayListBuilder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public CreatePlayListBuilder tracks(Tracks tracks) {
            this.tracks = tracks;
            return this;
        }

        public CreatePlayListBuilder type(String type) {
            this.type = type;
            return this;
        }

        public CreatePlayListBuilder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public CreatePlayList build() {
            return new CreatePlayList(collaborative, description, externalUrls, followers, href, id, images, name, owner, primaryColor, _public, snapshotId, tracks, type, uri);
        }

        public String toString() {
            return "CreatePlayList.CreatePlayListBuilder(collaborative=" + this.collaborative + ", description=" + this.description + ", externalUrls=" + this.externalUrls + ", followers=" + this.followers + ", href=" + this.href + ", id=" + this.id + ", images=" + this.images + ", name=" + this.name + ", owner=" + this.owner + ", primaryColor=" + this.primaryColor + ", _public=" + this._public + ", snapshotId=" + this.snapshotId + ", tracks=" + this.tracks + ", type=" + this.type + ", uri=" + this.uri + ")";
        }
    }
}
