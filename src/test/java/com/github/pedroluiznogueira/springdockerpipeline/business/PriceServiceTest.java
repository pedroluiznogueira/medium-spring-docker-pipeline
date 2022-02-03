package com.github.pedroluiznogueira.springdockerpipeline.business;

import com.github.pedroluiznogueira.springdockerpipeline.service.PriceService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceServiceTest {

    @Test
    public void sumProductsPrices() {
        // arrange
        PriceService priceService = new PriceService();
        List<Integer> mockPrices = new ArrayList<>();
        mockPrices.add(1);
        mockPrices.add(2);
        mockPrices.add(3);
        Integer expectedResult = 6;
        Integer actualResult = 0;

        // act
        actualResult = priceService.sumProductsPrices(mockPrices);

        // assert
        assertEquals(expectedResult, actualResult);
    }
}
