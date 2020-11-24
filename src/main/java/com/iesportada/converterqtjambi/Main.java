/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesportada.converterqtjambi;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QDialog;
import com.trolltech.qt.gui.QMainWindow;

/**
 *
 * @author s0ck3
 */
public class Main {
    public static void main(String[] args) {
        
        QApplication.initialize(args);
        QMainWindow mainwindow = new QMainWindow();
        MainWindow mw = new MainWindow();
        mw.setupUi(mainwindow);
        mainwindow.show();
        QApplication.execStatic();

        
    }
    
}
