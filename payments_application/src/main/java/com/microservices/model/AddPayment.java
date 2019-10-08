package com.microservices.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class AddPayment {
    @NotNull
    public String status;
    @NotNull
    public int orderId;

    public AddPayment(@NotNull String status, @NotNull int orderId) {
        this.status = status;
        this.orderId = orderId;
    }
}
