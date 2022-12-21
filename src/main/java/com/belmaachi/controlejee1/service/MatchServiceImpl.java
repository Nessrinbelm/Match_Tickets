package com.belmaachi.controlejee1.service;

import com.belmaachi.controlejee1.Repositories.MatchRepository;
import com.belmaachi.controlejee1.dtos.MatchRequestDto;
import com.belmaachi.controlejee1.dtos.MatchResponseDto;
import com.belmaachi.controlejee1.entities.Match;
import com.belmaachi.controlejee1.mappers.MatchMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MatchServiceImpl implements MatchService {
    @Autowired
    MatchRepository matchRepository;
    @Autowired
    MatchMapper matchMapper;

    @Override
    public MatchResponseDto addMatch(MatchRequestDto matchRequestDto) {
        Match m=matchMapper.fromMatchRequestDto(matchRequestDto);
        m.setLieu("Maroc");
        matchRepository.save(m);
        MatchResponseDto matchResponseDto=matchMapper.fromMatch(m);
        return matchResponseDto;
    }

    @Override
    public Match editMatch(Long id, Match match) {
        Match m=matchRepository.findById(id).get();
        if(m != null){
            m.setLieu(match.getLieu());
            m.setRef_match(match.getRef_match());
            m.setDate_heure(match.getDate_heure());
            m.setEquipe1(match.getEquipe1());
            m.setEquipe2(match.getEquipe2());
            m.setTickets(match.getTickets());

        }
        return matchRepository.save(m);
    }

    @Override
    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);

    }

    @Override
    public List<Match> getMatchs() {
        return matchRepository.findAll();
    }

    @Override
    public Match getMatch(Long id) {
        return  matchRepository.findById(id).orElseThrow(()-> new RuntimeException("Match Not Found!!"));
    }
}
