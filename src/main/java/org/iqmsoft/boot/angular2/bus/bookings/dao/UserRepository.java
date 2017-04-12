package org.iqmsoft.boot.angular2.bus.bookings.dao;

import org.iqmsoft.boot.angular2.bus.bookings.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByEmail(String email);
    User findOneByActivationHash(String activationHash);
}
