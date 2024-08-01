
package jagath.pianomain;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.AudioSystem;
import java.lang.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Jagath
 */
public class Piano extends javax.swing.JFrame{


    public Piano() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fsharp1 = new javax.swing.JButton();
        Dsharp2 = new javax.swing.JButton();
        Csharp1 = new javax.swing.JButton();
        Dsharp1 = new javax.swing.JButton();
        Gsharp1 = new javax.swing.JButton();
        Asharp1 = new javax.swing.JButton();
        Csharp2 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        FE = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        clap = new javax.swing.JButton();
        kick1 = new javax.swing.JButton();
        snare = new javax.swing.JButton();
        hihat = new javax.swing.JButton();
        sins = new javax.swing.JButton();
        KA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jagath's Piano");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fsharp1.setBackground(new java.awt.Color(0, 0, 0));
        Fsharp1.setForeground(new java.awt.Color(255, 255, 255));
        Fsharp1.setText("F#");
        Fsharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fsharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(Fsharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 60, 190));

        Dsharp2.setBackground(new java.awt.Color(0, 0, 0));
        Dsharp2.setForeground(new java.awt.Color(255, 255, 255));
        Dsharp2.setText("D#");
        Dsharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dsharp2ActionPerformed(evt);
            }
        });
        getContentPane().add(Dsharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 60, 190));

        Csharp1.setBackground(new java.awt.Color(0, 0, 0));
        Csharp1.setForeground(new java.awt.Color(255, 255, 255));
        Csharp1.setText("C#");
        Csharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Csharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(Csharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 60, 190));

        Dsharp1.setBackground(new java.awt.Color(0, 0, 0));
        Dsharp1.setForeground(new java.awt.Color(255, 255, 255));
        Dsharp1.setText("D#");
        Dsharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dsharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(Dsharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 60, 190));

        Gsharp1.setBackground(new java.awt.Color(0, 0, 0));
        Gsharp1.setForeground(new java.awt.Color(255, 255, 255));
        Gsharp1.setText("G#");
        Gsharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gsharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(Gsharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 60, 190));

        Asharp1.setBackground(new java.awt.Color(0, 0, 0));
        Asharp1.setForeground(new java.awt.Color(255, 255, 255));
        Asharp1.setText("A#");
        Asharp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asharp1ActionPerformed(evt);
            }
        });
        getContentPane().add(Asharp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 60, 190));

        Csharp2.setBackground(new java.awt.Color(0, 0, 0));
        Csharp2.setForeground(new java.awt.Color(255, 255, 255));
        Csharp2.setText("C#");
        Csharp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Csharp2ActionPerformed(evt);
            }
        });
        getContentPane().add(Csharp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 60, 190));

        A1.setBackground(new java.awt.Color(255, 255, 255));
        A1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        A1.setForeground(new java.awt.Color(0, 0, 0));
        A1.setText("A");
        A1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        getContentPane().add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 80, 330));

        C1.setBackground(new java.awt.Color(255, 255, 255));
        C1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C1.setForeground(new java.awt.Color(0, 0, 0));
        C1.setText("C");
        C1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 330));

        E1.setBackground(new java.awt.Color(255, 255, 255));
        E1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E1.setForeground(new java.awt.Color(0, 0, 0));
        E1.setText("E");
        E1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });
        getContentPane().add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 80, 330));

        F1.setBackground(new java.awt.Color(255, 255, 255));
        F1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F1.setForeground(new java.awt.Color(0, 0, 0));
        F1.setText("F");
        F1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });
        getContentPane().add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 80, 330));

        G1.setBackground(new java.awt.Color(255, 255, 255));
        G1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        G1.setForeground(new java.awt.Color(0, 0, 0));
        G1.setText("G");
        G1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });
        getContentPane().add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 80, 330));

        F2.setBackground(new java.awt.Color(255, 255, 255));
        F2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        F2.setForeground(new java.awt.Color(0, 0, 0));
        F2.setText("F");
        F2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });
        getContentPane().add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 80, 330));

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B1.setForeground(new java.awt.Color(0, 0, 0));
        B1.setText("B");
        B1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 80, 330));

        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C2.setForeground(new java.awt.Color(0, 0, 0));
        C2.setText("C");
        C2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 80, 330));

        D2.setBackground(new java.awt.Color(255, 255, 255));
        D2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D2.setForeground(new java.awt.Color(0, 0, 0));
        D2.setText("D");
        D2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        getContentPane().add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 80, 330));

        E2.setBackground(new java.awt.Color(255, 255, 255));
        E2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        E2.setForeground(new java.awt.Color(0, 0, 0));
        E2.setText("E");
        E2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });
        getContentPane().add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 80, 330));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Jagath's Piano");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        FE.setBackground(new java.awt.Color(255, 0, 0));
        FE.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        FE.setForeground(new java.awt.Color(0, 0, 0));
        FE.setText("Play Fur Elise");
        FE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEActionPerformed(evt);
            }
        });
        getContentPane().add(FE, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 210, 70));

        D1.setBackground(new java.awt.Color(255, 255, 255));
        D1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        D1.setForeground(new java.awt.Color(0, 0, 0));
        D1.setText("D");
        D1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        getContentPane().add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 80, 330));

        clap.setBackground(new java.awt.Color(51, 102, 255));
        clap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clap.setForeground(new java.awt.Color(0, 0, 0));
        clap.setText("CLAP");
        clap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clapActionPerformed(evt);
            }
        });
        getContentPane().add(clap, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, 60));

        kick1.setBackground(new java.awt.Color(51, 102, 255));
        kick1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kick1.setForeground(new java.awt.Color(0, 0, 0));
        kick1.setText("KICK");
        kick1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kick1ActionPerformed(evt);
            }
        });
        getContentPane().add(kick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 60));

        snare.setBackground(new java.awt.Color(51, 102, 255));
        snare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        snare.setForeground(new java.awt.Color(0, 0, 0));
        snare.setText("SNARE");
        snare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snareActionPerformed(evt);
            }
        });
        getContentPane().add(snare, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, 60));

        hihat.setBackground(new java.awt.Color(51, 102, 255));
        hihat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hihat.setForeground(new java.awt.Color(0, 0, 0));
        hihat.setText("HI HAT");
        hihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hihatActionPerformed(evt);
            }
        });
        getContentPane().add(hihat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 60));

        sins.setBackground(new java.awt.Color(102, 255, 102));
        sins.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        sins.setForeground(new java.awt.Color(0, 0, 0));
        sins.setText("Play SINS by Jagath");
        sins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinsActionPerformed(evt);
            }
        });
        getContentPane().add(sins, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 210, 70));

        KA.setBackground(new java.awt.Color(255, 51, 255));
        KA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        KA.setForeground(new java.awt.Color(0, 0, 0));
        KA.setText("Turn Keyboard Mode ON!");
        KA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KAActionPerformed(evt);
            }
        });
        KA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KAKeyTyped(evt);
            }
        });
        getContentPane().add(KA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Dsharp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dsharp2ActionPerformed
         try{
            File path=new File("D#2.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Dsharp2ActionPerformed

    private void Dsharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dsharp1ActionPerformed
         try{
            File path=new File("D#1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Dsharp1ActionPerformed

    private void Fsharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fsharp1ActionPerformed
         try{
            File path=new File("F#1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Fsharp1ActionPerformed

    private void Gsharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gsharp1ActionPerformed
       try{
            File path=new File("G#1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Gsharp1ActionPerformed

    private void Asharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asharp1ActionPerformed
        try{
            File path=new File("A#1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Asharp1ActionPerformed

    private void Csharp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Csharp2ActionPerformed
         try{
            File path=new File("C#2.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Csharp2ActionPerformed

    private void Csharp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Csharp1ActionPerformed
       try{
            File path=new File("C#1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Csharp1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        try{
            File path=new File("C1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        try{
            File path=new File("E1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_E1ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        try{
            File path=new File("F1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_F1ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        try{
            File path=new File("G1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_G1ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
         try{
            File path=new File("A1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        try{
            File path=new File("B1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
         try{
            File path=new File("C2.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
         try{
            File path=new File("D2.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_D2ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
         try{
            File path=new File("E2.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_E2ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        try{
            File path=new File("F2.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_F2ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
          try{
            File path=new File("D1.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_D1ActionPerformed

    private void FEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEActionPerformed
          try{
            File path=new File("FE.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FEActionPerformed

    private void clapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clapActionPerformed
        try{
            File path=new File("CLAP.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clapActionPerformed

    private void kick1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kick1ActionPerformed
        try{
            File path=new File("KICK.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kick1ActionPerformed

    private void snareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snareActionPerformed
        try{
            File path=new File("SNARE.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_snareActionPerformed

    private void hihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hihatActionPerformed
        try{
            File path=new File("HAT.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hihatActionPerformed

    private void sinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinsActionPerformed
       try{
            File path=new File("sins.wav");
            AudioInputStream audio = AudioSystem.getAudioInputStream(path);
            Clip player= AudioSystem.getClip();
            player.open(audio);
            player.setFramePosition(0);
            player.start();  
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sinsActionPerformed

    private void KAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KAActionPerformed
        try{
                                File path=new File("ting.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
    }//GEN-LAST:event_KAActionPerformed

    private void KAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KAKeyTyped
         switch(evt.getKeyChar())       
        {
                case 'z': try{
                                File path=new File("C1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                case 'x': try{
                                File path=new File("D1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case 'c': try{
                                File path=new File("E1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case 'v': try{
                                File path=new File("F1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case 'b': try{
                                File path=new File("G1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case 'n': try{
                                File path=new File("A1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                case 'm': try{
                                File path=new File("B1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                case ',': try{
                                File path=new File("C2.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                case '.': try{
                                File path=new File("D2.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                case '/': try{
                                File path=new File("E2.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                            break;
                case 's': try{
                                File path=new File("C#1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                case 'd': try{
                                File path=new File("D#1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case 'g': try{
                                File path=new File("F#1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                case 'h': try{
                                File path=new File("G#1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                case 'j': try{
                                File path=new File("A#1.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case 'l': try{
                                File path=new File("C#2.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                case ';': try{
                                File path=new File("D#2.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case '\'': try{
                                File path=new File("F2.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case '3': try{
                                File path=new File("KICK.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case '4': try{
                                File path=new File("SNARE.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case 'e': try{
                                File path=new File("HAT.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
                case 'r': try{
                                File path=new File("CLAP.wav");
                                AudioInputStream audio = AudioSystem.getAudioInputStream(path);
                                Clip player= AudioSystem.getClip();
                                player.open(audio);
                                player.setFramePosition(0);
                                player.start();  
                            } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
                                    Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                            break;
        }
    }//GEN-LAST:event_KAKeyTyped

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piano().setVisible(true);          }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton A1;
    javax.swing.JButton Asharp1;
    javax.swing.JButton B1;
    javax.swing.JButton C1;
    javax.swing.JButton C2;
    javax.swing.JButton Csharp1;
    javax.swing.JButton Csharp2;
    javax.swing.JButton D1;
    javax.swing.JButton D2;
    javax.swing.JButton Dsharp1;
    javax.swing.JButton Dsharp2;
    javax.swing.JButton E1;
    javax.swing.JButton E2;
    javax.swing.JButton F1;
    javax.swing.JButton F2;
    javax.swing.JButton FE;
    javax.swing.JButton Fsharp1;
    javax.swing.JButton G1;
    javax.swing.JButton Gsharp1;
    javax.swing.JButton KA;
    javax.swing.JLabel Title;
    javax.swing.JButton clap;
    javax.swing.JButton hihat;
    javax.swing.JButton kick1;
    javax.swing.JButton sins;
    javax.swing.JButton snare;
    // End of variables declaration//GEN-END:variables
 
}
