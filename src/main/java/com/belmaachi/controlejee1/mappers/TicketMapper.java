package com.belmaachi.controlejee1.mappers;

import com.belmaachi.controlejee1.dtos.MatchRequestDto;
import com.belmaachi.controlejee1.dtos.MatchResponseDto;
import com.belmaachi.controlejee1.dtos.TicketRequestDto;
import com.belmaachi.controlejee1.dtos.TicketResponseDto;
import com.belmaachi.controlejee1.entities.Match;
import com.belmaachi.controlejee1.entities.Ticket;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper {
    public Ticket fromTicketRequestDto(TicketRequestDto ticketRequestDto){
        Ticket ticket=new Ticket();
        BeanUtils.copyProperties(ticketRequestDto,ticket);
        return ticket;
    }

    public TicketResponseDto fromTicket(Ticket ticket){
        TicketResponseDto ticketResponseDto=new TicketResponseDto();
        BeanUtils.copyProperties(ticketResponseDto,ticket);
        return  ticketResponseDto;
    }
}
