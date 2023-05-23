package cverifier.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class SetBillingPlanCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String tenantId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String planType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Double rate;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer limit;
}
