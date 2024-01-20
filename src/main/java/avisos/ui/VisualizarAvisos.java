/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avisos.ui;

import avisos.infra.comparador.ComparadorPorAutor;
import avisos.infra.comparador.ComparadorPorCodigo;
import avisos.infra.interfaces.IAvisoDAO;
import avisos.infra.interfaces.IAvisoFactory;
import avisos.model.Aviso;
import java.util.Collections;
import java.util.List;
import javax.swing.table.TableModel;

public class VisualizarAvisos extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarFakeNews
     */
    public VisualizarAvisos() {
        initComponents();
        atualizarTabela();
    }

    private void atualizarTabela() {
        IAvisoDAO dao = IAvisoFactory.fabricar();
        List<Aviso> avisos = dao.recuperarTodos();
       // AvisoJDBCDAO aDAO = new AvisoJDBCDAO();
       // List<Aviso> avisos = aDAO.recuperarTodos();
        TableModel modelo = new ModeloTabelaAvisos(avisos);
        this.tbAvisos.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbRotulo = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        btOrdenarAutor = new javax.swing.JButton();
        spTabelaNoticias = new javax.swing.JScrollPane();
        tbAvisos = new javax.swing.JTable();
        brOrdenarCodigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbRotulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRotulo.setText("Visualizar Avisos");

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btOrdenarAutor.setText("Ordenar por autor");
        btOrdenarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarAutorActionPerformed(evt);
            }
        });

        tbAvisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coluna A"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTabelaNoticias.setViewportView(tbAvisos);

        brOrdenarCodigo.setText("Ordenar por código");
        brOrdenarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brOrdenarCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbRotulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(spTabelaNoticias))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 239, Short.MAX_VALUE)
                        .addComponent(btAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btOrdenarAutor)
                        .addGap(18, 18, 18)
                        .addComponent(brOrdenarCodigo)
                        .addGap(97, 97, 97)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRotulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTabelaNoticias, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btOrdenarAutor)
                    .addComponent(brOrdenarCodigo))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        this.atualizarTabela();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btOrdenarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarAutorActionPerformed
        IAvisoDAO dao = IAvisoFactory.fabricar();
        List<Aviso> avisos = dao.recuperarTodos();
        Collections.sort(avisos, new ComparadorPorAutor());
       TableModel modelo = new ModeloTabelaAvisos(avisos);
       this.tbAvisos.setModel(modelo);
        
    }//GEN-LAST:event_btOrdenarAutorActionPerformed

    private void brOrdenarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brOrdenarCodigoActionPerformed
       IAvisoDAO dao = IAvisoFactory.fabricar();
       List<Aviso> avisos = dao.recuperarTodos();
       Collections.sort(avisos, new ComparadorPorCodigo());
       TableModel modelo = new ModeloTabelaAvisos(avisos);
       this.tbAvisos.setModel(modelo);
    }//GEN-LAST:event_brOrdenarCodigoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brOrdenarCodigo;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btOrdenarAutor;
    private javax.swing.JLabel lbRotulo;
    private javax.swing.JScrollPane spTabelaNoticias;
    private javax.swing.JTable tbAvisos;
    // End of variables declaration//GEN-END:variables
}