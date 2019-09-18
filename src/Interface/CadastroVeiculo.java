/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;
import trabalhopraticoi.Caminhao;
import trabalhopraticoi.Carro;
import trabalhopraticoi.Onibus;
import trabalhopraticoi.Veiculo;
import trabalhopraticoi.Veiculos;

/**
 *
 * @author mathe
 */
public class CadastroVeiculo extends javax.swing.JInternalFrame {
    protected static Veiculos veiculos = new Veiculos();
    /**
     * Creates new form CadastroVeiculo
     */
    public CadastroVeiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        txt_ano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_valorDiaria = new javax.swing.JTextField();
        check_carro = new javax.swing.JCheckBox();
        check_caminhao = new javax.swing.JCheckBox();
        check_onibus = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txt_numPort = new javax.swing.JTextField();
        txt_numPass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_medKmLt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_categoria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        check_ar = new javax.swing.JCheckBox();
        check_wifi = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        txt_numEixos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_cargMax = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_salva = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(396, 346));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Placa:");

        txt_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_placaActionPerformed(evt);
            }
        });

        txt_ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_anoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ano:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Valor diária:");

        txt_valorDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorDiariaActionPerformed(evt);
            }
        });

        check_carro.setText("Carro");
        check_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_carroActionPerformed(evt);
            }
        });

        check_caminhao.setText("Caminhão");
        check_caminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_caminhaoActionPerformed(evt);
            }
        });

        check_onibus.setText("Onibus");
        check_onibus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_onibusActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nº Portas:");

        txt_numPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numPortActionPerformed(evt);
            }
        });

        txt_numPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numPassActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Nº Passageiros:");

        txt_medKmLt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medKmLtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Média Km/L:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Categoria:");

        txt_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_categoriaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Arcondicionado:");

        check_ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_arActionPerformed(evt);
            }
        });

        check_wifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_wifiActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Wifi:");

        txt_numEixos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numEixosActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Carga Max.:");

        txt_cargMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cargMaxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Nº de Eixos:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_ano))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_valorDiaria)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txt_numEixos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cargMax, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_numPort)
                                    .addComponent(txt_numPass)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txt_medKmLt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(144, 144, 144))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(check_wifi))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(check_ar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(check_carro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_onibus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check_caminhao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_onibus)
                    .addComponent(check_carro)
                    .addComponent(check_caminhao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_valorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_numPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_numPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_medKmLt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(check_ar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check_wifi)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(txt_cargMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_numEixos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15))))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("NOVO VEICULO");

        btn_salva.setText("Salvar");
        btn_salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btn_salva, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btn_salva)
                .addGap(37, 37, 37))
        );

        setSize(new java.awt.Dimension(636, 413));
    }// </editor-fold>//GEN-END:initComponents
    
    private Veiculo salvaVeiculo(){
        int ano = Integer.parseInt(txt_ano.getText());
        float valorDiaria = Float.parseFloat(txt_valorDiaria.getText());
        String placa = txt_placa.getText();
        if(check_caminhao.isSelected()){
            int numEixos = Integer.parseInt(txt_numEixos.getText());
            float cargMax = Float.parseFloat(txt_cargMax.getText());
            Veiculo novoVeiculo = new Caminhao(placa, ano, valorDiaria, numEixos, cargMax);
            return novoVeiculo;
        }else if(check_carro.isSelected()){
            int     numPass = Integer.parseInt(txt_numPass.getText());
            int numPort = Integer.parseInt(txt_numPort.getText());
            float medKmLt = Float.parseFloat(txt_medKmLt.getText());
            Veiculo novoVeiculo = new Carro(placa, ano, valorDiaria, numPass, numPort, medKmLt, check_ar.isSelected());
            return novoVeiculo;
        }else if(check_onibus.isSelected()){
            int numPass = Integer.parseInt(txt_numPass.getText());
            Veiculo novoVeiculo = new Onibus(placa, ano, valorDiaria, numPass, txt_categoria.getText(), check_wifi.isSelected(), check_ar.isSelected());
            return novoVeiculo;
        }
        
        return null;
    }
    
    protected void opsCaminhao(boolean valor){
        if (valor){
            txt_cargMax.setEnabled(true);
            txt_numEixos.setEnabled(true);
            check_caminhao.setEnabled(true);
        } else{
            txt_cargMax.setEnabled(false);
            txt_numEixos.setEnabled(false);
            check_caminhao.setEnabled(false);
        }
    }
    
    protected void opsOnibus(boolean valor){
        if(valor){
            check_onibus.setEnabled(true);
            txt_numPass.setEnabled(true);
            check_ar.setEnabled(true);
            check_wifi.setEnabled(true);
            txt_categoria.setEnabled(true);
        }else{
            check_onibus.setEnabled(false);
            txt_numPass.setEnabled(false);
            check_ar.setEnabled(false);
            check_wifi.setEnabled(false);
            txt_categoria.setEnabled(false);
        }
    }
    
    protected void opsCarro(boolean valor){
        if(valor){
            txt_numPass.setEnabled(true);
            check_carro.setEnabled(true);
            txt_numPort.setEnabled(true);
            check_ar.setEnabled(true);
            txt_medKmLt.setEnabled(true);
        }else{
            txt_numPass.setEnabled(false);
            check_carro.setEnabled(false);
            txt_numPort.setEnabled(false);
            check_ar.setEnabled(false);
            txt_medKmLt.setEnabled(false);
        }
    }
    
    private void resetaValores(){
        txt_placa.setText("");
        txt_ano.setText("");
        txt_valorDiaria.setText("");
        txt_cargMax.setText("");
        txt_medKmLt.setText("");
        txt_numEixos.setText("");
        txt_numPass.setText("");
        txt_numPort.setText("");
        txt_categoria.setText("");
        check_ar.setSelected(false);
        check_wifi.setSelected(false);
    }
    
    private void txt_anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_anoActionPerformed

    private void txt_valorDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorDiariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorDiariaActionPerformed

    private void check_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_carroActionPerformed
        if(check_carro.isSelected()){
            opsOnibus(false);
            opsCaminhao(false);
            check_ar.setEnabled(true);
            txt_numPass.setEnabled(true);
        }else{
            opsOnibus(true);
            opsCaminhao(true);
        }
    }//GEN-LAST:event_check_carroActionPerformed

    private void check_caminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_caminhaoActionPerformed

        if(check_caminhao.isSelected()){
            opsOnibus(false);
            opsCarro(false);
        }else{
            opsCarro(true);
            opsOnibus(true);
        }
    }//GEN-LAST:event_check_caminhaoActionPerformed

    private void check_onibusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_onibusActionPerformed
        if(check_onibus.isSelected()){
            opsCarro(false);
            opsCaminhao(false);
            check_ar.setEnabled(true);
            txt_numPass.setEnabled(true);
        }else{
            opsCarro(true);
            opsCaminhao(true);
        }
    }//GEN-LAST:event_check_onibusActionPerformed

    private void txt_numPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numPortActionPerformed

    private void txt_numPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numPassActionPerformed

    private void txt_medKmLtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medKmLtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medKmLtActionPerformed

    private void txt_placa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_placa5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_placa5ActionPerformed

    private void txt_cargMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cargMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cargMaxActionPerformed

    private void txt_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_categoriaActionPerformed

    private void check_arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_arActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_arActionPerformed

    private void check_wifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_wifiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_wifiActionPerformed

    private void txt_numEixosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numEixosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numEixosActionPerformed

    private void btn_salvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvaActionPerformed
        try {
            Veiculo novoVeiculo = salvaVeiculo();
            veiculos.add(novoVeiculo);
            
            JOptionPane.showMessageDialog(null, veiculos.getInfo(novoVeiculo.getPlaca()));
            
            resetaValores();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DIGITE AS INFORMACOES DE FORMA CORRETA");
        }
    }//GEN-LAST:event_btn_salvaActionPerformed

    private void txt_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_placaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salva;
    private javax.swing.JCheckBox check_ar;
    private javax.swing.JCheckBox check_caminhao;
    private javax.swing.JCheckBox check_carro;
    private javax.swing.JCheckBox check_onibus;
    private javax.swing.JCheckBox check_wifi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_ano;
    private javax.swing.JTextField txt_cargMax;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_medKmLt;
    private javax.swing.JTextField txt_numEixos;
    private javax.swing.JTextField txt_numPass;
    private javax.swing.JTextField txt_numPort;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_valorDiaria;
    // End of variables declaration//GEN-END:variables
}
