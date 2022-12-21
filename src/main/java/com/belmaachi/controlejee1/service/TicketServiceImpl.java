package com.belmaachi.controlejee1.service;
import com.belmaachi.controlejee1.Repositories.TicketRepository;
import com.belmaachi.controlejee1.dtos.TicketRequestDto;
import com.belmaachi.controlejee1.dtos.TicketResponseDto;
import com.belmaachi.controlejee1.entities.Ticket;
import com.belmaachi.controlejee1.enums.Statut;
import com.belmaachi.controlejee1.mappers.TicketMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TicketServiceImpl implements TicketService{
    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    TicketMapper ticketMapper;
    @Override
    public TicketResponseDto addTicket(TicketRequestDto ticketRequestDto) {
        Ticket t=ticketMapper.fromTicketRequestDto(ticketRequestDto);
        t.setStatut(Statut.ACTIVE);
        ticketRepository.save(t);

        TicketResponseDto ticketResponseDto=ticketMapper.fromTicket(t);
        return ticketResponseDto;

    }

    @Override
    public Ticket editTicket(Long id, Ticket ticket) {
        Ticket t=ticketRepository.findById(id).get();
        if(t != null){
           // t.setReference(ticket.getReference());
           // t.setPrix(ticket.getPrix());
            t.setStatut(ticket.getStatut());
            //t.setMatch(ticket.getMatch());
        }
        return ticketRepository.save(t);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public List<Ticket> getTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicket(Long id) {
        return ticketRepository.findById(id).orElseThrow(()-> new RuntimeException("Ticket Not Found"));
    }

   /* @Override
    public Ticket ModifierStatut(Long id,Ticket ticket){
        Ticket t=ticketRepository.findById(id).get();
        if(t != null){
           t.setStatut(ticket.getStatut());
        }
        return ticketRepository.save(t);

    }*/
}
