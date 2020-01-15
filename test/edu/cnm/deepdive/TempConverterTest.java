package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConverterTest {

  static final double[] INPUT = {-40, 0, 100};
  static final double[] EXPECTED = {-40,32,212};

  @Test
  void convertC2F() {
    for(int i = 0; i < INPUT.length; i++){
      double input = INPUT[i];
      double expected = EXPECTED[i];
      assertEquals( expected,TempConverter.convertC2F(input));

    }
  }
}