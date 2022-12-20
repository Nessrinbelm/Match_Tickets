package com.belmaachi.controlejee1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class TicketRequestDto {
    private String reference;
    private double prix;
    private boolean statut;
}
