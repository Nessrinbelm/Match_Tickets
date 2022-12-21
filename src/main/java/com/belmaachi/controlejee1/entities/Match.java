package com.belmaachi.controlejee1.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "matchFoot")
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
