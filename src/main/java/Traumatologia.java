
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Juanm
 */
public class Traumatologia extends javax.swing.JFrame {

    /**
     * Creates new form Traumatologia
     */
    public Traumatologia() {
        initComponents();
        setLocationRelativeTo(null);
        LocalDateTime d = LocalDateTime.now();
        FechaActual.setText(d.getDayOfMonth() + "/" + d.getMonthValue() + "/" + d.getYear() + "   " + d.getHour() + ":" + d.getMinute() + ":" + d.getSecond());
        cargar();
    }

    public void cargar() {
        try {
            //Pilla la primera linea del archivo
            BufferedReader br = new BufferedReader(new FileReader("src/Pacientes.txt"));
            String linea = br.readLine();
            //Aqui comprueba si es null
            if (linea != null) {
                linea = linea.trim(); // Elimina espacios en blanco alrededor del texto
                //Divide la linea
                String[] tokens = linea.split("/");
                //Comprueba si la longitud del array es mayor que 0 para comprobar si existe alguna division
                if (tokens.length > 0) {
                    Nombretext.setText(tokens[0]);
                    Nombretext1.setText(tokens[0]);
                    DireccionText.setText(tokens[1]);
                    GeneroText.setText(tokens[2]);
                    NumeroTlfnText.setText(tokens[4]);
                    FechaNacText.setText(tokens[5]);
                    Motivos.setText(tokens[7]);
                }
                //Aqui es el caso que linea sea null
            } else {
                System.out.println("El archivo está vacío.");
            }
            FechaActual.setEnabled(false);
            Nombretext.setEnabled(false);
            Nombretext1.setEnabled(false);
            DireccionText.setEnabled(false);
            FechaNacText.setEnabled(false);
            GeneroText.setEnabled(false);
            NumeroTlfnText.setEnabled(false);
            Motivos.setEnabled(false);
            PanelExamen.setVisible(false);
            jScrollPane6.setVisible(false);
            jScrollPane7.setVisible(false);
            jScrollPane8.setVisible(false);
            jScrollPane9.setVisible(false);
            jScrollPane10.setVisible(false);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no se encontró: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupExamen = new javax.swing.ButtonGroup();
        buttonGroupRadio = new javax.swing.ButtonGroup();
        buttonGroupResonancia = new javax.swing.ButtonGroup();
        buttonGroupTomografía = new javax.swing.ButtonGroup();
        buttonGroupAnalisis = new javax.swing.ButtonGroup();
        buttonGroupEcografia = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nombretext = new javax.swing.JTextField();
        FechaNacText = new javax.swing.JTextField();
        GeneroText = new javax.swing.JTextField();
        DireccionText = new javax.swing.JTextField();
        NumeroTlfnText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Motivos = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        SiExamen = new javax.swing.JRadioButton();
        NoExamen = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        PanelExamen = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        SiRadio = new javax.swing.JRadioButton();
        NoRadio = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        SiResonancia = new javax.swing.JRadioButton();
        NoResonancia = new javax.swing.JRadioButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        SiTomografia = new javax.swing.JRadioButton();
        NoTomografia = new javax.swing.JRadioButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        SiEcografia = new javax.swing.JRadioButton();
        NoEcografia = new javax.swing.JRadioButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        SiAnalisis = new javax.swing.JRadioButton();
        NoAnalisis = new javax.swing.JRadioButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        FechaActual = new javax.swing.JLabel();
        Nombretext1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Volver atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 50));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Nombre :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Fecha de nacimiento :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Genero :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Direccion :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Numero de telefono :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        Nombretext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nombretext.setText("Nombre");
        jPanel2.add(Nombretext, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 360, -1));

        FechaNacText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FechaNacText.setText("Fecha de nacimiento");
        jPanel2.add(FechaNacText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 250, -1));

        GeneroText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GeneroText.setText("Genero");
        jPanel2.add(GeneroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 370, -1));

        DireccionText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DireccionText.setText("Direccion");
        jPanel2.add(DireccionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 340, -1));

        NumeroTlfnText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumeroTlfnText.setText("Numero de telefono");
        jPanel2.add(NumeroTlfnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 250, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Datos del paciente");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Motivos");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, -1));

        Motivos.setColumns(20);
        Motivos.setRows(5);
        Motivos.setText("Motivos\n");
        jScrollPane1.setViewportView(Motivos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 330, 300));

        jTabbedPane1.addTab("Datos", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroupExamen.add(SiExamen);
        SiExamen.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SiExamen.setText("Si");
        SiExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel3.add(SiExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        buttonGroupExamen.add(NoExamen);
        NoExamen.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        NoExamen.setText("No");
        NoExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel3.add(NoExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("¿Se ha realizado examen físico?");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 38, -1, -1));

        PanelExamen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setText("Evaluación de la movilidad y función de las articulaciones y músculos afectados");
        PanelExamen.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        PanelExamen.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 450, 160));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel10.setText("Medición de la fuerza muscular");
        PanelExamen.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        PanelExamen.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 440, 160));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel11.setText("Evaluación de la sensibilidad");
        PanelExamen.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        PanelExamen.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 430, 160));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel12.setText("Revisión de posibles deformidades");
        PanelExamen.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, -1, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane5.setViewportView(jTextArea4);

        PanelExamen.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 430, 160));

        jPanel3.add(PanelExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1060, 460));

        jTabbedPane1.addTab("Examen Físico", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("¿Se ha realizado una radiografia?");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        buttonGroupRadio.add(SiRadio);
        SiRadio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SiRadio.setText("Si");
        SiRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(SiRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        buttonGroupRadio.add(NoRadio);
        NoRadio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NoRadio.setText("No");
        NoRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(NoRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane6.setViewportView(jTextArea5);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 300, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("¿Se ha realizado una resonancia?");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        buttonGroupResonancia.add(SiResonancia);
        SiResonancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SiResonancia.setText("Si");
        SiResonancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(SiResonancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        buttonGroupResonancia.add(NoResonancia);
        NoResonancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NoResonancia.setText("No");
        NoResonancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(NoResonancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane7.setViewportView(jTextArea6);

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 300, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("¿Se ha realizado una tomografia?");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 30));

        buttonGroupTomografía.add(SiTomografia);
        SiTomografia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SiTomografia.setText("Si");
        SiTomografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(SiTomografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        buttonGroupTomografía.add(NoTomografia);
        NoTomografia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NoTomografia.setText("No");
        NoTomografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(NoTomografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane8.setViewportView(jTextArea7);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 300, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setText("¿Se ha realizado una ecografía?");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        buttonGroupEcografia.add(SiEcografia);
        SiEcografia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SiEcografia.setText("Si");
        SiEcografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(SiEcografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        buttonGroupEcografia.add(NoEcografia);
        NoEcografia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NoEcografia.setText("No");
        NoEcografia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(NoEcografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jScrollPane9.setViewportView(jTextArea8);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 300, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setText("¿Se ha realizado un análisi de sangre?");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        buttonGroupAnalisis.add(SiAnalisis);
        SiAnalisis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SiAnalisis.setText("Si");
        SiAnalisis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(SiAnalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        buttonGroupAnalisis.add(NoAnalisis);
        NoAnalisis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NoAnalisis.setText("No");
        NoAnalisis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desaparicion(evt);
            }
        });
        jPanel4.add(NoAnalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jScrollPane10.setViewportView(jTextArea9);

        jPanel4.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 300, -1));

        jTabbedPane1.addTab("Pruebas diagnósticas", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setText("Descripción del diagnostico");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jScrollPane11.setViewportView(jTextArea10);

        jPanel5.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 970, 170));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione el grado de lesion --", "Grado 1", "Grado 2", "Grado 3" }));
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setText("Grado de lesion");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setText("Evaluacion de gravedad");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jScrollPane12.setViewportView(jTextArea11);

        jPanel5.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 570, 230));

        jTabbedPane1.addTab("Diagnóstico", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel21.setText("Medicamentos recetados");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 30));

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jScrollPane13.setViewportView(jTextArea12);

        jPanel6.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 400, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel22.setText("Terapias físicas");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, -1, -1));

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jScrollPane14.setViewportView(jTextArea13);

        jPanel6.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 400, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel23.setText("Cirugía");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jScrollPane15.setViewportView(jTextArea14);

        jPanel6.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 400, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel24.setText("Recomendaciones de actividad física y estilo de vida");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jTextArea15.setColumns(20);
        jTextArea15.setRows(5);
        jScrollPane16.setViewportView(jTextArea15);

        jPanel6.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 400, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel25.setText("Duración estimada del tratamiento");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        jTextArea16.setColumns(20);
        jTextArea16.setRows(5);
        jScrollPane17.setViewportView(jTextArea16);

        jPanel6.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 400, -1));

        jTabbedPane1.addTab("Tratamiento", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel26.setText("Fechas");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, -1, -1));

        jTextArea17.setColumns(20);
        jTextArea17.setRows(5);
        jScrollPane18.setViewportView(jTextArea17);

        jPanel7.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 450, 180));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel27.setText("Evaluación del paciente");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jTextArea18.setColumns(20);
        jTextArea18.setRows(5);
        jScrollPane19.setViewportView(jTextArea18);

        jPanel7.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 450, 180));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel28.setText("Ajuste de tratamientos");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, 30));

        jTextArea19.setColumns(20);
        jTextArea19.setRows(5);
        jScrollPane20.setViewportView(jTextArea19);

        jPanel7.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 450, 180));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel29.setText("Derivados");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Introduzca una fecha");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton2.setText("Añadir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fechas"
            }
        ));
        jScrollPane22.setViewportView(jTable1);

        jPanel7.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, 130));

        jTabbedPane1.addTab("Seguimiento", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel31.setText("Observaciones");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jTextArea20.setColumns(20);
        jTextArea20.setRows(5);
        jScrollPane21.setViewportView(jTextArea20);

        jPanel8.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 107, 940, 440));

        jTabbedPane1.addTab("Notas", jPanel8);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1300, 610));

        FechaActual.setBackground(new java.awt.Color(0, 0, 0));
        FechaActual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(FechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 270, 30));

        Nombretext1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nombretext1.setText("Nombre");
        jPanel1.add(Nombretext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 360, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel30.setText("Nombre :");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1302, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Formulario f = new Formulario();
        f.cargar();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void desaparicion(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desaparicion
        if (SiExamen.isSelected()) {
            PanelExamen.setVisible(true);
        } else {
            PanelExamen.setVisible(false);
        }
        if (SiRadio.isSelected()) {
            jScrollPane6.setVisible(true);
        } else {
            jScrollPane6.setVisible(false);
        }
        if (SiResonancia.isSelected()) {
            jScrollPane7.setVisible(true);
        } else {
            jScrollPane7.setVisible(false);
        }
        if (SiTomografia.isSelected()) {
            jScrollPane8.setVisible(true);
        } else {
            jScrollPane8.setVisible(false);
        }
        if (SiEcografia.isSelected()) {
            jScrollPane9.setVisible(true);
        } else {
            jScrollPane9.setVisible(false);
        }
        if (SiAnalisis.isSelected()) {
            jScrollPane10.setVisible(true);
        } else {
            jScrollPane10.setVisible(false);
        }
    }//GEN-LAST:event_desaparicion

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setForeground(Color.black);
        if (jTextField1.getText().equals("Introduzca una fecha"))
        {
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel m =(DefaultTableModel) jTable1.getModel();
        String[] a = {jTextField1.getText()};
        m.addRow(a);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Traumatologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traumatologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traumatologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traumatologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traumatologia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DireccionText;
    private javax.swing.JLabel FechaActual;
    private javax.swing.JTextField FechaNacText;
    private javax.swing.JTextField GeneroText;
    private javax.swing.JTextArea Motivos;
    private javax.swing.JRadioButton NoAnalisis;
    private javax.swing.JRadioButton NoEcografia;
    private javax.swing.JRadioButton NoExamen;
    private javax.swing.JRadioButton NoRadio;
    private javax.swing.JRadioButton NoResonancia;
    private javax.swing.JRadioButton NoTomografia;
    private javax.swing.JTextField Nombretext;
    private javax.swing.JTextField Nombretext1;
    private javax.swing.JTextField NumeroTlfnText;
    private javax.swing.JPanel PanelExamen;
    private javax.swing.JRadioButton SiAnalisis;
    private javax.swing.JRadioButton SiEcografia;
    private javax.swing.JRadioButton SiExamen;
    private javax.swing.JRadioButton SiRadio;
    private javax.swing.JRadioButton SiResonancia;
    private javax.swing.JRadioButton SiTomografia;
    private javax.swing.ButtonGroup buttonGroupAnalisis;
    private javax.swing.ButtonGroup buttonGroupEcografia;
    private javax.swing.ButtonGroup buttonGroupExamen;
    private javax.swing.ButtonGroup buttonGroupRadio;
    private javax.swing.ButtonGroup buttonGroupResonancia;
    private javax.swing.ButtonGroup buttonGroupTomografía;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
