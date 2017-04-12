package org.iqmsoft.boot.angular2.bus.bookings.dao;

import org.iqmsoft.boot.angular2.bus.bookings.domain.Connection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection, Long> {
}
