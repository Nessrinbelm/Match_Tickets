package com.belmaachi.controlejee1.dtos;

import com.belmaachi.controlejee1.entities.Match;
import com.belmaachi.controlejee1.enums.Statut;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor

public class TicketResponseDto {
    private Long id;
    private String reference;
    private double prix;
    private Statut statut;
    //private Match match;
}
