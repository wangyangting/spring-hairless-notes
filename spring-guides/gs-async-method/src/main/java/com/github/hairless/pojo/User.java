package com.github.hairless.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author wangyangting
 * @date 2020-06-12
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class User {
    private String name;
    private String blog;
}
