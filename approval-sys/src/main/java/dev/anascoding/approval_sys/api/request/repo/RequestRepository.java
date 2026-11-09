package dev.anascoding.approval_sys.api.request.repo;

import dev.anascoding.approval_sys.api.request.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request,Long>
{
}
