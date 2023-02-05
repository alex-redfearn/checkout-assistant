package org.redkat.darts;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.redkat.darts.exception.BustException;
import org.redkat.darts.type.Double;
import org.redkat.darts.type.Treble;

public class CheckoutAssistant {

  private final int score;

  public CheckoutAssistant(int score) {
    this.score = score;
  }

  public List<String> getCheckouts() {
    List<String> checkouts = new ArrayList<>();

    for (Treble treble : Treble.values()) {

      try {
        int remaining = hitTreble(score, treble);

        getFinish(remaining)
            .ifPresent(finish -> checkouts.add(String.format("%s %s", treble.name(), finish.name())));
      } catch (BustException exception) {
        continue;
      }
    }

    return checkouts;
  }

  private int hitTreble(int score, Treble treble) throws BustException {
    int remaining = score - treble.getScore();

    if (remaining <= 1) {
      throw new BustException();
    }

    return remaining;
  }

  private Optional<Double> getFinish(int score) {
    return Optional.ofNullable(Double.valueOf(score));
  }
}
