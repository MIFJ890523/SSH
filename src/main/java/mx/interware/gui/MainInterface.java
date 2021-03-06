package mx.interware.gui;

import mx.interware.ssh.Command;
import mx.interware.ssh.Tunnel;
import com.jcraft.jsch.JSchException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jmiranda
 */
public class MainInterface extends javax.swing.JFrame {

    public String[] userData = new String[5];

    public MainInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        field_User = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        field_Port = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        field_Pass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        field_Key = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        field_Command = new javax.swing.JTextField();
        button_Ejecutar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combo_Connection = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SSH");
        setBackground(new java.awt.Color(21, 21, 13));
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(300, 575));
        setPreferredSize(new java.awt.Dimension(300, 575));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 575));

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("MenuItem.selectionBackground"));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 468));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 545));

        jLabel1.setText("Usuario:");
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 25));

        field_User.setToolTipText("user@host");
        field_User.setMaximumSize(null);
        field_User.setMinimumSize(null);
        field_User.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel2.setText("Puerto:");
        jLabel2.setMaximumSize(null);
        jLabel2.setMinimumSize(null);
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 25));

        field_Port.setToolTipText("22");
        field_Port.setMaximumSize(null);
        field_Port.setMinimumSize(null);
        field_Port.setName(""); // NOI18N
        field_Port.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel3.setText("Password:");
        jLabel3.setMaximumSize(null);
        jLabel3.setMinimumSize(null);
        jLabel3.setPreferredSize(new java.awt.Dimension(250, 25));

        field_Pass.setMaximumSize(null);
        field_Pass.setMinimumSize(null);
        field_Pass.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel4.setText("Clave RSA:");
        jLabel4.setMaximumSize(null);
        jLabel4.setMinimumSize(null);
        jLabel4.setPreferredSize(new java.awt.Dimension(250, 25));

        field_Key.setToolTipText("~/.ssh/id_rsa");
        field_Key.setMaximumSize(null);
        field_Key.setMinimumSize(null);
        field_Key.setPreferredSize(new java.awt.Dimension(250, 30));

        jLabel5.setText("Comando:");
        jLabel5.setMaximumSize(null);
        jLabel5.setMinimumSize(null);
        jLabel5.setPreferredSize(new java.awt.Dimension(250, 25));

        field_Command.setToolTipText("ls -l");
        field_Command.setMaximumSize(null);
        field_Command.setMinimumSize(null);
        field_Command.setPreferredSize(new java.awt.Dimension(250, 30));

        button_Ejecutar.setText("Ejecutar");
        button_Ejecutar.setPreferredSize(new java.awt.Dimension(100, 25));
        button_Ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_EjecutarMouseClicked(evt);
            }
        });

        jLabel6.setText("Conexión");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 25));

        combo_Connection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Command", "Tunnel" }));
        combo_Connection.setMaximumSize(null);
        combo_Connection.setPreferredSize(new java.awt.Dimension(250, 30));
        combo_Connection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_ConnectionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(combo_Connection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(field_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(field_Port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(field_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(field_Key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(field_Command, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(button_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(combo_Connection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(field_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(field_Port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(field_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(field_Key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(field_Command, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(button_Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_EjecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EjecutarMouseClicked

        userData[0] = field_User.getText();
        userData[1] = field_Port.getText();
        userData[2] = field_Pass.getText();
        userData[3] = field_Key.getText();
        userData[4] = field_Command.getText();

        if (userData[0].equals("") || userData[1].equals("") || userData[4].equals("") || userData[2].equals("") && userData[3].equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (combo_Connection.getSelectedIndex() == 0) {
            
                Command command = new Command();
            try {
                command.Connection(userData);
            } catch (IOException ex) {
                //Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getCause());
            } catch (JSchException ex) {
                //Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getCause());
            }
            
        } else if (combo_Connection.getSelectedIndex() == 1) {
          
                Tunnel tunnel = new Tunnel();
            try {
                tunnel.Connection(userData);
            } catch (JSchException ex) {
                //Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getCause());
            } catch (IOException ex) {
                //Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getCause());
            }
                
            
        }

    }//GEN-LAST:event_button_EjecutarMouseClicked

    private void combo_ConnectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_ConnectionItemStateChanged
        if (combo_Connection.getSelectedIndex() == 0) {
            //JOptionPane.showMessageDialog(null, "comando", "Error", JOptionPane.ERROR_MESSAGE);
            jLabel5.setText("Comando:");
            field_Command.setToolTipText("ls -l");

        } else if (combo_Connection.getSelectedIndex() == 1) {
            //JOptionPane.showMessageDialog(null, "tunel", "Error", JOptionPane.ERROR_MESSAGE);
            jLabel5.setText("Reenvío de puerto:");
            field_Command.setToolTipText("9000:localhost:80");

        }
    }//GEN-LAST:event_combo_ConnectionItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Ejecutar;
    private javax.swing.JComboBox combo_Connection;
    private javax.swing.JTextField field_Command;
    private javax.swing.JTextField field_Key;
    private javax.swing.JTextField field_Pass;
    private javax.swing.JTextField field_Port;
    private javax.swing.JTextField field_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
