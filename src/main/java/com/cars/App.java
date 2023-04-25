package com.cars;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class App extends JFrame {
    //double valor;
    /**
     *
     */
    final private Font mainFont = new Font("conversor", Font.BOLD, 18);
    JTextField tfCantidad;
    JComboBox<String> combo1, combo2;
    JLabel lbResultado;

	public void initialize(){
        /*form Panel */
        JLabel lbCantidad = new JLabel("Introduce la cantidad:");
        lbCantidad.setFont(mainFont);

        tfCantidad = new JTextField();
        tfCantidad.setFont(mainFont);

        JLabel lbDe = new JLabel("De:");
        lbDe.setFont(mainFont);

        JLabel lbA = new JLabel("A:");
        lbA.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(2,1,5,50));
        formPanel.setOpaque(false);
        formPanel.add(lbCantidad);
        formPanel.add(tfCantidad);
        formPanel.add(lbDe);
        formPanel.add(lbA);

        

       
        /*JComboBox 1  */
        combo1 = new JComboBox<String>();
        combo1.setBounds(45,90,190,30);
        combo1.addItem("Pesos Mx");
        combo1.addItem("Dolar");
        combo1.addItem("Euros");
        combo1.addItem("Libras Esterlinas");
        combo1.addItem("Yen Japones");
        combo1.addItem("Won sul-coreano");

        

        combo2 = new JComboBox<String>();
        combo2.setBounds(270,90,190,30);
        combo2.addItem("Pesos Mx");
        combo2.addItem("Dolar");
        combo2.addItem("Euros");
        combo2.addItem("Libras Esterlinas");
        combo2.addItem("Yen Japones");
        combo2.addItem("Won sul-coreano");

        /*Resultado label */
        lbResultado = new JLabel();
        lbResultado.setFont(mainFont);

        /*Buttons Panel */
        JButton btnCovertir= new JButton("Convertir");
        btnCovertir.setFont(mainFont);
        btnCovertir.addActionListener((e)->{
            try{

                
                double valor = Double.parseDouble(tfCantidad.getText());
               // int divisa = combo1.getSelectedIndex();
                String valorinicial = (String) combo1.getSelectedItem();
                String valorFinal = (String) combo2.getSelectedItem();
                //int divisafin = combo2.getSelectedIndex();
                
                Convertidor puenteConexion = new Convertidor();
                // puenteConexion.setCantidad(valor);
                // puenteConexion.setDivisaOrigen(valorinicial);
                // puenteConexion.setDivisaDestino(valorFinal);

                double resultadoFinal=puenteConexion.convertir(valor,valorinicial,valorFinal);
                lbResultado.setText("");
                JOptionPane.showMessageDialog(this,"El resultado es: "+resultadoFinal);
                
                int opc=JOptionPane.showConfirmDialog(this,"Desea continuar?");
                
                if(opc == 0){
                    tfCantidad.setText("");
                    lbResultado.setText("Ingrese de nuevo los datos...");
                }else if(opc == 1){
                    JOptionPane.showMessageDialog(this," Programa Finalizado");
                    System.exit(0);
                    
                }else{
                    JOptionPane.showMessageDialog(this," Programa Finalizado");
                    System.exit(0);
                    
                }


                }catch(Exception ex){
                    
                    JOptionPane.showMessageDialog(this, "Ingrese un Valor Numerico");
                }
        });
        

        JButton btnClear = new JButton("Limpiar");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfCantidad.setText("");
                lbResultado.setText("");
            }
            
        });
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnCovertir);
        buttonsPanel.add(btnClear);

        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128, 255));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(combo1,BorderLayout.CENTER); 
        mainPanel.add(combo2, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);   
        mainPanel.add(lbResultado, BorderLayout.CENTER);
        
        add(mainPanel);

        setTitle("CONVERSOR DIVISAS");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
	
	public static void main(String[] args) {
        
        App myFrame = new App();
        myFrame.initialize();
     }
}
