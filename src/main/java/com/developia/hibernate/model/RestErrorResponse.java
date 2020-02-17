package com.developia.hibernate.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestErrorResponse  {
    private int code;
    private String message;
}
