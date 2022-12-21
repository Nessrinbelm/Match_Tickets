package com.belmaachi.controlejee1.mappers;

import com.belmaachi.controlejee1.dtos.MatchRequestDto;
import com.belmaachi.controlejee1.dtos.MatchResponseDto;
import com.belmaachi.controlejee1.entities.Match;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MatchMapper {
    public Match fromMatchRequestDto(MatchRequestDto matchRequestDto){
        Match match=new Match();
        BeanUtils.copyProperties(matchRequestDto,match);
        return match;
    }

    public MatchResponseDto fromMatch(Match match){
        MatchResponseDto matchResponseDto=new MatchResponseDto();
        BeanUtils.copyProperties(matchResponseDto,match);
        return  matchResponseDto;
    }
}
