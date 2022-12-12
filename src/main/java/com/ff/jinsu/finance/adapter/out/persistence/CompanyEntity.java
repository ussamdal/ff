package com.ff.jinsu.finance.adapter.out.persistence;

import com.ff.jinsu.common.domain.entity.AuditingEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COMPANY")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class CompanyEntity extends AuditingEntity {

    @Id
    @GeneratedValue
    @Column(name = "company_id")
    private Long id;

    private String companyName;

    @Column(unique = true)
    private String symbol;

    @OneToMany(mappedBy = "company")
    @ToString.Exclude
    private List<StockEntity> stock = new ArrayList<>();

}
