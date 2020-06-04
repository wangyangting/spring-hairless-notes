package com.github.hairless.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.hairless.pojo.Value;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Quote {
    private String type;
    private Value value;
}
