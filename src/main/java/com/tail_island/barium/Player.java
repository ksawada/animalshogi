package com.tail_island.barium;

import java.util.Random;

public class Player {
  public Move getMove(Message message) {
    return message.legalMoves[new Random().nextInt(message.legalMoves.length)];
  }
}

class Message {
  public State  state;
  public Move[] legalMoves;
  public Move   lastMove;
}

class State {
  public int     player;
  public Piece[] board;
  public Piece[] capturedPieces;
  public Piece[] enemyCapturedPieces;
}

class Piece {
  public int owner;
  public int type;
}

class Move {
  public Integer fromBoard;
  public Integer fromCaptured;
  public int     to;
}
