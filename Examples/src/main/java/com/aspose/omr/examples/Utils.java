package com.aspose.omr.examples;

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

    public static String getLicensePath(){
        return "Aspose.OMR-for-Java\\Examples\\src\\main\\java\\com\\aspose\\omr\\examples\\GettingStarted\\Aspose.OMRforJava.lic";
    }

}
