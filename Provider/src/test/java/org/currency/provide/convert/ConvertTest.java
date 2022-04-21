package org.currency.provide.convert;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConvertTest {

    @Test
    void convertMethodMultipliesCorrectly(){
     Convert convert = new Convert();

     assertThat(convert.convert(10,10)).isEqualTo(100);

    }
}
