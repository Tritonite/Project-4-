import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Parameter extends JPanel
{

    
    JLabel label2 = new JLabel("Parameter"); 
    
    
    // checkboxes for datatypes 
    JCheckBox tair = new JCheckBox("TAIR"); 
    JCheckBox ta9m= new JCheckBox("TA9M"); 
    JCheckBox srad = new JCheckBox("SRAD"); 
    JCheckBox wspd = new JCheckBox("WSPD"); 
    JCheckBox pres = new JCheckBox("PRES"); 
    
    public Parameter()
    {
       super(); 
    
  setLayout(new GridLayout(6,0)); 
  setBackground(Color.LIGHT_GRAY);
    
  
  tair.setBackground(Color.LIGHT_GRAY);
  ta9m.setBackground(Color.LIGHT_GRAY);
  srad.setBackground(Color.LIGHT_GRAY);
  wspd.setBackground(Color.LIGHT_GRAY);
  pres.setBackground(Color.LIGHT_GRAY);
  
  label2.setVerticalAlignment(JLabel.TOP);
  tair.setVerticalAlignment(JCheckBox.TOP);
  ta9m.setVerticalAlignment(JCheckBox.TOP);
  srad.setVerticalAlignment(JCheckBox.TOP);
  wspd.setVerticalAlignment(JCheckBox.TOP);
  pres.setVerticalAlignment(JCheckBox.TOP);
 
  
  
        
    // Parameter title   
    add(label2); 
    
    // tair placement
   
    add(tair); 
    
   // ta9m placement
    add(ta9m); 
    // srad placement
  
    add(srad); 

    // wspd placement
   
    add(wspd);

    // pres placement 

    add(pres); 
    
    
   
    
    
    }
    
}
