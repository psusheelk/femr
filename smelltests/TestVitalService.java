package smelltests;
import com.google.inject.Inject;
import femr.business.services.core.IVitalService;
import femr.common.dtos.ServiceResponse;
import femr.common.models.VitalItem;
import org.junit.Rule;
import org.junit.Test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by susheelon 11/15/16.
 *  * This will unit test the functionality that was Moved from  Schizophrenic class

 */
public class TestVitalService extends CoreClass{
     private IVitalService service  ;

    @Rule
    public TestCaseWriteRule pr = new TestCaseWriteRule(System.out);


    @Inject
    public void setService(IVitalService service) {
          this.service = service;
    }


    @Test
    public void Test_createPatientEncounterVitalItems() throws Exception {

        Map<String, Float> newVitals = new HashMap<>();
             newVitals.put("respiratoryRate", new Float(94));
             newVitals.put("heartRate",  new Float(86));
             newVitals.put("temperature", new Float(132));
             newVitals.put("oxygenSaturation", new Float(88));
             newVitals.put("heightFeet", new Float(70));
             newVitals.put("heightInches",  new Float(162));
             newVitals.put("bloodPressureDiastolic", new Float(109));
			 newVitals.put("weight", new Float(178));
             newVitals.put("bloodPressureSystolic", new Float(122));
             newVitals.put("glucose", new Float(140));
             
        ServiceResponse<List<VitalItem>> responseObject = service.createPatientEncounterVitalItems(newVitals,5,10302);
		boolean excepThrown = false;
        try {
            List<VitalItem> vitalItemsList = responseObject.getResponseObject();
        }
        catch (Exception e ){
			excepThrown = true;
        } 
		assertTrue(excepThrown);

    }
}

