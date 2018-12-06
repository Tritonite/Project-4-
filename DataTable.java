import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * This class is the datatable in the GUI that displays the calculated buttons
 * results.
 * 
 * @author Triston Luzanta
 * @version 2018-12-06
 *
 */

public class DataTable extends JPanel
{

    /**
     * Default UID
     */
    private static final long serialVersionUID = 1L;

    // title for each column
    String[] columns = { "Station", "Parameter", "Statistics", "Value", "Reporting Stations", "Date" };
    // Initialized a 2x2 data array
    String[][] data;

    // Created a DefaultTableModel object storing the titles
    DefaultTableModel Deftable = new DefaultTableModel(data, columns);

    // Created a table with the tablemodel stored
    JTable table = new JTable(Deftable);

    // Created a scroll pane object with the table stored
    JScrollPane scroll = new JScrollPane(table);

    // number of rows
    int numRows = 0;

    /*
     * Constructs the table with the set size
     */
    public DataTable()
    {
        super();

        table.setPreferredScrollableViewportSize(new Dimension(800, 600));

        this.add(scroll);
    }

    /**
     * 
     * @param data
     *            Mapdata object where the statistics will be from
     * @param type
     *            the type of Enumeration in Statstype class (Ex. MAXIMU, MINIMUM
     *            etc)
     * @param paramId
     *            The datatype (Ex. tair,ta9m etc.)
     * @return A string of each results stored to their corresponding title
     */
    public String[] dataFetch(MapData data, StatsType type, String paramId)
    {

        // Gets the Station
        String station = data.getStatistics(type, paramId).getStid();
        // Gets the datatype
        String parameter = paramId;
        // Gets the Statistic type
        String statistics = type.toString();
        // Gets the Value
        String value = Double.toString(data.getStatistics(type, paramId).getValue());
        // Gets the number of reporting stations
        String reportingStations = Integer.toString(data.getStatistics(type, paramId).getNumberOfReportingStations());
        // Gets the Date
        String date = data.getStatistics(type, paramId).getUTCDateTimeString();
        // Ouputs the results in this formatted string array
        String[] result = { station, parameter, statistics, value, reportingStations, date };

        return result;

    }
}
