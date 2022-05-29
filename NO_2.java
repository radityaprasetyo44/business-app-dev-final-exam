/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class NO_2 {
    public static void main(String[] args) {
        String[][] data = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8"}
        };
        
        int dataLength = data.length;
        int lastDataLength = data[dataLength - 1].length;
        System.out.println("Batas atas dari array data adalah " + (dataLength - 1));
        System.out.println("Nilai batas atas dari array data adalah " + Arrays.toString(data[dataLength - 1]));

        System.out.println("Batas atas dari isi batas atas array data adalah " + (lastDataLength - 1));
        System.out.println("Nilai batas atas dari isi batas atas array data adalah " + data[dataLength - 1][lastDataLength - 1]);
    }
}
