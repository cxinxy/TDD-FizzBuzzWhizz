package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {

  private List<String> results = new ArrayList<>();

  public void start(int count) {
    for (int i = 1; i <= count; i++) {
      String result = play(i);
      results.add(result);
    }
  }

  public List<String> getResults() {
    return results;
  }

  public String play(int num) {
    String numStr = "" + num;

    if (numStr.contains("3")) {
      numStr = "Fizz";
    } else {
      if (num % 3 == 0) {
        numStr = "Fizz";
        if (num % 5 == 0) {
          numStr += "Buzz";
          if (num % 7 == 0) {
            numStr += "Whizz";
          }
        } else if (num % 7 == 0) {
          numStr += "Whizz";
        }
      } else if (num % 5 == 0) {
        numStr = "Buzz";
        if (num % 7 == 0) {
          numStr += "Whizz";
        }
      } else if (num % 7 == 0) {
        numStr = "Whizz";
      }
    }
    return numStr;
  }
}


