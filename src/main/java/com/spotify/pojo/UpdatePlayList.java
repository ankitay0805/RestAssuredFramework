package com.spotify.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "name",
            "description",
            "public"
    })
    public class UpdatePlayList {

        @JsonProperty("name")
        private String name;
        @JsonProperty("description")
        private String description;
        @JsonProperty("public")
        private Boolean _public;

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public UpdatePlayList setName(String name) {
            this.name = name;
            return this;
        }

        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        @JsonProperty("description")
        public UpdatePlayList setDescription(String description) {
            this.description = description;
            return this;
        }

        @JsonProperty("public")
        public Boolean getPublic() {
            return _public;
        }

        @JsonProperty("public")
        public UpdatePlayList setPublic(Boolean _public) {
            this._public = _public;
            return this;
        }
}
