package com.jleetutorial.response;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class DateResponse {
    private Date date;
}
