package org.redkat.darts.type;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Double {

  D20(40),
  D19(38),
  D18(36),
  D17(34),
  D16(32),
  D15(30),
  D14(28),
  D13(26),
  D12(24),
  D11(22),
  D10(20),
  D9(18),
  D8(16),
  D7(14),
  D6(12),
  D5(10),
  D4(8),
  D3(6),
  D2(3),
  D1(2);


  private final int score;

  Double(int score) {
    this.score = score;
  }


  public int getScore() {
    return this.score;
  }

  private static final Map<Integer, Double> SCORE_DOUBLE_MAP = Arrays
    .stream(Double.values())
    .collect(Collectors.toMap(Double::getScore, Function.identity()));

  public static Double valueOf(int score) {
    return SCORE_DOUBLE_MAP.get(score);
  }
}
