package mk.microservices.springboot.msbeerinventoryservice.web.mappers;

import javax.annotation.processing.Generated;
import mk.microservices.springboot.msbeerinventoryservice.domain.BeerInventory;
import mk.microservices.springboot.msbeerinventoryservice.domain.BeerInventory.BeerInventoryBuilder;
import mk.microservices.springboot.msbeerinventoryservice.web.model.BeerInventoryDto;
import mk.microservices.springboot.msbeerinventoryservice.web.model.BeerInventoryDto.BeerInventoryDtoBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-08-25T12:44:04+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (Oracle Corporation)"
)
@Component
public class BeerInventoryMapperImpl implements BeerInventoryMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto) {
        if ( beerInventoryDto == null ) {
            return null;
        }

        BeerInventoryBuilder beerInventory = BeerInventory.builder();

        beerInventory.id( beerInventoryDto.getId() );
        beerInventory.createdDate( dateMapper.asTimestamp( beerInventoryDto.getCreatedDate() ) );
        beerInventory.lastModifiedDate( dateMapper.asTimestamp( beerInventoryDto.getLastModifiedDate() ) );
        beerInventory.beerId( beerInventoryDto.getBeerId() );
        beerInventory.quantityOnHand( beerInventoryDto.getQuantityOnHand() );

        return beerInventory.build();
    }

    @Override
    public BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory) {
        if ( beerInventory == null ) {
            return null;
        }

        BeerInventoryDtoBuilder beerInventoryDto = BeerInventoryDto.builder();

        beerInventoryDto.id( beerInventory.getId() );
        beerInventoryDto.createdDate( dateMapper.asOffsetDateTime( beerInventory.getCreatedDate() ) );
        beerInventoryDto.lastModifiedDate( dateMapper.asOffsetDateTime( beerInventory.getLastModifiedDate() ) );
        beerInventoryDto.beerId( beerInventory.getBeerId() );
        beerInventoryDto.quantityOnHand( beerInventory.getQuantityOnHand() );

        return beerInventoryDto.build();
    }
}
