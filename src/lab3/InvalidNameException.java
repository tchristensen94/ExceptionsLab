package lab3;

class InvalidNameException extends IllegalArgumentException {
      public InvalidNameException() {}

      public InvalidNameException(String message)
      {
         super(message);
      }
 }