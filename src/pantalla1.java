import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pantalla1 {
    public JPanel panel2;
    private JButton hobbyButton;
    public JLabel a;
    public JLabel b;
    public JLabel c;
    public JLabel d;
    public JLabel e;
    public JLabel f;


    public pantalla1() {
        hobbyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear el marco (JFrame)
                JFrame frame = new JFrame("Mostrar Imagen");
                frame.setSize(600, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Crear panel para la imagen
                JPanel imagePanel = new JPanel();
                frame.add(imagePanel, BorderLayout.CENTER);


                ImageIcon imageIcon = new ImageIcon("C:\\Users\\stefi\\IdeaProjects\\Login\\374320_28.jpg");/*Cambiar la direccion*/
                JLabel imageLabel = new JLabel(imageIcon);
                imagePanel.add(imageLabel);

                frame.setVisible(true);
                JButton regresar = new JButton("Regresar");
                regresar.setBounds(150, 150, -1, -1);

                frame.setVisible(true);
                frame.add(regresar,BorderLayout.PAGE_END);
                regresar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame frame2=new JFrame();
                        ((JFrame) SwingUtilities.getWindowAncestor(regresar)).dispose();
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.setContentPane(new pantalla1().panel2);
                        frame2.setSize(1000, 1000);
                        frame2.setLocationRelativeTo(null);
                        frame2.pack();
                        frame2.setVisible(true);


                    }


                });






            }
        });
    }
}
