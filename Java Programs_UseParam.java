    import java.applet.Applet;  
    import java.awt.*;
    import java.net.*;  
/*    
<applet code="UseParam.class" width="500" height="300">  
<param name="msg" value="Name:Arunava Dey   Roll No:11500117123   Year of Admission:2017   Department & Section: CSE A">  
</applet> 
*/
  
    public class UseParam extends Applet{ 
    public void init(){
      setBackground(Color.white); 
      setForeground(Color.green);
  
    } 
      
    public void paint(Graphics g){  
    
    //g.setColor(Color.red); 
    
    String cbase,dbase;
    String str=getParameter("msg");
    URL url=getCodeBase();
    cbase= "code base" + url.toString();
    url=getDocumentBase();
    dbase= "Document base" + url.toString();  
       g.drawString(str,10,10);
       g.drawString(cbase,10,20);
       g.drawString(dbase,10,30);
       

      
    }
    }  
