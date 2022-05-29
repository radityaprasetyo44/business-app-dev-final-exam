/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class NO_3 {
    public static void main(String[] args) throws ParseException {
        String dateString = String.format("30/3/2020"); // input tanggal pada soal
        Date date = new SimpleDateFormat("dd/M/yyyy").parse(dateString);

        String day = new SimpleDateFormat("EEEE", new java.util.Locale("id")).format(date);
        String month = new SimpleDateFormat("MMMM", new java.util.Locale("id")).format(date);
        String[] tanggal = dateString.split("/");
        
        System.out.println(day + ", " + tanggal[0] + " " + month + " " + tanggal[2]); // hasil
    }
}
