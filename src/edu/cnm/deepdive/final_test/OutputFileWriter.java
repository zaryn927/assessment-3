/**
 * 
 */
package edu.cnm.deepdive.final_test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Sky Link
 *
 */
public class OutputFileWriter {
  public OutputFileWriter(Double[][] data, String filename) {
    try (OutputStream stream = new FileOutputStream(filename);
        OutputStreamWriter writer = new OutputStreamWriter(stream);
        PrintWriter printer = new PrintWriter(writer);) {
      float totalNumElements = 0.0f;
      float totalSum = 0.0f;
      for (Double[] dataArray : data) {
        int i = 1;
        for (Double number : dataArray) {
          totalNumElements += 1;
          totalSum += number;
          if (i++ == dataArray.length) {
            printer.printf("%.3f", number);
          } else {
            printer.printf("%.3f|", number);
          }
        }
        printer.println();
      }
      printer.print(totalSum / totalNumElements);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
