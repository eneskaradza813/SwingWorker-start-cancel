package jtabblle;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class MyRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    JLabel res = new JLabel(table.getModel().getValueAt(row, column).toString());
    res.setOpaque(true);
    res.setForeground(Color.DARK_GRAY);
    res.setBackground(Color.LIGHT_GRAY);
    return res;
    }

    
    
    
    
}
