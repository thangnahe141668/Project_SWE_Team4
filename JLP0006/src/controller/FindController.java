/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.TokenType;
import view.ViewMain;

/**
 *
 * @author BTD
 */
public class FindController {

    public FindController(ViewMain view) {

        //create dialog find
        view.getItFind().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("" + view.getTxtArea().getCaretPosition());
//                int indexFirst = view.getTxtArea().getSelectionStart();
//                int indexLast = view.getTxtArea().getSelectionEnd();
//                System.out.println("indexF: " + indexFirst);
//                System.out.println("indexT: " + indexLast);
                view.getDialogFind().setVisible(true);
                view.getDialogFind().setResizable(false);
                view.getDialogFind().setLocationRelativeTo(null);
                view.getDialogFind().pack();
            }
        });

        //exit Dialog find
        view.getBtnCancel().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDialogFind().setVisible(false);
            }
        });

        //button find next 
        view.getBtnFindNext().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findText(view);
            }
        });

    }

    public void findText(ViewMain view) {
        String txtArea = view.getTxtArea().getText();
        String txtFind = view.getTxtFind().getText();
        //get index pointer when start show Dialog font
        int indexControl = view.getTxtArea().getCaretPosition();
        int indexFirst = view.getTxtArea().getSelectionStart();
        int indexLast = view.getTxtArea().getSelectionEnd();
        
        //choose rdDown
        if (view.getRdDown().isSelected()) {
            if (!view.getCbMatchcase().isSelected()) {
                txtArea = txtArea.toLowerCase();
                txtFind = txtFind.toLowerCase();
                indexControl = txtArea.indexOf(txtFind, indexControl);
            } else {
                indexControl = txtArea.indexOf(txtFind, indexControl);
            }
            //if user choose wrap
            if (view.getCbWraparound().isSelected() && indexControl == -1) {
                if (!view.getCbMatchcase().isSelected()) {
                    //set textArea and textFind to lowerCase
                    txtArea = txtArea.toLowerCase();
                    txtFind = txtFind.toLowerCase();
                    indexControl = txtArea.indexOf(txtFind, indexControl);
                } else {
                    indexControl = txtArea.indexOf(txtFind, indexControl);
                }
            }
        }//rd Up
        else {
            if (indexFirst != indexLast) {
                indexControl = indexLast - txtFind.length();
            }
            indexControl = indexControl - 1;
            if (!view.getCbMatchcase().isSelected()) {
                //set textArea and textFind to lowerCase
                txtArea = txtArea.toLowerCase();
                txtFind = txtFind.toLowerCase();
                indexControl = txtArea.lastIndexOf(txtFind, indexControl);
            } else {
                indexControl = txtArea.lastIndexOf(txtFind, indexControl);
            }
            if (view.getCbWraparound().isSelected() && indexControl == -1) {
                if (!view.getCbMatchcase().isSelected()) {
                    txtArea = txtArea.toLowerCase();
                    txtFind = txtFind.toLowerCase();
                    indexControl = txtArea.lastIndexOf(txtFind);
                } else {
                    indexControl = txtArea.lastIndexOf(txtFind);
                }
            }
        }
        if (indexControl != -1) {
            //set index last
            indexLast = indexControl + txtFind.length();
            view.getTxtArea().setSelectionStart(indexControl);
            view.getTxtArea().setSelectionEnd(indexLast);
        } else {
            JOptionPane.showMessageDialog(null, "Cannot find" + "\"" + txtFind + "\"", "Notepad", JOptionPane.OK_OPTION);
        }
    }
}
