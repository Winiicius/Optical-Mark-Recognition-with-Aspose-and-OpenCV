# Para usar

  - É necessário ter uma licença de uso, que é obtida através do site da aspose
  - É necessário instalar o OpenCv em sua máquina para rodar o código

# Minhas alterações

Somente o código básico do aspose não estava dando conta, dificilmente ele lê uma imagem sem estar com threshold aplicado(filtro para melhor identificação das marcações), e as vezes mesmo com o threshold aplicado dava errado, então usei o OpenCV para aplicar um threshold personalizado na imagem, assim melhorou os resultados. Ainda é preciso algumas restrições para consiguir um resultado preciso, mas, tá funcionando!

# Java API to Perform OMR

[Aspose.OMR for Java](https://products.aspose.com/omr/java) is a Java class library that provides API to recognize optical marks from OMR digitized sheet images. It can be used to recognize optical marks in a variety of image formats like BMP, JPG, TIF, TIFF, GIF. The API allows capturing human-marked data from document forms such as surveys, questionnaires, multiple-choice examination papers, and other tests. With this solution, it is possible to recognize scanned images and even photos with high accuracy. Recognition is based on a template markup which contains a graphical mapping of the elements to be recognized from the scanned images.

Directory | Description
--------- | -----------
[Examples](https://github.com/aspose-omr/Aspose.OMR-for-Java/tree/master/Examples) | A collection of Java examples that help you learn the product features.

<p align="center">
  <a title="Download Examples ZIP" href="https://github.com/aspose-omr/Aspose.omr-for-Java/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

## OMR API Features

- Recognition of scanned images and photos.
- Ability to process rotated and perspective (side viewed) images.
- Recognize data from tests, exams, questionnaires, surveys etc.
- High accuracy rate & ability to export the results in `CSV` and `JSON` file format.
- [Create OMR templates](https://docs.aspose.com/omr/java/create-omr-template/) from text markup.

## Save OMR Results As

CSV, JSON

## Read Images for OMR

JPEG, PNG, GIF, TIFF, BMP

## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, OpenSUSE, CentOS, and others
- **Java Versions:** `J2SE 7.0 (1.7)`, `J2SE 8.0 (1.8)` or above

## Get Started with Aspose.OMR for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://repository.aspose.com/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-omr). You can easily use Aspose.OMR for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.OMR for Java from Maven Repository](https://docs.aspose.com/omr/java/installation/) documentation page.

## Perform OMR operation on Images using Java

```java
// For complete examples and data files, please go to https://github.com/aspose-omr/Aspose.OMR-for-Java
String TemplateName = "Sheet.omr";
String[] UserImages = new String[] { "Sheet1.jpg", "Sheet2.jpg" };
String[] UserImagesNoExt = new String[] { "Sheet1", "Sheet2" };

String sourceDirectory = Utils.getSourceDirectory();
String outputDirectory = Utils.combine(Utils.getOutputDirectory(), "Result");
String templatePath = Utils.combine(Utils.getSourceDirectory(), TemplateName);

// initialize engine and get template processor providing path to the .omr file
OmrEngine engine = new OmrEngine();
TemplateProcessor templateProcessor = engine.getTemplateProcessor(templatePath);
System.out.println("Template loaded.");

// images loop
for (int i = 0; i < UserImages.length; i++) {
    // path to the image to be recognized
    String imagePath = Utils.combine(sourceDirectory, UserImages[i]);
    System.out.println("Processing image: " + imagePath);

    // recognize image and receive result
    RecognitionResult result = templateProcessor.recognizeImage(imagePath);

    // export results as csv string
    String csvResult = result.getCsv();

    String json = result.getJson();

    // save csv to the output folder
    PrintWriter wr = new PrintWriter(new FileOutputStream(Utils.combine(outputDirectory, UserImagesNoExt[i] + ".csv")), true);
    wr.println(csvResult);
}
```

[Home](https://www.aspose.com/) | [Product Page](https://products.aspose.com/omr/java) | [Docs](https://docs.aspose.com/omr/java/) | [Demos](https://products.aspose.app/omr/family) | [API Reference](https://apireference.aspose.com/omr/java) | [Examples](https://github.com/aspose-omr/Aspose.OMR-for-Java) | [Blog](https://blog.aspose.com/category/omr/) | [Search](https://search.aspose.com/) | [Free Support](https://forum.aspose.com/c/omr) | [Temporary License](https://purchase.aspose.com/temporary-license)
