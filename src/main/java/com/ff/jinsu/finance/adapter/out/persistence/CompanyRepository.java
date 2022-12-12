package com.ff.jinsu.finance.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
    CompanyEntity findBySymbol(String symbol);
}
