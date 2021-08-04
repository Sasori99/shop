package zuul.auth.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestExeption extends RuntimeException{
    public BadRequestExeption(String message) {
        super(message);
    }

    public BadRequestExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
