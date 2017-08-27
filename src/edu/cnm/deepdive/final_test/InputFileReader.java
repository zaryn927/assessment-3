/**
 * 
 */
package edu.cnm.deepdive.final_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * @author Sky Link
 *
 */
public class InputFileReader {
  Double[][] data;

  public InputFileReader(String file) {

    try (FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);

    ) {
      LinkedList<Double[]> work = new LinkedList<>();
      String line;
      while ((line = buffer.readLine()) != null) {
        if (line.trim().length() > 0) {
          String[] values = line.trim().split("\\s+");
          Double[] doubleValues = new Double[values.length];
          for (int i = 0; i < values.length; i++) {
            doubleValues[i] = Double.parseDouble(values[i]);
          }
          work.add(doubleValues);
        }
      }
      data = work.toArray(new Double[0][]);
    } catch (FileNotFoundException ex) {
      // TODO Auto-generated catch block
      ex.printStackTrace();
    } catch (IOException ex) {
      // TODO Auto-generated catch block
      ex.printStackTrace();
    }
  }
}
