package dev.anascoding.approval_sys.api.request.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name = "it_requests")
public class ItRequest
{
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY , optional = false)
    @MapsId
    @JoinColumn(name = "request_id")
    private Request request;

    private Issue_Category issueCategory;

    // TODO -- make the employee optionally add an image of the problem
}
