package dgrubjesic.tri_party.assets.out.adapter;

import dgrubjesic.tri_party.assets.entities.assets.AssetEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface AssetRepo extends ReactiveCrudRepository<AssetEntity, UUID> {
}
