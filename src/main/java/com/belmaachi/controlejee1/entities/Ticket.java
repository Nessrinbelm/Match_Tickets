package com.belmaachi.controlejee1.entities;

import com.belmaachi.controlejee1.enums.Statut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,length = 16)
    private String reference;
    private double prix;
    @Enumerated(EnumType.STRING)
    private Statut statut;
    @ManyToOne
    private Match match;
}
