package jonst;

import jonst.Models.LegalTender;
import org.junit.Test;

import static org.junit.Assert.*;

public class LegalTenderTest {


    @Test
    public void LegalTenderGetValueTest() {

        String value = LegalTender.FIVEHUNDRED.getValue();

        assertEquals("500", value);


    }
}
