
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
/**
 * This class creates a Mesonet Calculator GUI that in a BorderLayout format  that displays calculated data given on a file. 
 * @author Triston Luzanta with help from Robinshin Shin, and Dan Tran
 * @version 2018-12-6
 *
 */
public class MesonetFrame extends JFrame
{

    // Default UID
    private static final long serialVersionUID = 1L;

    // Panel for the North 
    JPanel panel1 = new JPanel();
    // Panel for the South layout 
    JPanel panel3 = new JPanel(new GridBagLayout());

  

    // Calculation and exit buttons
    JButton calculate = new JButton("Calculate");
    JButton exit = new JButton("Exit");
    
    // Initializing MapData and a String for file testing 
    MapData tests;
    String fileName;

    public MesonetFrame() throws IOException
    {
        // title
        super("Oklahoma Mesonet - Statistics Calculator");
        // Setting the default size 
        setSize(1000, 350);
       
        // Setting the Layout 
        setLayout(new BorderLayout());

        // Creating a file bar
        BarMenu test1 = new BarMenu();
        // Setting the file bar 
        setJMenuBar(test1);

        // Spacing for calculate and exit buttons
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 10);

        // Title for north panel
        JLabel label = new JLabel("Mesonet - We don't set records, we report them!");

        // Parameter panel object
        Parameter paramPanel = new Parameter();
        // Statistics panel object
        StatisticsPanel statsPanel = new StatisticsPanel();
        // New Panel to add parameter and statistics
        JPanel choicePanel = new JPanel();
        // Table object panel
        DataTable displayTable = new DataTable();

        // Adding parameter panel
        choicePanel.add(paramPanel);
        // Adding statistics panel
        choicePanel.add(statsPanel);
        
        // Setting the North panel backround to light gray. 
        panel1.setBackground(Color.LIGHT_GRAY);
        // Adding that label to the North panel 
        panel1.add(label);

       // Sets the South panel bacround to light gray. 
        panel3.setBackground(Color.LIGHT_GRAY);
        panel3.add(calculate);
        // Calculate and Exit button placements
        gbc.gridx = 5;
        gbc.gridy = 0;
        panel3.add(exit, gbc);

        // Displacements of information and layout of the GUI
        add(panel1, BorderLayout.NORTH);
        add(choicePanel, BorderLayout.WEST);
        add(displayTable, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);
        
        // Displays the GUI 
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        
        /*
         * If this button is selected then the result 
         */
        calculate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                if (paramPanel.tair.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "TAIR");

                        displayTable.Deftable.addRow(data);
                    }
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "TAIR");

                        displayTable.Deftable.addRow(data);
                    }

                     if (statsPanel.avg.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "TAIR");

                        displayTable.Deftable.addRow(data);
                    }
                }
                 if (paramPanel.ta9m.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "TA9M");

                        displayTable.Deftable.addRow(data);

                    }
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "TA9M");

                        displayTable.Deftable.addRow(data);

                    }

                     if (statsPanel.avg.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "TA9M");

                        displayTable.Deftable.addRow(data);

                    }
                }
                if (paramPanel.srad.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "SRAD");

                        displayTable.Deftable.addRow(data);

                    }
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "SRAD");

                        displayTable.Deftable.addRow(data);

                    }

                     if (statsPanel.avg.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "SRAD");

                        displayTable.Deftable.addRow(data);

                    }
                }
                if (paramPanel.wspd.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "WSPD");

                        displayTable.Deftable.addRow(data);

                    }
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "WSPD");

                        displayTable.Deftable.addRow(data);

                    }

                     if (statsPanel.avg.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "WSPD");

                        displayTable.Deftable.addRow(data);

                    }
                }
                if (paramPanel.pres.isSelected())
                {
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "PRES");

                        displayTable.Deftable.addRow(data);

                    }
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "PRES");

                        displayTable.Deftable.addRow(data);

                    }

                     if (statsPanel.avg.isSelected())
                    {

                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "PRES");

                        displayTable.Deftable.addRow(data);

                    }
                }
            }

        });
        
        exit.addActionListener(new ActionListener()
                {
            public void actionPerformed(ActionEvent e)
            { 
                if (e.getSource() == exit)
                {
                    System.exit(0);
                }
            }

            
                });
       
    }
    class BarMenu extends JMenuBar
    {
        /**
         * 
         */
        private static final long serialVersionUID = 1L;

        public BarMenu()
        {
            JMenu file = new JMenu("File"); 
            JMenuItem dataFile = new JMenuItem("Open Data File"); 
            JMenuItem exit = new JMenuItem("Exit"); 
            JFileChooser fileChooser = new JFileChooser();
            file.add(dataFile); 
            file.add(exit); 
           add(file); 

        
        dataFile.addActionListener(new ActionListener() 
        {
    public void actionPerformed(ActionEvent e)
    {
        fileChooser.setCurrentDirectory(new File("C:\\Users\\Triston\\eclipse-workspace\\Project 4\\data"));
        if(e.getSource() == dataFile)
        {
            int value = fileChooser.showOpenDialog(BarMenu.this);

            int YEAR = 0;
            int MONTH = 0; 
            int DAY = 0; 
            int HOUR = 0;
            int MINUTE = 0;

            String directory = "";
if (value == JFileChooser.APPROVE_OPTION)
            {
                String fileA = fileChooser.getSelectedFile().getName();
                directory = fileChooser.getCurrentDirectory().getName();

                String name = directory + "/" + fileA;
                fileName = name;

                String[] parts = fileA.split("");


                String numbers = parts[0] + parts[1] + parts[2] + parts[3];
                YEAR = Integer.parseInt(numbers);


                numbers = parts[4] + parts[5];
                MONTH = Integer.parseInt(numbers);

                numbers = parts[6] + parts[7];
                DAY = Integer.parseInt(numbers);

                numbers = parts[8] + parts[9];
                HOUR = Integer.parseInt(numbers);

                numbers = parts[10] + parts[11];
                MINUTE = Integer.parseInt(numbers);


                try 
                {
                    tests = new MapData(YEAR,MONTH,DAY,HOUR,MINUTE, directory);
                    tests.parseFile(fileName);
                } 
                catch (IOException e1) 
                {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        }
    }
        });
       exit.addActionListener(new ActionListener()
               {
                   public void actionPerformed(ActionEvent e)
                   {
                       System.exit(0);
                   }
               });
    }
    }
    public static void main(String[] args) throws IOException
    {
        new MesonetFrame();
    }
}
