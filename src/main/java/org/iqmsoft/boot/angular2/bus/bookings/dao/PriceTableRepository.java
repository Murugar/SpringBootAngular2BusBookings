package org.iqmsoft.boot.angular2.bus.bookings.dao;

import org.iqmsoft.boot.angular2.bus.bookings.domain.PriceTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceTableRepository extends JpaRepository<PriceTable, Long> {

}
