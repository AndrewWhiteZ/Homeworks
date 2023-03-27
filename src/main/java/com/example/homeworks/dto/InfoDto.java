package com.example.homeworks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class InfoDto {
    @JsonSerialize
    private long id;
    @JsonProperty("date")
    private String date;
}
