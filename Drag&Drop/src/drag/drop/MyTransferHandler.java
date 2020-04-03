package drag.drop;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.TransferHandler;

public class MyTransferHandler extends TransferHandler {

    @Override
    public int getSourceActions(JComponent c) {
        return COPY_OR_MOVE;
    }

    @Override
    protected Transferable createTransferable(JComponent c) {
       JList list = (JList)c;
       return new StringSelection(list.getSelectedValue().toString());
    }

    @Override
    protected void exportDone(JComponent source, Transferable data, int action) {
        if(action == MOVE)
        {
            JList list = (JList)source;
            DefaultListModel defaultListModel = (DefaultListModel)list.getModel();
            defaultListModel.remove(list.getSelectedIndex());
        }
             
        
    }

    @Override
    public boolean canImport(TransferSupport support) {
        if(!support.isDataFlavorSupported(DataFlavor.stringFlavor))
        {
            return false;
        }
        return true;
    }

    @Override
    public boolean importData(TransferSupport support) {
        if(!support.isDrop())
        {
            return false;
        }
        String data = null;
        try {
            data = (String) (support).getTransferable().getTransferData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException | IOException ex) {
            Logger.getLogger(MyTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        JList.DropLocation dl = (JList.DropLocation)support.getDropLocation();
        int index = dl.getIndex();
        JList jList = (JList)support.getComponent();
        DefaultListModel defaultListModel = (DefaultListModel)jList.getModel();
        defaultListModel.add(index, data);
        return true;
        
    }
    
    
}
