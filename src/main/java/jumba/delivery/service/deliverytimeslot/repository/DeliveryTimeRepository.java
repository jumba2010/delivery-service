package jumba.delivery.service.deliverytimeslot.repository;

import jumba.delivery.service.deliverytimeslot.domain.DeliveryTimeEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.util.UUID;

public interface DeliveryTimeRepository extends ReactiveCrudRepository<DeliveryTimeEntity
, UUID>{
    Flux<DeliveryTimeEntity> findByMarketId(UUID marketId, Pageable pageable);
}
