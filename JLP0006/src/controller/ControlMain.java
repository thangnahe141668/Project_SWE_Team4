/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.javafx.tk.Toolkit;
import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;
import jdk.nashorn.internal.parser.TokenType;
import view.ViewMain;

/**
 *
 * @author BTD
 */
public class ControlMain implements DocumentListener {

    private ViewMain view = new ViewMain();
    private String nameFile = "";
    private String urlFile = "";
    private UndoManager undo = new UndoManager();
    private boolean checkSave = true;
    private boolean checkCancel = false;

    public ControlMain() {
        view.setTitle("Notepad");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        view.getItSave().setEnabled(false);
        setUndoRedo(undo);
        setEdit();
        view.getItSelectAll().setEnabled(false);
        view.getTxtArea().getDocument().addDocumentListener(this);

        //item fileNew
        view.getItNew().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = 0;
                //if checksave false 
                if (!checkSave) {
                    //Check when not open the file
                    if (urlFile.isEmpty() && nameFile.isEmpty()) {
                        if (checkNewFile(view.getItSaveAs()) == 3) {
                            return;
                        }//if checkCancel is true
                        if (checkCancel) {
                            temp = 1;
                            checkCancel = false;
                        }
                        //check when file opening
                        // check khi mo file
                    }//if check save true neu dung
                    else {
                        if (checkNewFile(view.getItSave()) == 3) {
                            return;
                        }
                        if (checkCancel) {
                            System.out.println(""+checkCancel);
                            return;
                        }
                    }
                }
                //if check cancel is false
                if (temp == 1) {
                    System.out.println(""+checkCancel);
                    view.getTxtArea().requestFocus();
                }//if check cancel is true
                else {
                    //reset
                    view.getTxtArea().setText("");
                    urlFile = "";
                    nameFile = "";  
                    //reset enabled undo and redo
                    view.getItUndo().setEnabled(false);
                    view.getItRedo().setEnabled(false);
                    undo.die();
                    view.setTitle("");
                    checkSave = true;
                }
            }
        });

        //Exit
        view.getItExit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = 0;
                //check save is true
                if (checkSave) {
                    System.exit(0);
                } else {
                    //Check when not open the file
                    //Check khi k mo duoc file
                    if (urlFile.isEmpty() && nameFile.isEmpty()) {
                        if (checksaveExit(view.getItSaveAs()) == 2) {
                            return;
                        }//if cancel is true
                        if (checkCancel) {
                            temp = 1;
                            checkCancel = false;
                        }
                    }//check file opening 
                    else {
                        if (checksaveExit(view.getItSave()) == 2) {
                            return;
                        }
                        if (checkCancel) {
                            temp = 1;
                            checkCancel = false;
                        }
                    }
                }
                //if check cancel is false
                if (temp == 1) {
                    view.getTxtArea().requestFocus();
                }//if check cancel is true
                else {
                    System.exit(0);
                }
            }
        });

        //item Open
        view.getItOpen().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = 0;
                if (!checkSave) {
                    //Check when not open the file
                    if (urlFile.isEmpty() && nameFile.isEmpty()) {
                        if (checkNewFile(view.getItSaveAs()) == 3) {
                            return;
                        }
                        if (checkCancel) {
                            temp = 1;
                            checkCancel = false;
                        }
                    }//check file opening 
                    else {
                        if (checkNewFile(view.getItSaveAs()) == 3) {
                            return;
                        }
                        if (checkCancel) {
                            temp = 1;
                            checkCancel = false;
                        }
                    }
                }
                if (temp == 1) {
                    view.getTxtArea().requestFocus();
                } else {
                    //create JFileChooser
                    JFileChooser chooser = new JFileChooser();
                    int show = chooser.showOpenDialog(view);
                    //check user open file
                    if (show == JFileChooser.APPROVE_OPTION) {
                        //read file have nameFile and urlFile
                        nameFile = chooser.getSelectedFile().getName();
                        urlFile = chooser.getCurrentDirectory().toString();
                        File file = chooser.getSelectedFile();
                        //check user not open file .txt
                        if (nameFile.lastIndexOf(".txt") == -1) {
                            JOptionPane.showMessageDialog(null, "Pls open file *.txt");
                        }//if user open file txt
                        else {
                                readFile(file);
                                view.getTxtArea().setCaretPosition(0);
                                //check save
                                view.getItSave().setEnabled(false);
                                checkSave = true;
                                //reset undo and redo
                                view.getItUndo().setEnabled(false);
                                view.getItRedo().setEnabled(false);
                                undo.die();
                                //set title
                                view.setTitle(file.getName());
                        }
                    }
                }
            }
        });

        //item saveAs
        view.getItSaveAs().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int show = chooser.showSaveDialog(view);
                if (show == JFileChooser.APPROVE_OPTION) {
                    nameFile = chooser.getSelectedFile().getName();
                    urlFile = chooser.getCurrentDirectory().toString();
                    //check user not open file .txt
                    if (nameFile.lastIndexOf(".txt") == -1) {
                        JOptionPane.showMessageDialog(null, "Pls save file *.txt");
                    }else {
                        //save file
                        File file = chooser.getSelectedFile();
                        writeFile(file);
                        //reset
                        checkSave = true;
                        view.getItSave().setEnabled(false);
                        //set tittle
                        view.setTitle(nameFile);
                        JOptionPane.showMessageDialog(null, "Save As");
                    }
                } else {
                    checkSave = false;
                    checkCancel = true;
                }
            }
        });

        //item Save
        view.getItSave().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter(urlFile + "\\" + nameFile);
                    BufferedWriter bw = new BufferedWriter(writer);
                    String data = view.getTxtArea().getText();
                    bw.write(data);
                    bw.close();
                    writer.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
                checkSave = true;
                view.getItSave().setEnabled(false);
                JOptionPane.showMessageDialog(null, "Save");
            }
        });

        //exit on close
        view.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                if (checkSave) {
                    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    //check if file is new -> save as
                    if (urlFile.isEmpty() && nameFile.isEmpty()) {
                        checksaveExit(view.getItSaveAs());
                    }//opening file -> save
                    else {
                        checksaveExit(view.getItSave());
                    }
                }
            }
        });

        //MenuEdit
        //item cut
        view.getItCut().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTxtArea().cut();
                view.getItPaste().setEnabled(true);
            }
        });

        //item copy
        view.getItCopy().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTxtArea().copy();
            }
        });

        //item paste
        view.getItPaste().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTxtArea().paste();
            }
        });

        //item select all
        view.getItSelectAll().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getTxtArea().selectAll();
            }
        });

        //add text in undo
        view.getTxtArea().getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undo.addEdit(e.getEdit());
            }
        });

        //undo
        view.getItUndo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo.undo();
            }
        });

        //redo
        view.getItRedo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo.redo();
            }
        });

        //get class find
        FindController fc = new FindController(view);
        //get class replace
        ReplaceController rc = new ReplaceController(view);
        //get class font
        FontController fontc = new FontController(view);
    }
    //set enabled edit
    public void setEdit(){
        view.getItCopy().setEnabled(false);
        view.getItCut().setEnabled(false);
        view.getItFind().setEnabled(false);
        view.getItReplace().setEnabled(false);
        
        //check user can find, replace
        view.getTxtArea().addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                String text = view.getTxtArea().getText();
                if (!text.isEmpty()) {
                    view.getItFind().setEnabled(true);
                    view.getItReplace().setEnabled(true);
                }
                //if user select text can copy and cut
                if (view.getTxtArea().getSelectedText() != null) {
                    view.getItCut().setEnabled(true);
                    view.getItCopy().setEnabled(true);
                }else{
                    view.getItCut().setEnabled(false);
                    view.getItCopy().setEnabled(false);
                }
            }
        });
    }
    //set enabled undo redo
    public void setUndoRedo(UndoManager manager){
      //when start run can't undo redo
      view.getItUndo().setEnabled(false);
      view.getItRedo().setEnabled(false);
      view.getTxtArea().addCaretListener(new CaretListener() {
          @Override
          public void caretUpdate(CaretEvent e) {
              if (manager.canUndo()) {
                  view.getItUndo().setEnabled(true);
              }else{
                  view.getItUndo().setEnabled(false);
              }
              if (manager.canRedo()) {
                  view.getItRedo().setEnabled(true);
              }else{
                  view.getItRedo().setEnabled(false);
              }
          }
      });
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        view.getItRedo().setEnabled(false);
        if (!view.getTxtArea().getText().isEmpty()) {
            view.getItSelectAll().setEnabled(true);
            checkSave = false;
        } else {
            checkSave = true;
        }
        if (urlFile.isEmpty() && nameFile.isEmpty()) {
            view.getItSave().setEnabled(false);
        } else {
            view.getItSave().setEnabled(true);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        view.getItRedo().setEnabled(false);
        if (undo.canUndo() == false) {
            view.getItUndo().setEnabled(false);
        }
        if (view.getTxtArea().getText().isEmpty()) {
            view.getItCut().setEnabled(false);
            view.getItCopy().setEnabled(false);
            view.getItFind().setEnabled(false);
            view.getItReplace().setEnabled(false);
        }
        checkSave = false;
        if (urlFile.isEmpty() && nameFile.isEmpty()) {
            view.getItSave().setEnabled(false);
        } else {
            view.getItSave().setEnabled(true);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void readFile(File file) {
        try {
            view.getTxtArea().setText("");
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                view.getTxtArea().append(line);
            }
            br.close();
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pls open file *.txt");
        }
    }

    public void writeFile(File file) {
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            String data = view.getTxtArea().getText();
            bw.write(data);
            bw.close();
            writer.close();
            readFile(file);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pls save file *.txt");
        }
    }

    public int checkNewFile(JMenuItem item) {
        int click = JOptionPane.showConfirmDialog(null, "Do you want to save file?", "Notepad", JOptionPane.YES_NO_CANCEL_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            item.doClick();
            click = 1;
        } else if (click == JOptionPane.NO_OPTION) {
            view.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            click = 2;
        } else {
            view.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            click = 3;
        }
        return click;
    }

    public int checksaveExit(JMenuItem item) {
        int click = JOptionPane.showConfirmDialog(null, "Do you want to save file?", "Notepad", JOptionPane.YES_NO_CANCEL_OPTION);
        if (click == JOptionPane.YES_OPTION) {
            item.doClick();
            click = 1;
        } else if (click == JOptionPane.NO_OPTION) {
            view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            System.exit(0);
        } else {
            view.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            click = 2;
        }
        return click;
    }
}
