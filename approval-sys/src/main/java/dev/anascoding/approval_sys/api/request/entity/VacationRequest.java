package dev.anascoding.approval_sys.api.request.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "vacations_requests")

public class VacationRequest
{
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY , optional = false)
    @MapsId
    @JoinColumn(name = "request_id")
    private Request request;

    @Future(message = "Start Date Must Be In Future")
    private LocalDate startDate;

    @Future(message = "End Date Must Be In Future")
    private LocalDate endDate;


}
