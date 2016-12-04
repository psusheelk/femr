package smelltests;

import femr.common.models.PatientItem;
import femr.util.calculations.LocaleUnitConverter;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** 
* This test is intended to test the functionality moved to this class as part of the schizophrenic 
* 
* @author Susheel
* @since <pre>Nov 15, 2016</pre> 
* @version 1.0 
*/ 
public class TestSearchServiceLocaleUnitConverter  {

    @Rule
    public TestCaseWriteRule pr = new TestCaseWriteRule(System.out);

    /**
* 
* Method: toMetric(PatientItem patient) 
* 
*/

@Test
public void Test_ToMetric() throws Exception {
    PatientItem pi = new PatientItem();

    pi.setHeightFeet(5);
    pi.setHeightInches(2);

    LocaleUnitConverter s = new LocaleUnitConverter();
    PatientItem pi2 = s.toMetric(pi);
      assertEquals(new Integer(57), pi2.getHeightInches() );
    assertEquals(new Integer(1), pi2.getHeightFeet() );
}

/**
 *
 * Method: forDualUnitDisplay(PatientItem patient)
 *
 */
@Test
public void Test_ForDualUnitDisplay() throws Exception {
        PatientItem pi = new PatientItem();

        pi.setHeightFeet(5);
        pi.setHeightInches(2);

        LocaleUnitConverter s = new LocaleUnitConverter();
        PatientItem pi2 = s.toMetric(pi);
        assertEquals(new Integer(5), pi2.getHeightFeetDual() );
        assertEquals(new Integer(2), pi2.getHeightInchesDual() );
    }


}
