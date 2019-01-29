package gov.usgs.aqcu.reference;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gov.usgs.aqcu.config.AquariusReferenceListProperties;;


@Repository
public class ComputationReferenceService {
	private AquariusReferenceListProperties aquariusReferenceListProperties;

	@Autowired
	public ComputationReferenceService(AquariusReferenceListProperties aquariusReferenceListProperties) {
		this.aquariusReferenceListProperties = aquariusReferenceListProperties;
	}

	public List<String> get() {
		//TODO: Persist this list somewhere else?
		return aquariusReferenceListProperties.getComputations();
	}
}