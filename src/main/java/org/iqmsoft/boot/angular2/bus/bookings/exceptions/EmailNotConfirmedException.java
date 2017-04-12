package org.iqmsoft.boot.angular2.bus.bookings.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "user_email_not_confirmed")
public class EmailNotConfirmedException extends RuntimeException {
}
