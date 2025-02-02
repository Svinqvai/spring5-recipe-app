package guru.springframework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
     public NotFoundException(){
        super();
    }
    public NotFoundException(String msg){
         super(msg);
    }

    public NotFoundException(String msg, Throwable t){
         super(msg,t);
    }
}
