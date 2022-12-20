package com.belmaachi.controlejee1.Repositories;

import com.belmaachi.controlejee1.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
