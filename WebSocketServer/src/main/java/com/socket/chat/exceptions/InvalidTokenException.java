package com.socket.chat.exceptions;

public class InvalidTokenException extends  RuntimeException{

   public InvalidTokenException(String invalidToken) {
      super(invalidToken);
   }
}
