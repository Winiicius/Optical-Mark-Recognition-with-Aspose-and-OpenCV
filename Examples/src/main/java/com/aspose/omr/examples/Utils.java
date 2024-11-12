package com.aspose.omr.examples;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.io.File;

public class Utils {

    public static String combine(String path1, String path2)
    {
        File file1 = new File(path1);
        File file2 = new File(file1, path2);
        return file2.getPath();
    }

    public static File getDirectory(){
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "Aspose.OMR-for-Java");
        dir = new File(dir, "Examples");
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        return dir;
    }

    public static String getSourceDirectory()
    {
        File dir = getDirectory();

        String srcDir = dir.toString() + File.separator + "01_SourceDirectory"+ File.separator;

        return srcDir;
    }

    public static String getOutputDirectory()
    {
        File dir = getDirectory();

        String outDir = dir.toString()+ File.separator + "02_OutputDirectory"+ File.separator;

        return outDir;
    }

    public static void scanImage(String imagePath) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Carregar a imagem original
        Mat imagemOriginal = Imgcodecs.imread(imagePath);

        // Converter para escala de cinza
        Mat imagemCinza = new Mat();
        Imgproc.cvtColor(imagemOriginal, imagemCinza, Imgproc.COLOR_BGR2GRAY);

        // Aplicar desfoque gaussiano para suavizar a imagem
        Imgproc.GaussianBlur(imagemCinza, imagemCinza, new Size(5, 5), 0);

        // Aplicar o thresholding adaptativo para melhorar o contraste
        Mat imagemEscaneada = new Mat();
        Imgproc.adaptiveThreshold(
            imagemCinza, 
            imagemEscaneada, 
            255, 
            Imgproc.ADAPTIVE_THRESH_GAUSSIAN_C, 
            Imgproc.THRESH_BINARY, 
            11, 
            2
        );

        String outputDirectory = Utils.combine(Utils.getOutputDirectory(), "imagensEscaneadas/img.jpg");
        // Salvar a imagem resultante
        Imgcodecs.imwrite(outputDirectory, imagemEscaneada);

        System.out.println("Efeito de scan aplicado com sucesso!");
    }


}
