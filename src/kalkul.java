/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vstore Computer
 */
public class kalkul extends javax.swing.JFrame {

    /**
     * Creates new form kalkul
     */
    double jumlah,bil1,bil2;
    int pilih;
    String bilangan;
    
            
    public kalkul() {
        initComponents();
        bilangan="";
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        try {
            jPanel1 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "kalkul_jPanel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel1 = new javax.swing.JLabel();
        kali = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();
        koma = new javax.swing.JButton();
        nol = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        hasil = new javax.swing.JTextField();
        persen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setText("KALKULATOR");

        kali.setBackground(new java.awt.Color(102, 255, 204));
        kali.setText("X");
        kali.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        bagi.setBackground(new java.awt.Color(102, 255, 204));
        bagi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bagi.setText("/");
        bagi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        tambah.setBackground(new java.awt.Color(102, 255, 204));
        tambah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tambah.setText("+");
        tambah.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        kurang.setBackground(new java.awt.Color(102, 255, 204));
        kurang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kurang.setText("-");
        kurang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        sembilan.setBackground(new java.awt.Color(102, 255, 204));
        sembilan.setText("9");
        sembilan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });

        delapan.setBackground(new java.awt.Color(102, 255, 204));
        delapan.setText("8");
        delapan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });

        tujuh.setBackground(new java.awt.Color(102, 255, 204));
        tujuh.setText("7");
        tujuh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });

        enam.setBackground(new java.awt.Color(102, 255, 204));
        enam.setText("6");
        enam.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });

        lima.setBackground(new java.awt.Color(102, 255, 204));
        lima.setText("5");
        lima.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });

        empat.setBackground(new java.awt.Color(102, 255, 204));
        empat.setText("4");
        empat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });

        tiga.setBackground(new java.awt.Color(102, 255, 204));
        tiga.setText("3");
        tiga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });

        dua.setBackground(new java.awt.Color(102, 255, 204));
        dua.setText("2");
        dua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });

        satu.setBackground(new java.awt.Color(102, 255, 204));
        satu.setText("1");
        satu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });

        samadengan.setBackground(new java.awt.Color(102, 255, 204));
        samadengan.setText("=");
        samadengan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });

        koma.setBackground(new java.awt.Color(102, 255, 204));
        koma.setText(",");
        koma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komaActionPerformed(evt);
            }
        });

        nol.setBackground(new java.awt.Color(102, 255, 204));
        nol.setText("0");
        nol.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(102, 255, 204));
        hapus.setText("C");
        hapus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        hasil.setEditable(false);
        hasil.setBackground(new java.awt.Color(255, 255, 255));
        hasil.setFont(new java.awt.Font("Eras Demi ITC", 1, 24)); // NOI18N
        hasil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hasil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });

        persen.setBackground(new java.awt.Color(102, 255, 204));
        persen.setText("%");
        persen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(51, 255, 255)));
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("smkittanwirulqulubkelasXII");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hasil)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(dua, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(delapan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lima, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(enam, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(koma, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(samadengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delapan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lima, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enam, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiga, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(satu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nol, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(koma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
        bil1 =Double.parseDouble(bilangan);
        hasil.setText("-");
        bilangan="";
        pilih=2;
        
         
    }//GEN-LAST:event_kurangActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        // TODO add your handling code here:
         bilangan  +="8";
        hasil.setText(bilangan);
    }//GEN-LAST:event_delapanActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        // TODO add your handling code here:
         bilangan  +="7";
        hasil.setText(bilangan);
    }//GEN-LAST:event_tujuhActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        // TODO add your handling code here:
         bilangan  +="6";
        hasil.setText(bilangan);
    }//GEN-LAST:event_enamActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        // TODO add your handling code here:
         bilangan  +="5";
        hasil.setText(bilangan);
    }//GEN-LAST:event_limaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        // TODO add your handling code here:
         bilangan  +="4";
        hasil.setText(bilangan);
    }//GEN-LAST:event_empatActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        // TODO add your handling code here:
         bilangan  +="3";
        hasil.setText(bilangan);
    }//GEN-LAST:event_tigaActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        // TODO add your handling code here:
         bilangan  +="2";
        hasil.setText(bilangan);
    }//GEN-LAST:event_duaActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
        bilangan  +="1";
        hasil.setText(bilangan);
        
    }//GEN-LAST:event_satuActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
        // TODO add your handling code here:
        switch(pilih){
        case 1 :
            bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
            jumlah = bil1 + bil2;
            bilangan = Double.toString(jumlah);
            break;
        case 2 :
           bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
            jumlah = bil1 - bil2;
            bilangan = Double.toString(jumlah);
            break; 
        case 3 :
           bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
            jumlah = bil1 / bil2;
            bilangan = Double.toString(jumlah);
            break;
        case 4 :
           bil2 = Double.parseDouble(String.valueOf(hasil.getText()));
            jumlah = bil1 * bil2;
            bilangan = Double.toString(jumlah);
            break;
        }
        hasil.setText(bilangan);
    }//GEN-LAST:event_samadenganActionPerformed

    private void komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komaActionPerformed
        // TODO add your handling code here:
            bilangan +=".";
            hasil.setText(bilangan);
    }//GEN-LAST:event_komaActionPerformed

    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        // TODO add your handling code here:
        bilangan +="0";
        hasil.setText(bilangan);
    }//GEN-LAST:event_nolActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        hasil.setText("");
        bil1=0;
        bil2=0;
        jumlah=0;
        bilangan="";
        
        
        
    }//GEN-LAST:event_hapusActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
        bil1 =Double.parseDouble(bilangan);
        hasil.setText("*");
        bilangan="";
        pilih=4;
        
    }//GEN-LAST:event_kaliActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_hasilActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        bil1 =Double.parseDouble(bilangan);
        hasil.setText("+");
        bilangan="";
        pilih=1;
        
    }//GEN-LAST:event_tambahActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        // TODO add your handling code here:
        bilangan  +="9";
        hasil.setText(bilangan);
    }//GEN-LAST:event_sembilanActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:\
         bil1 =Double.parseDouble(bilangan);
        hasil.setText("/");
        bilangan="";
        pilih=3;
        
    }//GEN-LAST:event_bagiActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
        // TODO add your handling code here:
        bil2=Double.parseDouble(bilangan);
        jumlah = bil2/100;
        bilangan=Double.toString(jumlah);
        hasil.setText(bilangan);
    }//GEN-LAST:event_persenActionPerformed

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
            java.util.logging.Logger.getLogger(kalkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi;
    private javax.swing.JButton delapan;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton kali;
    private javax.swing.JButton koma;
    private javax.swing.JButton kurang;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JButton persen;
    private javax.swing.JButton samadengan;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
