package com.github.pedroluiznogueira.springdockerpipeline.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PriceService {

    public Integer sumProductsPrices(List<Integer> prices) {
        Integer sum = 0;

        for (Integer price: prices) {
            sum += price;
        }

        return sum;
    }
}
