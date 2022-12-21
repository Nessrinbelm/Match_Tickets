package com.belmaachi.controlejee1.Controllers;

import com.belmaachi.controlejee1.Repositories.MatchRepository;
import com.belmaachi.controlejee1.dtos.MatchRequestDto;
import com.belmaachi.controlejee1.dtos.MatchResponseDto;
import com.belmaachi.controlejee1.entities.Match;
import com.belmaachi.controlejee1.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = "application/json",path = "/apiMatch")
public class MatchRest {
    @Autowired
    MatchRepository matchRepository;
    @Autowired
    MatchService matchService;

    public MatchRest(MatchRepository matchRepository, MatchService matchService){
        this.matchRepository=matchRepository;
        this.matchService=matchService;
    }

    @GetMapping("/Match/{id}")
    public Match getMatch(@PathVariable Long id){
        return matchRepository.findById(id).get();
    }

    @GetMapping("/Matchs")
    public List<Match> getMatchs(){
        return  matchService.getMatchs();
    }

    @PostMapping("/ajouterMatch")
    public MatchResponseDto addMatch(@RequestBody MatchRequestDto m){
        return matchService.addMatch(m);
    }

    @PutMapping("/modifierMatch/{id}")
    public Match editMatch(@PathVariable Long id, @RequestBody Match m){
        return matchService.editMatch(id,m);
    }
    @DeleteMapping("/supprimerMatch/{id}")
    public void deleteMatch(@PathVariable Long id){
        matchService.deleteMatch(id);
    }



}
