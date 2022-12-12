package com.ff.jinsu.finance.adapter.out.persistence;

import com.ff.jinsu.finance.application.port.out.StoreStockPort;
import com.ff.jinsu.finance.domain.Chart;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
class StockPersistenceAdapter implements StoreStockPort {

    private final StockRepository stockRepository;
    private final CompanyRepository companyRepository;

    private final StockMapper stockMapper;


    @Override
    public void storeStock(Chart.Stock stock) {
        CompanyEntity company = companyRepository.findBySymbol(stock.getSymbol());
        List<StockEntity> stockEntities = stockMapper.mapToJpaEntity(stock, company);
        for (StockEntity stockEntity : stockEntities) {
            stockRepository.save(stockEntity);
        }
    }
}
