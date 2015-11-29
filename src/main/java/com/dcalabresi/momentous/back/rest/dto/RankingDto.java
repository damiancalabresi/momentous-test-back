package com.dcalabresi.momentous.back.rest.dto;

import javax.validation.constraints.NotNull;

public class RankingDto {

    @NotNull(message = "The ranking cannot be null")
    private Float rankingFrom;

    @NotNull(message = "The ranking cannot be null")
    private Float rankingTo;

    public RankingDto() {
    }

    public Float getRankingFrom() {
        return rankingFrom;
    }

    public void setRankingFrom(Float rankingFrom) {
        this.rankingFrom = rankingFrom;
    }

    public Float getRankingTo() {
        return rankingTo;
    }

    public void setRankingTo(Float rankingTo) {
        this.rankingTo = rankingTo;
    }
}
