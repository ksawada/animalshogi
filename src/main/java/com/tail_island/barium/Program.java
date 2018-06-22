package com.tail_island.barium;

import java.net.URI;

public class Program {
  public static void main(String[] args) {
    try {
      new Bridge(new URI("ws://localhost:8080")).connect();

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
