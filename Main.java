import java.awt.Color;

import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JFrame ventana = new JFrame();

    Producto pElectronics = new Producto("Electronics", "img/electronics.jpg");
    pElectronics.setLocation(32, 32);
    ventana.add(pElectronics);

    Producto pHealth = new Producto("Health & Personal Care", "img/health.jpg");
    pHealth.setLocation(332, 32);
    ventana.add(pHealth);

    Producto pToys = new Producto("Toys Under $30", "img/toys.jpg");
    pToys.setLocation(632, 32);
    ventana.add(pToys);

    Producto pHome = new Producto("Home & Kitchen Under $30", "img/home.jpg");
    pHome.setLocation(932, 32);
    ventana.add(pHome);

    ventana.setBackground(new Color(227,230,230));
    ventana.setSize(1280, 720); // tamaño
    ventana.setLayout(null); // layout null
    ventana.setLocationRelativeTo(null); // centrar ventana
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
    ventana.setVisible(true); // hacer ventana visible
  }

}