package org.redkat;

import java.io.IOException;
import java.io.InputStream;

import org.redkat.darts.CheckoutAssistant;
import org.redkat.io.Reader;

public class Main {
  public static void main(String[] args) {
    readScores(System.in);
  }

  private static void readScores(InputStream inputStream) {
    Reader reader = new Reader(inputStream);

    String line;
    try {
      while ((line = reader.readLine()) != null) {
        int score = Integer.parseInt(line);

        assistPlayer(score);
      }
    } catch (NumberFormatException | IOException e) {
      System.out.println(String.format("Invalid score", e.getMessage()));
    }
  }

  private static void assistPlayer(int score) {
    CheckoutAssistant assistant = new CheckoutAssistant(score);

    assistant.getCheckouts()
        .forEach(checkout -> System.out.println(checkout));
  }

}