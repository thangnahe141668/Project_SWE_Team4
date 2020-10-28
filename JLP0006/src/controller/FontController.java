/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.Position;
import jdk.nashorn.internal.parser.TokenType;
import view.ViewMain;

/**
 *
 * @author BTD
 */
public class FontController {

    
    public void getFont(ViewMain view) {
        //get font size style in text Area
        String font = view.getTxtArea().getFont().getFamily();
        int style = view.getTxtArea().getFont().getStyle();
        int size = view.getTxtArea().getFont().getSize();

        //set select font style size in Jlist
        view.getJtFont().setSelectedValue(font, true);
        view.getJtFontStyle().setSelectedIndex(style);
        view.getJtSize().setSelectedValue(Integer.toString(size), true);
        
        //set text font style and size
        view.getTxtFont().setText(font);
        view.getTxtFontStyle().setText(view.getJtFontStyle().getSelectedValue());
        view.getTxtSize().setText(Integer.toString(size));
        
        view.getLblSample().setFont(new Font(font, style, size));
    }

    //when user change font in Jlist
    public void changeFont(ViewMain view) {
        String choose = view.getJtFont().getSelectedValue();
        int style = view.getLblSample().getFont().getStyle();
        int size = view.getLblSample().getFont().getSize();
        view.getTxtFont().setText(choose);
        view.getLblSample().setFont(new Font(choose, style, size));
    }

    //when user change style in Jlist
    public void changeStyle(ViewMain view) {
        int style = view.getJtFontStyle().getSelectedIndex();
        String font = view.getLblSample().getFont().getFontName();
        int size = view.getLblSample().getFont().getSize();
        switch(style){
            case 0:{
                view.getTxtFontStyle().setText("Reqular");
                break;
            }
            case 1:{
                view.getTxtFontStyle().setText("Bold");
                break;
            }
            case 2:{
                view.getTxtFontStyle().setText("Italic");
                break;
            }
            case 3:{
                view.getTxtFontStyle().setText("Bold Italic");
                break;
            }
        }
        view.getLblSample().setFont(new Font(font, style, size));
    }

    //when user change size
    public void changeSize(ViewMain view) {
        view.getJtSize().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String size = view.getJtSize().getSelectedValue();
                String font  = view.getLblSample().getFont().getFontName();
                int style = view.getLblSample().getFont().getStyle();
                int sizedefault  = view.getTxtArea().getFont().getSize();
                if(size == null){
                    size = Integer.toString(sizedefault);
                }
                view.getTxtSize().setText(size);
                view.getLblSample().setFont(new Font(font, style, Integer.parseInt(size)));
            }
        });
        view.getTxtSize().addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                String font = view.getLblSample().getFont().getFontName();
                int style = view.getLblSample().getFont().getStyle();
                String size = view.getTxtSize().getText();
                if (!size.isEmpty()) {
                    view.getLblSample().setFont(new Font(font, style, Integer.parseInt(size)));
                }
            }
        });
    }
    


    public FontController(ViewMain view) {
        
        view.getItFont().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get Dialog font
                view.getDialogFont().setVisible(true);
                view.getDialogFont().setResizable(false);
                view.getDialogFont().setLocationRelativeTo(null);
                view.getDialogFont().pack();

                //get font in sytsterm
                String font[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
                view.getJtFont().setListData(font);
                //create list fontstyle
                String fontStyle[] = {"Normal", "Bold", "Italic", "Bold Italic"};
                view.getJtFontStyle().setListData(fontStyle);
                //create list size
                String sizes[] = {"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "36", "40", "72"};
                view.getJtSize().setListData(sizes);
                getFont(view);
            }
        });

        //get action when select item in Jlist Font
        view.getJtFont().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                changeFont(view);
            }
        });

        //get action when select item in Jlist FontStyle
        view.getJtFontStyle().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                changeStyle(view);
            }
        });
        //get action when select item in Jlist Size
        changeSize(view);

        //cancel Dialogfont
        view.getBtnCancelFont().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getDialogFont().setVisible(false);
            }
        });

        //btnOK set font into textArea
        view.getBtnOKFont().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String font = view.getJtFont().getSelectedValue();
                int style = view.getJtFontStyle().getSelectedIndex();
                int size = Integer.parseInt(view.getTxtSize().getText());
                view.getTxtArea().setFont(new Font(font, style, size));
                view.getDialogFont().setVisible(false);
            }
        });

    }

}
