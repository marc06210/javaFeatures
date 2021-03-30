package com.mgu.java16.record;

// new Jackson version => no annotation
//public record Rectangle (int width, int length){
//}


// with old jackson version => no record support so annotation required
import com.fasterxml.jackson.annotation.JsonProperty;

public record Rectangle(
        @JsonProperty("width") int width,
        @JsonProperty("length") int length) {
}