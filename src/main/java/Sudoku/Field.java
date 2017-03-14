/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Sudoku;

import java.util.Arrays;

/**
 *
 * @author KingCreeperDJ
 */
public class Field {
    //-------------------------------------------------------------------------------
    //vars
    private int rowCount;
    private int columnCount;
    private int[][] fieldArray;
    
    //-------------------------------------------------------------------------------
    //editing
    
    public void fillField(Field val){
        for (int i = 0; i < val.getRowCount(); i++) {
            for (int j = 0; j < val.getColumnCount(); j++) {
                val.getFieldArray()[i][j] = 5; //random number => when 0 => in te vullen door user
            }
        }
    }
    
    public void checkRow(Field val){
        for (int i = 0; i < val.getRowCount(); i++) {
            for (int j = 0; j < val.getColumnCount(); j++) {
                
                val.getFieldArray()[i][j] = 5;
            }
        }
    }
    
    public void createField(int rows, int columns) {
        rowCount = rows;
        columnCount = columns;
        
        fieldArray = new int[getRowCount()][getColumnCount()];
        
        for (int i = 0; i < getRowCount(); i++) {
            
            for (int j = 0; j < getColumnCount(); j++) {
                fieldArray[i] = new int[getColumnCount()];
            }
        }
        
    }
    
    public void insert(int row, int column, int val, Field field){
        field.getFieldArray()[row][column] = val;
    }
    //-------------------------------------------------------------------------------
    //output
    public void printArray(Field field){
        
        for (int i = 0; i < field.getRowCount(); i++) {
            for (int j = 0; j < field.getColumnCount(); j++) {
            }
            System.out.println(Arrays.toString(field.getFieldArray()[i]));
            
        }
        
    }
    
    public int[][] getFieldArray() {
        return fieldArray;
    }

    /**
     * @return the rowCount
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * @return the columnCount
     */
    public int getColumnCount() {
        return columnCount;
    }
    
}
