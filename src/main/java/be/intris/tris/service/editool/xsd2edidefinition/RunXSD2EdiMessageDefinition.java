package be.intris.tris.service.editool.xsd2edidefinition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import oracle.adf.share.logging.ADFLogger;

public class RunXSD2EdiMessageDefinition {
    
    private static final ADFLogger LOG = ADFLogger.createADFLogger(RunXSD2EdiMessageDefinition.class);
    
    public static void main(String[] args) {
        String propsFile = "resources/EdiMessageDefinition.properties";
        if(args.length > 0){
            propsFile = args[0];
        } else {
            System.out.println("Please enter a valid Property filename (with path if not in current directory");
            try (BufferedReader is = new BufferedReader(new InputStreamReader(System.in))) {
                propsFile = is.readLine();
            } catch (IOException e) {
                LOG.severe("<ERROR> main(): IOException! Stacktrace: ", e);
                //TODO: does this logger work for main methods?
//                e.printStackTrace();
            }
        }
        XmlSchema2EdiMessageDefinition xmlSchema2EdiMessageDefinition = new XmlSchema2EdiMessageDefinition(propsFile);
        xmlSchema2EdiMessageDefinition.run();
    }
}
