package com.instructure.aspose_poc;

import com.aspose.words.Document;
/**
 * Created by jgorr on 1/13/17.
 */

public class App {
    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();

        // Load the document from disk.
        Document doc = new Document(args[0]);

        // Save the document in PDF format.
        String outputPath = args[0] + ".pdf";
        doc.save(outputPath);

        long endTime = System.nanoTime();

        System.out.println("\nDocument converted to PDF successfully " + (endTime - startTime));
    }
}
