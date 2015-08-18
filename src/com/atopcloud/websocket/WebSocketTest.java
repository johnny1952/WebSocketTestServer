package com.atopcloud.websocket;

import java.io.IOException;
 
import java.nio.ByteBuffer;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
 
@ServerEndpoint("/websocket")
public class WebSocketTest {
	String  mystring="This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!This is a binary message!end!";
  @OnMessage
  public void onMessage(String message, Session session)
    throws IOException, InterruptedException {
   
    // Print the client message for testing purposes
    System.out.println("Received: " + message);
   
    /*
    // Send the first message to the client
    session.getBasicRemote().sendText("This is the first server message");
   
    // Send 3 messages to the client every 5 seconds
    int sentMessages = 0;
    while(sentMessages < 3){
      Thread.sleep(5000);
      session.getBasicRemote().
        sendText("This is an intermediate server message. Count: "
          + sentMessages);
      sentMessages++;
    }
   
    // Send a final message to the client
    session.getBasicRemote().sendText("This is the last server message");
    */
    //每隔3秒发送一条消息给客户端
    int sentMessages = 0;
    if(message.equals("hello"))
    {
    	while(true)
    	{
//    		sentMessages++;
//	        session.getBasicRemote().sendText("session:" + session.getId() + " return msg["
//	          + sentMessages + "]");
	        
	        session.getBasicRemote().sendBinary(ByteBuffer.wrap(mystring.getBytes()));
	        
	        Thread.sleep(3000);
    	}
    }
  }
   
  @OnOpen
  public void onOpen() {
    System.out.println("Client connected");
  }
 
  @OnClose
  public void onClose() {
    System.out.println("Connection closed");
  }
}