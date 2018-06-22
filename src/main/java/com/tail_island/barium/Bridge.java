package com.tail_island.barium;

import java.net.URI;
import net.arnx.jsonic.JSON;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class Bridge extends WebSocketClient {
  private Player player = new Player();

  public Bridge(URI uri) {
    super(uri);
  }

  @Override
  public void onOpen(ServerHandshake serverHandshake) {
    System.out.println("Connected!");
  }

  @Override
  public void onClose(int code, String reason, boolean remote) {
    ;
  }

  @Override
  public void onMessage(String messageString) {
    send(JSON.encode(player.getMove(JSON.decode(messageString, Message.class))));
  }

  @Override
  public void onError(Exception ex) {
    ex.printStackTrace();
  }
}
