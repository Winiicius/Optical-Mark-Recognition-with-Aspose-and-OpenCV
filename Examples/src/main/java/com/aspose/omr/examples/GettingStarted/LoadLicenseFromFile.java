package com.aspose.omr.examples.GettingStarted;

import com.aspose.omr.License;

public class LoadLicenseFromFile {
    public static void run() throws Exception {
        // ExStart:1
        // Initialize license object
        License omrLicense = new License();
        // Set license
        // Pass valid license path
        omrLicense.setLicense("Aspose.OMR-for-Java\\Examples\\src\\main\\java\\com\\aspose\\omr\\examples\\GettingStarted\\Aspose.OMRforJava.lic");
        // ExEnd:1
        System.out.println("LoadLicenseFromFile executed successfully.\n\r");
    }
}
