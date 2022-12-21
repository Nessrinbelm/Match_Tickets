package com.belmaachi.controlejee1.service;
import com.belmaachi.controlejee1.dtos.MatchRequestDto;
import com.belmaachi.controlejee1.dtos.MatchResponseDto;
import com.belmaachi.controlejee1.entities.Match;

import java.util.List;


public interface MatchService {
    MatchResponseDto addMatch(MatchRequestDto match);
    Match editMatch(Long id, Match match);
    void deleteMatch(Long id);
    List<Match> getMatchs();
    Match getMatch(Long id);
}
