package com.jleetutorial.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PongResponse {
    private String message;
}
