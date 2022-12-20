package com.belmaachi.controlejee1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.Temporal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Match {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,length = 16)
    private String ref_match;
    private Date date_heure;
    private String lieu;
    private String equipe1;
    private String equipe2;
   @OneToMany
    private List<Ticket> tickets=new ArrayList<>();
}
