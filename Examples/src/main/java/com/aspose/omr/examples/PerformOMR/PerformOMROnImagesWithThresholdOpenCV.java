package com.aspose.omr.examples.PerformOMR;

import com.aspose.omr.OmrEngine;
import com.aspose.omr.RecognitionResult;
import com.aspose.omr.TemplateProcessor;
import com.aspose.omr.examples.Utils;
import com.aspose.omr.examples.ImagePreProcessing.AplicarThreshold;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PerformOMROnImagesWithThresholdOpenCV {

    public static void run(String templateName, String[] userImages, String[] userImagesNoExt, boolean threshold) throws FileNotFoundException {

        String sourceDirectory = Utils.getSourceDirectory();
        String outputDirectory = Utils.getOutputDirectory();
        String templatePath = Utils.combine(Utils.getSourceDirectory(), templateName);

        // initialize engine and get template processor providing path to the .omr file
        OmrEngine engine = new OmrEngine();
        TemplateProcessor templateProcessor = engine.getTemplateProcessor(templatePath);
        System.out.println("Template loaded.");
        
        // images loop
        for (int i = 0; i < userImages.length; i++) {
            
            String imagePath = "";
            // Se de prefrência, Aplica Threshold(+/- um scanner) na imagem
            if(threshold == true){
                AplicarThreshold.aplicarThreshold(userImages[i], userImagesNoExt[i]);
                imagePath = Utils.combine(outputDirectory + "/imagensEscaneadas", userImagesNoExt[i] + ".jpg");
            }
            else { imagePath = Utils.combine(sourceDirectory , userImages[i]); }

            // path to the image to be recognized
            System.out.println("Processing image: " + imagePath);

            // recognize image and receive result
            RecognitionResult result = templateProcessor.recognizeImage(imagePath);

            // export results as csv string
            String csvResult = result.getCsv();
            System.out.printf("Resultado em CSV: \n%s\n",csvResult);

            String jsonResult = result.getJson();
            System.out.printf("Resultado em JSON:\n%s\n", jsonResult);

            String resultFolder = outputDirectory + "/result";

            // save csv to the output folder
            PrintWriter wr = new PrintWriter(new FileOutputStream(Utils.combine(resultFolder, userImagesNoExt[i] + ".csv")), true);
            wr.println(csvResult);

            wr = new PrintWriter(new FileOutputStream(Utils.combine(resultFolder, userImagesNoExt[i] + ".json")), true);
            wr.println(jsonResult);
            
        }

        // ExEnd:1
        System.out.println("PerformOMROnImages executed successfully.\n\r");
    }
}
