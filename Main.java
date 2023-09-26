import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		
		Cursor cMano = new Cursor(Cursor.HAND_CURSOR);
		Font fuenteTituloPrincipal = new Font("Tahoma", Font.PLAIN, 15);
        Font fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 12);
		Color colorventana = new Color(221,240,89,255);
		Color colorventana1 = new Color(35,47,62,255);
		Color colorventana2 = new Color(19,25,33,255);
		Color colorventana3 = new Color(254,189,105,255);
		ImageIcon logoAma = new ImageIcon("C:\\Users\\KEVIN\\eclipse-workspace\\Interfaz\\src\\imagenes\\logo amazon.png");
		
        JFrame ventana = new JFrame("Proyecto amazon interfaz grafica");
        ventana.setState(JFrame.MAXIMIZED_BOTH);
        
        
        // panel superior
        JPanel pAlta = new JPanel();
        pAlta.setBounds(0, 0, 1280, 50); // coordenadas y tamaño
        pAlta.setBackground(colorventana2);
        pAlta.setLayout(null);
        ventana.add(pAlta);
        
       
        
        // BOTON AMAZON 
        JButton bTitulo = new JButton();
        bTitulo.setBounds(10,5, 100, 50);
        bTitulo.setFocusable(false);
        bTitulo.setFont(fuenteTituloPrincipal);
        bTitulo.setBackground(colorventana2);
        bTitulo.setForeground(Color.white);
        bTitulo.setBorder(null);
        bTitulo.setIcon(logoAma);
        bTitulo.setCursor(cMano);
        pAlta.add(bTitulo);
        
        
        // BOTON ENVIAR
        JButton benviar = new JButton("Enviar a \n"+" Colombia");
        benviar.setBounds(130,0, 130, 50);
        benviar.setFocusable(false);
        benviar.setFont(fuenteTitulo);
        benviar.setBackground(colorventana2);
        benviar.setForeground(Color.white);
        benviar.setBorder(null);
        benviar.setCursor(cMano);
        pAlta.add(benviar);
        
        // BARRA DE TEXTO
        JTextField tNombreUsuario = new JTextField("Buscar amazon");
        tNombreUsuario.setBounds(370, 10, 300 , 30);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE); // Color de la línea que parpadea
        tNombreUsuario.setHorizontalAlignment(JTextField.CENTER);
        pAlta.add(tNombreUsuario);
        
        //LISTA DE BUSQUEDA
        JComboBox<String> buscar = new JComboBox<>();
        buscar.addItem("Todos los departamentos");
        buscar.addItem("Arte y artesanias");
        buscar.addItem("Automotriz");
        buscar.addItem("Bebé");
        buscar.addItem("Belleza y cuidado personal");
        buscar.addItem("Cine y TV ");
        buscar.addItem("Computadoras");
        buscar.addItem("Deportes y actividades al aire libre ");
        buscar.addItem("Electronicos");
        buscar.addItem("Equipaje");
        buscar.addItem("Herramientas y mejoramiento del hogar");
        buscar.addItem("Automotriz");
        buscar.addItem("Hogar y cocina ");
        buscar.addItem("Industrial y cientifico");
        buscar.addItem("Insumos para mascotas");
        buscar.addItem("Juguetes y juegos");
        buscar.addItem("Libros");
        buscar.addItem("Moda de niñas");
        buscar.addItem("Moda de niños");
        buscar.addItem("Moda para hombre ");
        buscar.addItem("Moda para mujer ");
        buscar.addItem("Musica MP3");
        buscar.addItem("Musica, CD y vinilos");
        buscar.addItem("Ofertas");
        buscar.addItem("Prime video");
        buscar.addItem("Salud y productos para el hogar ");
        buscar.addItem("Software");
        buscar.addItem("Tienda Kindle");
        buscar.addItem("Videojuegos");
        
        buscar.setBounds(300, 10, 70, 30);
        pAlta.add(buscar);
        
        //BARRA DE TEXTO 
        JTextField tBuscar1 = new JTextField("BUSCAR AMAZON");
        tBuscar1.setBounds(10, 240, 260, 40);
        tBuscar1.setForeground(Color.DARK_GRAY);
        tBuscar1.setBackground(Color.WHITE);
        tBuscar1.setCaretColor(Color.BLUE); // Color de la línea que parpadea
        tBuscar1.setHorizontalAlignment(JTextField.CENTER);
        pAlta.add(tBuscar1);
        
        //BOTON DE BUSCAR 
        JButton buscar1 = new JButton();
        buscar1.setBounds(670,10,30, 30);
        buscar1.setFocusable(false);
        buscar1.setBackground(colorventana3);
        buscar1.setForeground(Color.black);
        buscar1.setBorder(null);
        buscar1.setCursor(cMano);
        pAlta.add(buscar1);
        
        // PANEL MEDIO 
        JPanel pMedia = new JPanel();
        pMedia.setBounds(0, 50, 1280, 30); // coordenadas y tamaño
        pMedia.setBackground(colorventana1);
        pMedia.setLayout(null);
        ventana.add(pMedia);
        
        //BOTON TODO
        JButton bTodo = new JButton("Todo");
        bTodo.setBounds(10,0, 100, 30);
        bTodo.setFocusable(false);
        bTodo.setBackground(colorventana1);
        bTodo.setForeground(Color.white);
        bTodo.setBorder(null);
        bTodo.setCursor(cMano);
        pMedia.add(bTodo);

      //BOTON OFERTA DEL DIA
        JButton bOferta = new JButton("Oferta del Dia");
        bOferta.setBounds(110,0,150, 30);
        bOferta.setFocusable(false);
        bOferta.setBackground(colorventana1);
        bOferta.setForeground(Color.white);
        bOferta.setBorder(null);
        bOferta.setCursor(cMano);
        pMedia.add(bOferta);
        
      //BOTON SERVICIO AL CLIENTE
        JButton bServicio = new JButton("Servicio al cliente");
        bServicio.setBounds(260,0, 150, 30);
        bServicio.setFocusable(false);
        bServicio.setBackground(colorventana1);
        bServicio.setForeground(Color.white);
        bServicio.setBorder(null);
        bServicio.setCursor(cMano);
        pMedia.add(bServicio);
        
      //BOTON LISTAS
        JButton bListas = new JButton("Listas");
        bListas.setBounds(410,0, 100, 30);
        bListas.setFocusable(false);
        bListas.setBackground(colorventana1);
        bListas.setForeground(Color.white);
        bListas.setBorder(null);
        bListas.setCursor(cMano);
        pMedia.add(bListas);
        
      //BOTON TARJETAS DE REGALO
        JButton bTarjetas = new JButton("Tarjetas de regalo");
        bTarjetas.setBounds(510,0, 150, 30);
        bTarjetas.setFocusable(false);
        bTarjetas.setBackground(colorventana1);
        bTarjetas.setForeground(Color.white);
        bTarjetas.setBorder(null);
        bTarjetas.setCursor(cMano);
        pMedia.add(bTarjetas);
        
      //BOTON VENDER
        JButton bVender = new JButton("Vender");
        bVender.setBounds(660,0, 100, 30);
        bVender.setFocusable(false);
        bVender.setBackground(colorventana1);
        bVender.setForeground(Color.white);
        bVender.setBorder(null);
        bVender.setCursor(cMano);
        pMedia.add(bVender);

        JLabel  videojuegos = new JLabel("ACCESORIOS PARA VIDEOJUEGOS");
        videojuegos.setBounds( 40, 70, 280, 500);
        videojuegos.setBackground(Color.BLACK);
        videojuegos.setFont(fuenteTituloPrincipal);
        videojuegos.setLayout(null);
        ventana.add(videojuegos);
        
        JPanel pBajo1 = new JPanel();
        pBajo1.setBounds( 20, 300, 280, 300);
        pBajo1.setBackground(Color.white);
        pBajo1.setLayout(null);
        ventana.add(pBajo1);
        
        JLabel  envio= new JLabel("Envio GRATUITO a Colombia");
        envio.setBounds( 380, 70, 280, 300);
        envio.setBackground(Color.BLACK);
        envio.setFont(fuenteTituloPrincipal);
        envio.setLayout(null);
        ventana.add(envio);
       
        
        
        JPanel pBajo2 = new JPanel();
        pBajo2.setBounds( 340, 300, 280, 300);
        pBajo2.setBackground(Color.white);
        pBajo2.setLayout(null);
        ventana.add(pBajo2);
        
        JLabel  Electro = new JLabel("ELECTRONICOS");
        Electro.setBounds( 680, 70, 280, 500);
        Electro.setBackground(Color.BLACK);
        Electro.setFont(fuenteTituloPrincipal);
        Electro.setLayout(null);
        ventana.add(Electro);
        
        
        JPanel pBajo3 = new JPanel();
        pBajo3.setBounds( 660, 300, 280, 300);
        pBajo3.setBackground(Color.white);
        pBajo3.setLayout(null);
        ventana.add(pBajo3);
        
        JLabel  AMAZONB = new JLabel("AmazonBACICS");
        AMAZONB.setBounds( 1000, 70, 280, 500);
        AMAZONB.setBackground(Color.BLACK);
        AMAZONB.setFont(fuenteTituloPrincipal);
        AMAZONB.setLayout(null);
        ventana.add(AMAZONB);
        
        
        
        JPanel pBajo4 = new JPanel();
        pBajo4.setBounds( 980, 300, 280, 300);
        pBajo4.setBackground(Color.white);
        pBajo4.setLayout(null);
        ventana.add(pBajo4);
        
        //PANEL BAJO 
        JPanel pBajo = new JPanel();
        pBajo.setBounds(0, 80, 1280, 720);
        pBajo.setBackground(colorventana);
        pBajo.setLayout(null);
        ventana.add(pBajo);
        
    
        
   
        
        ImageIcon logo = new ImageIcon("C:\\Users\\KEVIN\\eclipse-workspace\\Interfaz\\src\\imagenes\\portada.jpg");
        ImageIcon logoEscalado = new ImageIcon(logo.getImage().getScaledInstance(1280, 720,Image.SCALE_AREA_AVERAGING));
        JLabel lLogo = new JLabel (logoEscalado);
        lLogo.setBounds(0, 0, 1280, 720);
        pBajo.add(lLogo);
        
        
        
       
     
   
       

    

        ventana.setSize(1280, 720); // tamaño
        ventana.setLayout(null); // layout null
        ventana.setLocationRelativeTo(null); // centrar ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
        ventana.setVisible(true); // hacer ventana visible
    }

}