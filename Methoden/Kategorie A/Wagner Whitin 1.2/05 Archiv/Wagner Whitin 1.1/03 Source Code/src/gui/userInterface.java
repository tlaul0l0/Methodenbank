/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import logic.WagWhit;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

/**
 *
 * @author marweiss, snogles
 */
public class userInterface extends javax.swing.JFrame {

    /**
     * Creates new form userInterface
     */
    public boolean perLagerkosten = false;
    public double lagerkosten[];
    private static Object[][] inputTableData;
    private static Object[][] saveTableData;//++++++++++++++
    private String speicherPfad; //++++++++++++++++
    private static int periodenbedarf[]; //++++WARUM DOUBLE?? ge�ndert in Integer
    private static JTable jTable;

    public userInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RuestkostenEF = new javax.swing.JTextField();
        PeriodenEF = new javax.swing.JTextField();
        LagerkostenEF = new javax.swing.JTextField();
        varLagerkostenCB = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        berechnung = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wagner Whitin Algorithmus - Lagerhaltungsoptimierung");
        setFocusCycleRoot(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Wagner-Whitin-Algorithmus");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMinimumSize(new java.awt.Dimension(38, 14));
        jLabel2.setOpaque(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Anzahl der Perioden :");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Bestellkostensatz :");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Lagerkostensatz :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        RuestkostenEF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        RuestkostenEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuestkostenEFActionPerformed(evt);
            }
        });
        RuestkostenEF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RuestkostenEFKeyTyped(evt);
            }
        });

        PeriodenEF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        LagerkostenEF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        LagerkostenEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LagerkostenEFActionPerformed(evt);
            }
        });

        varLagerkostenCB.setText("jCheckBox1");
        varLagerkostenCB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                varLagerkostenCBStateChanged(evt);
            }
        });
        varLagerkostenCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varLagerkostenCBActionPerformed(evt);
            }
        });

        jLabel5.setText("variable Lagerkosten");

        jButton1.setText("Weiter !");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                werteEingeben(evt);
            }
        });

        jLabel6.setText("GE");

        jLabel7.setText("Perioden");

        jLabel8.setText("GE pro ME pro ZE");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Periode", "Bedarf der Periode", "Lagerkosten der Periode"
            }
        ) {

			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class<?> getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRequestFocusEnabled(false);
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);

        berechnung.setText("Berechnung !");
        berechnung.setEnabled(false);
        berechnung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berechnungActionPerformed(evt);
            }
        });
        
        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		berechnung.setEnabled(false);
        		jButton1.setEnabled(true);
                mntmSpeichern.setEnabled(false);                
                //Felder k�nnen wieder beschrieben werden
                RuestkostenEF.setEnabled(true);
                PeriodenEF.setEnabled(true);
                LagerkostenEF.setEnabled(true);
                //Inhalt wird aus Zellen gel�scht
                RuestkostenEF.setText(null);
                PeriodenEF.setText(null);
                LagerkostenEF.setText(null);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(jLabel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        								.addComponent(jLabel3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(RuestkostenEF, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        								.addComponent(PeriodenEF, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        								.addComponent(LagerkostenEF, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(varLagerkostenCB, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jLabel5))))
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addContainerGap(113, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(195)
        					.addComponent(btnReset)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(berechnung)
        					.addPreferredGap(ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(10))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(RuestkostenEF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel6))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
        				.addComponent(PeriodenEF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(LagerkostenEF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(varLagerkostenCB)
        				.addComponent(jLabel8)
        				.addComponent(jLabel5))
        			.addGap(11)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jButton1)
        					.addComponent(berechnung)
        					.addComponent(btnReset)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(40, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();//+++++      
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        mnOptionen = new JMenu("Datei");
        menuBar.add(mnOptionen);
        
        mntmLaden = new JMenuItem("Laden");
        mntmLaden.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent load) {
        		
        		//eingelesene Daten werden in Array gespeichert	
        		inputTableData = logic.SpeichernOeffnen.read(logic.SpeichernOeffnen.fileChooserDialog("laden"));
        		 RuestkostenEF.setText(""+logic.WagWhit.getRuestkosten());
        		
        		; //schreibt Bestellkosten/R�stkosten in das GUI-Feld
        		PeriodenEF.setText(""+logic.WagWhit.getAnzahlPerioden());
        		
        		//und m�ssen noch in der GUI dargestellt werden...+++++++++
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        inputTableData,
                        new String[]{
                    "Periode", "Bedarf", "Lagerkosten"
                }) {
					private static final long serialVersionUID = 1L;
					
						boolean[] canEdit = new boolean[]{
                            false, true, false
                        }; //bearbeitbarkeit der Spalten
						
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                            return canEdit[columnIndex];
                        }
                    });//+++++
                
                jTable1.getColumnModel().getColumn(0).setResizable(false);
                jTable1.getColumnModel().getColumn(1).setResizable(false);
                jTable1.getColumnModel().getColumn(2).setResizable(false);
                
                //Aktivieren bzw. ausgrauen von Buttons Men�punkten
                berechnung.setEnabled(true);
                mntmSpeichern.setEnabled(true);
                jButton1.setEnabled(false); //+++++
                
                //Editierbarkeit der Anfangsfelder wird beim Laden eines Modells deaktiviert, da die Werte eingelesen werden und nicht von Hand reingeschrieben                
                //und ausgegraut um es �ber die GUI zu veranschaulichen.
                RuestkostenEF.setEnabled(false);
                PeriodenEF.setEnabled(false);
                LagerkostenEF.setEnabled(false);
                
        	}
        });
        mnOptionen.add(mntmLaden);
  //++++++++++++++++++++++++++++++++++++++++++++      
        mntmSpeichern = new JMenuItem("Speichern");
        mntmSpeichern.addActionListener(new ActionListener() {
        	/**bei klick auf "Speichern" wird alles aus der Tabelle 
        	 * die in der GUI zu sehen ist in ein Zweidimensionales 
        	 * Array geschrieben und der Speichermethode �bergeben
        	 */
        	public void actionPerformed(ActionEvent save) {
 		        		
                periodenbedarf = new int[logic.WagWhit.getAnzahlPerioden()];
                jTable1.getDefaultEditor(Double.class).stopCellEditing();
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    try {
                        periodenbedarf[i] = Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 1)));
                        lagerkosten[i] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, 2)));
                      saveTableData = new Object[logic.WagWhit.getAnzahlPerioden()][3];
                        
                                        for (int j = 0; j < logic.WagWhit.getAnzahlPerioden(); j++) {
                                        	saveTableData[j][0] = (j + 1);
                                        	saveTableData[j][1] = periodenbedarf[j];
                                            saveTableData[j][2] = lagerkosten[j];
                                        }
                    } catch (Exception e) {
                        //schreibe "0" Statt leere Menge
                    }
                }
                
//hier wird die Methode f�r die Speicherpfad-Wahl aufgerufen und danach die Methode zum schreiben in eine Datei
              speicherPfad= logic.SpeichernOeffnen.fileChooserDialog("speichern"); 
              logic.SpeichernOeffnen.save(saveTableData, RuestkostenEF.getText(),PeriodenEF.getText(),speicherPfad);
        	}
        });
        

        mntmSpeichern.setEnabled(false);
        mnOptionen.add(mntmSpeichern);
        
        mnInfo = new JMenu("Info");
        menuBar.add(mnInfo);
              
        mntmKurzinfo = new JMenuItem("Kurzinfo");
        mnInfo.add(mntmKurzinfo);
        
        mntmKurzinfo.addActionListener(new ActionListener() {//++++ �ffnet bei Klick neues Fenster mit Kurzinfo �ber den verwendeten Algorithmus/Kurzbeschreibung des Programmes
        	public void actionPerformed(ActionEvent arg1) {
        		gui.Kurzinfo.main(null);	 
        	}	
        });
//++++++++++++++++++++++++        
    }

    private void RuestkostenEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuestkostenEFActionPerformed
    }//GEN-LAST:event_RuestkostenEFActionPerformed

    private void varLagerkostenCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varLagerkostenCBActionPerformed
        if (LagerkostenEF.isEnabled() == true) {
            LagerkostenEF.setEnabled(false);

            perLagerkosten = true;

            //System.out.println("variable Lagerkosten aktiviert!");
        } else {
            LagerkostenEF.setEnabled(true);
            perLagerkosten = false;
            //System.out.println("variable Lagerkosten deaktiviert!");
        }
    }//GEN-LAST:event_varLagerkostenCBActionPerformed

    private void LagerkostenEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LagerkostenEFActionPerformed
    }//GEN-LAST:event_LagerkostenEFActionPerformed

    private void varLagerkostenCBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_varLagerkostenCBStateChanged
    }//GEN-LAST:event_varLagerkostenCBStateChanged

    private void werteEingeben(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_werteEingeben
        System.out.println("Auslesen:");

        try {
            logic.WagWhit.setRuestkosten(Double.parseDouble(RuestkostenEF.getText()));
        } catch (Exception e) {
        	String text = "Bitte nur numerische Werte eingeben!\nBeispiel: 2.6 oder 5";
            JOptionPane.showMessageDialog(new JFrame(), text, "Fehlerhafte Eingabe Bestellkosten/R�stkosten",
                    JOptionPane.ERROR_MESSAGE);
        }
        try {
            logic.WagWhit.setAnzahlPerioden(Integer.parseInt(PeriodenEF.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Die Periodenanzahl muss ganzzahlig sein! ", "Fehlerhafte Eingabe Periodenanzahl",
                    JOptionPane.ERROR_MESSAGE);
        }

        System.out.println("R�stkosten gesetzt auf: \t " + logic.WagWhit.getRuestkosten());
        System.out.println("Periodenzahl gesetzt auf: \t " + logic.WagWhit.getAnzahlPerioden());


        lagerkosten = new double[logic.WagWhit.getAnzahlPerioden()];


        if (perLagerkosten != false) {
            System.out.println("Lagerkostenarray f�r variable Lagerkosten erstellt");
            lagerkosten[0] = 0;
        } else {
            try {
                lagerkosten[0] = (Double.parseDouble(LagerkostenEF.getText()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new JFrame(), "Bitte nur numerische Werte f�r Lagerkosten eingeben eingeben!\nBeispiel: 2.6 oder 5", "Fehlerhafte Eingabe Lagerkosten", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("Lagerkostenarray f�r fixe Lagerkosten (" + LagerkostenEF.getText() + ") erstellt");
        }
        for (int i = 1; i < lagerkosten.length; i++) {
        	
            lagerkosten[i] = lagerkosten[0];
        }

        inputTableData = new Object[logic.WagWhit.getAnzahlPerioden()][3];

        for (int i = 0; i < logic.WagWhit.getAnzahlPerioden(); i++) {
            inputTableData[i][0] = (i + 1);
            inputTableData[i][1] = null;
            if (perLagerkosten != false) {
                inputTableData[i][2] = null;
            } else {
                inputTableData[i][2] = lagerkosten[i];
            }
        }



        if (perLagerkosten == true){  //bei variablen Lagerkosten wird die Spalte Lagerkosten auf bearbeitbar gesetzt....
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    inputTableData,
                    new String[]{
                "Periode", "Bedarf", "Lagerkosten"
            }) {
   
				private static final long serialVersionUID = 1L;
				@SuppressWarnings("rawtypes")
				Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
                };
                boolean[] canEdit = new boolean[]{
                    false, true, true
                }; //bearbeitbarkeit der Spalten

                public Class<?> getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
        } else { //bei fixen Lagerkosten ist die Spalte Lagerkosten nicht bearbeitbar
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    inputTableData,
                    new String[]{
                "Periode", "Bedarf", "Lagerkosten"
            }) {
   
				private static final long serialVersionUID = 1L;
				@SuppressWarnings("rawtypes")
				Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
                };
                boolean[] canEdit = new boolean[]{
                    false, true, false
                }; //bearbeitbarkeit der Spalten

                public Class<?> getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

        }
       
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        
        
        //Aktivieren bzw. ausgrauen von Buttons Men�punkten
        berechnung.setEnabled(true);
        mntmSpeichern.setEnabled(true);
        jButton1.setEnabled(false); //+++++
        
        //Editierbarkeit der Anfangsfelder wird nach Eingabe und "Weiter!" deaktiviert, um die Bedienung zu vereinfachen
        //und ausgegraut um es �ber die GUI zu veranschaulichen.
        RuestkostenEF.setEnabled(false);
        PeriodenEF.setEnabled(false);
        LagerkostenEF.setEnabled(false);


    }//GEN-LAST:event_werteEingeben

    private void RuestkostenEFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RuestkostenEFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_RuestkostenEFKeyTyped

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
    }//GEN-LAST:event_jTable1PropertyChange

    private void berechnungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berechnungActionPerformed
        //Tabelle scannen und in die Felder �bernehmen ...
    	
        periodenbedarf = new int[logic.WagWhit.getAnzahlPerioden()];
        jTable1.getDefaultEditor(Double.class).stopCellEditing();
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            try {
                periodenbedarf[i] = Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 1)));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new JFrame(), "Bitte nur ganze Zahlen als Bedarfsmengen eingeben! \n Eingabe an Stelle '1/" + (i+1) + "'(Spalte/Zeile) pr�fen", "Fehlerhafte Eingabe Bedarfsmenge", JOptionPane.ERROR_MESSAGE);
            }
        }

        logic.WagWhit.setPeriodenbedarf(periodenbedarf);
    	lagerkosten = new double[logic.WagWhit.getAnzahlPerioden()]; // +++++++++ hinzugef�ft, damit eingelesene Dateien keinen Fehler mehr werfen..
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            try {
                lagerkosten[i] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, 2)));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new JFrame(), "Bitte nur numerische Werte als Lagerkosten eingeben!\nEingabe an Stelle '2/" + (i+1) + "'(Spalte/Zeile) pr�fen", "Fehlerhafte Eingabe Lagerkosten", JOptionPane.ERROR_MESSAGE);
            }
        }

        logic.WagWhit.setLagerkosten(lagerkosten);



        System.out.println("Testausgabe der Parameter:");
        System.out.println("Anzahl der Perioden: \t" + logic.WagWhit.getAnzahlPerioden());
        System.out.println("R�stkosten: \t" + logic.WagWhit.getRuestkosten());//+++ 

        for (int i = 0; i < lagerkosten.length; i++) {
            System.out.println(i + 1 + ". Periode: \t " + periodenbedarf[i] + " \t" + lagerkosten[i]);
        }

        logic.WagWhit.start();

        gui.Solutions.main(null);



    }//GEN-LAST:event_berechnungActionPerformed

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
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userInterface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LagerkostenEF;
    private javax.swing.JTextField PeriodenEF;
    private javax.swing.JTextField RuestkostenEF;
    private javax.swing.JButton berechnung;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jTable1;
    private javax.swing.JCheckBox varLagerkostenCB;
    private JMenuBar menuBar;
    private JMenu mnOptionen;
    private JMenuItem mntmSpeichern;
    private JMenuItem mntmLaden;
    private JMenu mnInfo;
    private JMenuItem mntmAbout;
    private JMenuItem mntmProgrammbeschreibung;
    private JMenuItem mntmKurzinfo;
}
