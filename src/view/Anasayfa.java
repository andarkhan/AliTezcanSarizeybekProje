/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OgrenciYonetici;
import model.Ogrenci;

/**
 *
 * @author atsar
 */
public class Anasayfa extends javax.swing.JFrame {
    private OgrenciYonetici oy;
    
    /**
     * Creates new form Anasayfa
     */
    public Anasayfa() {
        initComponents();
        oy=new OgrenciYonetici(obs);
        oy.ac();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ekleDialog = new javax.swing.JDialog();
        ogrencinoekle = new javax.swing.JTextField();
        adsoyadekle = new javax.swing.JTextField();
        sehirekle = new javax.swing.JTextField();
        telnoekle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        eklegonderButton = new javax.swing.JButton();
        guncelleDialog = new javax.swing.JDialog();
        ogrencinoguncelle = new javax.swing.JTextField();
        adsoyadguncelle = new javax.swing.JTextField();
        sehirguncelle = new javax.swing.JTextField();
        telnoguncelle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        guncellegonderButton1 = new javax.swing.JButton();
        ogrenciidguncelle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        silDialog = new javax.swing.JDialog();
        ogrenciidsil = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        silGonderButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        adsoyadlabel = new javax.swing.JLabel();
        adsoyad = new javax.swing.JTextField();
        sehirlabel = new javax.swing.JLabel();
        sehir = new javax.swing.JTextField();
        bul = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        listele = new javax.swing.JButton();
        ekle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();

        ekleDialog.setBounds(new java.awt.Rectangle(0, 500, 400, 320));

        ogrencinoekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrencinoekleActionPerformed(evt);
            }
        });

        jLabel2.setText("Öğrenci No:");

        jLabel3.setText("Ad Soyad:");

        jLabel4.setText("Şehir:");

        jLabel5.setText("Telefon No:");

        eklegonderButton.setText("Ekle");
        eklegonderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eklegonderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ekleDialogLayout = new javax.swing.GroupLayout(ekleDialog.getContentPane());
        ekleDialog.getContentPane().setLayout(ekleDialogLayout);
        ekleDialogLayout.setHorizontalGroup(
            ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ekleDialogLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eklegonderButton)
                    .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ogrencinoekle, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(adsoyadekle)
                        .addComponent(sehirekle)
                        .addComponent(telnoekle)))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        ekleDialogLayout.setVerticalGroup(
            ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ekleDialogLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrencinoekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adsoyadekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sehirekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ekleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telnoekle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(eklegonderButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        ekleDialog.getAccessibleContext().setAccessibleParent(ekle);

        guncelleDialog.setBounds(new java.awt.Rectangle(0, 500, 400, 320));

        ogrencinoguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ogrencinoguncelleActionPerformed(evt);
            }
        });

        jLabel6.setText("Öğrenci No:");

        jLabel7.setText("Ad Soyad:");

        jLabel8.setText("Şehir:");

        jLabel9.setText("Telefon No:");

        guncellegonderButton1.setText("Güncelle");
        guncellegonderButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncellegonderButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Öğrenci ID:");

        javax.swing.GroupLayout guncelleDialogLayout = new javax.swing.GroupLayout(guncelleDialog.getContentPane());
        guncelleDialog.getContentPane().setLayout(guncelleDialogLayout);
        guncelleDialogLayout.setHorizontalGroup(
            guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guncelleDialogLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guncellegonderButton1)
                    .addComponent(ogrencinoguncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(adsoyadguncelle)
                    .addComponent(sehirguncelle)
                    .addComponent(telnoguncelle)
                    .addComponent(ogrenciidguncelle))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        guncelleDialogLayout.setVerticalGroup(
            guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guncelleDialogLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenciidguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrencinoguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adsoyadguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sehirguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guncelleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telnoguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(guncellegonderButton1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        silDialog.setSize(new java.awt.Dimension(400, 400));

        jLabel10.setText("Öğrenci ID:");

        silGonderButton.setText("Gönder");
        silGonderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silGonderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout silDialogLayout = new javax.swing.GroupLayout(silDialog.getContentPane());
        silDialog.getContentPane().setLayout(silDialogLayout);
        silDialogLayout.setHorizontalGroup(
            silDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(silDialogLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(silDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(silGonderButton)
                    .addComponent(jLabel10)
                    .addComponent(ogrenciidsil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        silDialogLayout.setVerticalGroup(
            silDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(silDialogLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(ogrenciidsil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(silGonderButton)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        adsoyadlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adsoyadlabel.setText("Ad-Soyad:");
        adsoyadlabel.setToolTipText("");

        adsoyad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adsoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adsoyadActionPerformed(evt);
            }
        });

        sehirlabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sehirlabel.setText("Şehir:");

        sehir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bul.setText("Bul");
        bul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adsoyadlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sehirlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sehir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bul, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(adsoyadlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adsoyad)
                    .addComponent(sehirlabel)
                    .addComponent(sehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bul))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        obs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(obs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        listele.setText("Listele");
        listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeleActionPerformed(evt);
            }
        });

        ekle.setText("Ekle");
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });

        sil.setText("Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        guncelle.setText("Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listele, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listele)
                    .addComponent(ekle)
                    .addComponent(sil)
                    .addComponent(guncelle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adsoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adsoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adsoyadActionPerformed

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed
        ekleDialog.show();
    }//GEN-LAST:event_ekleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        silDialog.show();
    }//GEN-LAST:event_silActionPerformed

    private void bulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulActionPerformed
        if(!adsoyad.getText().trim().equals("")){
            oy.ogrenciGetir(adsoyad.getText(), "adsoyad");
        }
        else if(!sehir.getText().trim().equals("")){
            oy.ogrenciGetir(sehir.getText(), "sehir");
        }
    }//GEN-LAST:event_bulActionPerformed

    private void listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeleActionPerformed
        Ogrenci ogrenci = new Ogrenci();
        oy.ogrenciListele(ogrenci.getOgrencino(), ogrenci.getAdsoyad(), ogrenci.getSehir(), ogrenci.getTelno());
    }//GEN-LAST:event_listeleActionPerformed

    private void eklegonderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eklegonderButtonActionPerformed
       oy.ogrenciEkle(ogrencinoekle.getText(), adsoyadekle.getText(), sehirekle.getText(), telnoekle.getText());
    }//GEN-LAST:event_eklegonderButtonActionPerformed

    private void ogrencinoekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrencinoekleActionPerformed
        
    }//GEN-LAST:event_ogrencinoekleActionPerformed

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        guncelleDialog.show();
    }//GEN-LAST:event_guncelleActionPerformed

    private void ogrencinoguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ogrencinoguncelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ogrencinoguncelleActionPerformed

    private void guncellegonderButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncellegonderButton1ActionPerformed
        oy.ogrenciGuncelle(ogrenciidguncelle.getText(),ogrencinoguncelle.getText(), adsoyadguncelle.getText(), sehirguncelle.getText(), telnoguncelle.getText());
    }//GEN-LAST:event_guncellegonderButton1ActionPerformed

    private void silGonderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silGonderButtonActionPerformed
        oy.ogrenciSil(ogrenciidsil.getText());
    }//GEN-LAST:event_silGonderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adsoyad;
    private javax.swing.JTextField adsoyadekle;
    private javax.swing.JTextField adsoyadguncelle;
    private javax.swing.JLabel adsoyadlabel;
    private javax.swing.JButton bul;
    private javax.swing.JButton ekle;
    private javax.swing.JDialog ekleDialog;
    private javax.swing.JButton eklegonderButton;
    private javax.swing.JButton guncelle;
    private javax.swing.JDialog guncelleDialog;
    private javax.swing.JButton guncellegonderButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listele;
    private javax.swing.JTable obs;
    private javax.swing.JTextField ogrenciidguncelle;
    private javax.swing.JTextField ogrenciidsil;
    private javax.swing.JTextField ogrencinoekle;
    private javax.swing.JTextField ogrencinoguncelle;
    private javax.swing.JTextField sehir;
    private javax.swing.JTextField sehirekle;
    private javax.swing.JTextField sehirguncelle;
    private javax.swing.JLabel sehirlabel;
    private javax.swing.JButton sil;
    private javax.swing.JDialog silDialog;
    private javax.swing.JButton silGonderButton;
    private javax.swing.JTextField telnoekle;
    private javax.swing.JTextField telnoguncelle;
    // End of variables declaration//GEN-END:variables
}
