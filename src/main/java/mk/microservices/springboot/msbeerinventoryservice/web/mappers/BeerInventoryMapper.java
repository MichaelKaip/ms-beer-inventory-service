package mk.microservices.springboot.msbeerinventoryservice.web.mappers;

import mk.microservices.springboot.msbeerinventoryservice.domain.BeerInventory;
import mk.microservices.springboot.msbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
