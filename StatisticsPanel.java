import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class StatisticsPanel extends JPanel
{
    JLabel label3 = new JLabel("Statistics");

    JRadioButton min = new JRadioButton("MINIMUM");
    JRadioButton max = new JRadioButton("MAXIMUM");
    JRadioButton avg = new JRadioButton("AVERAGE");

    public StatisticsPanel()
    {
        super();

        setLayout(new GridLayout(4,0,16,16));
        setBackground(Color.LIGHT_GRAY);

        
        label3.setVerticalAlignment(JLabel.TOP);
    
        
        min.setVerticalAlignment(JRadioButton.TOP);
        
        max.setVerticalAlignment(JRadioButton.TOP);
    
        
        avg.setVerticalAlignment(JRadioButton.TOP);
    
    
               
        // Statistics label
        label3.setBackground(Color.LIGHT_GRAY);
        
        add(label3);

        // min placement
        min.setBackground(Color.LIGHT_GRAY);
        add(min);

        // avg placement
        avg.setBackground(Color.LIGHT_GRAY);
        add(avg);

        // max placement
        max.setBackground(Color.LIGHT_GRAY);
        add(max);

        // Maximimum set defaulted
        max.setSelected(true);
    }

}
