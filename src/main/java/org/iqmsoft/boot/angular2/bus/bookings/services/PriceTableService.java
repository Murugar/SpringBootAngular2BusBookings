package org.iqmsoft.boot.angular2.bus.bookings.services;

import org.iqmsoft.boot.angular2.bus.bookings.domain.PriceTable;

public interface PriceTableService {
    PriceTable updatePriceTable(PriceTable priceTable);
    PriceTable getPriceTable();
}
