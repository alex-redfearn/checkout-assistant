package org.redkat.darts.type;

public enum Treble {

  T20(60),
  T19(57),
  T18(54),
  T17(51),
  T16(48),
  T15(45),
  T14(42),
  T13(39),
  T12(36),
  T11(33),
  T10(30),
  T9(27),
  T8(24),
  T7(21),
  T6(18),
  T5(15),
  T4(12),
  T3(9),
  T2(6),
  T1(3);


  private final int score;
  Treble(int score) {
    this.score = score;
  }

  public int getScore() {
    return score;
  }
}
