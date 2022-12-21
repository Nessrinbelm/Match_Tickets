package com.belmaachi.controlejee1;

import com.belmaachi.controlejee1.Repositories.MatchRepository;
import com.belmaachi.controlejee1.Repositories.TicketRepository;
import com.belmaachi.controlejee1.entities.Match;
import com.belmaachi.controlejee1.entities.Ticket;
import com.belmaachi.controlejee1.enums.Statut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;

@SpringBootApplication
public class ControleJee1Application implements CommandLineRunner {
    @Autowired
    MatchRepository matchRepository;
    @Autowired
    TicketRepository ticketRepository;

    public static void main(String[] args) {
        SpringApplication.run(ControleJee1Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        for(int i=1;i<11;i++)
            matchRepository.save(
                    new Match(null,"Match"+i,null,"Lieu"+i,null,null,null)
            );
        for(int j=1;j<11;j++)
        ticketRepository.save(
                new Ticket(null,"Reference"+j,0, Statut.ACTIVE,null)
        );

    }
}
