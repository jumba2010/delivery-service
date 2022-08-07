package jumba.delivery.service.generic.service;

import jumba.delivery.service.generic.dao.AbstractBaseRepository;
import jumba.delivery.service.generic.entity.LifeCyCleState;
import jumba.delivery.service.generic.entity.LifeCycleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.UUID;

@Service
@Transactional
public class AbstractQueryServiceImpl<T extends LifeCycleEntity<T>, ID extends UUID>
		implements AbstractQueryService<T, ID> {
	
	@Autowired
	private AbstractBaseRepository<T, ID> repository;
	
	@Override
	public Mono<T> findById(ID id) {
		
		return repository.findById(id);
	}

	@Override
	public Flux<T> findAll() {
		return repository.findAll();
	}

	@Override
	public Flux<T> findByActiveAndState(LifeCyCleState lifeCyCleState) {
	
		return repository.findByActiveAndState(lifeCyCleState.isActive(),lifeCyCleState.getState());
	}

}
