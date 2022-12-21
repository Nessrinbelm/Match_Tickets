package com.belmaachi.controlejee1.service;
import com.belmaachi.controlejee1.dtos.TicketRequestDto;
import com.belmaachi.controlejee1.dtos.TicketResponseDto;
import com.belmaachi.controlejee1.entities.Ticket;


import java.util.List;


public interface TicketService {
    TicketResponseDto addTicket(TicketRequestDto ticket);
    Ticket editTicket(Long id, Ticket ticket);
    void deleteTicket(Long id);
    List<Ticket> getTickets();
    Ticket getTicket(Long id);
    //Ticket ModifierStatut(Long id,Ticket ticket);
}
