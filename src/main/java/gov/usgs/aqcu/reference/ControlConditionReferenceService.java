package gov.usgs.aqcu.reference;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gov.usgs.aqcu.config.AquariusReferenceListProperties;

import gov.usgs.aqcu.util.LogExecutionTime;

@Repository
public class ControlConditionReferenceService {
	private AquariusReferenceListProperties aquariusReferenceListProperties;

	@Autowired
	public ControlConditionReferenceService(AquariusReferenceListProperties aquariusReferenceListProperties) {
		this.aquariusReferenceListProperties = aquariusReferenceListProperties;
	}

        @LogExecutionTime
	public List<String> get() {
		//TODO: Persist this list somewhere else?
		return aquariusReferenceListProperties.getControlConditions();
	}
}