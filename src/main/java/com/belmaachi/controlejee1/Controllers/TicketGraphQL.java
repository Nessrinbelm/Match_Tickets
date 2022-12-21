package com.belmaachi.controlejee1.Controllers;


import com.belmaachi.controlejee1.dtos.TicketRequestDto;
import com.belmaachi.controlejee1.dtos.TicketResponseDto;
import com.belmaachi.controlejee1.entities.Ticket;
import com.belmaachi.controlejee1.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketGraphQL {
    @Autowired
    TicketService ticketService;
    @QueryMapping
    public Ticket getTicket(@Argument Long id){
        return ticketService.getTicket(id);
    }

    @QueryMapping
    public List<Ticket> getTickets(){
        return  ticketService.getTickets();
    }

    @MutationMapping
    public TicketResponseDto addTicket(@Argument TicketRequestDto t){
        return ticketService.addTicket(t);
    }

    @MutationMapping
    public Ticket editTicket(@Argument Long id, @Argument Ticket t){
        return ticketService.editTicket(id,t);
    }
    @MutationMapping
    public void deleteEtudiant(@Argument Long id){
        ticketService.deleteTicket(id);
    }


}
