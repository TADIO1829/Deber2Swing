import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    public JLabel Inicio;
    public JPasswordField passwordField1;
    public JButton Ingreso;
    public  JPanel panel1;
    public JTextField usuario;
    public JLabel lae;


    public Login() {
        Ingreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = usuario.getText();
                 String contra = new String(passwordField1.getPassword());
                 if(user.equals("Tadio") && contra.equals("Tadio")){
                     JOptionPane.showMessageDialog(Ingreso, "Login exitoso!");
                     JFrame frame=new JFrame();
                     ((JFrame) SwingUtilities.getWindowAncestor(Ingreso)).dispose();
                     frame.setContentPane(new pantalla1().panel2);
                     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     frame.setSize(1000, 1000);
                     frame.setLocationRelativeTo(null);
                     frame.pack();
                     frame.setVisible(true);

                 }else{
                     JOptionPane.showMessageDialog(Ingreso, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);

                 }



            }
        });
    }
}
