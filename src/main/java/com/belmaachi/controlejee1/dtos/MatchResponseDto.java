package com.belmaachi.controlejee1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class MatchResponseDto {
    private Long id;
    private String ref_match;
    private Date date_heure;
    private String lieu;
    private String equipe1;
    private String equipe2;
}
