/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author mathe
 */
public class Menu extends javax.swing.JFrame {
    
    /**
     * Creates new form Menu
     */
    public Menu() {
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

        JArea = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuNovaLocacao = new javax.swing.JMenuItem();
        menuBuscaLocacao = new javax.swing.JMenuItem();
        menuListLocacoes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_novoCliente = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuListClientes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuNovoVeiculo = new javax.swing.JMenuItem();
        menuBuscarVeiculo = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(720, 480));

        JArea.setMaximumSize(new java.awt.Dimension(1920, 1080));
        JArea.setMinimumSize(new java.awt.Dimension(720, 480));
        JArea.setPreferredSize(new java.awt.Dimension(1920, 1080));
        JArea.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        jLabel1.setText("Minha Locadora");

        JArea.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout JAreaLayout = new javax.swing.GroupLayout(JArea);
        JArea.setLayout(JAreaLayout);
        JAreaLayout.setHorizontalGroup(
            JAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JAreaLayout.createSequentialGroup()
                .addContainerGap(418, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(400, 400, 400))
        );
        JAreaLayout.setVerticalGroup(
            JAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JAreaLayout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
        );

        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(355, 35));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_document.png"))); // NOI18N
        jMenu2.setText("Gerenciar Locações");

        menuNovaLocacao.setText("Nova Locação");
        menuNovaLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovaLocacaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuNovaLocacao);

        menuBuscaLocacao.setText("Buscar Locação");
        menuBuscaLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaLocacaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuBuscaLocacao);

        menuListLocacoes.setText("Lista de Locações");
        menuListLocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListLocacoesActionPerformed(evt);
            }
        });
        jMenu2.add(menuListLocacoes);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_user.png"))); // NOI18N
        jMenu3.setText("Gerenciar Clientes");

        menu_novoCliente.setText("Novo Cliente");
        menu_novoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_novoClienteActionPerformed(evt);
            }
        });
        jMenu3.add(menu_novoCliente);

        jMenuItem4.setText("Buscar Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        menuListClientes.setText("Lista de Clientes");
        menuListClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListClientesActionPerformed(evt);
            }
        });
        jMenu3.add(menuListClientes);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconcar.png"))); // NOI18N
        jMenu4.setText("Gerenciar Veículos");
        jMenu4.setToolTipText("");

        menuNovoVeiculo.setText("Novo Veículo");
        menuNovoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovoVeiculoActionPerformed(evt);
            }
        });
        jMenu4.add(menuNovoVeiculo);

        menuBuscarVeiculo.setText("Buscar Veículo");
        menuBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarVeiculoActionPerformed(evt);
            }
        });
        jMenu4.add(menuBuscarVeiculo);

        jMenuItem9.setText("Lista de Veículos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JArea, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JArea, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1094, 757));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuNovaLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovaLocacaoActionPerformed
        CadastroLocacao novaLocacao = new CadastroLocacao();
        JArea.add(novaLocacao);
        novaLocacao.setVisible(true);
    }//GEN-LAST:event_menuNovaLocacaoActionPerformed

    private void menuBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarVeiculoActionPerformed
        BuscarVeiculo buscarVeiculo = new BuscarVeiculo();
        JArea.add(buscarVeiculo);
        buscarVeiculo.setVisible(true);
    }//GEN-LAST:event_menuBuscarVeiculoActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ListaVeiculos listaVeiculo = new ListaVeiculos();
        JArea.add(listaVeiculo);
        listaVeiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void menu_novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_novoClienteActionPerformed
        CadastroCliente novoCliente = new CadastroCliente();
        JArea.add(novoCliente);
        novoCliente.setVisible(true);
    }//GEN-LAST:event_menu_novoClienteActionPerformed

    private void menuNovoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovoVeiculoActionPerformed
        CadastroVeiculo novoVeiculo = new CadastroVeiculo();
        JArea.add(novoVeiculo);
        novoVeiculo.setVisible(true);
    }//GEN-LAST:event_menuNovoVeiculoActionPerformed

    private void menuBuscaLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaLocacaoActionPerformed
        BuscarLocacao buscarLocacao = new BuscarLocacao();
        JArea.add(buscarLocacao);
        buscarLocacao.setVisible(true);
    }//GEN-LAST:event_menuBuscaLocacaoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        BuscarCliente novaBusca = new BuscarCliente();
        JArea.add(novaBusca);
        novaBusca.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menuListLocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListLocacoesActionPerformed
        ListLocacoes listaLocacoes = new ListLocacoes();
        JArea.add(listaLocacoes);
        listaLocacoes.setVisible(true);
    }//GEN-LAST:event_menuListLocacoesActionPerformed

    private void menuListClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListClientesActionPerformed
        ListaClientes listaClientes = new ListaClientes();
        JArea.add(listaClientes);
        listaClientes.setVisible(true);
    }//GEN-LAST:event_menuListClientesActionPerformed

    /**
     * @param args the comma|nd line arguments
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane JArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem menuBuscaLocacao;
    private javax.swing.JMenuItem menuBuscarVeiculo;
    private javax.swing.JMenuItem menuListClientes;
    private javax.swing.JMenuItem menuListLocacoes;
    private javax.swing.JMenuItem menuNovaLocacao;
    private javax.swing.JMenuItem menuNovoVeiculo;
    private javax.swing.JMenuItem menu_novoCliente;
    // End of variables declaration//GEN-END:variables
}
