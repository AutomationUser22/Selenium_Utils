package util;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.IOException;

public class PDFUtils {
    public String extractTextFromPDF(String filePath) throws IOException {
        try (PDDocument document = Loader.loadPDF(new RandomAccessReadBufferedFile(filePath))){
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(document);
        }
    }
}
