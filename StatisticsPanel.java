import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * This class creates the Statistics panel in the GUI. 
 * @author Triston Luzanta 
 * @version 2018-12-06
 */
public class StatisticsPanel extends JPanel
{
    // Label for the panel 
    JLabel label3 = new JLabel("Statistics");

    // RadioButton for the datatypes 
    JRadioButton min = new JRadioButton("MINIMUM");
    JRadioButton max = new JRadioButton("MAXIMUM");
    JRadioButton avg = new JRadioButton("AVERAGE");

    // Group of dataype buttons
    ButtonGroup group = new ButtonGroup();

    public StatisticsPanel()
    {
        super();

        // Layout in form of GridLayout with vertical and horizontal spacings. 
        setLayout(new GridLayout(4, 0, 16, 16));
        // Panel Backround set to light gray 
        setBackground(Color.LIGHT_GRAY);

        // Aligns the components centrally on the yaxis 
        label3.setVerticalAlignment(JLabel.TOP);
        min.setVerticalAlignment(JRadioButton.TOP);
        max.setVerticalAlignment(JRadioButton.TOP);
        avg.setVerticalAlignment(JRadioButton.TOP);

        // Components background is light gray 
        label3.setBackground(Color.LIGHT_GRAY);
        min.setBackground(Color.LIGHT_GRAY);
        avg.setBackground(Color.LIGHT_GRAY);
        max.setBackground(Color.LIGHT_GRAY);

        // The label and datatypes are added to the panel 
        add(label3);
        add(min);
        add(avg);
        add(max);

        // Maximimum set defaulted
        max.setSelected(true);

        // Only one datatype can be selected one at a time
        group.add(min);
        group.add(max);
        group.add(avg);
    }

}
