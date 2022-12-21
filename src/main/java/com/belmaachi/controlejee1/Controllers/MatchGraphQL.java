package com.belmaachi.controlejee1.Controllers;

import com.belmaachi.controlejee1.dtos.MatchRequestDto;
import com.belmaachi.controlejee1.dtos.MatchResponseDto;
import com.belmaachi.controlejee1.dtos.TicketRequestDto;
import com.belmaachi.controlejee1.dtos.TicketResponseDto;
import com.belmaachi.controlejee1.entities.Match;
import com.belmaachi.controlejee1.entities.Ticket;
import com.belmaachi.controlejee1.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MatchGraphQL {
    @Autowired
    MatchService matchService;

    @QueryMapping
    public Match getMatch(@Argument Long id){
        return matchService.getMatch(id);
    }

    @QueryMapping
    public List<Match> getMatchs(){
        return  matchService.getMatchs();
    }

    @MutationMapping
    public MatchResponseDto addMatch(@Argument MatchRequestDto m){
        return matchService.addMatch(m);
    }

    @MutationMapping
    public Match editMatch(@Argument Long id, @Argument Match m){
        return matchService.editMatch(id,m);
    }
    @MutationMapping
    public void deleteMatch(@Argument Long id){
        matchService.deleteMatch(id);
    }



}
