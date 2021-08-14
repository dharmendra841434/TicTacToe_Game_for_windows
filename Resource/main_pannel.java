/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author dhruv
 */
public class main_pannel extends javax.swing.JFrame {

    private String startgame="x";
    private int xcount = 0;
    private int ocount = 0;
    private boolean checker;
    /**
     * Creates new form main_pannel
     */
    public main_pannel() {
        initComponents();
        icon();
    }
    
    private void icon()
 {
   setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/t.png")));
 }
    
private void gamescore()
{
    playerx.setText(String.valueOf(xcount));
    playero.setText(String.valueOf(ocount));

}
private void choose()
{

  if(startgame.equalsIgnoreCase("x"))
  {
     startgame = "0";
  
  }
  else
       {
     startgame = "x";
  
  }

}
private void wingame()
{

  String b1=one.getText();
  String b2=two.getText();
  String b3=three.getText();
  String b4=four.getText();
  String b5=five.getText();
  String b6=six.getText();
  String b7=seven.getText();
  String b8=eight.getText();
  String b9=nine.getText();
  
  
  if(b1 == "x" && b2 == "x" && b3 == "x")
  {
    JOptionPane.showMessageDialog(null,"PlayerX is Win"); 
    one.setForeground(new java.awt.Color(204, 0, 0));
    two.setForeground(new java.awt.Color(204, 0, 0));
    three.setForeground(new java.awt.Color(204, 0, 0));
    xcount++;
    gamescore();
  
  }
   if(b4 == "x" && b5 == "x" && b6 == "x")
  {
    JOptionPane.showMessageDialog(null,"PlayerX is Win");
    four.setForeground(new java.awt.Color(204, 0, 0));
   five.setForeground(new java.awt.Color(204, 0, 0));
    six.setForeground(new java.awt.Color(204, 0, 0));
   xcount++;
    gamescore();
  }
    if(b7 == "x" && b8 == "x" && b9 == "x")
  {
    JOptionPane.showMessageDialog(null,"PlayerX is Win");
    seven.setForeground(new java.awt.Color(204, 0, 0));
    eight.setForeground(new java.awt.Color(204, 0, 0));
    nine.setForeground(new java.awt.Color(204, 0, 0));
   xcount++;
    gamescore();
  }
     if(b1 == "x" && b4 == "x" && b7 == "x")
  {
    JOptionPane.showMessageDialog(null,"PlayerX is Win");
    one.setForeground(new java.awt.Color(204, 0, 0));
    four.setForeground(new java.awt.Color(204, 0, 0));
    seven.setForeground(new java.awt.Color(204, 0, 0));
   xcount++;
    gamescore();
  }
      if(b2 == "x" && b5 == "x" && b8 == "x")
  {
    JOptionPane.showMessageDialog(null,"PlayerX is Win");
    two.setForeground(new java.awt.Color(204, 0, 0));
    five.setForeground(new java.awt.Color(204, 0, 0));
    eight.setForeground(new java.awt.Color(204, 0, 0));
   xcount++;
    gamescore();
  }
       if(b3 == "x" && b6 == "x" && b9 == "x")
  {
   JOptionPane.showMessageDialog(null,"PlayerX is Win");
    three.setForeground(new java.awt.Color(204, 0, 0));
    six.setForeground(new java.awt.Color(204, 0, 0));
    nine.setForeground(new java.awt.Color(204, 0, 0));
   xcount++;
    gamescore();
  }
        if(b1 == "x" && b5 == "x" && b9 == "x")
  {
    JOptionPane.showMessageDialog(null,"PlayerX is Win");
    one.setForeground(new java.awt.Color(204, 0, 0));
    five.setForeground(new java.awt.Color(204, 0, 0));
    nine.setForeground(new java.awt.Color(204, 0, 0));
   xcount++;
    gamescore();
  }
         if(b3 == "x" && b5 == "x" && b7 == "x")
  {
    JOptionPane.showMessageDialog(null,"PlayerX is Win");
    three.setForeground(new java.awt.Color(204, 0, 0));
    five.setForeground(new java.awt.Color(204, 0, 0));
    seven.setForeground(new java.awt.Color(204, 0, 0));
   xcount++;
    gamescore();
  }

         
         
  if(b1 == "0" && b2 == "0" && b3 == "0")
  {
    JOptionPane.showMessageDialog(null,"PlayerO is Win");
    one.setForeground(new java.awt.Color(204, 0, 0));
    two.setForeground(new java.awt.Color(204, 0, 0));
    three.setForeground(new java.awt.Color(204, 0, 0));
   ocount++;
    gamescore();
  }
   if(b4 == "0" && b5 == "0" && b6 == "0")
  {
    JOptionPane.showMessageDialog(null,"PlayerO is Win");
    four.setForeground(new java.awt.Color(204, 0, 0));
   five.setForeground(new java.awt.Color(204, 0, 0));
    six.setForeground(new java.awt.Color(204, 0, 0));
   ocount++;
    gamescore();
  }
    if(b7 == "0" && b8 == "0" && b9 == "0")
  {
   JOptionPane.showMessageDialog(null,"PlayerO is Win");
    seven.setForeground(new java.awt.Color(204, 0, 0));
    eight.setForeground(new java.awt.Color(204, 0, 0));
    nine.setForeground(new java.awt.Color(204, 0, 0));
   ocount++;
    gamescore();
  }
     if(b1 == "0" && b4 == "0" && b7 == "0")
  {
   JOptionPane.showMessageDialog(null,"PlayerO is Win");
    one.setForeground(new java.awt.Color(204, 0, 0));
    four.setForeground(new java.awt.Color(204, 0, 0));
    seven.setForeground(new java.awt.Color(204, 0, 0));
   ocount++;
    gamescore();
  }
      if(b2 == "0" && b5 == "0" && b8 == "0")
  {
    JOptionPane.showMessageDialog(null,"PlayerO is Win");
    two.setForeground(new java.awt.Color(204, 0, 0));
    five.setForeground(new java.awt.Color(204, 0, 0));
    eight.setForeground(new java.awt.Color(204, 0, 0));
   ocount++;
    gamescore();
  }
       if(b3 == "0" && b6 == "0" && b9 == "0")
  {
   JOptionPane.showMessageDialog(null,"PlayerO is Win");
     three.setForeground(new java.awt.Color(204, 0, 0));
    six.setForeground(new java.awt.Color(204, 0, 0));
    nine.setForeground(new java.awt.Color(204, 0, 0));
   ocount++;
    gamescore();
  }
        if(b1 == "0" && b5 == "0" && b9 == "0")
  {
    JOptionPane.showMessageDialog(null,"PlayerO is Win");
    one.setForeground(new java.awt.Color(204, 0, 0));
    five.setForeground(new java.awt.Color(204, 0, 0));
    nine.setForeground(new java.awt.Color(204, 0, 0));
   ocount++;
    gamescore();
  }
         if(b3 == "0" && b5 == "0" && b7 == "0")
  {
    JOptionPane.showMessageDialog(null,"PlayerO is Win");
    three.setForeground(new java.awt.Color(204, 0, 0));
    five.setForeground(new java.awt.Color(204, 0, 0));
    seven.setForeground(new java.awt.Color(204, 0, 0));
   ocount++;
    gamescore();
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

        main = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        one = new javax.swing.JLabel();
        three = new javax.swing.JLabel();
        two = new javax.swing.JLabel();
        four = new javax.swing.JLabel();
        seven = new javax.swing.JLabel();
        five = new javax.swing.JLabel();
        six = new javax.swing.JLabel();
        nine = new javax.swing.JLabel();
        eight = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        exitgame = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        reset = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 100, 750, 530));
        setMaximumSize(new java.awt.Dimension(750, 530));
        setMinimumSize(new java.awt.Dimension(750, 530));
        setUndecorated(true);

        main.setBackground(new java.awt.Color(255, 204, 204));
        main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 5, true));
        main.setMaximumSize(new java.awt.Dimension(750, 530));
        main.setMinimumSize(new java.awt.Dimension(750, 530));
        main.setPreferredSize(new java.awt.Dimension(750, 530));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 5, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 10, 320));

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 10, 320));

        jPanel5.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 410, 10));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 410, 10));

        one.setFont(new java.awt.Font("Georgia", 1, 120)); // NOI18N
        one.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        one.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
        });
        jPanel2.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, 100));

        three.setFont(new java.awt.Font("Georgia", 1, 120)); // NOI18N
        three.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        three.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeMouseClicked(evt);
            }
        });
        jPanel2.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 130, 100));

        two.setFont(new java.awt.Font("Georgia", 1, 120)); // NOI18N
        two.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        two.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
        });
        jPanel2.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 130, 100));

        four.setFont(new java.awt.Font("Georgia", 1, 120)); // NOI18N
        four.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        four.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourMouseClicked(evt);
            }
        });
        jPanel2.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 130, 100));

        seven.setFont(new java.awt.Font("Georgia", 1, 120)); // NOI18N
        seven.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenMouseClicked(evt);
            }
        });
        jPanel2.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 130, 100));

        five.setFont(new java.awt.Font("Georgia", 1, 120)); // NOI18N
        five.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        five.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveMouseClicked(evt);
            }
        });
        jPanel2.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 130, 100));

        six.setFont(new java.awt.Font("Georgia", 1, 120)); // NOI18N
        six.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        six.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixMouseClicked(evt);
            }
        });
        jPanel2.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 130, 100));

        nine.setFont(new java.awt.Font("Georgia", 1, 120)); // NOI18N
        nine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineMouseClicked(evt);
            }
        });
        jPanel2.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 130, 100));

        eight.setFont(new java.awt.Font("Georgia", 1, 120)); // NOI18N
        eight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightMouseClicked(evt);
            }
        });
        jPanel2.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 130, 100));

        main.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 550, 370));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PlayerO");
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 120, 30));

        jPanel8.setBackground(new java.awt.Color(0, 0, 102));

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/x.png"))); // NOI18N
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(695, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        main.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        exitgame.setBackground(new java.awt.Color(51, 51, 51));
        exitgame.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        exitgame.setForeground(new java.awt.Color(255, 204, 204));
        exitgame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/exit1.png"))); // NOI18N
        exitgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitgameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitgameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitgameMouseExited(evt);
            }
        });
        main.add(exitgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 120, 50));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Score");
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 120, 40));

        playerx.setBackground(new java.awt.Color(51, 51, 51));
        playerx.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        playerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerx.setText("0");
        playerx.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        main.add(playerx, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 120, 70));

        playero.setBackground(new java.awt.Color(51, 51, 51));
        playero.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        playero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playero.setText("0");
        playero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        main.add(playero, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 120, 70));

        reset.setBackground(new java.awt.Color(51, 51, 51));
        reset.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 204, 204));
        reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/reset1.png"))); // NOI18N
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetMouseExited(evt);
            }
        });
        main.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 120, 60));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PlayerX");
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 120, 30));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 710, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
         int resp=JOptionPane.showConfirmDialog(this,"Are You Sure To Exit", "select option", JOptionPane.YES_NO_CANCEL_OPTION);              
        if(resp==JOptionPane.YES_OPTION)
        {
            System.exit(1);
        }    
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
       exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/x2.png"))); // NOI18N
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,255,255), 2));        
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
      exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/x.png"))); // NOI18N
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
    }//GEN-LAST:event_exitMouseExited

    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
      one.setText(startgame);
      
      if(startgame.equalsIgnoreCase("x"))
      {
         checker = false;
      }
      else
      {
         checker = true;
      }
       choose();
       wingame();
    }//GEN-LAST:event_oneMouseClicked

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
    two.setText(startgame);
      
      if(startgame.equalsIgnoreCase("x"))
      {
         checker = false;
      }
      else
      {
         checker = true;
      }
       choose();
       wingame();
       
    }//GEN-LAST:event_twoMouseClicked

    private void threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseClicked
       three.setText(startgame);
      
      if(startgame.equalsIgnoreCase("x"))
      {
         checker = false;
      }
      else
      {
         checker = true;
      }
       choose();
       wingame();
    }//GEN-LAST:event_threeMouseClicked

    private void fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseClicked
       four.setText(startgame);
      
      if(startgame.equalsIgnoreCase("x"))
      {
         checker = false;
      }
      else
      {
         checker = true;
      }
       choose();
       wingame();
    }//GEN-LAST:event_fourMouseClicked

    private void fiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseClicked
        five.setText(startgame);
      
      if(startgame.equalsIgnoreCase("x"))
      {
         checker = false;
      }
      else
      {
         checker = true;
      }
       choose();
       wingame();
    }//GEN-LAST:event_fiveMouseClicked

    private void sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseClicked
      six.setText(startgame);
      
      if(startgame.equalsIgnoreCase("x"))
      {
         checker = false;
      }
      else
      {
         checker = true;
      }
       choose();
       wingame();
    }//GEN-LAST:event_sixMouseClicked

    private void sevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseClicked
         seven.setText(startgame);
      
      if(startgame.equalsIgnoreCase("x"))
      {
         checker = false;
      }
      else
      {
         checker = true;
      }
       choose();
       wingame();
    }//GEN-LAST:event_sevenMouseClicked

    private void eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseClicked
         eight.setText(startgame);
      
      if(startgame.equalsIgnoreCase("x"))
      {
         checker = false;
      }
      else
      {
         checker = true;
      }
       choose();
       wingame();
    }//GEN-LAST:event_eightMouseClicked

    private void nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseClicked
        nine.setText(startgame);
      
      if(startgame.equalsIgnoreCase("x"))
      {
         checker = false;
      }
      else
      {
         checker = true;
      }
       choose();
       wingame();
    }//GEN-LAST:event_nineMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
       one.setEnabled(true);
       two.setEnabled(true);
       three.setEnabled(true);
       four.setEnabled(true);
       five.setEnabled(true);
      six.setEnabled(true);
       seven.setEnabled(true);
       eight.setEnabled(true);
       nine.setEnabled(true);
       
       
       
       
       one.setText("");
       two.setText("");
       three.setText("");
       four.setText("");
       five.setText("");
       six.setText("");
       seven.setText("");
       eight.setText("");
       nine.setText("");
       
       
       one.setForeground(new java.awt.Color(0, 0, 0));
       two.setForeground(new java.awt.Color(0, 0, 0));
       three.setForeground(new java.awt.Color(0, 0, 0));
       four.setForeground(new java.awt.Color(0, 0, 0));
       five.setForeground(new java.awt.Color(0, 0, 0));
       six.setForeground(new java.awt.Color(0, 0, 0));
       seven.setForeground(new java.awt.Color(0, 0, 0));
       eight.setForeground(new java.awt.Color(0, 0, 0));
       nine.setForeground(new java.awt.Color(0, 0, 0));
       
       
    }//GEN-LAST:event_resetMouseClicked

    private void exitgameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitgameMouseClicked
        int resp=JOptionPane.showConfirmDialog(this,"Are You Sure To Exit the Game", "select option", JOptionPane.YES_NO_CANCEL_OPTION);              
        if(resp==JOptionPane.YES_OPTION)
        {
            System.exit(1);
        }    
    }//GEN-LAST:event_exitgameMouseClicked

    private void resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseEntered
       reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/reset2.png")));
    }//GEN-LAST:event_resetMouseEntered

    private void resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseExited
       reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/reset1.png")));
    }//GEN-LAST:event_resetMouseExited

    private void exitgameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitgameMouseEntered
        exitgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/exit2.png")));
    }//GEN-LAST:event_exitgameMouseEntered

    private void exitgameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitgameMouseExited
      exitgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/exit1.png")));
    }//GEN-LAST:event_exitgameMouseExited

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
            java.util.logging.Logger.getLogger(main_pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_pannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_pannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eight;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exitgame;
    private javax.swing.JLabel five;
    private javax.swing.JLabel four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel main;
    private javax.swing.JLabel nine;
    private javax.swing.JLabel one;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel reset;
    private javax.swing.JLabel seven;
    private javax.swing.JLabel six;
    private javax.swing.JLabel three;
    private javax.swing.JLabel two;
    // End of variables declaration//GEN-END:variables
}
