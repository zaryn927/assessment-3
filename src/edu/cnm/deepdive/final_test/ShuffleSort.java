/**
 * 
 */
package edu.cnm.deepdive.final_test;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Sky Link
 *
 */
public class ShuffleSort {
  /**
   * @param args
   */
  public static void main(String[] args) {

    // Read
    InputFileReader fileReader = new InputFileReader("test-input.dat");
    Double[][] data = fileReader.data;

    // Shuffle
    for (Double[] dataArray : data) {
      Collections.shuffle(Arrays.asList(dataArray));
    }

    // Sort
    Arrays.asList(data).sort((arr1, arr2) -> {
      if ((Collections.min(Arrays.asList(arr1)) < (Collections.min(Arrays.asList(arr2))))) {
        return -1;
      } else if ((Collections.min(Arrays.asList(arr1)) > (Collections.min(Arrays.asList(arr2))))) {
        return 1;
      } else {
        return 0;
      }
    });

    // Write
    OutputFileWriter fileWriter = new OutputFileWriter(data, "test-output.dat");

  }

}
