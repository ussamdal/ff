package com.ff.jinsu.finance.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface StockRepository extends JpaRepository<StockEntity, Long> {
}
