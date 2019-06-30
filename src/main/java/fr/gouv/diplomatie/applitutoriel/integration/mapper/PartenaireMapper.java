package fr.gouv.diplomatie.applitutoriel.integration.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import fr.gouv.diplomatie.applitutoriel.integration.entity.Partenaire;
import fr.gouv.diplomatie.applitutoriel.integration.repository.partenaire.PartenaireSummaryDto;

@Mapper(componentModel="spring")
public interface PartenaireMapper {
	
	PartenaireMapper INSTANCE = Mappers.getMapper( PartenaireMapper.class );
 
    PartenaireSummaryDto partenaireToSummary(Partenaire partenaire);

    List<PartenaireSummaryDto> partenairesToSummarys(List<Partenaire> partenaires);
 
}