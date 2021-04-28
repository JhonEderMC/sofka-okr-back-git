package co.com.sofka.okrs.repositoryPlanification;

import co.com.sofka.okrs.domainPlanification.Okr;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOkr extends ReactiveMongoRepository<Okr, String> {

}
