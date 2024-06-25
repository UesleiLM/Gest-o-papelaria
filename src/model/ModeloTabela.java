/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel{

    public static final String[] colunas = {"ID", "Nome", "Marca", "Preço", "Estoque"};
    
    private ArrayList<Produto> produtos;

    public ModeloTabela(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = produtos.get(rowIndex);
        if(columnIndex == 0){
            return produto.getId();
        }
        else if(columnIndex == 1){
            return produto.getNome();
        }
        else if(columnIndex == 2){
            return produto.getMarca();
        }
        else if(columnIndex == 3){
            return produto.getValor();
        }
        else if(columnIndex == 4){
            return produto.getEstoque();
        }else{
            return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    
}
