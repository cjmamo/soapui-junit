package org.opensourcesoftwareandme;

import com.eviware.soapui.tools.SoapUIMockServiceRunner;
import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.junit.Test;

public class CalculatorServiceTestCase  {

    @Test
    public void testCalculatorService() throws Exception {
        SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
        SoapUIMockServiceRunner mockServiceRunner = new SoapUIMockServiceRunner();

        testCaseRunner.setProjectFile("src/test/resources/calculator-soapui-project.xml");
        mockServiceRunner.setProjectFile("src/test/resources/calculator-soapui-project.xml");
        mockServiceRunner.run();
        testCaseRunner.run();
    }
}
