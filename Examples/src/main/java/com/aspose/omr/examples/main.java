package com.aspose.omr.examples;

import com.aspose.omr.examples.GenerateOMRTemplate.GenerateOMRTemplate;
import com.aspose.omr.examples.GettingStarted.LoadLicenseFromFile;
import com.aspose.omr.examples.GettingStarted.LoadLicenseFromStream;
import com.aspose.omr.examples.PerformOMR.PerformOMROnImagesWithThresholdOpenCV;

public class main {
    public static void main(String[] args) throws Exception {

        // Carega a licença de uso do Aspose
        LoadLicenseFromFile.run();
        LoadLicenseFromStream.run();

        // Template name é o nome do arquivo .omr que foi gerado a partir do txt
        String templateName = "MyGrid.omr";

        // Nome dos arquivos de imagens dos cartões-respostas que irão ser corrigidos
        String[] userImages = new String[] { "imagensParaTestes/MyGrid-boa-2.jpg" };

        // Nome dos arquivos de imagens dos cartões-respostas que irão ser corrigidos sem a extensão (.jpg, .jpeg)
        String[] userImagesNoExt = new String[] { "MyGrid-boa-2" };

        // Método para gerar o cartão resposta e arquivos correspondentes
        // GenerateOMRTemplate.run();

        // Método para corrigir catão-resposta
        PerformOMROnImagesWithThresholdOpenCV.run(templateName, userImages, userImagesNoExt, true);

    }
}
