package calc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JTextField;

/**
 *
 * @author Seba
 */
public class Calculadora extends JFrame implements ActionListener {
    
    //creamos variavle de tipo panel
    
    JPanel panel;
    JPanel panelres;
    
    
     //declaramos variables de tipo botones para los numeros de la calculadora
      JButton buno;
      JButton bdos;
      JButton btres;
      JButton bcuatro;
      JButton bcinco;
      JButton bseis;
      JButton bsiete;
      JButton bocho;
      JButton bnueve;
      JButton bcero;
      
      //declaramos variables de tipo botones para operatoria
      JButton bsuma;
      JButton bresta;
      JButton bmult;
      JButton bdiv;
      
      //declaramos variables de tipo botones para funciones especiales
      
      JButton bdec;
      JButton bneg;
      JButton bporc;
      JButton bigual;
      JButton breset;
      JButton bfunc;
      
      
      //creamos un cuadro de texto para los resultado de la calculadora
      
      JTextField resultado;
      JTextArea area;
          
   
    public Calculadora() {
      
     
      buno = new JButton("1");
      buno.setBounds(100, 50, 50, 50);
      buno.addActionListener(this);
      
      bdos = new JButton("2");
      bdos.setBounds(200, 50, 50, 50);
      bdos.addActionListener(this);
      
      btres = new JButton("3");
      btres.setBounds(300, 50, 50, 50);
      btres.addActionListener(this);
      
      bcuatro = new JButton("4");
      bcuatro.setBounds(400, 50, 50, 50);
      bcuatro.addActionListener(this);
      
      bcinco = new JButton("5");
      bcinco.setBounds(100, 100, 50, 50);
      bcinco.addActionListener(this);
      
      bseis = new JButton("6");
      bseis.setBounds(200, 100, 50, 50);
      bseis.addActionListener(this);
      
      bsiete = new JButton("7");
      bsiete.setBounds(300, 100, 50, 50);
      bsiete.addActionListener(this);
      
      bocho = new JButton("8");
      bocho.setBounds(400, 100, 50, 50);
      bocho.addActionListener(this);
      
      bnueve = new JButton("9");
      bnueve.setBounds(100, 150, 50, 50);
      bnueve.addActionListener(this);
      
      bcero = new JButton("0");
      bcero.setBounds(200, 150, 50, 50);
      bcero.addActionListener(this);
      
      bsuma = new JButton("+");
      bsuma.setBounds(300, 150, 50, 50);
      bsuma.setBackground(Color.WHITE);
      bsuma.addActionListener(this);
      
      bresta = new JButton("-");
      bresta.setBounds(400, 150, 50, 50);
      bresta.setBackground(Color.WHITE);
      bresta.addActionListener(this);
      
      bmult = new JButton("*");
      bmult.setBounds(100, 200, 50, 50);
      bmult.setBackground(Color.WHITE);
      bmult.addActionListener(this);
      
      bdiv = new JButton("/");
      bdiv.setBounds(200, 200, 50, 50);
      bdiv.setBackground(Color.WHITE);
      bdiv.addActionListener(this);
      
      bdec = new JButton(".");
      bdec.setBounds(300, 200, 50, 50);
      bdec.setBackground(Color.WHITE);
      bdec.addActionListener(this);
      
      bneg = new JButton("+/-");
      bneg.setBounds(400, 200, 50, 50);
      bneg.setBackground(Color.WHITE);
      bneg.addActionListener(this);
      
      bporc = new JButton("%");
      bporc.setBounds(100, 250, 50, 50);
      bporc.setBackground(Color.WHITE);
      bporc.addActionListener(this);
      
      bigual = new JButton("=");
      bigual.setBounds(200, 250, 50, 50);
      bigual.setBackground(Color.WHITE);
      bigual.addActionListener(this);
      
      breset = new JButton("C");
      breset.setBounds(300, 250, 50, 50);
      breset.setBackground(Color.RED);
      breset.addActionListener(this);
      
      
      bfunc = new JButton("()");
      bfunc.setBounds(400, 250, 50, 50);
      bfunc.setBackground(Color.WHITE);
      bfunc.addActionListener(this);
      
      panelres = new JPanel();
      resultado = new JTextField(20);
      area = new JTextArea(2,20);
      area.setFont(new Font("arial",Font.BOLD,20));
     panelres.add(area);
      
      
      
      
      panel = new JPanel();
      panel.setLayout(null);
      
      GridLayout gl = new GridLayout (5,4); 
      gl.setHgap(5);
      gl.setVgap(5);
      panel.setLayout(gl);
      
      
      
      panel.add(breset);
      panel.add(bfunc);
      panel.add(bporc);
      panel.add(bdiv);
      panel.add(bsiete);
      panel.add(bocho);
      panel.add(bnueve);
      panel.add(bmult);
      panel.add(bcuatro);
      panel.add(bcinco);
      panel.add(bseis);
      panel.add(bresta);
      panel.add(buno);
      panel.add(bdos);
      panel.add(btres);
      panel.add(bsuma);
      panel.add(bneg);
      panel.add(bcero);
      panel.add(bdec);
      panel.add(bigual);
      
      add(panelres, BorderLayout.NORTH);
      add(panel);
      setBounds(500,350,500,500);
      setVisible(true);
      setTitle("Calculadora Swing - JAVA");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      
      
     
      
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == buno){
                if (area.getText() == "") {
                        area.setText("1");
                    }else{
                        area.setText(area.getText() + "1");}
        }
        
        
         if (ae.getSource() == bdos){
                if (area.getText() == "") {
                        area.setText("2");
                    }else{
                        area.setText(area.getText() + "2");}
        }
         
         
          if (ae.getSource() == btres){
                if (area.getText() == "") {
                        area.setText("3");
                    }else{
                        area.setText(area.getText() + "3");}
        }
          
          if (ae.getSource() == bcuatro){
                if (area.getText() == "") {
                        area.setText("4");
                    }else{
                        area.setText(area.getText() + "4");}
        }
          
          if (ae.getSource() == bcinco){
                if (area.getText() == "") {
                        area.setText("5");
                    }else{
                        area.setText(area.getText() + "5");}
        }
          if (ae.getSource() == bseis){
                if (area.getText() == "") {
                        area.setText("6");
                    }else{
                        area.setText(area.getText() + "6");}
        }
          if (ae.getSource() == bsiete){
                if (area.getText() == "") {
                        area.setText("7");
                    }else{
                        area.setText(area.getText() + "7");}
        }
          if (ae.getSource() == bocho){
                if (area.getText() == "") {
                        area.setText("8");
                    }else{
                        area.setText(area.getText() + "8");}
        }
          if (ae.getSource() == bnueve){
                if (area.getText() == "") {
                        area.setText("9");
                    }else{
                        area.setText(area.getText() + "9");}
        }
          if (ae.getSource() == bcero){
                if (area.getText() == "") {
                        area.setText("0");
                        
                    }else{
                        area.setText(area.getText() + "0");}
        }
          
          if (ae.getSource() == bsuma){
                if (area.getText() == "") {
                        area.setText("+");
                        
                    }else{
                        area.setText(area.getText() + "+");}
        }
          
            if (ae.getSource() == bresta){
                if (area.getText() == "") {
                        area.setText("-");
                        
                    }else{
                        area.setText(area.getText() + "-");}
        }
            
              if (ae.getSource() == bmult){
                if (area.getText() == "") {
                        area.setText("*");
                        
                    }else{
                        area.setText(area.getText() + "*");}
        }
              
                   if (ae.getSource() == bdiv){
                if (area.getText() == "") {
                        area.setText("/");
                        
                    }else{
                        area.setText(area.getText() + "/");}
        }
                   
                    if (ae.getSource() == bdec){
                if (area.getText() == "") {
                        area.setText(".");
                        
                    }else{
                        area.setText(area.getText() + ".");}
        }
          
          
          
           if (ae.getSource() == breset){
                if (area.getText() != "") {
                        area.setText("");
                        
                    }
        }
           
          
           
           if (ae.getSource() == bigual){
               
               String cadena = area.getText();
               
               for(int i = 0; i < cadena.length(); i++){
                   char caracter = cadena.charAt(i);
                   
                   if(caracter == '+'){
                       
                     String primeraparte = cadena.substring(0,i);
                     String segundaparte = cadena.substring(i+1,cadena.length());
                     
                     double resultado = Double.parseDouble(primeraparte) + Double.parseDouble(segundaparte);
                     
                     area.setText(Double.toString(resultado));
                     
                   }
                   
                    if(caracter == '-'){
                       
                     String primeraparte = cadena.substring(0,i);
                     String segundaparte = cadena.substring(i+1,cadena.length());
                     
                     double resultado = Double.parseDouble(primeraparte) - Double.parseDouble(segundaparte);
                     
                     area.setText(Double.toString(resultado));
                     
                   }
                    
                     if(caracter == '*'){
                       
                     String primeraparte = cadena.substring(0,i);
                     String segundaparte = cadena.substring(i+1,cadena.length());
                     
                     double resultado = Double.parseDouble(primeraparte) * Double.parseDouble(segundaparte);
                     
                     area.setText(Double.toString(resultado));
                     
                   }
                     
                     
                      if(caracter == '/'){
                       
                     String primeraparte = cadena.substring(0,i);
                     String segundaparte = cadena.substring(i+1,cadena.length());
                     
                     double resultado = Double.parseDouble(primeraparte) / Double.parseDouble(segundaparte);
                     String mensaje = "division por cero";
                     area.setText(mensaje);
                     
                   }
                   
               }
                   }
          
           
    }
    
    
    
}
