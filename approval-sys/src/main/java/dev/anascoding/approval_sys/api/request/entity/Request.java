package dev.anascoding.approval_sys.api.request.entity;

import dev.anascoding.approval_sys.common.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "requests")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Request extends BaseEntity
{

    @Id
    @GeneratedValue(generator = "request_ids")
    @SequenceGenerator(name = "request_ids",
                       initialValue = 100,
                       allocationSize = 1,
                       sequenceName = "request_ids")
    private Long id;

    private String description;
    private String title;


    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    @Enumerated(EnumType.STRING)
    private RequestType requestType;
    private Long empId;
}
