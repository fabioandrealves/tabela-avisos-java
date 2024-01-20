/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avisos.ui;

import avisos.model.Aviso;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaAvisos extends AbstractTableModel {
    private List<Aviso> avisos;
    private String colunas[] = {"Codigo", "Nome do autor", "Titulo", "Texto"}; 
    public ModeloTabelaAvisos(List<Aviso> avisos) {
        this.avisos = avisos;
    }

    @Override
    public int getRowCount() {
        return avisos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aviso aviso = avisos.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return aviso.getCodigo();
            case 1:
                return aviso.getAutor();
            case 2:
                return aviso.getTitulo();
            case 3:
                return aviso.getTexto();
            default:
                return "Erro";
        }
    }
    
}
