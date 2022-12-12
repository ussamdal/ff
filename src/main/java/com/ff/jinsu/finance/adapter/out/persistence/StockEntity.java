package com.ff.jinsu.finance.adapter.out.persistence;

import com.ff.jinsu.common.domain.entity.AuditingEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "stock")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
class StockEntity extends AuditingEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String timestamp;

    private Double highPrice;

    private Double lowPrice;

    private Double openPrice;

    private Double closePrice;

    private Integer volume;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    @ToString.Exclude
    private CompanyEntity company;
}
