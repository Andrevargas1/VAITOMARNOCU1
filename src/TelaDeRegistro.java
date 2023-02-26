import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class TelaDeRegistro extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JLabel empresaLabel;
    private JTextField empresaField;
    private JLabel usuarioLabel;
    private JTextField usuarioField;
    private JLabel problemaLabel;
    private JTextField problemaField;
    private JLabel solucaoLabel;
    private JTextField solucaoField;
    private JLabel produtoLabel;
    private JTextField produtoField;
    private JLabel contatoLabel;
    private JComboBox<String> contatoComboBox;
    private JButton registrarButton;
    private JButton imprimirButton;


    public TelaDeRegistro( ) {

        super("Registrar Problema do Cliente");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLayout(new GridLayout(7, 2));


        empresaLabel = new JLabel("Empresa:");
        add(empresaLabel);
        empresaField = new JTextField();
        empresaField.setMargin(new Insets(15, 15, 15, 15));
        // empresaField.setPreferredSize(new Dimension(500, 20));
        add(empresaField);

        usuarioLabel = new JLabel("Usuário:");
        add(usuarioLabel);
        usuarioField = new JTextField();
        add(usuarioField);

        problemaLabel = new JLabel("Problema:");
        add(problemaLabel);
        problemaField = new JTextField();
        add(problemaField);

        solucaoLabel = new JLabel("Solução:");
        add(solucaoLabel);
        solucaoField = new JTextField();
        add(solucaoField);

        produtoLabel = new JLabel("Produto:");
        add(produtoLabel);
        produtoField = new JTextField();
        add(produtoField);

        contatoLabel = new JLabel("Contato:");
        add(contatoLabel);
        String[] contatoOptions = {"Whatsapp", "Telefone"};
        contatoComboBox = new JComboBox<String>(contatoOptions);
        add(contatoComboBox);

        registrarButton = new JButton("Registrar");
        registrarButton.addActionListener(this);
        add(registrarButton);

        pack();
        setLocationRelativeTo(null);
        setSize(1250, 720);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == registrarButton) {
            String empresa = empresaField.getText();
            String usuario = usuarioField.getText();
            String problema = problemaField.getText();
            String solucao = solucaoField.getText();
            String produto = produtoField.getText();
            String contato = (String) contatoComboBox.getSelectedItem();

            .AddProblem(new CustomerProblem(empresa, usuario, problema, solucao, produto, contato));

        }
    }

}
