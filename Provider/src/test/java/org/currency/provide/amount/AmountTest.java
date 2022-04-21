package org.currency.provide.amount;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AmountTest {

    @Test
    void AmountReturnsCorrectValue(){
        Amount a = new Amount();

        assertThat(  a.amount(200)).isEqualTo(200);
    }
}
