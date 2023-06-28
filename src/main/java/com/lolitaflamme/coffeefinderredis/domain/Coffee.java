package com.lolitaflamme.coffeefinderredis.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.math.BigDecimal;

@RedisHash
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coffee {
    @Id
    private String id;
    private String title;
    private Beans beans;
    private String aroma;
    private Roast roast;
    private BigDecimal price;
    @JsonProperty("caffeine_content")
    private double caffeineContent;
}
