package com.aspose.omr.examples.Scan;

import static com.aspose.omr.examples.Utils.getOutputDirectory;
import static com.aspose.omr.examples.Utils.getSourceDirectory;

import org.opencv.core.Core;

import com.aspose.omr.examples.Utils;

public class PerformImageScan {
    
    public static void main(String[] args) {
        // System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        // System.out.println("Load success");
        Utils.scanImage(Utils.combine(getSourceDirectory(), "MyGrid/MyGrid-boa.jpg"));

    }
}
