/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_emilianoagurcia;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author emili
 */
public class Main extends javax.swing.JFrame {
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        //Nodos Plantas y Zombies
        DefaultTreeModel ModeloArbol = (DefaultTreeModel) T_Tree.getModel();
        DefaultMutableTreeNode Raiz = (DefaultMutableTreeNode) ModeloArbol.getRoot();
    
        DefaultMutableTreeNode Nodo_Plantas = new DefaultMutableTreeNode("Plantas");
        DefaultMutableTreeNode Nodo_Zombies = new DefaultMutableTreeNode("Zombies");
        Raiz.add(Nodo_Plantas);
        Raiz.add(Nodo_Zombies);
        
        DefaultMutableTreeNode Nodo_Planta_Defensa = new DefaultMutableTreeNode("Defensa");
        DefaultMutableTreeNode Nodo_Planta_Disparo = new DefaultMutableTreeNode("Disparo");
        DefaultMutableTreeNode Nodo_Planta_Explosiva = new DefaultMutableTreeNode("Explosiva");
        Nodo_Plantas.add(Nodo_Planta_Defensa);
        Nodo_Plantas.add(Nodo_Planta_Disparo);
        Nodo_Plantas.add(Nodo_Planta_Explosiva);
        
        DefaultMutableTreeNode Nodo_Zombie_Clasico = new DefaultMutableTreeNode("Clasico");
        DefaultMutableTreeNode Nodo_Zombie_Cargado = new DefaultMutableTreeNode("Cargado");
        Nodo_Zombies.add(Nodo_Zombie_Clasico);
        Nodo_Zombies.add(Nodo_Zombie_Cargado);
        //Fin Nodos Plantas y Zombies
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Z_Tipo = new javax.swing.ButtonGroup();
        P_Tipo = new javax.swing.ButtonGroup();
        P_Rango = new javax.swing.ButtonGroup();
        PopUp = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Elegir = new javax.swing.JMenuItem();
        Imprimir = new javax.swing.JMenuItem();
        BACKGROUND = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Tab_Test = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_TA_Impresion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        T_Tree = new javax.swing.JTree();
        T_BT_Testear = new javax.swing.JButton();
        T_L_ZombieElegido = new javax.swing.JLabel();
        T_L_PlantaElegida = new javax.swing.JLabel();
        Tab_Plantas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        P_TF_NombreProyectil = new javax.swing.JTextField();
        P_TF_Nombre = new javax.swing.JTextField();
        P_SP_Ataque = new javax.swing.JSpinner();
        P_SP_MagnitudExplosion = new javax.swing.JSpinner();
        P_SP_Dureza = new javax.swing.JSpinner();
        P_SP_Vida = new javax.swing.JSpinner();
        P_SP_Peso = new javax.swing.JSpinner();
        P_SP_Altura = new javax.swing.JSpinner();
        P_BT_Crear = new javax.swing.JButton();
        P_RB_Medio = new javax.swing.JRadioButton();
        P_RB_Alto = new javax.swing.JRadioButton();
        P_RB_Bajo = new javax.swing.JRadioButton();
        P_RB_Disparo = new javax.swing.JRadioButton();
        P_RB_Defensa = new javax.swing.JRadioButton();
        P_RB_Explosiva = new javax.swing.JRadioButton();
        P_TF_NombreProyectil1 = new javax.swing.JTextField();
        Tab_Zombies = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Z_TF_Nombre = new javax.swing.JTextField();
        Z_TF_NombrePComida = new javax.swing.JTextField();
        Z_TF_Imagen = new javax.swing.JTextField();
        Z_SP_Ataque = new javax.swing.JSpinner();
        Z_SP_Vida = new javax.swing.JSpinner();
        Z_SP_Edad = new javax.swing.JSpinner();
        Z_SP_Size = new javax.swing.JSpinner();
        Z_SP_AñosExperiencia = new javax.swing.JSpinner();
        Z_SP_Enojo = new javax.swing.JSpinner();
        Z_BT_AgregarPComida = new javax.swing.JButton();
        Z_BT_Crear = new javax.swing.JButton();
        Z_BT_Color = new javax.swing.JButton();
        Z_RB_Cargado = new javax.swing.JRadioButton();
        Z_RB_Clasico = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Z_TA_PersonasComidas = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        PopUp.add(Eliminar);

        Elegir.setText("Elegir");
        PopUp.add(Elegir);

        Imprimir.setText("Imprimir");
        PopUp.add(Imprimir);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACKGROUND.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tab_Test.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        T_TA_Impresion.setColumns(20);
        T_TA_Impresion.setRows(5);
        jScrollPane2.setViewportView(T_TA_Impresion);

        Tab_Test.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 460, 390));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Entidades");
        T_Tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        T_Tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_TreeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(T_Tree);

        Tab_Test.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 290, 390));

        T_BT_Testear.setText("Testear");
        Tab_Test.add(T_BT_Testear, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 522, 280, 30));

        T_L_ZombieElegido.setText("Elegir Zombie");
        Tab_Test.add(T_L_ZombieElegido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        T_L_PlantaElegida.setText("Elegir Planta");
        Tab_Test.add(T_L_PlantaElegida, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jTabbedPane1.addTab("Test", Tab_Test);

        Tab_Plantas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Magnitud de Explosion");
        Tab_Plantas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel2.setText("Rango");
        Tab_Plantas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setText("Tipo");
        Tab_Plantas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel4.setText("Nombre");
        Tab_Plantas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel5.setText("Ataque");
        Tab_Plantas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        jLabel6.setText("Vida");
        Tab_Plantas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel7.setText("Nombre Proyectil");
        Tab_Plantas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel8.setText("Color");
        Tab_Plantas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jLabel9.setText("Altura");
        Tab_Plantas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel10.setText("Peso");
        Tab_Plantas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        jLabel11.setText("Dureza");
        Tab_Plantas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, -1));
        Tab_Plantas.add(P_TF_NombreProyectil, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 180, -1));
        Tab_Plantas.add(P_TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 180, -1));
        Tab_Plantas.add(P_SP_Ataque, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 140, -1));
        Tab_Plantas.add(P_SP_MagnitudExplosion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 140, -1));
        Tab_Plantas.add(P_SP_Dureza, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 140, -1));
        Tab_Plantas.add(P_SP_Vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 140, -1));
        Tab_Plantas.add(P_SP_Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 140, -1));
        Tab_Plantas.add(P_SP_Altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 140, -1));

        P_BT_Crear.setText("CREAR");
        Tab_Plantas.add(P_BT_Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 170, 50));

        P_RB_Medio.setText("Medio");
        Tab_Plantas.add(P_RB_Medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        P_RB_Alto.setText("Alto");
        Tab_Plantas.add(P_RB_Alto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        P_RB_Bajo.setText("Bajo");
        P_RB_Bajo.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                P_RB_BajoAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        Tab_Plantas.add(P_RB_Bajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        P_RB_Disparo.setText("Disparo");
        Tab_Plantas.add(P_RB_Disparo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        P_RB_Defensa.setText("Defensa");
        Tab_Plantas.add(P_RB_Defensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        P_RB_Explosiva.setText("Explosiva");
        Tab_Plantas.add(P_RB_Explosiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));
        Tab_Plantas.add(P_TF_NombreProyectil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 180, -1));

        jTabbedPane1.addTab("Plantas", Tab_Plantas);

        Tab_Zombies.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Nombre");
        Tab_Zombies.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel13.setText("Ataque");
        Tab_Zombies.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel14.setText("Vida");
        Tab_Zombies.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel15.setText("Edad");
        Tab_Zombies.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel16.setText("Agregar Persona Comida");
        Tab_Zombies.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));

        jLabel17.setText("Nombre");
        Tab_Zombies.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, -1));

        jLabel18.setText("Tamaño");
        Tab_Zombies.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel19.setText("Años de experiencia");
        Tab_Zombies.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel20.setText("Enojo");
        Tab_Zombies.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel21.setText("Color Bandera");
        Tab_Zombies.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel22.setText("Direccion Imagen");
        Tab_Zombies.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jLabel23.setText("Tipo");
        Tab_Zombies.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel24.setText("Personas Comidas");
        Tab_Zombies.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, -1));
        Tab_Zombies.add(Z_TF_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, -1));
        Tab_Zombies.add(Z_TF_NombrePComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 180, -1));
        Tab_Zombies.add(Z_TF_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 180, -1));
        Tab_Zombies.add(Z_SP_Ataque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, -1));
        Tab_Zombies.add(Z_SP_Vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, -1));
        Tab_Zombies.add(Z_SP_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 140, -1));
        Tab_Zombies.add(Z_SP_Size, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 140, -1));
        Tab_Zombies.add(Z_SP_AñosExperiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 140, -1));
        Tab_Zombies.add(Z_SP_Enojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 140, -1));
        Tab_Zombies.add(Z_BT_AgregarPComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 30, 20));

        Z_BT_Crear.setText("Crear");
        Tab_Zombies.add(Z_BT_Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 170, 30));
        Tab_Zombies.add(Z_BT_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 80, 20));

        Z_Tipo.add(Z_RB_Cargado);
        Z_RB_Cargado.setText("Cargado");
        Tab_Zombies.add(Z_RB_Cargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        Z_Tipo.add(Z_RB_Clasico);
        Z_RB_Clasico.setText("Clasico");
        Tab_Zombies.add(Z_RB_Clasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        Z_TA_PersonasComidas.setColumns(20);
        Z_TA_PersonasComidas.setRows(5);
        jScrollPane1.setViewportView(Z_TA_PersonasComidas);

        Tab_Zombies.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 260, 250));

        jTabbedPane1.addTab("Zombies", Tab_Zombies);

        BACKGROUND.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 990, 630));

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel25.setText("Plantas vs. Zombies");
        BACKGROUND.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P_RB_BajoAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_P_RB_BajoAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_P_RB_BajoAncestorMoved

    private void T_TreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_TreeMouseClicked
        if(evt.isMetaDown()){
            int Row = T_Tree.getClosestRowForLocation(evt.getX(), evt.getY());
            T_Tree.setSelectionRow(Row);
            
            Object v1 = T_Tree.getSelectionPath().getLastPathComponent();
            
            Selected_Node = (DefaultMutableTreeNode) v1;
            if(Selected_Node.getUserObject() instanceof Planta){
                Selected_Planta = (Planta) Selected_Node.getUserObject();
            }else if(Selected_Node.getUserObject() instanceof Zombie){
                Selected_Zombie = (Zombie) Selected_Node.getUserObject();
            }
        }
    }//GEN-LAST:event_T_TreeMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "Seguro desea Eliminar el elemento?");
        
        if(resp == 0){
            DefaultTreeModel Modelo = (DefaultTreeModel) T_Tree.getModel();
            Modelo.removeNodeFromParent(Selected_Node);
            Modelo.reload();
        }
    }//GEN-LAST:event_EliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUND;
    private javax.swing.JMenuItem Elegir;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Imprimir;
    private javax.swing.JButton P_BT_Crear;
    private javax.swing.JRadioButton P_RB_Alto;
    private javax.swing.JRadioButton P_RB_Bajo;
    private javax.swing.JRadioButton P_RB_Defensa;
    private javax.swing.JRadioButton P_RB_Disparo;
    private javax.swing.JRadioButton P_RB_Explosiva;
    private javax.swing.JRadioButton P_RB_Medio;
    private javax.swing.ButtonGroup P_Rango;
    private javax.swing.JSpinner P_SP_Altura;
    private javax.swing.JSpinner P_SP_Ataque;
    private javax.swing.JSpinner P_SP_Dureza;
    private javax.swing.JSpinner P_SP_MagnitudExplosion;
    private javax.swing.JSpinner P_SP_Peso;
    private javax.swing.JSpinner P_SP_Vida;
    private javax.swing.JTextField P_TF_Nombre;
    private javax.swing.JTextField P_TF_NombreProyectil;
    private javax.swing.JTextField P_TF_NombreProyectil1;
    private javax.swing.ButtonGroup P_Tipo;
    private javax.swing.JPopupMenu PopUp;
    private javax.swing.JButton T_BT_Testear;
    private javax.swing.JLabel T_L_PlantaElegida;
    private javax.swing.JLabel T_L_ZombieElegido;
    private javax.swing.JTextArea T_TA_Impresion;
    private javax.swing.JTree T_Tree;
    private javax.swing.JPanel Tab_Plantas;
    private javax.swing.JPanel Tab_Test;
    private javax.swing.JPanel Tab_Zombies;
    private javax.swing.JButton Z_BT_AgregarPComida;
    private javax.swing.JButton Z_BT_Color;
    private javax.swing.JButton Z_BT_Crear;
    private javax.swing.JRadioButton Z_RB_Cargado;
    private javax.swing.JRadioButton Z_RB_Clasico;
    private javax.swing.JSpinner Z_SP_Ataque;
    private javax.swing.JSpinner Z_SP_AñosExperiencia;
    private javax.swing.JSpinner Z_SP_Edad;
    private javax.swing.JSpinner Z_SP_Enojo;
    private javax.swing.JSpinner Z_SP_Size;
    private javax.swing.JSpinner Z_SP_Vida;
    private javax.swing.JTextArea Z_TA_PersonasComidas;
    private javax.swing.JTextField Z_TF_Imagen;
    private javax.swing.JTextField Z_TF_Nombre;
    private javax.swing.JTextField Z_TF_NombrePComida;
    private javax.swing.ButtonGroup Z_Tipo;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void EscribirArchivo(){
        
    }
    
    private void CargarArchivo(){
        
    }
    
    DefaultMutableTreeNode Selected_Node;
    Zombie Selected_Zombie;
    Planta Selected_Planta;
}
