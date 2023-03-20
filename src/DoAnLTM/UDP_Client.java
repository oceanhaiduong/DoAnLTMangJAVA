package DoAnLTM;

import java.awt.Color;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UDP_Client extends javax.swing.JFrame {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public UDP_Client() {
        initComponents();
        setLocationRelativeTo(null); // set form để giữa màn hình 
        txtChuoiVanBan.setBackground(Color.GRAY);
        txtTenTapTin.setBackground(Color.GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnKetNoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        txtIPServer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtThongBao = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        btnGuiYeuCau = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenTapTin = new javax.swing.JTextField();
        btnThoat = new javax.swing.JButton();
        cmbLuaChon = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtChuoiVanBan = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKetQua = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");

        jDesktopPane1.setBackground(new java.awt.Color(102, 204, 255));

        btnKetNoi.setText("Kết Nối");
        btnKetNoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetNoiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhập Port : ");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nhập đia chỉ IP Server  :");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Socket Client - Server");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Trạng Thái :");

        txtThongBao.setBackground(new java.awt.Color(255, 255, 255));
        txtThongBao.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtThongBao.setForeground(new java.awt.Color(255, 0, 0));
        txtThongBao.setText("Chưa kết nối !");

        jDesktopPane1.setLayer(btnKetNoi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtPort, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtIPServer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtThongBao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel6)
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtThongBao)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPort, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(txtIPServer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIPServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(1, 1, 1))
                    .addComponent(btnKetNoi))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane2.setBackground(new java.awt.Color(102, 204, 255));

        btnGuiYeuCau.setText("Gửi Yêu Cầu");
        btnGuiYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiYeuCauActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nhập tên tập tin :");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nhập văn bản : ");

        txtTenTapTin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTenTapTin.setEnabled(false);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        cmbLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đọc / Viết văn bản", "Đọc / viết nhị phân" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kết Quả");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lựa Chọn");

        txtChuoiVanBan.setColumns(20);
        txtChuoiVanBan.setRows(5);
        txtChuoiVanBan.setEnabled(false);
        jScrollPane3.setViewportView(txtChuoiVanBan);

        txtKetQua.setBackground(new java.awt.Color(153, 255, 204));
        txtKetQua.setColumns(20);
        txtKetQua.setRows(5);
        jScrollPane1.setViewportView(txtKetQua);

        jDesktopPane2.setLayer(btnGuiYeuCau, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtTenTapTin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnThoat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cmbLuaChon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))
                                        .addGap(28, 28, 28)
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTenTapTin)
                                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addComponent(cmbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addComponent(jScrollPane3))
                                .addGap(18, 18, 18)
                                .addComponent(btnGuiYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenTapTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuiYeuCau)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnThoat))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean CheckThongBaoIP = false; // Kiểm tra kết nối 

    public boolean KiemTraIP(String Ip) {
        try {
            InetAddress host = Inet4Address.getByName(Ip);
            if (host != null) {
                if (!Ip.contains(".")) {
                    return false;
                }
            } else {
                return false;
            }
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Địa chỉ IP của bạn nhập sai ! \n",
                    "Thông báo", JOptionPane.ERROR_MESSAGE);
            CheckThongBaoIP = true;
            return false;
        }
        return true;
    }

    public boolean CheckValidate(String Ip, String Port) {
        if (Ip.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập địa chỉ IP kết nối Server ", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (Port.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập Port kết nối Server", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if ("localhost".equals(Ip)) {
            if (!"8888".equals(Port)) {
                JOptionPane.showMessageDialog(null, "Port " + Port + " không thể kết nối được với Server", "Thông báo", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        }

        String CheckIP127 = Ip;
        CheckIP127 = CheckIP127.substring(0, 3); // Kiểm tra IP 127
        boolean checkIP = KiemTraIP(Ip);
        if (checkIP == false || !"127".equals(CheckIP127)) {
            if (CheckThongBaoIP == false) {
                JOptionPane.showMessageDialog(null, "Địa chỉ " + Ip + " không thể kết nối với Server ", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
            return false;
        }

        if (!"8888".equals(Port)) {
            JOptionPane.showMessageDialog(null, "Port " + Port + " không thể kết nối được với Server", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean CheckGuiYeuCau(String fileName, String vanBan) {
        if (fileName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên File ", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (vanBan.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập văn bản", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean CheckConnect = false; // Kiểm tra kết nối 
    public String IpConnected = "";
    public String PortConnected = "";

    private void btnKetNoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetNoiActionPerformed
        String Ip = txtIPServer.getText();
        String port = txtPort.getText().trim();
        boolean check = CheckValidate(Ip, port);
        if (CheckConnect == false) {
            if (check == true) {
                CheckConnect = true;
                IpConnected = txtIPServer.getText();
                PortConnected = txtPort.getText();
                btnKetNoi.setText("Ngắt kết nối");
                txtThongBao.setText("Đã kết nối ...");
                txtThongBao.setForeground(Color.green);
                txtChuoiVanBan.enable(true);
                txtTenTapTin.enable(true);
                txtChuoiVanBan.setBackground(Color.white);
                txtTenTapTin.setBackground(Color.white);
                JOptionPane.showMessageDialog(null, "Kết Nối Server Thành Công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                txtIPServer.setText("");
                txtPort.setText("");
            }
        }else{
                CheckConnect = false;
                btnKetNoi.setText("Kết nối");
                txtThongBao.setText("Chưa kết nối !");
                txtThongBao.setForeground(Color.red);
                txtChuoiVanBan.enable(false);
                txtTenTapTin.enable(false);
                txtChuoiVanBan.setBackground(Color.GRAY);
                txtTenTapTin.setBackground(Color.GRAY);
                JOptionPane.showMessageDialog(null, "Đã ngắt kết nối", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnKetNoiActionPerformed

    private void btnGuiYeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiYeuCauActionPerformed
           try {
            if (CheckConnect == true) {
                 boolean check = CheckGuiYeuCau(txtTenTapTin.getText(), txtChuoiVanBan.getText());
                if (check == true) {
                    DatagramSocket client = new DatagramSocket();

                    String ChuoiVanBan = "";
                    if (cmbLuaChon.getSelectedIndex() == 0) {
                        ChuoiVanBan = ChuoiVanBan.concat("1@");
                    } else {
                        ChuoiVanBan = ChuoiVanBan.concat("2@");
                    }

                    ChuoiVanBan = ChuoiVanBan.concat(txtTenTapTin.getText() + "@" + txtChuoiVanBan.getText());

                    byte vanBan[] = new byte[1024];
                    vanBan = ChuoiVanBan.getBytes();
                    int lenght = vanBan.length;
                    InetAddress ip = null;
                    try {
                        ip = InetAddress.getByName(IpConnected);
                    } catch (UnknownHostException ex) {
                        Logger.getLogger(UDP_Client.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    int port = Integer.parseInt(PortConnected);

                    DatagramPacket guiThongTin = new DatagramPacket(vanBan, lenght, ip, port);
                    client.send(guiThongTin);

                    // Nhận về
                    byte nhanfi[] = new byte[256];
                    DatagramPacket nhansofi = new DatagramPacket(nhanfi, nhanfi.length);
                    client.receive(nhansofi);
                    String ketqua = new String(nhansofi.getData(), 0, nhansofi.getLength()).trim();
                    txtKetQua.setText(ketqua);
                    System.out.print(ketqua);
                    client.close();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Chưa kết nối", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SocketException ex) {
            Logger.getLogger(UDP_Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UDP_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuiYeuCauActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    @SuppressWarnings("Convert2Lambda")
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
            java.util.logging.Logger.getLogger(UDP_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UDP_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UDP_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UDP_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UDP_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuiYeuCau;
    private javax.swing.JButton btnKetNoi;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cmbLuaChon;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtChuoiVanBan;
    private javax.swing.JTextField txtIPServer;
    private javax.swing.JTextArea txtKetQua;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtTenTapTin;
    private javax.swing.JLabel txtThongBao;
    // End of variables declaration//GEN-END:variables
}
