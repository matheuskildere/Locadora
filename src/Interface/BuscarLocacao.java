/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import static Interface.CadastroLocacao.locacoes;
import static Interface.CadastroVeiculo.veiculos;
import javax.swing.JOptionPane;
import trabalhopraticoi.Locacao;
import trabalhopraticoi.Locacoes;

/**
 *
 * @author Bruno and Matheus
 */
public class BuscarLocacao extends javax.swing.JInternalFrame {
    Locacao editaLoca;
    /**
     * Cria um novo form BuscarLocacao
     */
    public BuscarLocacao() {
        initComponents();
    }

    /**
     * Este método é chamado de dentro do construtor para inicializar o formulário.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        btn_salvaLocacao = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_dataDev = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        txt_valorDia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_validar = new javax.swing.JButton();
        check_seguro = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_info = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        edit.setMinimumSize(new java.awt.Dimension(485, 247));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("EDITAR LOCAÇÃO");

        btn_salvaLocacao.setText("Salvar");
        btn_salvaLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvaLocacaoActionPerformed(evt);
            }
        });

        jLabel7.setText("Data devolução:");

        txt_dataDev.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Seguro:");

        jLabel4.setText("Placa Veículo:");

        txt_valorDia.setEditable(false);

        jLabel6.setText("Valor:");

        btn_validar.setBackground(new java.awt.Color(255, 51, 51));
        btn_validar.setText("Validar");
        btn_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit.getContentPane());
        edit.getContentPane().setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(21, 21, 21)
                        .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_validar))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_valorDia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_dataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(check_seguro))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(btn_salvaLocacao))
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_validar))
                .addGap(18, 18, 18)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_valorDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)
                        .addComponent(txt_dataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(check_seguro)
                        .addGap(9, 9, 9)))
                .addComponent(btn_salvaLocacao)
                .addGap(21, 21, 21))
        );

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Buscar Locação");

        txt_info.setEditable(false);
        txt_info.setColumns(20);
        txt_info.setRows(5);
        jScrollPane1.setViewportView(txt_info);

        jLabel2.setText("Cod. Locação");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.setEnabled(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar)
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Buscar)))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(btn_editar)
                .addGap(92, 92, 92))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buscar))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    /**
     * Este método é utilizado para editar locação.
     */
    private void editaLoca(){
        editaLoca = locacoes.get(Integer.parseInt(txt_cod.getText()));
        editaLoca.setDataDevolucao(txt_dataDev.getText());
        editaLoca.setSeguro(check_seguro.isSelected());
        editaLoca.setVeiculoLocado(veiculos.get(txt_placa.getText()));
    }
    /**
     * Este método mostra as informações iniciais de uma locação.
     */
    private void infoInicial(){
        editaLoca = locacoes.get(Integer.parseInt(txt_cod.getText()));
        txt_placa.setText(""+editaLoca.getVeiculoLocado().getPlaca());
        txt_dataDev.setText(""+editaLoca.getDataDevolucao());
        check_seguro.setSelected(editaLoca.getSeguro());
    }
    /**
     * Este btn quando acionado, mostrará as informações de uma locação pelo código digitado, 
     * caso o código não exista, o sistema informará que o código é inválido.
     * @param evt 
     */
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            txt_info.setText(locacoes.getInfo(Integer.parseInt(txt_cod.getText())));
            btn_editar.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Código Inválido");
        }
    }

    /**
     * Neste método o valor da diária será de acordo com a placa do veículo locado,
     * caso a placa esteja errada o sistema informará "Placa incorreta".
     * @param evt 
     */
    private void btn_validarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String valorDiaria =""+ veiculos.get(txt_placa.getText()).getValorDiaria();
            txt_valorDia.setText(valorDiaria);
            btn_salvaLocacao.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Placa Incorreta");
        }
    }
	/**
	* Neste método será salva as informações editadas, caso algum campo fique em branco ou estaja incorreta,
	* será informada a mensagem "Novas informações incorretas".
	* @param evt 
	*/
    private void btn_salvaLocacaoActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            editaLoca();
            JOptionPane.showMessageDialog(null, "As informaçõpes da locação foram alteradas com sucesso");
            edit.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Novas Informações incorretas");
        }
    }
	/**
	 * Este método mostra as informações da locação.
	 * @param evt 
	 */
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {
        edit.setVisible(true);
        infoInicial();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_salvaLocacao;
    private javax.swing.JButton btn_validar;
    private javax.swing.JCheckBox check_seguro;
    private javax.swing.JDialog edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JFormattedTextField txt_dataDev;
    private javax.swing.JTextArea txt_info;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_valorDia;
    // End of variables declaration//GEN-END:variables
}
