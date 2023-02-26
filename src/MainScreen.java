import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JComboBox<String> datacombobox;
    private JButton registrarButton;
    private JTable alltables;

    private AbstractTableModel tableModel;
    public MainScreen( ){

        super("Vcall 1.1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        tableModel = new MyTableModel();
        alltables = new JTable(tableModel);
        add(alltables);
        registrarButton = new JButton("Registar Novo Chamado");
        registrarButton.addActionListener(this);
        add(registrarButton);

        pack();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        new TelaDeRegistro();
        tableModel.fireTableDataChanged();
    }
}
