package com.example.homeworks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class GoodDto {
    @JsonProperty("price")
    private float price;
    @JsonProperty("info")
    private InfoDto infoDto;
}
