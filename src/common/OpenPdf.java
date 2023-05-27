/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;
import dao.MMAUtils;

/**
 *
 * @author dell
 */
public class OpenPdf {
    public static void openById(String id){
        try{
        if((new File(MMAUtils.billPath+id+".pdf")).exists()){
            Process p = Runtime
                    .getRuntime()
                    .exec("rundll32 url.dll,FileProtocolHandler " + MMAUtils.billPath + id + ".pdf");

        }
        else{
            JOptionPane.showMessageDialog(null, "file is not ");
        }
        }
        catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
            }
    }
    
}
