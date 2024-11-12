package com.aspose.omr.examples.ImagePreProcessing;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import com.aspose.omr.examples.Utils;

public class AplicarThreshold {

    public static Mat aplicarThreshold(String imagePath, String imagePathNoExt) {

        // Carrega a biblioteca nativa do OpenCV
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Encontra a imagem
        Mat imagem = Imgcodecs.imread(Utils.combine(Utils.getSourceDirectory(), imagePath));
        
        // Converte a imagem para escala de cinza
        // Mat imagemCinza = new Mat();
        // Imgproc.cvtColor(imagem, imagemCinza, Imgproc.COLOR_BGR2GRAY);

        // Aplica o threshold para isolar áreas específicas
        Mat imagemThreshold = new Mat();
        Imgproc.threshold(imagem, imagemThreshold, 90, 255, Imgproc.THRESH_BINARY);
        

        // Salva a imagem de threshold para visualização
        Imgcodecs.imwrite(Utils.getOutputDirectory() + "imagensEscaneadas/" + imagePathNoExt + ".jpg", imagemThreshold);
        System.out.printf("Imagem %s Escaneada com sucesso\n", imagePathNoExt);

        return imagemThreshold;

    }
}
