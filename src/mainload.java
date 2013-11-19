
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yajnavalkya
 */
public class mainload {
    private static void sleepThread() {
        try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException ex)
            {
                // Do something, if there is a exception
                System.out.println(ex.toString());
            } 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        sleepThread(); 
        
         java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    new login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(mainload.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
