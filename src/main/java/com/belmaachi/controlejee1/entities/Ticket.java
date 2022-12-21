package com.belmaachi.controlejee1.entities;

import com.belmaachi.controlejee1.enums.Statut;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "TicketMatch")
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,length = 16)
    private String reference;
    private double prix;
    private Statut statut;
    @ManyToOne
    private Match match;
}
