package org.iqmsoft.boot.angular2.bus.bookings.services;

import org.iqmsoft.boot.angular2.bus.bookings.dao.PriceTableRepository;
import org.iqmsoft.boot.angular2.bus.bookings.domain.PriceTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PriceTableServiceImpl implements PriceTableService {
    @Autowired
    private PriceTableRepository priceTableRepository;

    @Override
    public PriceTable updatePriceTable(PriceTable priceTable) {
        priceTableRepository.deleteAll();
        priceTable.setId(null);
        return priceTableRepository.save(priceTable);
    }

    @Override
    public PriceTable getPriceTable() {
        List<PriceTable> tables = priceTableRepository.findAll();
        return tables.size() > 0 ? tables.get(0) : null;
    }
}
