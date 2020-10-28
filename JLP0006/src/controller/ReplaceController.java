/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.ViewMain;

/**
 *
 * @author BTD
 */
public class ReplaceController {
    
    private String txtArea;
    private String txtFindRep;
    private int indexControl;
    private int indexFirst;
    private int indexLast;
    private String txtReplace;
    private String wordReplace;
    
    public ReplaceController(ViewMain view) {
        //getDialog Replace
        view.getItReplace().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDialogReplace().setVisible(true);
                view.getDialogReplace().setResizable(false);
                view.getDialogReplace().setLocationRelativeTo(null);
                view.getDialogReplace().pack();
            }
        });

        //close Dialog Replace
        view.getBtnCancelRep().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTxtFindRep().setText("");
                view.getTxtReplace().setText("");
                view.getCbMatchCaseRep().setSelected(false);
                view.getCbWrapAroundRep().setSelected(false);
                view.getDialogReplace().setVisible(false);
            }
        });
        //find in DialogReplace
        view.getBtnFindNextRep().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findNext(view);
            }
        });

        //replce
        view.getBtnReplace().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replace(view);
            }
        });

        //replaceAll
        view.getBtnReplaceAll().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                replaceAll1(view);
            }
        });
    }
    
    public void findNext(ViewMain view) {
        txtArea = view.getTxtArea().getText();
        txtFindRep = view.getTxtFindRep().getText();
        indexControl = view.getTxtArea().getCaretPosition();
        indexFirst = view.getTxtArea().getSelectionStart();
        indexLast = view.getTxtArea().getSelectionEnd();     
        //if matchcase is selected
        if (!view.getCbMatchCaseRep().isSelected()) {
            txtArea = txtArea.toLowerCase();
            txtFindRep = txtFindRep.toLowerCase();
            indexControl = txtArea.indexOf(txtFindRep, indexControl);
        } else {
            indexControl = txtArea.indexOf(txtFindRep, indexControl);
        }
        //if cwraparound is selected and when not find at index last
        if (view.getCbWrapAroundRep().isSelected() && indexControl == -1) {
            if (!view.getCbMatchCaseRep().isSelected()) {
                txtArea = txtArea.toLowerCase();
                txtFindRep = txtFindRep.toLowerCase();
                indexControl = txtArea.indexOf(txtFindRep, indexControl);
            } else {
                indexControl = txtArea.indexOf(txtFindRep, indexControl);
            }
        }
        //if find value in textArea
        if (indexControl != -1) {
            indexLast = indexControl + txtFindRep.length();
            view.getTxtArea().setSelectionStart(indexControl);
            view.getTxtArea().setSelectionEnd(indexLast);;
        } else {
            JOptionPane.showMessageDialog(null, "Cannot " + "\"" + txtFindRep + "\"", "Notepad", JOptionPane.OK_OPTION);
        }
    }
     public void findNext1(ViewMain view) {
        txtArea = view.getTxtArea().getText();
        txtFindRep = view.getTxtFindRep().getText();
        indexControl = view.getTxtArea().getCaretPosition();
        indexFirst = view.getTxtArea().getSelectionStart();
        indexLast = view.getTxtArea().getSelectionEnd();     
        //if matchcase is selected
        if (!view.getCbMatchCaseRep().isSelected()) {
            txtArea = txtArea.toLowerCase();
            txtFindRep = txtFindRep.toLowerCase();
            indexControl = txtArea.indexOf(txtFindRep, indexControl);
        } else {
            indexControl = txtArea.indexOf(txtFindRep, indexControl);
        }
        //if cwraparound is selected and when not find at index last
        if (view.getCbWrapAroundRep().isSelected() && indexControl == -1) {
            if (!view.getCbMatchCaseRep().isSelected()) {
                txtArea = txtArea.toLowerCase();
                txtFindRep = txtFindRep.toLowerCase();
                indexControl = txtArea.indexOf(txtFindRep, indexControl);
            } else {
                indexControl = txtArea.indexOf(txtFindRep, indexControl);
            }
        }
        //if find value in textArea
        if (indexControl != -1) {
            indexLast = indexControl + txtFindRep.length();
            view.getTxtArea().setSelectionStart(indexControl);
            view.getTxtArea().setSelectionEnd(indexLast);;
        } else {
            
        }
    }
    
    public void replace(ViewMain view) {
        //if indexStar equal indexEnd
        if (view.getTxtArea().getSelectionStart() == view.getTxtArea().getSelectionEnd()) {
            findNext(view);
        }
        txtFindRep = view.getTxtFindRep().getText();
        txtArea = view.getTxtArea().getSelectedText();
        //if value Selected in textArea different null
        if (txtArea != null) {
            //if value select in text Area equal value in txtFind
            if (txtArea.equals(txtFindRep) ||txtArea.equalsIgnoreCase(txtFindRep)) {
                view.getTxtArea().replaceSelection(view.getTxtReplace().getText());
            }
        }
        findNext(view);
    }
    
    public void replaceAll1(ViewMain view) {
        txtArea = view.getTxtArea().getText();
        txtFindRep = view.getTxtFindRep().getText();
        wordReplace = view.getTxtReplace().getText();
        view.getTxtArea().setText(txtArea.replaceAll(txtFindRep, wordReplace));
    }
}
