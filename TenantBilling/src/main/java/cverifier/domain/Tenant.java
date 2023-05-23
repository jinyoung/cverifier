package cverifier.domain;

import cverifier.TenantBillingApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Tenant_table")
@Data
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String planType;

    private Double rate;

    private Integer limit;

    @PrePersist
    public void onPrePersist() {}

    public static TenantRepository repository() {
        TenantRepository tenantRepository = TenantBillingApplication.applicationContext.getBean(
            TenantRepository.class
        );
        return tenantRepository;
    }
}
