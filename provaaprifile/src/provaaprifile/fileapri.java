/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaaprifile;
import java.awt.*;
import java.net.URL;
import java.io.*;
/*
 *
 * @author PLiuzzo
 */
public class fileapri {

    public void fileapriw() throws IOException{
        
      File f=new File("C:\\Documents and Settings\\PLiuzzo\\Desktop\\colori java.pdf");
      Desktop d=null;
        if (Desktop.isDesktopSupported()) {
        d = Desktop.getDesktop();
      }
      d.open(f);
   
       
    
        
    }
   
    
    
    
}
