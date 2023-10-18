
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JTextField;

/**
 *
 * @author Juanm
 */
public class Formulario extends javax.swing.JFrame {

    int contador = 0;

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        LocalDateTime d = LocalDateTime.now();
        FechaActual.setText(d.getDayOfMonth() + "/" + d.getMonthValue() + "/" + d.getYear() + "   " + d.getHour() + ":" + d.getMinute() + ":" + d.getSecond());
        FechaActual.setEnabled(false);
        setLocationRelativeTo(null);
    }

    public void cargar() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Pacientes.txt"));
            String linea = br.readLine();
            System.out.println(linea + " adios");

            if (linea != null) {
                linea = linea.trim(); // Elimina espacios en blanco alrededor del texto
                String[] tokens = linea.split("/");
                if (tokens.length > 0) {
                    System.out.println(tokens[0]);
                    Nombre.setText(tokens[0]);
                    Direccion.setText(tokens[1]);
                    Sexo.setSelectedItem(tokens[2]);
                    Provincia.setText(tokens[3]);
                    Telefono.setText(tokens[4]);
                    Fecha.setText(tokens[5]);
                    CodigoPostal.setText(tokens[6]);
                }
            } else {
                System.out.println("El archivo está vacío.");
            }
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Motivos = new javax.swing.JComboBox<>();
        CodigoPostal = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Provincia = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Causas = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Sexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        FechaNac = new javax.swing.JLabel();
        FechaActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(221, 221, 221));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(221, 221, 221));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Direccion");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Codigo Postal");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Provincia");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Motivos");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Causas que le derivan a urgencias");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, -1, -1));

        Nombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Nombre.setForeground(new java.awt.Color(204, 204, 204));
        Nombre.setText("Ponga aqui el nombre");
        Nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreMousePressed(evt);
            }
        });
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Formulario.this.keyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NoNum(evt);
            }
        });
        jPanel3.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Teléfono");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setText("Datos del paciente");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 320, -1));

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 80));

        Motivos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Motivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Motivos --", "Traumatologia", "Accidente", "Estomatologia", "Consulta médico de cabecera", "Otro" }));
        jPanel3.add(Motivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        CodigoPostal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CodigoPostal.setForeground(new java.awt.Color(204, 204, 204));
        CodigoPostal.setText("Ponga aqui el codigo postal ");
        CodigoPostal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CodigoPostal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CodigoPostalMousePressed(evt);
            }
        });
        CodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Formulario.this.keyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NoNum(evt);
            }
        });
        jPanel3.add(CodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 310, -1));

        Telefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Telefono.setForeground(new java.awt.Color(204, 204, 204));
        Telefono.setText("Ponga aqui el teléfono");
        Telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoMousePressed(evt);
            }
        });
        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Formulario.this.keyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NoLetrasTelefono(evt);
            }
        });
        jPanel3.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 260, -1));

        Provincia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Provincia.setForeground(new java.awt.Color(204, 204, 204));
        Provincia.setText("Ponga aqui la provincia");
        Provincia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Provincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProvinciaMousePressed(evt);
            }
        });
        Provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinciaActionPerformed(evt);
            }
        });
        Provincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Formulario.this.keyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NoNum(evt);
            }
        });
        jPanel3.add(Provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 260, -1));

        Direccion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Direccion.setForeground(new java.awt.Color(204, 204, 204));
        Direccion.setText("Ponga aqui la direccion");
        Direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DireccionMousePressed(evt);
            }
        });
        Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Formulario.this.keyPressed(evt);
            }
        });
        jPanel3.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 310, -1));

        Causas.setColumns(20);
        Causas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Causas.setForeground(new java.awt.Color(204, 204, 204));
        Causas.setRows(5);
        Causas.setText("Ponga aqui sus causas");
        Causas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CausasMouseClicked(evt);
            }
        });
        Causas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NoNum(evt);
            }
        });
        jScrollPane1.setViewportView(Causas);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 360, 240));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Enviar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, 180, 30));

        Sexo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Sexo --", "Masculino", "Femenino" }));
        Sexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SexoMouseClicked(evt);
            }
        });
        jPanel3.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 160, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Genero");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        Fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Fecha.setForeground(new java.awt.Color(204, 204, 204));
        Fecha.setText("Ponga aqui su fecha de nacimiento");
        Fecha.setToolTipText("");
        Fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FechaMousePressed(evt);
            }
        });
        Fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Formulario.this.keyPressed(evt);
            }
        });
        jPanel3.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 400, -1));

        FechaNac.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        FechaNac.setText("Fecha de nacimiento");
        jPanel3.add(FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        FechaActual.setBackground(new java.awt.Color(0, 0, 0));
        FechaActual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel3.add(FechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 270, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1140, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.black);
        jPanel1.setBackground(Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.red);
        jPanel1.setBackground(new Color(221, 221, 221));
    }//GEN-LAST:event_jLabel1MouseExited

    private void NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMousePressed
        if (Nombre.getText().equals("Ponga aqui el nombre")) {
            Nombre.setText("");
            Nombre.setForeground(Color.black);
            Nombre.setBackground(Color.white);
            contador = 0;
        } else {
            contador = 0;
            Nombre.setForeground(Color.black);
            Nombre.setBackground(Color.white);
        }
    }//GEN-LAST:event_NombreMousePressed

    private void CodigoPostalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoPostalMousePressed
        if (CodigoPostal.getText().equals("Ponga aqui el codigo postal ")) {
            CodigoPostal.setText("");
            CodigoPostal.setForeground(Color.black);
            CodigoPostal.setBackground(Color.white);
            contador = 4;
        } else {
            contador = 4;
            CodigoPostal.setForeground(Color.black);
            CodigoPostal.setBackground(Color.white);
        }
      }//GEN-LAST:event_CodigoPostalMousePressed

    private void TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMousePressed
        if (Telefono.getText().equals("Ponga aqui el teléfono")) {
            Telefono.setText("");
            Telefono.setForeground(Color.black);
            Telefono.setBackground(Color.white);
            contador = 1;
        } else {
            contador = 1;
            Telefono.setForeground(Color.black);
            Telefono.setBackground(Color.white);
        }
    }//GEN-LAST:event_TelefonoMousePressed

    private void ProvinciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProvinciaMousePressed
        if (Provincia.getText().equals("Ponga aqui la provincia")) {
            Provincia.setText("");
            Provincia.setForeground(Color.black);
            Provincia.setBackground(Color.white);
            contador = 3;
        } else {
            contador = 3;
            Provincia.setForeground(Color.black);
            Provincia.setBackground(Color.white);
        }
    }//GEN-LAST:event_ProvinciaMousePressed

    private void DireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DireccionMousePressed
        if (Direccion.getText().equals("Ponga aqui la direccion")) {
            Direccion.setText("");
            Direccion.setForeground(Color.black);
            Direccion.setBackground(Color.white);
            contador = 2;
        } else {
            contador = 2;
            Direccion.setForeground(Color.black);
            Direccion.setBackground(Color.white);
        }
    }//GEN-LAST:event_DireccionMousePressed

    private void ProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinciaActionPerformed

    }//GEN-LAST:event_ProvinciaActionPerformed

    private void keyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (contador == 0) {
                if (Telefono.getText().equals("Ponga aqui el teléfono")) {
                    Telefono.setText("");
                    Telefono.setForeground(Color.black);
                    Telefono.requestFocus();
                    contador++;
                } else {
                    Telefono.requestFocus();
                    contador++;
                }
            } else if (contador == 1) {
                if (Direccion.getText().equals("Ponga aqui la direccion")) {
                    Direccion.setText("");
                    Direccion.setForeground(Color.black);
                    Direccion.requestFocus();
                    contador++;
                } else {
                    Direccion.requestFocus();
                    contador++;
                }
            } else if (contador == 2) {
                if (Provincia.getText().equals("Ponga aqui la provincia")) {
                    Provincia.setText("");
                    Provincia.setForeground(Color.black);
                    Provincia.requestFocus();
                    contador++;
                } else {
                    Provincia.requestFocus();
                    contador++;
                }
            } else if (contador == 3) {
                if (CodigoPostal.getText().equals("Ponga aqui el codigo postal ")) {
                    CodigoPostal.setText("");
                    CodigoPostal.setForeground(Color.black);
                    CodigoPostal.requestFocus();
                    contador++;
                } else {
                    CodigoPostal.requestFocus();
                    contador++;
                }
            } else if (contador == 4) {
                if (Fecha.getText().equals("Ponga aqui su fecha de nacimiento")) {
                    Fecha.setText("");
                    Fecha.setForeground(Color.black);
                    Fecha.requestFocus();
                    contador++;
                } else {
                    Fecha.requestFocus();
                    contador++;
                }
            } else if (contador == 5) {
                if (Nombre.getText().equals("Ponga aqui el nombre")) {
                    Nombre.setText("");
                    Nombre.setForeground(Color.black);
                    Nombre.requestFocus();
                    contador = 0;
                } else {
                    Nombre.requestFocus();
                    contador = 0;
                }
            }
        }
    }//GEN-LAST:event_keyPressed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
    }//GEN-LAST:event_NombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int contador = 0;
        JTextField[] cuadros = {Nombre, Telefono, Provincia, Direccion, CodigoPostal, Fecha};
        System.out.println(cuadros.length);
        for (int i = 0; i < cuadros.length; i++) {
            if (cuadros[i].getText().equals("") || cuadros[i].getText().substring(0, 5).equals("Ponga")) {
                cuadros[i].setBackground(Color.red);
                contador++;
            }
            if (Causas.getText().equals("") || Causas.getText().substring(0, 5).equals("Ponga")) {
                Causas.setBackground(Color.red);
                contador++;
            }

        }
        if (contador > 0) {
            JOptionPane.showMessageDialog(this, "Rellene los campos faltantes");
        }
        if (String.valueOf(Sexo.getSelectedItem()).equals("-- Sexo --")) {
            Sexo.setBackground(Color.red);
            JOptionPane.showMessageDialog(this, "Seleccione un sexo por favor");
            contador++;
        }
        if (String.valueOf(Motivos.getSelectedItem()).equals("-- Motivos --")) {
            JOptionPane.showMessageDialog(this, "Seleccione un motivo por favor");
            contador++;
        }
        if (contador == 0) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/Pacientes.txt"));
                bw.write(Nombre.getText() + "/" + Direccion.getText() + "/" + String.valueOf(Sexo.getSelectedItem())
                        + "/" + Provincia.getText() + "/" + Telefono.getText() + "/" + Fecha.getText()
                        + "/" + CodigoPostal.getText() + "/" + Causas.getText());
                bw.close();
                if (Motivos.getSelectedItem().equals("Traumatologia")) {
                    JOptionPane.showMessageDialog(this, "Datos guardados en el archivo.");
                    JOptionPane.showMessageDialog(this, "Cargando formulario");
                    Traumatologia t = new Traumatologia();
                    t.setVisible(true);
                    this.setVisible(false);
                } else if (Motivos.getSelectedItem().equals("Accidente")) {
                    JOptionPane.showMessageDialog(this, "Datos guardados en el archivo.");
                    JOptionPane.showMessageDialog(this, "Cargando formulario");
                } else if (Motivos.getSelectedItem().equals("Estomatologia")) {
                    JOptionPane.showMessageDialog(this, "Datos guardados en el archivo.");
                    JOptionPane.showMessageDialog(this, "Cargando formulario");
                } else if (Motivos.getSelectedItem().equals("Otro")) {
                    JOptionPane.showMessageDialog(this, "Datos guardados en el archivo.");
                    JOptionPane.showMessageDialog(this, "Cargando formulario");
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } else {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaMousePressed
        if (Fecha.getText().equals("Ponga aqui su fecha de nacimiento")) {
            Fecha.setText("");
            Fecha.setForeground(Color.black);
            Fecha.setBackground(Color.white);
            contador = 5;
        } else {
            contador = 5;
            Fecha.setForeground(Color.black);
            Fecha.setBackground(Color.white);
        }
    }//GEN-LAST:event_FechaMousePressed

    private void CausasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CausasMouseClicked
        if (Causas.getText().equals("Ponga aqui sus causas")) {
            Causas.setText("");
            Causas.setForeground(Color.black);
            Causas.setBackground(Color.white);
        } else {
            Causas.setForeground(Color.black);
            Causas.setBackground(Color.white);
        }
    }//GEN-LAST:event_CausasMouseClicked

    private void SexoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SexoMouseClicked
        Sexo.setBackground(Color.white);
    }//GEN-LAST:event_SexoMouseClicked

    private void NoNum(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoNum

        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_NoNum

    private void NoLetrasTelefono(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoLetrasTelefono
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Telefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_NoLetrasTelefono

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Causas;
    private javax.swing.JTextField CodigoPostal;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Fecha;
    private javax.swing.JLabel FechaActual;
    private javax.swing.JLabel FechaNac;
    private javax.swing.JComboBox<String> Motivos;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Provincia;
    private javax.swing.JComboBox<String> Sexo;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
