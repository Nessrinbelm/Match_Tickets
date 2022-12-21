package com.belmaachi.controlejee1.Controllers;

import com.belmaachi.controlejee1.Repositories.TicketRepository;
import com.belmaachi.controlejee1.dtos.TicketRequestDto;
import com.belmaachi.controlejee1.dtos.TicketResponseDto;
import com.belmaachi.controlejee1.entities.Ticket;
import com.belmaachi.controlejee1.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = "application/json",path = "/apiticket")
public class TicketRest {
    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    TicketService ticketService;
    public TicketRest(TicketRepository ticketRepository,TicketService ticketService){
        this.ticketRepository=ticketRepository;
        this.ticketService=ticketService;
    }

    @GetMapping("/ticket/{id}")
    public Ticket getTicket(@PathVariable Long id){
       return ticketRepository.findById(id).get();
    }

    @GetMapping("/tickets")
    public List<Ticket> getTickets(){
        return  ticketService.getTickets();
    }

    @PostMapping("/ajouterTicket")
    public TicketResponseDto addTicket(@RequestBody TicketRequestDto t){
        return ticketService.addTicket(t);
    }

    @PutMapping("/modifier/{id}")
    public Ticket editTicket(@PathVariable Long id, @RequestBody Ticket t){
        return ticketService.editTicket(id,t);
    }

    @DeleteMapping("supprimerTicket/{id}")
    public void deleteTicket(@PathVariable Long id){
        ticketService.deleteTicket(id);
    }

}
