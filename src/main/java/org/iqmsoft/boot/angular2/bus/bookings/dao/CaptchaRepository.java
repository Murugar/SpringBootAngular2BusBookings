package org.iqmsoft.boot.angular2.bus.bookings.dao;

import org.iqmsoft.boot.angular2.bus.bookings.domain.Captcha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaptchaRepository extends JpaRepository<Captcha, Long> {

}
