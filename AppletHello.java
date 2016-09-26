
 // NORMAL JAVA PROGRAM TO PRINT HELLO WORLD
 // Applet Program
 
 import java.applet.*;
import java.awt.Graphics;

public class AppletHello extends Applet {

   public void init() {
     /**
      * init work
      */
   }

   public void paint( Graphics g ) {
	   g.drawString("Hello World - Applet",40,100);
   }
}
 
 
