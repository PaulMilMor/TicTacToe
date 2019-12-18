/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipo4;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Gato extends javax.swing.JFrame {
   boolean jugador = true;
   String sim1="";
   String sim2="";
   int s1 = 1;
   int s2 = 2;
   int[][] ans = {{10,11,12},{13,14,15},{16,17,18}};
   
   void play(JButton b){
      if(jugador){
         b.setEnabled(false);
         
         b.setFont(new Font("Arial",0,60));
         b.setForeground(Color.red);
         b.setText(sim1);
         
         jugador = false;
         
      }
      else{
         b.setEnabled(false);
         b.setForeground(Color.blue);
         b.setFont(new Font("Arial",0,60));
         b.setText(sim2);
         jugador = true;
        }
   } 
   void iniciar(){
      b1.setEnabled(true);
      b2.setEnabled(true);
      b3.setEnabled(true);
      b4.setEnabled(true);
      b5.setEnabled(true);
      b6.setEnabled(true);
      b7.setEnabled(true);
      b8.setEnabled(true);
      b9.setEnabled(true);
      choose.setText("");
      
   }
   void reset(){
      ans[0][0]=10;
      ans[0][1]=11;
      ans[0][2]=12;
      ans[1][2]=13;
      ans[1][0]=14;
      ans[1][1]=15;
      ans[2][2]=16;
      ans[2][0]=17;
      ans[2][1]=118;
      b1.setEnabled(false);
      b2.setEnabled(false);
      b3.setEnabled(false);
      b4.setEnabled(false);
      b5.setEnabled(false);
      b6.setEnabled(false);
      b7.setEnabled(false);
      b8.setEnabled(false);
      b9.setEnabled(false);
      
         
      b1.setBackground(Color.WHITE);
      b2.setBackground(Color.WHITE);
      b3.setBackground(Color.WHITE);
      b4.setBackground(Color.WHITE);
      b5.setBackground(Color.WHITE);
      b6.setBackground(Color.WHITE);
      b7.setBackground(Color.WHITE);
      b8.setBackground(Color.WHITE);
      b9.setBackground(Color.WHITE);
      
      b1.setText("");
      b2.setText("");
      b3.setText("");
      b4.setText("");
      b5.setText("");
      b6.setText("");
      b7.setText("");
      b8.setText("");
      b9.setText("");
      figx.setVisible(true);
      figo.setVisible(true);
      turno.setText("");
      if(jugador){
         choose.setText("Elige el jugador 1");
      }
      else{
         choose.setText("Elige el jugador 2");
      }
   }
   boolean compare(JButton[][] bb){
      for (int i = 0; i < 3; i++) {
      if((ans[i][0]==ans[i][1]) && (ans[i][1]==ans[i][2])){
         
         if(ans[i][0]==2){
         
            bb[0][i].setBackground(Color.red);
         bb[1][i].setBackground(Color.red);
         bb[2][i].setBackground(Color.red);
         if(!jugador){
            
            gan1.setText(""+(Integer.parseInt(gan1.getText())+1));
            pun1.setText(""+(Integer.parseInt(pun1.getText())+2));
            per2.setText(""+(Integer.parseInt(per2.getText())+1));
         }
         else{
            gan2.setText(""+(Integer.parseInt(gan2.getText())+1));
            pun2.setText(""+(Integer.parseInt(pun2.getText())+2));
            per1.setText(""+(Integer.parseInt(per1.getText())+1));
         }
         int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea jugar otra vez?","Ganó el jugador 1", JOptionPane.YES_NO_OPTION);
         if(respuesta==0){
         reset();
         bb[0][i].setBackground(Color.white);
         bb[1][i].setBackground(Color.white);
         bb[2][i].setBackground(Color.white);
         
         }
         else{
            JOptionPane.showMessageDialog(this,
        "Jugador 1 ganó: " + gan1.getText() + ", perdió: " + per1.getText() + " y empató: " + emp1.getText() + "\n"
     +  "Jugador 2 ganó: " + gan2.getText() + ", perdió: " + per2.getText() + " y empató: " + emp2.getText() + "\n"
      ,
        "Fin del juego",
        JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
         }
         else{
         bb[0][i].setBackground(Color.blue);
         bb[1][i].setBackground(Color.blue);
         bb[2][i].setBackground(Color.blue);
         if(!jugador){
            
            gan1.setText(""+(Integer.parseInt(gan1.getText())+1));
            pun1.setText(""+(Integer.parseInt(pun1.getText())+2));
            per2.setText(""+(Integer.parseInt(per2.getText())+1));
         }
         else{
            gan2.setText(""+(Integer.parseInt(gan2.getText())+1));
            pun2.setText(""+(Integer.parseInt(pun2.getText())+2));
            per1.setText(""+(Integer.parseInt(per1.getText())+1));
         }
         int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea jugar otra vez?","Ganó el jugador 2", JOptionPane.YES_NO_OPTION);
         if(respuesta==0){
         reset();
         bb[0][i].setBackground(Color.white);
         bb[1][i].setBackground(Color.white);
         bb[2][i].setBackground(Color.white);
         }
         else{
            JOptionPane.showMessageDialog(this,
        "Jugador 1 ganó: " + gan1.getText() + ", perdió: " + per1.getText() + " y empató: " + emp1.getText() + "\n"
     +  "Jugador 2 ganó: " + gan2.getText() + ", perdió: " + per2.getText() + " y empató: " + emp2.getText() + "\n"
    ,
        "Fin del juego",
        JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
         }
      return true;
      }
      
      }
      for (int i = 0; i < 3; i++) {
      if((ans[0][i]==ans[1][i]) && (ans[1][i]==ans[2][i])){
         if(ans[0][i]==2){
         bb[i][0].setBackground(Color.red);
         bb[i][1].setBackground(Color.red);
         bb[i][2].setBackground(Color.red);
         if(!jugador){
            
            gan1.setText(""+(Integer.parseInt(gan1.getText())+1));
            pun1.setText(""+(Integer.parseInt(pun1.getText())+2));
            per2.setText(""+(Integer.parseInt(per2.getText())+1));
         }
         else{
            gan2.setText(""+(Integer.parseInt(gan2.getText())+1));
            pun2.setText(""+(Integer.parseInt(pun2.getText())+2));
            per1.setText(""+(Integer.parseInt(per1.getText())+1));
         }
         int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea jugar otra vez?","Ganó el jugador 1", JOptionPane.YES_NO_OPTION);
         if(respuesta==0){
         reset();
         bb[0][i].setBackground(Color.white);
         bb[1][i].setBackground(Color.white);
         bb[2][i].setBackground(Color.white);
         }
         else{
           JOptionPane.showMessageDialog(this,
        "Jugador 1 ganó: " + gan1.getText() + ", perdió: " + per1.getText() + " y empató: " + emp1.getText() + "\n"
     +  "Jugador 2 ganó: " + gan2.getText() + ", perdió: " + per2.getText() + " y empató: " + emp2.getText() + "\n"
    ,
        "Fin del juego",
        JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
         }
         else{
         bb[i][0].setBackground(Color.blue);
         bb[i][1].setBackground(Color.blue);
         bb[i][2].setBackground(Color.blue);
         if(!jugador){
            
            gan1.setText(""+(Integer.parseInt(gan1.getText())+1));
            pun1.setText(""+(Integer.parseInt(pun1.getText())+2));
            per2.setText(""+(Integer.parseInt(per2.getText())+1));
         }
         else{
            gan2.setText(""+(Integer.parseInt(gan2.getText())+1));
            pun2.setText(""+(Integer.parseInt(pun2.getText())+2));
            per1.setText(""+(Integer.parseInt(per1.getText())+1));
         }
         int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea jugar otra vez?","Ganó el jugador 2", JOptionPane.YES_NO_OPTION);
         if(respuesta==0){
         reset();
         bb[0][i].setBackground(Color.white);
         bb[1][i].setBackground(Color.white);
         bb[2][i].setBackground(Color.white);
         }
         else{
            JOptionPane.showMessageDialog(this,
        "Jugador 1 ganó: " + gan1.getText() + ", perdió: " + per1.getText() + " y empató: " + emp1.getText() + "\n"
     +  "Jugador 2 ganó: " + gan2.getText() + ", perdió: " + per2.getText() + " y empató: " + emp2.getText() + "\n"
    ,
        "Fin del juego",
        JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }}
      return true;
      }
      }
      if(ans[0][2]==ans[1][1] && ans[1][1]==ans[2][0]){
         if(ans[0][0]==2){
         bb[0][2].setBackground(Color.blue);
         bb[1][1].setBackground(Color.blue);
         bb[2][0].setBackground(Color.blue);
         if(!jugador){
            
            gan1.setText(""+(Integer.parseInt(gan1.getText())+1));
            pun1.setText(""+(Integer.parseInt(pun1.getText())+2));
            per2.setText(""+(Integer.parseInt(per2.getText())+1));
         }
         else{
            gan2.setText(""+(Integer.parseInt(gan2.getText())+1));
            pun2.setText(""+(Integer.parseInt(pun2.getText())+2));
            per1.setText(""+(Integer.parseInt(per1.getText())+1));
         }
         int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea jugar otra vez?","Ganó el jugador 2", JOptionPane.YES_NO_OPTION);
         if(respuesta==0){
         reset();
         bb[0][2].setBackground(Color.white);
         bb[1][1].setBackground(Color.white);
         bb[2][0].setBackground(Color.white);
         }
         else{
         JOptionPane.showMessageDialog(this,
        "Jugador 1 ganó: " + gan1.getText() + ", perdió: " + per1.getText() + " y empató: " + emp1.getText() + "\n"
     +  "Jugador 2 ganó: " + gan2.getText() + ", perdió: " + per2.getText() + " y empató: " + emp2.getText() + "\n"
    ,
        "Fin del juego",
        JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
         }
         else{
         bb[0][2].setBackground(Color.red);
         bb[1][1].setBackground(Color.red);
         bb[2][0].setBackground(Color.red);
         if(jugador){
            
            gan1.setText(""+(Integer.parseInt(gan1.getText())+1));
            pun1.setText(""+(Integer.parseInt(pun1.getText())+2));
            per2.setText(""+(Integer.parseInt(per2.getText())+1));
         }
         else{
            gan2.setText(""+(Integer.parseInt(gan2.getText())+1));
            pun2.setText(""+(Integer.parseInt(pun2.getText())+2));
            per1.setText(""+(Integer.parseInt(per1.getText())+1));
         }
         int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea jugar otra vez?","Ganó el jugador 1", JOptionPane.YES_NO_OPTION);
         if(respuesta==0){
         reset();
         bb[0][2].setBackground(Color.white);
         bb[1][1].setBackground(Color.white);
         bb[2][0].setBackground(Color.white);
         }
         else{
         JOptionPane.showMessageDialog(this,
        "Jugador 1 ganó: " + gan1.getText() + ", perdió: " + per1.getText() + " y empató: " + emp1.getText() + "\n"
     +  "Jugador 2 ganó: " + gan2.getText() + ", perdió: " + per2.getText() + " y empató: " + emp2.getText() + "\n"
    ,
        "Fin del juego",
        JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
         }
         return true;
      }
      if(ans[0][0]==ans[1][1] && ans[1][1]==ans[2][2]){
         if(ans[0][0]==2){
         bb[0][0].setBackground(Color.red);
         bb[1][1].setBackground(Color.red);
         bb[2][2].setBackground(Color.red);
         if(!jugador){
            
            gan1.setText(""+(Integer.parseInt(gan1.getText())+1));
            pun1.setText(""+(Integer.parseInt(pun1.getText())+2));
            per2.setText(""+(Integer.parseInt(per2.getText())+1));
         }
         else{
            gan2.setText(""+(Integer.parseInt(gan2.getText())+1));
            pun2.setText(""+(Integer.parseInt(pun2.getText())+2));
            per1.setText(""+(Integer.parseInt(per1.getText())+1));
         }
         int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea jugar otra vez?","Ganó el jugador 1", JOptionPane.YES_NO_OPTION);
         if(respuesta==0){
         reset();
         bb[0][0].setBackground(Color.white);
         bb[1][1].setBackground(Color.white);
         bb[2][2].setBackground(Color.white);
         }
         else{
         JOptionPane.showMessageDialog(this,
        "Jugador 1 ganó: " + gan1.getText() + ", perdió: " + per1.getText() + " y empató: " + emp1.getText() + "\n"
     +  "Jugador 2 ganó: " + gan2.getText() + ", perdió: " + per2.getText() + " y empató: " + emp2.getText() + "\n"
    ,
        "Fin del juego",
        JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
         }
         else{
         bb[0][0].setBackground(Color.blue);
         bb[1][1].setBackground(Color.blue);
         bb[2][2].setBackground(Color.blue);
         if(!jugador){
            
            gan1.setText(""+(Integer.parseInt(gan1.getText())+1));
            pun1.setText(""+(Integer.parseInt(pun1.getText())+2));
            per2.setText(""+(Integer.parseInt(per2.getText())+1));
         }
         else{
            gan2.setText(""+(Integer.parseInt(gan2.getText())+1));
            pun2.setText(""+(Integer.parseInt(pun2.getText())+2));
            per1.setText(""+(Integer.parseInt(per1.getText())+1));
         }
         int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea jugar otra vez?","Ganó el jugador 2", JOptionPane.YES_NO_OPTION);
         if(respuesta==0){
         reset();
         bb[0][0].setBackground(Color.white);
         bb[1][1].setBackground(Color.white);
         bb[2][2].setBackground(Color.white);
         }
         else{
         JOptionPane.showMessageDialog(this,
        "Jugador 1 ganó: " + gan1.getText() + ", perdió: " + per1.getText() + " y empató: " + emp1.getText() + "\n"
     +  "Jugador 2 ganó: " + gan2.getText() + ", perdió: " + per2.getText() + " y empató: " + emp2.getText() + "\n"
    ,
        "Fin del juego",
        JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
         }
         return true;
      }
   
      return false;
   }
   void empate(){
      if(!b1.isEnabled() && !b2.isEnabled()&& !b3.isEnabled()&& !b4.isEnabled()&& !b5.isEnabled()&& !b6.isEnabled()&& !b7.isEnabled()&& !b8.isEnabled()&& !b9.isEnabled() ){
         if(!b1.getText().equals(null) && !b2.getText().equals(null) &&!b3.getText().equals(null) &&!b4.getText().equals(null) &&!b5.getText().equals(null) &&!b6.getText().equals(null) &&!b7.getText().equals(null) &&!b8.getText().equals(null) &&!b9.getText().equals(null)  ){   
            emp1.setText(""+(Integer.parseInt(emp1.getText())+1));
            emp2.setText(""+(Integer.parseInt(emp2.getText())+1));
            pun2.setText(""+(Integer.parseInt(pun2.getText())+1));
            pun1.setText(""+(Integer.parseInt(pun1.getText())+1));
         
         int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea jugar otra vez?","Empate", JOptionPane.YES_NO_OPTION);
         if(respuesta==0){
         reset();
         }
         else{
            JOptionPane.showMessageDialog(this,
        "Jugador 1 ganó: " + gan1.getText() + ", perdió: " + per1.getText() + " y empató: " + emp1.getText() + "\n"
     +  "Jugador 2 ganó: " + gan2.getText() + ", perdió: " + per2.getText() + " y empató: " + emp2.getText() + "\n"
    ,
        "Fin del juego",
        JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
         }
      }
   }
   /**
    * Creates new form Gato
    */
   
   public Gato() {
      
      initComponents();
      setTitle("Gato");
      if(jugador){
         choose.setText("El jugador 1 elige");
      }
      else{
         choose.setText("El jugador 2 elige");
      }
     
      
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jMenu1 = new javax.swing.JMenu();
      jPanel1 = new javax.swing.JPanel();
      b1 = new javax.swing.JButton();
      b2 = new javax.swing.JButton();
      b3 = new javax.swing.JButton();
      b4 = new javax.swing.JButton();
      b5 = new javax.swing.JButton();
      b6 = new javax.swing.JButton();
      b7 = new javax.swing.JButton();
      b8 = new javax.swing.JButton();
      b9 = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      gan2 = new javax.swing.JTextField();
      emp2 = new javax.swing.JTextField();
      per2 = new javax.swing.JTextField();
      gan1 = new javax.swing.JTextField();
      emp1 = new javax.swing.JTextField();
      per1 = new javax.swing.JTextField();
      figx = new javax.swing.JButton();
      figo = new javax.swing.JButton();
      fig1 = new javax.swing.JTextField();
      fig2 = new javax.swing.JTextField();
      turno = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      pun1 = new javax.swing.JTextField();
      jLabel11 = new javax.swing.JLabel();
      pun2 = new javax.swing.JTextField();
      choose = new javax.swing.JLabel();

      jMenu1.setText("jMenu1");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setBackground(new java.awt.Color(255, 255, 255));

      jPanel1.setBackground(new java.awt.Color(0, 0, 0));
      jPanel1.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

      b1.setBackground(new java.awt.Color(255, 255, 255));
      b1.setBorder(null);
      b1.setEnabled(false);
      b1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            b1ActionPerformed(evt);
         }
      });
      jPanel1.add(b1);

      b2.setBackground(new java.awt.Color(255, 255, 255));
      b2.setBorder(null);
      b2.setEnabled(false);
      b2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            b2ActionPerformed(evt);
         }
      });
      jPanel1.add(b2);

      b3.setBackground(new java.awt.Color(255, 255, 255));
      b3.setBorder(null);
      b3.setEnabled(false);
      b3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            b3ActionPerformed(evt);
         }
      });
      jPanel1.add(b3);

      b4.setBackground(new java.awt.Color(255, 255, 255));
      b4.setBorder(null);
      b4.setEnabled(false);
      b4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            b4ActionPerformed(evt);
         }
      });
      jPanel1.add(b4);

      b5.setBackground(new java.awt.Color(255, 255, 255));
      b5.setBorder(null);
      b5.setEnabled(false);
      b5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            b5ActionPerformed(evt);
         }
      });
      jPanel1.add(b5);

      b6.setBackground(new java.awt.Color(255, 255, 255));
      b6.setBorder(null);
      b6.setEnabled(false);
      b6.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            b6ActionPerformed(evt);
         }
      });
      jPanel1.add(b6);

      b7.setBackground(new java.awt.Color(255, 255, 255));
      b7.setBorder(null);
      b7.setEnabled(false);
      b7.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            b7ActionPerformed(evt);
         }
      });
      jPanel1.add(b7);

      b8.setBackground(new java.awt.Color(255, 255, 255));
      b8.setBorder(null);
      b8.setEnabled(false);
      b8.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            b8ActionPerformed(evt);
         }
      });
      jPanel1.add(b8);

      b9.setBackground(new java.awt.Color(255, 255, 255));
      b9.setBorder(null);
      b9.setEnabled(false);
      b9.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            b9ActionPerformed(evt);
         }
      });
      jPanel1.add(b9);

      jLabel1.setText("Jugador 1");

      jLabel2.setText("Jugador 2");

      jLabel3.setText("Ganados");

      jLabel4.setText("Empates");

      jLabel5.setText("Pérdidos");

      jLabel6.setText("Ganados");

      jLabel7.setText("Empates");

      jLabel8.setText("Pérdidos");

      gan2.setEditable(false);
      gan2.setText("0");
      gan2.setBorder(null);

      emp2.setEditable(false);
      emp2.setText("0");
      emp2.setBorder(null);

      per2.setEditable(false);
      per2.setText("0");
      per2.setBorder(null);

      gan1.setEditable(false);
      gan1.setText("0");
      gan1.setBorder(null);
      gan1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            gan1ActionPerformed(evt);
         }
      });

      emp1.setEditable(false);
      emp1.setText("0");
      emp1.setBorder(null);
      emp1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            emp1ActionPerformed(evt);
         }
      });

      per1.setEditable(false);
      per1.setText("0");
      per1.setBorder(null);

      figx.setBackground(new java.awt.Color(255, 255, 255));
      figx.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
      figx.setText("X");
      figx.setBorder(null);
      figx.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            figxActionPerformed(evt);
         }
      });

      figo.setBackground(new java.awt.Color(255, 255, 255));
      figo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
      figo.setText("O");
      figo.setBorder(null);
      figo.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            figoActionPerformed(evt);
         }
      });

      fig1.setEditable(false);
      fig1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
      fig1.setForeground(new java.awt.Color(255, 0, 0));
      fig1.setBorder(null);
      fig1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fig1ActionPerformed(evt);
         }
      });

      fig2.setEditable(false);
      fig2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
      fig2.setForeground(new java.awt.Color(0, 0, 255));
      fig2.setBorder(null);
      fig2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            fig2ActionPerformed(evt);
         }
      });

      jLabel10.setText("Puntos");

      pun1.setEditable(false);
      pun1.setText("0");
      pun1.setBorder(null);

      jLabel11.setText("Puntos");

      pun2.setEditable(false);
      pun2.setText("0");
      pun2.setBorder(null);

      choose.setText("El jugador  elige");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(303, 303, 303)
            .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(67, 67, 67)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel3)
                  .addGap(67, 67, 67)
                  .addComponent(gan1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1)
                     .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel5))
                  .addGap(60, 60, 60)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(per1)
                     .addComponent(pun1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                     .addComponent(fig1, javax.swing.GroupLayout.Alignment.TRAILING)))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel4)
                  .addGap(67, 67, 67)
                  .addComponent(emp1)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(figo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(figx, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(103, 103, 103))
               .addGroup(layout.createSequentialGroup()
                  .addGap(83, 83, 83)
                  .addComponent(choose)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel6)
               .addComponent(jLabel7)
               .addComponent(jLabel8)
               .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addGap(63, 63, 63)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(pun2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
               .addComponent(fig2)
               .addComponent(emp2)
               .addComponent(gan2)
               .addComponent(per2))
            .addGap(58, 58, 58))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(118, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(118, 118, 118))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(jLabel2)
               .addComponent(fig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(fig2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(choose))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(gan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(figx, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel7)
                     .addComponent(emp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel8)
                     .addComponent(per2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(figo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
               .addGroup(layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3)
                     .addComponent(gan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4)
                     .addComponent(emp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(per1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel5))
                  .addGap(23, 23, 23)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel10)
                  .addComponent(pun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(pun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel11))
            .addGap(19, 19, 19)
            .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void gan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gan1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_gan1ActionPerformed

   private void emp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_emp1ActionPerformed

   private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
      // TODO add your handling code here:
      play(b6);
      if(jugador){
         ans[2][1] = s1;
         turno.setText("Turno del jugador 1");
      }
      else{
         ans[2][1] = s2;
         turno.setText("Turno del jugador 2");
      }
      JButton[][] b = {{b1,b2,b3}, {b4,b5,b6}, {b7,b8,b9}};
      if(compare(b)){
         
      }else{
      empate();
      }
   }//GEN-LAST:event_b6ActionPerformed

   private void figxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_figxActionPerformed
      // TODO add your handling code here:
      figx.setVisible(false); 
      figo.setVisible(false);
      
      
      iniciar();
      if(jugador){
         fig1.setText("X");
         fig2.setText("O");
         sim1 = "X";
         sim2 = "O";
         turno.setText("Turno del jugador 1");
      }
      else{
         fig2.setText("X");
         fig1.setText("O");
         sim2 = "X";
         sim1 = "O";
         turno.setText("Turno del jugador 2");
      }
   }//GEN-LAST:event_figxActionPerformed

   private void figoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_figoActionPerformed
      // TODO add your handling code here:
      figx.setVisible(false); 
      figo.setVisible(false);
      
      iniciar();
      if(jugador){
         fig1.setText("O");
         fig2.setText("X");
         sim1 = "O";
         sim2 = "X";
         turno.setText("Turno del jugador 1");
      }
      else{
         fig2.setText("O");
         fig1.setText("X");
         sim2 = "O";
         sim1 = "X";
         turno.setText("Turno del jugador 2");
      }
   }//GEN-LAST:event_figoActionPerformed

   private void fig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_fig1ActionPerformed

   private void fig2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fig2ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_fig2ActionPerformed

   private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
      // TODO add your handling code here:
      play(b1);
      if(jugador){
         ans[0][0] = s1;
         turno.setText("Turno del jugador 1");
      }
      else{
         ans[0][0] = s2;
         turno.setText("Turno del jugador 2");
      }
      JButton[][] b = {{b1,b2,b3}, {b4,b5,b6}, {b7,b8,b9}};
      if(compare(b)){
         
      }else{
      empate();
      }
   }//GEN-LAST:event_b1ActionPerformed

   private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
      // TODO add your handling code here
      play(b2);
      if(jugador){
         ans[1][0] = s1;
         turno.setText("Turno del jugador 1");
      }
      else{
         ans[1][0] = s2;
         turno.setText("Turno del jugador 2");
      }
      JButton[][] b = {{b1,b2,b3}, {b4,b5,b6}, {b7,b8,b9}};
      if(compare(b)){
         
      }else{
      empate();
      }
   }//GEN-LAST:event_b2ActionPerformed

   private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
      // TODO add your handling code here:
      play(b3);
      if(jugador){
         ans[2][0] = s1;
         turno.setText("Turno del jugador 1");
      }
      else{
         ans[2][0] = s2;
         turno.setText("Turno del jugador 2");
      }
      JButton[][] b = {{b1,b2,b3}, {b4,b5,b6}, {b7,b8,b9}};
      if(compare(b)){
         
      }else{
      empate();
      }
   }//GEN-LAST:event_b3ActionPerformed

   private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
      // TODO add your handling code here:
      play(b4);
      if(jugador){
         ans[0][1] = s1;
         turno.setText("Turno del jugador 1");
      }
      else{
         ans[0][1] = s2;
         turno.setText("Turno del jugador 2");
      }
      JButton[][] b = {{b1,b2,b3}, {b4,b5,b6}, {b7,b8,b9}};
      if(compare(b)){
         
      }else{
      empate();
      }
   }//GEN-LAST:event_b4ActionPerformed

   private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
      // TODO add your handling code here:
      play(b5);
      if(jugador){
         ans[1][1] = s1;
         turno.setText("Turno del jugador 1");
      }
      else{
         ans[1][1] = s2;
         turno.setText("Turno del jugador 2");
      }
      JButton[][] b = {{b1,b2,b3}, {b4,b5,b6}, {b7,b8,b9}};
      if(compare(b)){
         
      }else{
      empate();
      }
   }//GEN-LAST:event_b5ActionPerformed

   private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
      // TODO add your handling code here:
      play(b7);
      if(jugador){
         ans[0][2] = s1;
         turno.setText("Turno del jugador 1");
      }
      else{
         ans[0][2] = s2;
         turno.setText("Turno del jugador 2");
      }
      JButton[][] b = {{b1,b2,b3}, {b4,b5,b6}, {b7,b8,b9}};
      if(compare(b)){
         
      }else{
      empate();
      }
   }//GEN-LAST:event_b7ActionPerformed

   private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
      // TODO add your handling code here:
      play(b8);
      if(jugador){
         ans[1][2] = s1;
         turno.setText("Turno del jugador 1");
      }
      else{
         ans[1][2] = s2;
         turno.setText("Turno del jugador 2");
      }
      JButton[][] b = {{b1,b2,b3}, {b4,b5,b6}, {b7,b8,b9}};
      if(compare(b)){
         
      }else{
      empate();
      }
   }//GEN-LAST:event_b8ActionPerformed

   private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
      // TODO add your handling code here:
      play(b9);
      if(jugador){
         ans[2][2] = s1;
         turno.setText("Turno del jugador 1");
      }
      else{
         ans[2][2] = s2;
         turno.setText("Turno del jugador 2");
      }
      JButton[][] b = {{b1,b2,b3}, {b4,b5,b6}, {b7,b8,b9}};
      if(compare(b)){
         
      }else{
      empate();
      }
   }//GEN-LAST:event_b9ActionPerformed

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Gato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Gato().setVisible(true);
         }
      });
   } 

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton b1;
   private javax.swing.JButton b2;
   private javax.swing.JButton b3;
   private javax.swing.JButton b4;
   private javax.swing.JButton b5;
   private javax.swing.JButton b6;
   private javax.swing.JButton b7;
   private javax.swing.JButton b8;
   private javax.swing.JButton b9;
   private javax.swing.JLabel choose;
   private javax.swing.JTextField emp1;
   private javax.swing.JTextField emp2;
   private javax.swing.JTextField fig1;
   private javax.swing.JTextField fig2;
   private javax.swing.JButton figo;
   private javax.swing.JButton figx;
   private javax.swing.JTextField gan1;
   private javax.swing.JTextField gan2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JMenu jMenu1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JTextField per1;
   private javax.swing.JTextField per2;
   private javax.swing.JTextField pun1;
   private javax.swing.JTextField pun2;
   private javax.swing.JLabel turno;
   // End of variables declaration//GEN-END:variables
}
