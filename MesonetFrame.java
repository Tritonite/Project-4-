
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import MapData.StatsType;

public class MesonetFrame extends JFrame 
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    JPanel panel1 = new JPanel();
    JPanel panel3 = new JPanel(new GridBagLayout());

    // checkboxes for datatypes
    JCheckBox tair = new JCheckBox("TAIR");
    JCheckBox ta9m = new JCheckBox("TA9M");
    JCheckBox srad = new JCheckBox("SRAD");
    JCheckBox wspd = new JCheckBox("WSPD");
    JCheckBox pres = new JCheckBox("PRES");

    // buttons for measurements
    JRadioButton min = new JRadioButton("MINIMUM");
    JRadioButton max = new JRadioButton("MAXIMUM");
    JRadioButton avg = new JRadioButton("AVERAGE");

    // calculation and exit buttons
    JButton calculate = new JButton("Calculate");
    JButton exit = new JButton("Exit");

    public MesonetFrame()
    {
        // title
        super("Oklahoma Mesonet - Statistics Calculator");
        setSize(1000, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // file bar
        BarMenu test1 = new BarMenu();
        setJMenuBar(test1);

        // spacing for calculate and exit buttons
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 10);

        // title for north panel
        JLabel label = new JLabel("Mesonet - We don't set records, we report them!");

        // parameter panel object
        Parameter paramPanel = new Parameter();
        // statistics panel object
        StatisticsPanel statsPanel = new StatisticsPanel();
        // New Panel to add parameter and statistics
        JPanel choicePanel = new JPanel();
        // table object panel
        DataTable displayTable = new DataTable();

        // adding parameter panel
        choicePanel.add(paramPanel);
        // adding statistics panel
        choicePanel.add(statsPanel);

        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.add(label);

        // Calculate and Exit button placements
        panel3.setBackground(Color.LIGHT_GRAY);
        panel3.add(calculate);
        gbc.gridx = 5;
        gbc.gridy = 0;
        panel3.add(exit, gbc);

        // Displacements of information
        add(panel1, BorderLayout.NORTH);
        add(choicePanel, BorderLayout.WEST);
        add(displayTable, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);

        calculate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (paramPanel.tair.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
                          String [] data = displayTable.dataFetch(MapData data, StatsType.MAXIMU, "TAIR");  
                          
                          displayTable.Deftable.addRow(data);
                    }
                    else if (statsPanel.min.isSelected())
                    {
                        String [] data = displayTable.dataFetch(MapData data, StatsType.MINIMUM, "TAIR");  
                        
                        displayTable.Deftable.addRow(data);
                    }

                    else if (statsPanel.avg.isSelected())
                    {
                        String [] data = displayTable.dataFetch(MapData data, StatsType.AVERAGE, "TAIR");  
                        
                        displayTable.Deftable.addRow(data);
                    }
                }
                else if (paramPanel.ta9m.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
                        String [] data = displayTable.dataFetch(MapData data, StatsType.MAXIMU, "TA9M");  
                        
                        displayTable.Deftable.addRow(data);

                    }
                    else if (statsPanel.min.isSelected())
                    {
    String [] data = displayTable.dataFetch(MapData data, StatsType.MINIMUM, "TA9M");  
                        
                        displayTable.Deftable.addRow(data);

                    }

                    else if (statsPanel.avg.isSelected())
                    {
    String [] data = displayTable.dataFetch(MapData data, StatsType.AVERAGE, "TA9M");  
                        
                        displayTable.Deftable.addRow(data);

                    }
                }
                if (paramPanel.srad.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
    String [] data = displayTable.dataFetch(MapData data, StatsType.MAXIMU, "SRAD");  
                        
                        displayTable.Deftable.addRow(data);
                        
                    }
                    else if (statsPanel.min.isSelected())
                    {
String [] data = displayTable.dataFetch(MapData data, StatsType.MINIMUM, "SRAD");  
                        
                        displayTable.Deftable.addRow(data);
                        
                    }

                    else if (statsPanel.avg.isSelected())
                    {
String [] data = displayTable.dataFetch(MapData data, StatsType.AVERAGE, "SRAD");  
                        
                        displayTable.Deftable.addRow(data);
                        

                    }
                }
                if (paramPanel.wspd.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
String [] data = displayTable.dataFetch(MapData data, StatsType.MAXIMU, "WSPD");  
                        
                        displayTable.Deftable.addRow(data);
                        

                    }
                    else if (statsPanel.min.isSelected())
                    {
String [] data = displayTable.dataFetch(MapData data, StatsType.MINIMUM, "WSPD");  
                        
                        displayTable.Deftable.addRow(data);
                        

                    }

                    else if (statsPanel.avg.isSelected())
                    {
String [] data = displayTable.dataFetch(MapData data, StatsType.AVERAGE, "WSPD");  
                        
                        displayTable.Deftable.addRow(data);
                        

                    }
                }
                if (paramPanel.pres.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
String [] data = displayTable.dataFetch(MapData data, StatsType.MAXIMU, "PRES");  
                        
                        displayTable.Deftable.addRow(data);
                        
                    }
                    else if (statsPanel.min.isSelected())
                    {
String [] data = displayTable.dataFetch(MapData data, StatsType.MINIMUM, "PRES");  
                        
                        displayTable.Deftable.addRow(data);
                        

                    }

                    else if (statsPanel.avg.isSelected())
                    {

String [] data = displayTable.dataFetch(MapData data, StatsType.AVERAGE, "PRES");  
                        
                        displayTable.Deftable.addRow(data);
                        
                    }
                }
            }

        });
    }

    public static void main(String arg[])
    {
        ProjectTesting test = new ProjectTesting();
        test.setVisible(true);
    }

   

}
