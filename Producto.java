import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Producto extends JPanel {
    public Producto(String titulo, String rutaImagen) {
        Font fTitulo = new Font("Arial", Font.BOLD, 16);

        JLabel lTitulo = new JLabel(titulo);
        lTitulo.setBounds(20, 20, 280, 24);
        lTitulo.setFont(fTitulo);
        add(lTitulo);

        JLabel lImagen = new JLabel(new ImageIcon(rutaImagen));
        lImagen.setBounds(20, 50, 250, 240);
        add(lImagen);

        JLabel lShopNow = new JLabel("Shop now");
        lShopNow.setBounds(20, 300, 170, 30);
        lShopNow.setForeground(new Color(123,182,191));
        add(lShopNow);

        setSize(290, 340);
        setBackground(Color.WHITE);
        setLayout(null);
    }
}
