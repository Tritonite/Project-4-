import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class creates the Parameter panel in the GUI.
 * 
 * @author Triston Luzanta
 * @version 2018-12-06
 */
public class Parameter extends JPanel

{

    // Label for the panel
    JLabel label2 = new JLabel("Parameter");

    // Checkboxes for datatypes
    JCheckBox tair = new JCheckBox("TAIR");
    JCheckBox ta9m = new JCheckBox("TA9M");
    JCheckBox srad = new JCheckBox("SRAD");
    JCheckBox wspd = new JCheckBox("WSPD");
    JCheckBox pres = new JCheckBox("PRES");

    public Parameter()
    {
        super();

        // Layout is in Gridlayout format
        setLayout(new GridLayout(6, 0));
        // Background color set to Light Gray
        setBackground(Color.LIGHT_GRAY);

        // Sets checkboxes backround to light gray to match the panel
        tair.setBackground(Color.LIGHT_GRAY);
        ta9m.setBackground(Color.LIGHT_GRAY);
        srad.setBackground(Color.LIGHT_GRAY);
        wspd.setBackground(Color.LIGHT_GRAY);
        pres.setBackground(Color.LIGHT_GRAY);

        // Sets the placement of the components centrally on the y axis. 
        label2.setVerticalAlignment(JLabel.TOP);
        tair.setVerticalAlignment(JCheckBox.TOP);
        ta9m.setVerticalAlignment(JCheckBox.TOP);
        srad.setVerticalAlignment(JCheckBox.TOP);
        wspd.setVerticalAlignment(JCheckBox.TOP);
        pres.setVerticalAlignment(JCheckBox.TOP);

        // Adding the components to the panel
        add(label2);
        add(tair);
        add(ta9m);
        add(srad);
        add(wspd);
        add(pres);

    }

}
