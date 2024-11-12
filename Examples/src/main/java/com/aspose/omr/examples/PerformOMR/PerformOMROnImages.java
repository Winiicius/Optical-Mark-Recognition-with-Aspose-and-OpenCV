package com.aspose.omr.examples.PerformOMR;

import com.aspose.omr.OmrEngine;
import com.aspose.omr.RecognitionResult;
import com.aspose.omr.TemplateProcessor;
import com.aspose.omr.examples.Utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.opencv.core.Core;

public class PerformOMROnImages {
    public static void run() throws FileNotFoundException {
        // ExStart:1
        String TemplateName = "MyGrid.omr";
        String[] UserImages = new String[] { "MyGrid/MyGrid-boa.jpg" };
        String[] UserImagesNoExt = new String[] { "MyGrid-boa" };

        String sourceDirectory = Utils.getSourceDirectory();
        String outputDirectory = Utils.combine(Utils.getOutputDirectory(), "Result");
        String templatePath = Utils.combine(Utils.getSourceDirectory(), TemplateName);

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println("Load success");

        // initialize engine and get template processor providing path to the .omr file
        // OmrEngine engine = new OmrEngine();
        // TemplateProcessor templateProcessor = engine.getTemplateProcessor(templatePath);
        System.out.println("Template loaded.");

        // images loop
        // for (int i = 0; i < UserImages.length; i++) {
            // path to the image to be recognized
        //     String imagePath = Utils.combine(sourceDirectory, UserImages[i]);
        //     System.out.println("Processing image: " + imagePath);

        //     // recognize image and receive result
        //     RecognitionResult result = templateProcessor.recognizeImage(imagePath);

        //     // export results as csv string
        //     String csvResult = result.getCsv();

        //     String json = result.getJson();
        //     System.out.println(json);

        //     // save csv to the output folder
        //     PrintWriter wr = new PrintWriter(new FileOutputStream(Utils.combine(outputDirectory, UserImagesNoExt[i] + ".csv")), true);
        //     wr.println(csvResult);
        // }
        // ExEnd:1
        // System.out.println("PerformOMROnImages executed successfully.\n\r");
    }
}
