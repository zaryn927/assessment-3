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
    InputFileReader fileReader = new InputFileReader("data/test-input.dat");
    Double[][] data = fileReader.data;
//    for (int i = 0; i < fileReader.data.length; i++) { 
//    System.out.println(Arrays.toString(fileReader.data[i]));
//    }
    
    for(Double[] dataArray : data) {
      Collections.sort(Arrays.asList(dataArray));
    }
    Arrays.asList(data).sort((arr1, arr2) ->
      {
        if( (Collections.min(Arrays.asList(arr1)) < (Collections.min(Arrays.asList(arr2))))){
          return -1;
        }else if ((Collections.min(Arrays.asList(arr1)) > (Collections.min(Arrays.asList(arr2))))){
          return 1;
        }else {
          return 0;
        }
      }
    );
    
    System.out.println(Arrays.toString(data[0]));
    System.out.println(Arrays.toString(data[1]));
    System.out.println(Arrays.toString(data[498]));
    System.out.println(Arrays.toString(data[499]));
    System.out.println(Arrays.toString(data[499]));
    System.out.println(Arrays.toString(data[499]));
    System.out.println(Arrays.toString(data[499]));
    System.out.println(Arrays.toString(data[499]));
    System.out.println(Arrays.toString(data[499]));
  }

}
