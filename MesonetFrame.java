
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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
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

    /*
     * Builds and operates the GUI 
     */
    public MesonetFrame(String title) throws IOException
    {
        // title
        super(title);
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
        // New Panel to add parameter and statistics panels 
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
         * If this button is selected then you will the result corresponded to that measurement/statistics. 
         */
        calculate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //  TAIR checkbox is selected 
                if (paramPanel.tair.isSelected())
                {
                    // Retrieve the maximum TAIR statistic
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "TAIR");

                        displayTable.Deftable.addRow(data);
                    }
                    // Retrieve the minimum TAIR statistic
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "TAIR");

                        displayTable.Deftable.addRow(data);
                    }

                     // Retrieve the average TAIR statistic
                     if (statsPanel.avg.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "TAIR");

                        displayTable.Deftable.addRow(data);
                    }
                }
                //  TA9M checkbox is selected
                 if (paramPanel.ta9m.isSelected())
                {
                     // Retrieve the TA9M maximum statistic
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "TA9M");

                        displayTable.Deftable.addRow(data);

                    }
                    // Retrieve the TA9M minimum statistic
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "TA9M");

                        displayTable.Deftable.addRow(data);

                    }
                     
                     // Retrieve the TA9M average statistic 
                     if (statsPanel.avg.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "TA9M");

                        displayTable.Deftable.addRow(data);

                    }
                }
                 //  SRAD checkbox is selected 
                if (paramPanel.srad.isSelected())
                {
                    // Retrieve the SRAD maximum statistic 
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "SRAD");

                        displayTable.Deftable.addRow(data);

                    }
                    // Retrieve the SRAD minimum statistic 
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "SRAD");

                        displayTable.Deftable.addRow(data);

                    }
                     // Retrieve the SRAD average statistic 
                     if (statsPanel.avg.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "SRAD");

                        displayTable.Deftable.addRow(data);

                    }
                }
                //  WSPD checkbox is selected 
                if (paramPanel.wspd.isSelected())
                {
                    // Retrieve the WSPD maximum statistic 
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "WSPD");

                        displayTable.Deftable.addRow(data);

                    }
                    // Retrieve the WSPD minimum statistic 
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "WSPD");

                        displayTable.Deftable.addRow(data);

                    }

                     // Retrieve the WSPD average statistic 
                     if (statsPanel.avg.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "WSPD");

                        displayTable.Deftable.addRow(data);

                    }
                }
                // PRES check box is selected 
                if (paramPanel.pres.isSelected())
                {
                    // Retrieve the PRES maximum statistic 
                    if (statsPanel.max.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MAXIMU, "PRES");

                        displayTable.Deftable.addRow(data);

                    }
                    // Retrieve the PRES minimum statistic 
                     if (statsPanel.min.isSelected())
                    {
                        String[] data = displayTable.dataFetch(tests, StatsType.MINIMUM, "PRES");

                        displayTable.Deftable.addRow(data);

                    }

                     // Retrieve the PRES average statistic 
                     if (statsPanel.avg.isSelected())
                    {

                        String[] data = displayTable.dataFetch(tests, StatsType.AVERAGE, "PRES");

                        displayTable.Deftable.addRow(data);

                    }
                }
            }

        });
        /**
         * GUI will close if exit button is executed. 
         */
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
    /*
     * This class sets up the File bar in the GUI. 
     */
    class BarMenu extends JMenuBar
    {
        /**
         *  Defualt UID
         */
        private static final long serialVersionUID = 1L;

        public BarMenu()
        {
            // Sets the File menu tile as "File"
            JMenu file = new JMenu("File"); 
            // Subcomponents of the File menu bar 
            JMenuItem dataFile = new JMenuItem("Open Data File"); 
            JMenuItem exit = new JMenuItem("Exit"); 
            JFileChooser fileChooser = new JFileChooser();
            // Adding the subcomponents to the main component 
            file.add(dataFile); 
            file.add(exit); 
           add(file); 

        /*
         * If this button is executed then 
         */
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
        new MesonetFrame("Oklahoma Mesonet - Statistics Calculator");
    }
}
