/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.accessibility.AccessibleContext;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author BTD
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewMain
     */
    public ViewMain() {
        initComponents();
    }

    public JMenuItem getItRedo() {
        return itRedo;
    }

    public void setItRedo(JMenuItem itRedo) {
        this.itRedo = itRedo;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public JDialog getDialogFont() {
        return DialogFont;
    }

    public void setDialogFont(JDialog DialogFont) {
        this.DialogFont = DialogFont;
    }

    public JButton getBtnCancelFont() {
        return btnCancelFont;
    }

    public void setBtnCancelFont(JButton btnCancelFont) {
        this.btnCancelFont = btnCancelFont;
    }

    public JButton getBtnOKFont() {
        return btnOKFont;
    }

    public void setBtnOKFont(JButton btnOKFont) {
        this.btnOKFont = btnOKFont;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JList<String> getjList4() {
        return jList4;
    }

    public void setjList4(JList<String> jList4) {
        this.jList4 = jList4;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public JList<String> getJtFont() {
        return jtFont;
    }

    public void setJtFont(JList<String> jtFont) {
        this.jtFont = jtFont;
    }

    public JList<String> getJtFontStyle() {
        return jtFontStyle;
    }

    public void setJtFontStyle(JList<String> jtFontStyle) {
        this.jtFontStyle = jtFontStyle;
    }

    public JList<String> getJtSize() {
        return jtSize;
    }

    public void setJtSize(JList<String> jtSize) {
        this.jtSize = jtSize;
    }

    public JLabel getLblSample() {
        return lblSample;
    }

    public void setLblSample(JLabel lblSample) {
        this.lblSample = lblSample;
    }

    public JPanel getPnSample() {
        return pnSample;
    }

    public void setPnSample(JPanel pnSample) {
        this.pnSample = pnSample;
    }

    public JTextField getTxtFont() {
        return txtFont;
    }

    public void setTxtFont(JTextField txtFont) {
        this.txtFont = txtFont;
    }

    public JTextField getTxtFontStyle() {
        return txtFontStyle;
    }

    public void setTxtFontStyle(JTextField txtFontStyle) {
        this.txtFontStyle = txtFontStyle;
    }

    public JTextField getTxtSize() {
        return txtSize;
    }

    public void setTxtSize(JTextField txtSize) {
        this.txtSize = txtSize;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    public JDialog getDialogReplace() {
        return DialogReplace;
    }

    public void setDialogReplace(JDialog DialogReplace) {
        this.DialogReplace = DialogReplace;
    }

    public JButton getBtnCancelRep() {
        return btnCancelRep;
    }

    public void setBtnCancelRep(JButton btnCancelRep) {
        this.btnCancelRep = btnCancelRep;
    }

    public JButton getBtnFindNextRep() {
        return btnFindNextRep;
    }

    public void setBtnFindNextRep(JButton btnFindNextRep) {
        this.btnFindNextRep = btnFindNextRep;
    }

    public ButtonGroup getBtnGroup() {
        return btnGroup;
    }

    public void setBtnGroup(ButtonGroup btnGroup) {
        this.btnGroup = btnGroup;
    }

    public JButton getBtnReplace() {
        return btnReplace;
    }

    public void setBtnReplace(JButton btnReplace) {
        this.btnReplace = btnReplace;
    }

    public JButton getBtnReplaceAll() {
        return btnReplaceAll;
    }

    public void setBtnReplaceAll(JButton btnReplaceAll) {
        this.btnReplaceAll = btnReplaceAll;
    }

    public JCheckBox getCbMatchCaseRep() {
        return cbMatchCaseRep;
    }

    public void setCbMatchCaseRep(JCheckBox cbMatchCaseRep) {
        this.cbMatchCaseRep = cbMatchCaseRep;
    }

    public JCheckBox getCbWrapAroundRep() {
        return cbWrapAroundRep;
    }

    public void setCbWrapAroundRep(JCheckBox cbWrapAroundRep) {
        this.cbWrapAroundRep = cbWrapAroundRep;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JTextField getTxtFindRep() {
        return txtFindRep;
    }

    public void setTxtFindRep(JTextField txtFindRep) {
        this.txtFindRep = txtFindRep;
    }

    public JTextField getTxtReplace() {
        return txtReplace;
    }

    public void setTxtReplace(JTextField txtReplace) {
        this.txtReplace = txtReplace;
    }

    

    public JDialog getDialogFind() {
        return DialogFind;
    }

    public void setDialogFind(JDialog DialogFind) {
        this.DialogFind = DialogFind;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnFindNext() {
        return btnFindNext;
    }

    public void setBtnFindNext(JButton btnFindNext) {
        this.btnFindNext = btnFindNext;
    }

    public JCheckBox getCbMatchcase() {
        return cbMatchcase;
    }

    public void setCbMatchcase(JCheckBox cbMatchcase) {
        this.cbMatchcase = cbMatchcase;
    }

    public JCheckBox getCbWraparound() {
        return cbWraparound;
    }

    public void setCbWraparound(JCheckBox cbWraparound) {
        this.cbWraparound = cbWraparound;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JRadioButton getRdDown() {
        return rdDown;
    }

    public void setRdDown(JRadioButton rdDown) {
        this.rdDown = rdDown;
    }

    public JRadioButton getRdUp() {
        return rdUp;
    }

    public void setRdUp(JRadioButton rdUp) {
        this.rdUp = rdUp;
    }

    public JTextField getTxtFind() {
        return txtFind;
    }

    public void setTxtFind(JTextField txtFind) {
        this.txtFind = txtFind;
    }

    

    public JMenuItem getItCopy() {
        return itCopy;
    }

    public void setItCopy(JMenuItem itCopy) {
        this.itCopy = itCopy;
    }

    public JMenuItem getItCut() {
        return itCut;
    }

    public void setItCut(JMenuItem itCut) {
        this.itCut = itCut;
    }

    public JMenuItem getItDelete() {
        return itDelete;
    }

    public void setItDelete(JMenuItem itDelete) {
        this.itDelete = itDelete;
    }

    public JMenuItem getItExit() {
        return itExit;
    }

    public void setItExit(JMenuItem itExit) {
        this.itExit = itExit;
    }

    public JMenuItem getItFind() {
        return itFind;
    }

    public void setItFind(JMenuItem itFind) {
        this.itFind = itFind;
    }

    public JMenuItem getItFindNext() {
        return itFindNext;
    }

    public void setItFindNext(JMenuItem itFindNext) {
        this.itFindNext = itFindNext;
    }

    
    public JMenuItem getItFont() {
        return itFont;
    }

    public void setItFont(JMenuItem itFont) {
        this.itFont = itFont;
    }

    
    public JMenuItem getItNew() {
        return itNew;
    }

    public void setItNew(JMenuItem itNew) {
        this.itNew = itNew;
    }

    public JMenuItem getItNewWindow() {
        return itNewWindow;
    }

    public void setItNewWindow(JMenuItem itNewWindow) {
        this.itNewWindow = itNewWindow;
    }

    public JMenuItem getItOpen() {
        return itOpen;
    }

    public void setItOpen(JMenuItem itOpen) {
        this.itOpen = itOpen;
    }

    public JMenuItem getItPageSetup() {
        return itPageSetup;
    }

    public void setItPageSetup(JMenuItem itPageSetup) {
        this.itPageSetup = itPageSetup;
    }

    public JMenuItem getItPaste() {
        return itPaste;
    }

    public void setItPaste(JMenuItem itPaste) {
        this.itPaste = itPaste;
    }

    public JMenuItem getItPrint() {
        return itPrint;
    }

    public void setItPrint(JMenuItem itPrint) {
        this.itPrint = itPrint;
    }

    public JMenuItem getItReplace() {
        return itReplace;
    }

    public void setItReplace(JMenuItem itReplace) {
        this.itReplace = itReplace;
    }

    public JMenuItem getItSave() {
        return itSave;
    }

    public void setItSave(JMenuItem itSave) {
        this.itSave = itSave;
    }

    public JMenuItem getItSaveAs() {
        return itSaveAs;
    }

    public void setItSaveAs(JMenuItem itSaveAs) {
        this.itSaveAs = itSaveAs;
    }

    

    public JMenuItem getItSelectAll() {
        return itSelectAll;
    }

    public void setItSelectAll(JMenuItem itSelectAll) {
        this.itSelectAll = itSelectAll;
    }

    

    public JMenuItem getItUndo() {
        return itUndo;
    }

    public void setItUndo(JMenuItem itUndo) {
        this.itUndo = itUndo;
    }

    

    
    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JPopupMenu.Separator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JPopupMenu.Separator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JPopupMenu.Separator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JPopupMenu.Separator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JPopupMenu.Separator getjSeparator3() {
        return jSeparator3;
    }

    public void setjSeparator3(JPopupMenu.Separator jSeparator3) {
        this.jSeparator3 = jSeparator3;
    }

    public JPopupMenu.Separator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JPopupMenu.Separator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JPopupMenu.Separator getjSeparator5() {
        return jSeparator5;
    }

    public void setjSeparator5(JPopupMenu.Separator jSeparator5) {
        this.jSeparator5 = jSeparator5;
    }

    

    public JTextArea getTxtArea() {
        return txtArea;
    }

    public void setTxtArea(JTextArea txtArea) {
        this.txtArea = txtArea;
    }


    public JMenu getMenuEdit() {
        return menuEdit;
    }

    public void setMenuEdit(JMenu menuEdit) {
        this.menuEdit = menuEdit;
    }

    public JMenu getMenuFile() {
        return menuFile;
    }

    public void setMenuFile(JMenu menuFile) {
        this.menuFile = menuFile;
    }

    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogFind = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        btnFindNext = new javax.swing.JButton();
        txtFind = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rdDown = new javax.swing.JRadioButton();
        rdUp = new javax.swing.JRadioButton();
        btnCancel = new javax.swing.JButton();
        cbWraparound = new javax.swing.JCheckBox();
        cbMatchcase = new javax.swing.JCheckBox();
        btnGroup = new javax.swing.ButtonGroup();
        DialogReplace = new javax.swing.JDialog();
        cbMatchCaseRep = new javax.swing.JCheckBox();
        cbWrapAroundRep = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtFindRep = new javax.swing.JTextField();
        txtReplace = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnReplace = new javax.swing.JButton();
        btnReplaceAll = new javax.swing.JButton();
        btnCancelRep = new javax.swing.JButton();
        btnFindNextRep = new javax.swing.JButton();
        DialogFont = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        txtFont = new javax.swing.JTextField();
        txtFontStyle = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtFont = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtFontStyle = new javax.swing.JList<>();
        pnSample = new javax.swing.JPanel();
        lblSample = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtSize = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        btnCancelFont = new javax.swing.JButton();
        btnOKFont = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        itNew = new javax.swing.JMenuItem();
        itNewWindow = new javax.swing.JMenuItem();
        itOpen = new javax.swing.JMenuItem();
        itSave = new javax.swing.JMenuItem();
        itSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itPageSetup = new javax.swing.JMenuItem();
        itPrint = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        itUndo = new javax.swing.JMenuItem();
        itRedo = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itCut = new javax.swing.JMenuItem();
        itCopy = new javax.swing.JMenuItem();
        itPaste = new javax.swing.JMenuItem();
        itDelete = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itFind = new javax.swing.JMenuItem();
        itFindNext = new javax.swing.JMenuItem();
        itReplace = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        itSelectAll = new javax.swing.JMenuItem();
        itFont = new javax.swing.JMenuItem();

        DialogFind.setTitle("Find");
        DialogFind.setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Find what");

        btnFindNext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFindNext.setText("Find Next");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Direction"));
        jPanel1.setToolTipText("");

        btnGroup.add(rdDown);
        rdDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdDown.setSelected(true);
        rdDown.setText("Down");

        btnGroup.add(rdUp);
        rdUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdUp.setText("Up");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdUp)
                .addGap(18, 18, 18)
                .addComponent(rdDown, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");

        cbWraparound.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbWraparound.setText("Wrap around");

        cbMatchcase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbMatchcase.setText("Match case");

        javax.swing.GroupLayout DialogFindLayout = new javax.swing.GroupLayout(DialogFind.getContentPane());
        DialogFind.getContentPane().setLayout(DialogFindLayout);
        DialogFindLayout.setHorizontalGroup(
            DialogFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogFindLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogFindLayout.createSequentialGroup()
                        .addGroup(DialogFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DialogFindLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DialogFindLayout.createSequentialGroup()
                                .addComponent(cbMatchcase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(DialogFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFindNext, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(DialogFindLayout.createSequentialGroup()
                        .addComponent(cbWraparound)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DialogFindLayout.setVerticalGroup(
            DialogFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogFindLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFind)
                    .addGroup(DialogFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnFindNext)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancel)
                    .addGroup(DialogFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbMatchcase)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbWraparound)
                .addContainerGap())
        );

        DialogReplace.setTitle("Replace");
        DialogReplace.setResizable(false);

        cbMatchCaseRep.setText("Match case");

        cbWrapAroundRep.setText("Wrap Around ");

        jLabel2.setText("Find What:");

        jLabel3.setText("Replace With:");

        btnReplace.setText("Replace");

        btnReplaceAll.setText("Replace All");

        btnCancelRep.setText("Canner");

        btnFindNextRep.setText("Find Next");

        javax.swing.GroupLayout DialogReplaceLayout = new javax.swing.GroupLayout(DialogReplace.getContentPane());
        DialogReplace.getContentPane().setLayout(DialogReplaceLayout);
        DialogReplaceLayout.setHorizontalGroup(
            DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogReplaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMatchCaseRep)
                    .addGroup(DialogReplaceLayout.createSequentialGroup()
                        .addGroup(DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DialogReplaceLayout.createSequentialGroup()
                                .addComponent(txtFindRep, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFindNextRep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DialogReplaceLayout.createSequentialGroup()
                                .addComponent(txtReplace, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReplaceAll)
                                    .addComponent(btnReplace, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelRep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(cbWrapAroundRep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DialogReplaceLayout.setVerticalGroup(
            DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogReplaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFindRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btnFindNextRep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtReplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReplace, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(btnReplaceAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogReplaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMatchCaseRep)
                    .addComponent(btnCancelRep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbWrapAroundRep)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DialogFont.setTitle("Font");
        DialogFont.setResizable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Font:");

        txtFont.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtFontStyle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Font style:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Size:");

        jScrollPane2.setViewportView(jtFont);

        jScrollPane3.setViewportView(jtFontStyle);

        pnSample.setBorder(javax.swing.BorderFactory.createTitledBorder("Sample"));

        lblSample.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSample.setText("AaBbYyZz");

        javax.swing.GroupLayout pnSampleLayout = new javax.swing.GroupLayout(pnSample);
        pnSample.setLayout(pnSampleLayout);
        pnSampleLayout.setHorizontalGroup(
            pnSampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSample, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnSampleLayout.setVerticalGroup(
            pnSampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSample, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane4.setViewportView(jtSize);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Script:");

        jList4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Westerm", " ", " ", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList4);

        btnCancelFont.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelFont.setText("Cancel");

        btnOKFont.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOKFont.setText("OK");

        javax.swing.GroupLayout DialogFontLayout = new javax.swing.GroupLayout(DialogFont.getContentPane());
        DialogFont.getContentPane().setLayout(DialogFontLayout);
        DialogFontLayout.setHorizontalGroup(
            DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogFontLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogFontLayout.createSequentialGroup()
                        .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(txtFont)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(DialogFontLayout.createSequentialGroup()
                                .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFontStyle)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(txtSize)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                            .addComponent(pnSample, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogFontLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogFontLayout.createSequentialGroup()
                                .addComponent(btnOKFont, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelFont, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        DialogFontLayout.setVerticalGroup(
            DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogFontLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFont, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4))
                .addGap(39, 39, 39)
                .addComponent(pnSample, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DialogFontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelFont, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOKFont, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setColumns(20);
        txtArea.setLineWrap(true);
        txtArea.setRows(5);
        txtArea.setToolTipText("");
        txtArea.setWrapStyleWord(true);
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea);

        menuFile.setText("File");

        itNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        itNew.setText("New");
        menuFile.add(itNew);

        itNewWindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itNewWindow.setText("New Window");
        menuFile.add(itNewWindow);

        itOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        itOpen.setText("Open...");
        menuFile.add(itOpen);

        itSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itSave.setText("Save");
        menuFile.add(itSave);

        itSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itSaveAs.setText("Save As...");
        menuFile.add(itSaveAs);
        menuFile.add(jSeparator1);

        itPageSetup.setText("Page Setup");
        menuFile.add(itPageSetup);

        itPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        itPrint.setText("Print...");
        menuFile.add(itPrint);
        menuFile.add(jSeparator2);

        itExit.setText("Exit");
        menuFile.add(itExit);

        jMenuBar1.add(menuFile);

        menuEdit.setText("Edit");

        itUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        itUndo.setText("Undo");
        menuEdit.add(itUndo);

        itRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        itRedo.setText("Redo");
        menuEdit.add(itRedo);
        menuEdit.add(jSeparator3);

        itCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itCut.setText("Cut");
        menuEdit.add(itCut);

        itCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itCopy.setText("Copy");
        menuEdit.add(itCopy);

        itPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        itPaste.setText("Paste");
        menuEdit.add(itPaste);

        itDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        itDelete.setText("Delete");
        menuEdit.add(itDelete);
        menuEdit.add(jSeparator4);

        itFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itFind.setText("Find...");
        menuEdit.add(itFind);

        itFindNext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        itFindNext.setText("Find Next");
        menuEdit.add(itFindNext);

        itReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        itReplace.setText("Replace...");
        menuEdit.add(itReplace);
        menuEdit.add(jSeparator5);

        itSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itSelectAll.setText("Select All");
        menuEdit.add(itSelectAll);

        itFont.setText("Font...");
        menuEdit.add(itFont);

        jMenuBar1.add(menuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtAreaKeyTyped

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogFind;
    private javax.swing.JDialog DialogFont;
    private javax.swing.JDialog DialogReplace;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelFont;
    private javax.swing.JButton btnCancelRep;
    private javax.swing.JButton btnFindNext;
    private javax.swing.JButton btnFindNextRep;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnOKFont;
    private javax.swing.JButton btnReplace;
    private javax.swing.JButton btnReplaceAll;
    private javax.swing.JCheckBox cbMatchCaseRep;
    private javax.swing.JCheckBox cbMatchcase;
    private javax.swing.JCheckBox cbWrapAroundRep;
    private javax.swing.JCheckBox cbWraparound;
    private javax.swing.JMenuItem itCopy;
    private javax.swing.JMenuItem itCut;
    private javax.swing.JMenuItem itDelete;
    private javax.swing.JMenuItem itExit;
    private javax.swing.JMenuItem itFind;
    private javax.swing.JMenuItem itFindNext;
    private javax.swing.JMenuItem itFont;
    private javax.swing.JMenuItem itNew;
    private javax.swing.JMenuItem itNewWindow;
    private javax.swing.JMenuItem itOpen;
    private javax.swing.JMenuItem itPageSetup;
    private javax.swing.JMenuItem itPaste;
    private javax.swing.JMenuItem itPrint;
    private javax.swing.JMenuItem itRedo;
    private javax.swing.JMenuItem itReplace;
    private javax.swing.JMenuItem itSave;
    private javax.swing.JMenuItem itSaveAs;
    private javax.swing.JMenuItem itSelectAll;
    private javax.swing.JMenuItem itUndo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JList<String> jtFont;
    private javax.swing.JList<String> jtFontStyle;
    private javax.swing.JList<String> jtSize;
    private javax.swing.JLabel lblSample;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JPanel pnSample;
    private javax.swing.JRadioButton rdDown;
    private javax.swing.JRadioButton rdUp;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtFindRep;
    private javax.swing.JTextField txtFont;
    private javax.swing.JTextField txtFontStyle;
    private javax.swing.JTextField txtReplace;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
