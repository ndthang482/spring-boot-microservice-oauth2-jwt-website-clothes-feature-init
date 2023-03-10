package com.product.domain.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BaseMessage {
    private String code;
    private Boolean success;
    private String message;
    private String description;
}
