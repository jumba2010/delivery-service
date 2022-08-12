package jumba.delivery.service.deliverytimeslot.repository;

import jumba.delivery.service.deliverytimeslot.domain.DeliveryTimeConfigEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;


import java.util.UUID;

public interface DeliveryTimeConfigRepository extends ReactiveCrudRepository<DeliveryTimeConfigEntity
, UUID>{

    Flux<DeliveryTimeConfigEntity> findByMarketId(UUID marketId, Pageable pageable);
}
