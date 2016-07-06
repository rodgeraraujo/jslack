package com.github.seratch.jslack.api.methods.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsersProfileGetRequest {

    private String token;
    private String user;
    private Integer includeLabels;
}