package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
            //Given
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                            .bun("Sesame")
                            .sauce("Barbecue")
                            .burgers(3)
                            .ingredient("Lettuce")
                            .ingredient("Onion")
                            .ingredient("Cheese")
                            .ingredient("Bacon")
                            .build();
            System.out.println(bigmac);
            //When
            int howManyIngredients = bigmac.getIngredients().size();
            int howManyBurgers = bigmac.getBurgers();
            //Then
            Assert.assertEquals(4, howManyIngredients);
            Assert.assertEquals(3, howManyBurgers);
    }
}
