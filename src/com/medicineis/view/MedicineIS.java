/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MedicineIS.view;

import com.MedicineIS.model.MedicineInfo;
import com.medicineis.controller.algorithms.BinarySearch;
import com.medicineis.controller.algorithms.InsertionSort;
import com.medicineis.controller.algorithms.MergeSort;
import com.medicineis.controller.algorithms.SelectionSort;
import com.medicineis.util.ValidationUtil;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Represents a simple information management system with Graphical User Interface (GUI) for managing medication data
 * This class provides functionality to store, update, delete, retrieve and display information about medicines,
 * including their name, price, strength, it's usage etc providing a user-friendly UI for interaction
 * 
 * Functions:
 * Secure login system for authenticating users
 * CRUD (Create, Read, Update, and Delete) operations for managing medicine records
 * Sort medicines based on different criteria such as id, name etc
 * Quick searching to find specific medicine data
 * Validation for input data entered by the users
 * Maintains the list of medicine records
 * Display and interact with the data through the Graphical User Interface(GUI)
 * 
 * GUI Features:
 * Login page for authenticating users before accessing the system
 * Home page providing brief information about the system and other pages in the system
 * Buttons and Menus for interacting and performing CRUD operations on the medicine records
 * Admin page for displaying and interacting with the medicine records
 * Displaying sorted and searched data of the medicines
 * 
 * Dependencies:
 * ValidationUtil - relies for validating user inputs
 * SelectionSort, InsertionSort, MergeSort - relies for data sorting
 * BinarySearch - relies for data searching
 * MedicineInfo - relies of representing individual medicine record
 * Java Swing - relied for GUI creation
 * 
 * @author Sugam Shrestha 
 * LMU ID: 23048636
 */
public class MedicineIS extends javax.swing.JFrame {

    // Declaration of CardLayouts.
    private java.awt.CardLayout bodyCardLayout;
    private java.awt.CardLayout mainCardLayout;
    private java.awt.CardLayout adminCardLayout;

    // Declartion of medicineList.
    private List<MedicineInfo> medicineList;

    /**
     * Creates new form MedicineIS
     */
    public MedicineIS() {
        // initializing components for the GUI
        initComponents();
        // Initializing body layout for switching login and main page
        initializeBodyLayout();
        // Initializing main layout for switiching home and admin page
        initializeMainLayout();
        // Initializing admin layout for switching pages in admin page
        initializeAdminLayout();
        
        // Initializing multiple data for the table and arraylist 
        initializeData();
    }

    /**
     * Initializes layout for frame as cardLayout
     */
    private void initializeMainLayout() {
        mainCardLayout = new CardLayout();
        // setting cardlayout to frame
        getContentPane().setLayout(mainCardLayout);

        // adding panels (cards) in the frame
        getContentPane().add(pnlLogin, "LoginPanel");
        getContentPane().add(pnlMain, "MainPanel");

        // showing login panel as default
        changeMainPanels("LoginPanel");
    }

    /**
     * Initializes layout for body panels
     */
    private void initializeBodyLayout() {
        bodyCardLayout = new CardLayout();
        pnlNestedBody.setLayout(bodyCardLayout);

        // adding panels in the body
        pnlNestedBody.add(pnlHome, "HomePage");
        pnlNestedBody.add(pnlAdmin, "AdminPage");

        // showing home page as dafault panel
        changeBodyPanels("HomePage");
        addBottomColor(lblHome);
    }

    /**
     * initializes admin layout
     */
    private void initializeAdminLayout() {
        adminCardLayout = new CardLayout();
        pnlAdmin.setLayout(adminCardLayout);

        // adding panels to admin panles
        pnlAdmin.add(pnlAddMedicine, "AdminAddMed");
        pnlAdmin.add(pnlAdminDashboard, "AdminDashboard");
        pnlAdmin.add(pnlUpdateMedicine, "AdminUpdate");

        // showing admin dashboard as default panel
        changeAdminPanels("AdminDashboard");
    }

    /**
     * changes panels of frame according to the panel passed to parameter
     *
     * @param panelName the panel to be shown in the frame
     */
    private void changeMainPanels(String panelName) {
        mainCardLayout.show(getContentPane(), panelName);
    }

    /**
     * changes panels of body panel according to the panel passed to parameters
     *
     * @param panelName the panel to be shown in the body panel
     */
    private void changeBodyPanels(String panelName) {
        bodyCardLayout.show(pnlNestedBody, panelName);
    }

    /**
     * changes panels of admin panel according to the panel passed to parameters
     *
     * @param panelName the panel to be shown in the admin panel
     */
    private void changeAdminPanels(String panelName) {
        adminCardLayout.show(pnlAdmin, panelName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblMainHead = new javax.swing.JLabel();
        lblLogoutBtn = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        pnlNestedBody = new javax.swing.JPanel();
        pnlAdmin = new javax.swing.JPanel();
        pnlAdminDashboard = new javax.swing.JPanel();
        lblUpdateBtn = new javax.swing.JLabel();
        lblDeleteBtn = new javax.swing.JLabel();
        lblAddInfo = new javax.swing.JLabel();
        lblAdminAddBtn = new javax.swing.JLabel();
        scrPaneTable = new javax.swing.JScrollPane();
        tblMedicineDatabase = new javax.swing.JTable();
        lblDatabasePageLogo = new javax.swing.JLabel();
        lblAdminError = new javax.swing.JLabel();
        txtSearchBar = new javax.swing.JTextField();
        lblSearchIcon = new javax.swing.JLabel();
        comboxSortItems = new javax.swing.JComboBox<>();
        lblSearchError = new javax.swing.JLabel();
        lblAddInfoVerification = new javax.swing.JLabel();
        lblConfirmationMsg = new javax.swing.JLabel();
        lblSortText = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        lblBodyHeading = new javax.swing.JLabel();
        lblWebDesc = new javax.swing.JLabel();
        lblAdminDesc = new javax.swing.JLabel();
        lblLinkHelper = new javax.swing.JLabel();
        lblHomePagePhoto = new javax.swing.JLabel();
        lblAdminLink = new javax.swing.JLabel();
        pnlAddMedicine = new javax.swing.JPanel();
        lblAddCancel = new javax.swing.JLabel();
        txtAddMedId = new javax.swing.JTextField();
        txtAddMedName = new javax.swing.JTextField();
        txtAddMedStrength = new javax.swing.JTextField();
        txtAddMedDosageForm = new javax.swing.JTextField();
        txtAddMedManufacturer = new javax.swing.JTextField();
        txtAddMedPrice = new javax.swing.JTextField();
        txtAddMedUsage = new javax.swing.JTextField();
        lblAddMedBtn = new javax.swing.JLabel();
        lblAddIdError = new javax.swing.JLabel();
        lblAddDosageFormError = new javax.swing.JLabel();
        lblAddNameError = new javax.swing.JLabel();
        lblAddPriceError = new javax.swing.JLabel();
        lblAddStrengthError = new javax.swing.JLabel();
        lblAddManufacturerError = new javax.swing.JLabel();
        lblAddUsageError = new javax.swing.JLabel();
        lblAddMedClear = new javax.swing.JLabel();
        lblAddError = new javax.swing.JLabel();
        pnlUpdateMedicine = new javax.swing.JPanel();
        lblUpdateCancel = new javax.swing.JLabel();
        txtUpdateMedId = new javax.swing.JTextField();
        txtUpdateMedName = new javax.swing.JTextField();
        txtUpdateMedStrength = new javax.swing.JTextField();
        txtUpdateMedDosageForm = new javax.swing.JTextField();
        txtUpdateMedManufacturer = new javax.swing.JTextField();
        txtUpdateMedPrice = new javax.swing.JTextField();
        txtUpdateMedUsage = new javax.swing.JTextField();
        lblUpdateMedBtn = new javax.swing.JLabel();
        lblUpdateIdError = new javax.swing.JLabel();
        lblUpdateDosageFormError = new javax.swing.JLabel();
        lblUpdateNameError = new javax.swing.JLabel();
        lblUpdatePriceError = new javax.swing.JLabel();
        lblUpdateStrengthError = new javax.swing.JLabel();
        lblUpdateManufacturerError = new javax.swing.JLabel();
        lblUpdateUsageError = new javax.swing.JLabel();
        lblUpdateError = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblHomePhoto = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblHeadingLogin = new javax.swing.JLabel();
        lblSubHeading1Login = new javax.swing.JLabel();
        lblSubHeading2Login = new javax.swing.JLabel();
        lblLoginButton = new javax.swing.JLabel();
        lblUsernameError = new javax.swing.JLabel();
        lblPasswordError = new javax.swing.JLabel();

        pnlMain.setMinimumSize(new java.awt.Dimension(1300, 800));

        pnlHeader.setBackground(new java.awt.Color(60, 60, 60));
        pnlHeader.setMinimumSize(new java.awt.Dimension(1300, 120));
        pnlHeader.setPreferredSize(new java.awt.Dimension(1300, 120));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medicineis/resources/logo.png"))); // NOI18N
        lblLogo.setMinimumSize(new java.awt.Dimension(50, 70));
        lblLogo.setPreferredSize(new java.awt.Dimension(70, 70));

        lblMainHead.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lblMainHead.setForeground(new java.awt.Color(100, 255, 200));
        lblMainHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainHead.setText("<html><span style=\"color: rgb(255,240,0)\">MEDICINE</span> INFORMATION SYSTEM</html>");
        lblMainHead.setMinimumSize(new java.awt.Dimension(570, 60));
        lblMainHead.setPreferredSize(new java.awt.Dimension(650, 60));

        lblLogoutBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblLogoutBtn.setForeground(new java.awt.Color(255, 90, 9));
        lblLogoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoutBtn.setText("LOG OUT");
        lblLogoutBtn.setToolTipText("");
        lblLogoutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 9), 2, true));
        lblLogoutBtn.setPreferredSize(new java.awt.Dimension(100, 50));
        lblLogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMainHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185)
                .addComponent(lblLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMainHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlBody.setBackground(new java.awt.Color(60, 60, 60));

        pnlMenu.setBackground(new java.awt.Color(60, 60, 60));
        pnlMenu.setBorder(BorderFactory.createMatteBorder(0,0,2,0, new Color(255,153,0)));
        pnlMenu.setPreferredSize(new java.awt.Dimension(1300, 54));

        lblHome.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 240, 0));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MedicineIS/resources/home.png"))); // NOI18N
        lblHome.setText("HOME PAGE");
        lblHome.setPreferredSize(new java.awt.Dimension(200, 50));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
        });

        lblAdmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 240, 0));
        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MedicineIS/resources/admin.png"))); // NOI18N
        lblAdmin.setText("ADMIN HUB");
        lblAdmin.setPreferredSize(new java.awt.Dimension(200, 50));
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlNestedBody.setBackground(new java.awt.Color(60, 60, 60));
        pnlNestedBody.setPreferredSize(new java.awt.Dimension(1300, 626));

        pnlAdmin.setBackground(new java.awt.Color(60, 60, 60));
        pnlAdmin.setPreferredSize(new java.awt.Dimension(1288, 614));

        pnlAdminDashboard.setBackground(new java.awt.Color(60, 60, 60));

        lblUpdateBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        lblUpdateBtn.setForeground(new java.awt.Color(100, 255, 200));
        lblUpdateBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdateBtn.setText("Update Information");
        lblUpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true));
        lblUpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUpdateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUpdateBtnMouseExited(evt);
            }
        });

        lblDeleteBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        lblDeleteBtn.setForeground(new java.awt.Color(100, 255, 200));
        lblDeleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeleteBtn.setText("Delete Information");
        lblDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true));
        lblDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeleteBtnMouseExited(evt);
            }
        });

        lblAddInfo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblAddInfo.setForeground(new java.awt.Color(100, 240, 200));
        lblAddInfo.setText("<html>For <span style=\"color:rgb(255, 240, 0)\"><strong>adding</strong></span> medicine information click the button below.");

        lblAdminAddBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblAdminAddBtn.setForeground(new java.awt.Color(100, 255, 200));
        lblAdminAddBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminAddBtn.setText("Add Information");
        lblAdminAddBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true));
        lblAdminAddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminAddBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminAddBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminAddBtnMouseExited(evt);
            }
        });

        scrPaneTable.setBackground(new java.awt.Color(60, 60, 60));
        scrPaneTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true));
        scrPaneTable.setFocusable(false);

        tblMedicineDatabase.setBackground(new java.awt.Color(60, 60, 60));
        tblMedicineDatabase.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tblMedicineDatabase.setForeground(new java.awt.Color(100, 255, 200));
        tblMedicineDatabase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Strength(mg)", "Dosage Form", "Manufacturer", "Price", "Usage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicineDatabase.setFocusable(false);
        tblMedicineDatabase.setRowHeight(25);
        tblMedicineDatabase.setSelectionBackground(new java.awt.Color(100, 255, 200));
        tblMedicineDatabase.setSelectionForeground(new java.awt.Color(60, 60, 60));
        tblMedicineDatabase.setShowHorizontalLines(true);
        tblMedicineDatabase.getTableHeader().setReorderingAllowed(false);
        scrPaneTable.setViewportView(tblMedicineDatabase);
        if (tblMedicineDatabase.getColumnModel().getColumnCount() > 0) {
            tblMedicineDatabase.getColumnModel().getColumn(0).setMinWidth(130);
            tblMedicineDatabase.getColumnModel().getColumn(0).setPreferredWidth(130);
            tblMedicineDatabase.getColumnModel().getColumn(0).setMaxWidth(130);
            tblMedicineDatabase.getColumnModel().getColumn(1).setMinWidth(150);
            tblMedicineDatabase.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblMedicineDatabase.getColumnModel().getColumn(1).setMaxWidth(150);
            tblMedicineDatabase.getColumnModel().getColumn(2).setMinWidth(130);
            tblMedicineDatabase.getColumnModel().getColumn(2).setPreferredWidth(130);
            tblMedicineDatabase.getColumnModel().getColumn(2).setMaxWidth(130);
            tblMedicineDatabase.getColumnModel().getColumn(3).setMinWidth(150);
            tblMedicineDatabase.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblMedicineDatabase.getColumnModel().getColumn(3).setMaxWidth(150);
            tblMedicineDatabase.getColumnModel().getColumn(4).setMinWidth(180);
            tblMedicineDatabase.getColumnModel().getColumn(4).setPreferredWidth(180);
            tblMedicineDatabase.getColumnModel().getColumn(4).setMaxWidth(180);
            tblMedicineDatabase.getColumnModel().getColumn(5).setMinWidth(170);
            tblMedicineDatabase.getColumnModel().getColumn(5).setPreferredWidth(170);
            tblMedicineDatabase.getColumnModel().getColumn(5).setMaxWidth(170);
        }

        lblDatabasePageLogo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        lblDatabasePageLogo.setForeground(new java.awt.Color(100, 255, 200));
        lblDatabasePageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medicineis/resources/medicine records.png"))); // NOI18N

        lblAdminError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        lblAdminError.setForeground(new java.awt.Color(200, 90, 0));
        lblAdminError.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        txtSearchBar.setBackground(new java.awt.Color(60, 60, 60));
        txtSearchBar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtSearchBar.setForeground(new java.awt.Color(100, 255, 200));
        txtSearchBar.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Search", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 18), new java.awt.Color(100, 255, 200))); // NOI18N

        lblSearchIcon.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblSearchIcon.setForeground(new java.awt.Color(100, 255, 200));
        lblSearchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medicineis/resources/search.png"))); // NOI18N
        lblSearchIcon.setFocusable(false);
        lblSearchIcon.setRequestFocusEnabled(false);
        lblSearchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSearchIconMouseEntered(evt);
            }
        });

        comboxSortItems.setBackground(new java.awt.Color(153, 153, 153));
        comboxSortItems.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        comboxSortItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID: A - Z", "ID: Z - A", "Name: A - Z", "Name: Z - A", "Strength: Low - High", "Strength: High - Low", "Price: Low - High", "Price: High - Low", "Manufacturer: A - Z", "Manufacturer: Z - A" }));
        comboxSortItems.setBorder(null);
        comboxSortItems.setFocusable(false);
        comboxSortItems.setLightWeightPopupEnabled(false);
        comboxSortItems.setPreferredSize(new java.awt.Dimension(200, 40));
        comboxSortItems.setRequestFocusEnabled(false);
        comboxSortItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxSortItemsActionPerformed(evt);
            }
        });

        lblSearchError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblSearchError.setForeground(new java.awt.Color(200, 90, 0));

        lblAddInfoVerification.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAddInfoVerification.setForeground(new java.awt.Color(100, 255, 200));

        lblConfirmationMsg.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        lblConfirmationMsg.setForeground(new java.awt.Color(100, 255, 200));
        lblConfirmationMsg.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        lblSortText.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblSortText.setForeground(new java.awt.Color(100, 255, 200));
        lblSortText.setText("Sort By:");

        javax.swing.GroupLayout pnlAdminDashboardLayout = new javax.swing.GroupLayout(pnlAdminDashboard);
        pnlAdminDashboard.setLayout(pnlAdminDashboardLayout);
        pnlAdminDashboardLayout.setHorizontalGroup(
            pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminDashboardLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblAddInfoVerification, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                        .addComponent(lblAddInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
                    .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminDashboardLayout.createSequentialGroup()
                            .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblAdminError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlAdminDashboardLayout.createSequentialGroup()
                                    .addComponent(lblUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblConfirmationMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlAdminDashboardLayout.createSequentialGroup()
                            .addComponent(lblDatabasePageLogo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 506, Short.MAX_VALUE)
                            .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSearchBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSearchError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addComponent(lblSearchIcon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSortText, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(comboxSortItems, 0, 240, Short.MAX_VALUE)))
                        .addComponent(lblAdminAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        pnlAdminDashboardLayout.setVerticalGroup(
            pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminDashboardLayout.createSequentialGroup()
                .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAdminDashboardLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblSearchIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminDashboardLayout.createSequentialGroup()
                                .addComponent(lblSortText)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(comboxSortItems, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addComponent(lblSearchError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDatabasePageLogo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(2, 2, 2)
                .addComponent(scrPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblConfirmationMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblAdminError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblAddInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblAdminAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblAddInfoVerification, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1282, Short.MAX_VALUE)
            .addGroup(pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAdminLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlAdminDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAdminLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlAdminDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout pnlNestedBodyLayout = new javax.swing.GroupLayout(pnlNestedBody);
        pnlNestedBody.setLayout(pnlNestedBodyLayout);
        pnlNestedBodyLayout.setHorizontalGroup(
            pnlNestedBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNestedBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 1282, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNestedBodyLayout.setVerticalGroup(
            pnlNestedBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNestedBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addComponent(pnlNestedBody, javax.swing.GroupLayout.PREFERRED_SIZE, 1294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlNestedBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHome.setBackground(new java.awt.Color(60, 60, 60));
        pnlHome.setPreferredSize(new java.awt.Dimension(1276, 600));

        lblBodyHeading.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        lblBodyHeading.setForeground(new java.awt.Color(100, 255, 200));
        lblBodyHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBodyHeading.setText("<html>WELCOME TO OUR <span style=\"color:rgb(255,240,0);\">PHARMACEUTICALS </span>INFORMATION SYSTEM</html>");

        lblWebDesc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblWebDesc.setForeground(new java.awt.Color(100, 255, 200));
        lblWebDesc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWebDesc.setText("<html>Find extensive information on a wide range of medications easily. We <br>help healthcare providers and patients make informed decisions about medication use by providing quick access to accurate details like Name, <br>it's Manufacturers, Usage and availability.</htmk>");
        lblWebDesc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblAdminDesc.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblAdminDesc.setForeground(new java.awt.Color(100, 255, 200));
        lblAdminDesc.setText("<html>You can add new medicine information, delete records, & update existing entries to keep the database accurate.</html>");
        lblAdminDesc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblLinkHelper.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblLinkHelper.setForeground(new java.awt.Color(100, 255, 200));
        lblLinkHelper.setText("Access");

        lblHomePagePhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHomePagePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/medicineis/resources/Homepagephoto.png"))); // NOI18N

        lblAdminLink.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lblAdminLink.setForeground(new java.awt.Color(255, 240, 0));
        lblAdminLink.setText("Admin Control");
        lblAdminLink.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 240, 0)));
        lblAdminLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminLinkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBodyHeading)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addComponent(lblHomePagePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWebDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdminDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlHomeLayout.createSequentialGroup()
                                .addComponent(lblLinkHelper)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAdminLink)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(100, 100, 100))
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblBodyHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblHomePagePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlHomeLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblWebDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAdminDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLinkHelper, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdminLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pnlAddMedicine.setBackground(new java.awt.Color(60, 60, 60));

        lblAddCancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblAddCancel.setForeground(new java.awt.Color(255, 90, 0));
        lblAddCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddCancel.setText("Cancel");
        lblAddCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 9), 2, true));
        lblAddCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddCancelMouseExited(evt);
            }
        });

        txtAddMedId.setBackground(new java.awt.Color(60, 60, 60));
        txtAddMedId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtAddMedId.setForeground(new java.awt.Color(100, 255, 200));
        txtAddMedId.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtAddMedName.setBackground(new java.awt.Color(60, 60, 60));
        txtAddMedName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtAddMedName.setForeground(new java.awt.Color(100, 255, 200));
        txtAddMedName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtAddMedStrength.setBackground(new java.awt.Color(60, 60, 60));
        txtAddMedStrength.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtAddMedStrength.setForeground(new java.awt.Color(100, 255, 200));
        txtAddMedStrength.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Strength (mg)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtAddMedDosageForm.setBackground(new java.awt.Color(60, 60, 60));
        txtAddMedDosageForm.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtAddMedDosageForm.setForeground(new java.awt.Color(100, 255, 200));
        txtAddMedDosageForm.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Dosage Form", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtAddMedManufacturer.setBackground(new java.awt.Color(60, 60, 60));
        txtAddMedManufacturer.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtAddMedManufacturer.setForeground(new java.awt.Color(100, 255, 200));
        txtAddMedManufacturer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Manufacturer", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtAddMedPrice.setBackground(new java.awt.Color(60, 60, 60));
        txtAddMedPrice.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtAddMedPrice.setForeground(new java.awt.Color(100, 255, 200));
        txtAddMedPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Price (Rs.)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtAddMedUsage.setBackground(new java.awt.Color(60, 60, 60));
        txtAddMedUsage.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtAddMedUsage.setForeground(new java.awt.Color(100, 255, 200));
        txtAddMedUsage.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Usage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        lblAddMedBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        lblAddMedBtn.setForeground(new java.awt.Color(100, 255, 200));
        lblAddMedBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddMedBtn.setText("Add New Medicine");
        lblAddMedBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true));
        lblAddMedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMedBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddMedBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddMedBtnMouseExited(evt);
            }
        });

        lblAddIdError.setBackground(new java.awt.Color(60, 60, 60));
        lblAddIdError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAddIdError.setForeground(new java.awt.Color(200, 90, 0));

        lblAddDosageFormError.setBackground(new java.awt.Color(60, 60, 60));
        lblAddDosageFormError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAddDosageFormError.setForeground(new java.awt.Color(200, 90, 0));

        lblAddNameError.setBackground(new java.awt.Color(60, 60, 60));
        lblAddNameError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAddNameError.setForeground(new java.awt.Color(200, 90, 0));

        lblAddPriceError.setBackground(new java.awt.Color(60, 60, 60));
        lblAddPriceError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAddPriceError.setForeground(new java.awt.Color(200, 90, 0));

        lblAddStrengthError.setBackground(new java.awt.Color(60, 60, 60));
        lblAddStrengthError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAddStrengthError.setForeground(new java.awt.Color(200, 90, 0));

        lblAddManufacturerError.setBackground(new java.awt.Color(60, 60, 60));
        lblAddManufacturerError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAddManufacturerError.setForeground(new java.awt.Color(200, 90, 0));

        lblAddUsageError.setBackground(new java.awt.Color(60, 60, 60));
        lblAddUsageError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAddUsageError.setForeground(new java.awt.Color(200, 90, 0));

        lblAddMedClear.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        lblAddMedClear.setForeground(new java.awt.Color(200, 90, 0));
        lblAddMedClear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddMedClear.setText("Clear");
        lblAddMedClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 9), 2, true));
        lblAddMedClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMedClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddMedClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddMedClearMouseExited(evt);
            }
        });

        lblAddError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblAddError.setForeground(new java.awt.Color(200, 90, 0));
        lblAddError.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout pnlAddMedicineLayout = new javax.swing.GroupLayout(pnlAddMedicine);
        pnlAddMedicine.setLayout(pnlAddMedicineLayout);
        pnlAddMedicineLayout.setHorizontalGroup(
            pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAddCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                                    .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAddIdError, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddMedId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblAddNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtAddMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtAddMedStrength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAddStrengthError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(15, 15, 15)
                                    .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAddMedPrice)
                                        .addComponent(txtAddMedDosageForm)
                                        .addComponent(txtAddMedManufacturer)
                                        .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblAddDosageFormError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblAddPriceError, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lblAddManufacturerError, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(txtAddMedUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblAddUsageError, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddMedicineLayout.createSequentialGroup()
                                .addComponent(lblAddMedClear, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAddError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAddMedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        pnlAddMedicineLayout.setVerticalGroup(
            pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddMedId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddMedDosageForm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                        .addComponent(lblAddIdError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddMedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAddDosageFormError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddMedicineLayout.createSequentialGroup()
                        .addComponent(lblAddNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddMedStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddMedManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAddPriceError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddStrengthError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddManufacturerError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(txtAddMedUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblAddUsageError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddMedClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(lblAddError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pnlUpdateMedicine.setBackground(new java.awt.Color(60, 60, 60));
        pnlUpdateMedicine.setForeground(new java.awt.Color(100, 255, 200));

        lblUpdateCancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblUpdateCancel.setForeground(new java.awt.Color(200, 90, 0));
        lblUpdateCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdateCancel.setText("Cancel");
        lblUpdateCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 90, 9), 2, true));
        lblUpdateCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUpdateCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUpdateCancelMouseExited(evt);
            }
        });

        txtUpdateMedId.setBackground(new java.awt.Color(60, 60, 60));
        txtUpdateMedId.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtUpdateMedId.setForeground(new java.awt.Color(100, 255, 200));
        txtUpdateMedId.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "ID", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtUpdateMedName.setBackground(new java.awt.Color(60, 60, 60));
        txtUpdateMedName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtUpdateMedName.setForeground(new java.awt.Color(100, 255, 200));
        txtUpdateMedName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtUpdateMedStrength.setBackground(new java.awt.Color(60, 60, 60));
        txtUpdateMedStrength.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtUpdateMedStrength.setForeground(new java.awt.Color(100, 255, 200));
        txtUpdateMedStrength.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Strength (mg)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtUpdateMedDosageForm.setBackground(new java.awt.Color(60, 60, 60));
        txtUpdateMedDosageForm.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtUpdateMedDosageForm.setForeground(new java.awt.Color(100, 255, 200));
        txtUpdateMedDosageForm.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Dosage Form", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtUpdateMedManufacturer.setBackground(new java.awt.Color(60, 60, 60));
        txtUpdateMedManufacturer.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtUpdateMedManufacturer.setForeground(new java.awt.Color(100, 255, 200));
        txtUpdateMedManufacturer.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Manufacturer", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtUpdateMedPrice.setBackground(new java.awt.Color(60, 60, 60));
        txtUpdateMedPrice.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtUpdateMedPrice.setForeground(new java.awt.Color(100, 255, 200));
        txtUpdateMedPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Price (Rs.)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtUpdateMedUsage.setBackground(new java.awt.Color(60, 60, 60));
        txtUpdateMedUsage.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtUpdateMedUsage.setForeground(new java.awt.Color(100, 255, 200));
        txtUpdateMedUsage.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Usage", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        lblUpdateMedBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblUpdateMedBtn.setForeground(new java.awt.Color(100, 255, 200));
        lblUpdateMedBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdateMedBtn.setText("Update Information");
        lblUpdateMedBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true));
        lblUpdateMedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateMedBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUpdateMedBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUpdateMedBtnMouseExited(evt);
            }
        });

        lblUpdateIdError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblUpdateIdError.setForeground(new java.awt.Color(200, 90, 0));

        lblUpdateDosageFormError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblUpdateDosageFormError.setForeground(new java.awt.Color(200, 90, 0));

        lblUpdateNameError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblUpdateNameError.setForeground(new java.awt.Color(200, 90, 0));

        lblUpdatePriceError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblUpdatePriceError.setForeground(new java.awt.Color(200, 90, 0));

        lblUpdateStrengthError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblUpdateStrengthError.setForeground(new java.awt.Color(200, 90, 0));

        lblUpdateManufacturerError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblUpdateManufacturerError.setForeground(new java.awt.Color(200, 90, 0));

        lblUpdateUsageError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblUpdateUsageError.setForeground(new java.awt.Color(200, 90, 0));

        lblUpdateError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblUpdateError.setForeground(new java.awt.Color(200, 90, 0));
        lblUpdateError.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        javax.swing.GroupLayout pnlUpdateMedicineLayout = new javax.swing.GroupLayout(pnlUpdateMedicine);
        pnlUpdateMedicine.setLayout(pnlUpdateMedicineLayout);
        pnlUpdateMedicineLayout.setHorizontalGroup(
            pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateMedicineLayout.createSequentialGroup()
                .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUpdateCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateMedicineLayout.createSequentialGroup()
                                    .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUpdateMedName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblUpdateNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(15, 15, 15)
                                    .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblUpdatePriceError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(txtUpdateMedPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                                    .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtUpdateMedStrength, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblUpdateStrengthError, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(15, 15, 15)
                                    .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUpdateMedManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblUpdateManufacturerError, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(txtUpdateMedUsage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                                        .addGap(315, 315, 315)
                                        .addComponent(lblUpdateMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblUpdateUsageError, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblUpdateError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                                .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblUpdateIdError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtUpdateMedId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblUpdateDosageFormError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtUpdateMedDosageForm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        pnlUpdateMedicineLayout.setVerticalGroup(
            pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUpdateCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateMedId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateMedDosageForm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUpdateIdError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateDosageFormError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUpdateMedicineLayout.createSequentialGroup()
                        .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUpdateMedPrice)
                            .addComponent(txtUpdateMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(lblUpdateNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUpdatePriceError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUpdateMedStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateMedManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlUpdateMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUpdateStrengthError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateManufacturerError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(txtUpdateMedUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblUpdateUsageError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblUpdateMedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblUpdateError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEDICINE INVENTORY SYSTEM");
        setBounds(new java.awt.Rectangle(100, 15, 15, 15));
        setLocation(new java.awt.Point(105, 10));
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 800));

        pnlLogin.setBackground(new java.awt.Color(50, 50, 50));
        pnlLogin.setPreferredSize(new java.awt.Dimension(1300, 800));

        lblHomePhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/MedicineIS/resources/LoginPagePhoto.png"))); // NOI18N

        txtUsername.setBackground(new java.awt.Color(50, 50, 50));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(100, 255, 200));
        txtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        txtPassword.setBackground(new java.awt.Color(50, 50, 50));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(100, 255, 200));
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 255, 200), 2, true), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(100, 255, 200))); // NOI18N

        lblHeadingLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblHeadingLogin.setForeground(new java.awt.Color(100, 255, 200));
        lblHeadingLogin.setText("<html>WELCOME TO OUR<span style=\"color: rgb(255, 240, 0)\"><br>PHARMACEUTICALS</span> DATABASE</html>");

        lblSubHeading1Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubHeading1Login.setForeground(new java.awt.Color(100, 255, 200));
        lblSubHeading1Login.setText("<html>EMPOWER YOURSELF WITH ACCURATE<br> DRUG INFORMATION </html>");

        lblSubHeading2Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubHeading2Login.setForeground(new java.awt.Color(100, 255, 200));
        lblSubHeading2Login.setText("<html>ACCESS OUR VAST & COMPREHENSIVE<br> MEDICINE DATABASE</html>");

        lblLoginButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblLoginButton.setForeground(new java.awt.Color(100, 255, 200));
        lblLoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginButton.setText("SIGN IN");
        lblLoginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 255, 200), 3));
        lblLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginButtonMouseExited(evt);
            }
        });

        lblUsernameError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblUsernameError.setForeground(new java.awt.Color(200, 90, 0));

        lblPasswordError.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblPasswordError.setForeground(new java.awt.Color(200, 90, 0));

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSubHeading1Login)
                    .addComponent(lblSubHeading2Login)
                    .addComponent(lblHomePhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblHeadingLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(lblLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(237, 237, 237))))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblHomePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSubHeading2Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSubHeading1Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblHeadingLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblUsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblPasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(225, 225, 225))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * adds bottom color to the label
     *
     * @param label the label passed for adding bottom color
     */
    private void addBottomColor(JLabel label) {
        label.setBorder(BorderFactory.createMatteBorder(0, 0, 6, 0, new Color(255, 153, 0)));
    }

    /**
     * removes bottom color to the label
     *
     * @param label the label passed for removing bottom color
     */
    private void removeBottomColor(JLabel label) {
        label.setBorder(BorderFactory.createEmptyBorder());
    }

    /**
     * sets the background color orange to the label
     *
     * @param label the label passed for setting label color to orange
     */
    private void setOrangeBgColor(JLabel label) {
        label.repaint();
        label.setOpaque(true);
        label.setBackground(new Color(240, 140, 0));
        label.setForeground(new Color(60, 60, 60));
    }

    /**
     * sets the background color green to the label
     *
     * @param label the label passed for setting label color to green
     */
    private void setGreenBgColor(JLabel label) {
        label.repaint();
        label.setOpaque(true);
        label.setBackground(new Color(50, 205, 150));
        label.setForeground(new Color(60, 60, 60));
    }

    /**
     * sets the background color red to the label
     *
     * @param label the label passed for setting label color to red
     */
    private void setRedBgColor(JLabel label) {
        label.repaint();
        label.setOpaque(true);
        label.setBackground(new Color(170, 50, 0));
        label.setForeground(new Color(230, 230, 230));
    }

    /**
     * removes the orange background color in labels
     *
     * @param label the label passed for removing background color
     */
    private void removeOrangeBgColor(JLabel label) {
        label.setOpaque(false);
        label.setForeground(new Color(255, 240, 0));
        label.repaint();
    }

    /**
     * removes the green background color in labels
     *
     * @param label the label passed for removing background color
     */
    private void removeGreenBgColor(JLabel label) {
        label.setOpaque(false);
        label.setForeground(new Color(100, 255, 200));
        label.repaint();
    }

    /**
     * removes the red background color in labels
     *
     * @param label the label passed for removing background color
     */
    private void removeRedBgColor(JLabel label) {
        label.setOpaque(false);
        label.setForeground(new Color(255, 90, 0));
        label.repaint();
    }

    /**
     * This method loads the homepage after being called.
     */
    private void loadHomePage() {
        // adds bottom color on home page menu item
        addBottomColor(lblHome);
        // removes bottom color on admin page
        removeBottomColor(lblAdmin);
        // changes page to home page
        changeBodyPanels("HomePage");
        // resets the admin page
        changeAdminPanels("AdminDashboard");
        // making the admin pages default 
        clearDashboardErrors();
        clearDashboardTxts();
        clearAddErrors();
        clearAddTxts();
        clearUpdateErrors();
        // Clearing selection of row in the table
        tblMedicineDatabase.clearSelection();
    }

    /**
     * This method loads the admin page after being called.
     */
    private void loadAdminPage() {
        // default sorting by medicine id
        performSorting();
        // adds bottom color to the "ADMIN HUB" label in menu bar
        addBottomColor(lblAdmin);
        // removes bottom color of the "HOME PAGE" label 
        removeBottomColor(lblHome);

        // changes the page to admin page and show default page
        changeBodyPanels("AdminPage");
        changeBodyPanels("AdminDashboard");
    }

    /**
     * Multiple data are added to the Array List initially, then added to the
     * table and displayed using registerMedicine method.
     */
    private void initializeData() {
        // initializing medicineList as Array list
        medicineList = new ArrayList();

        // calling registerMedicine method to add objects to the table
        registerMedicine(new MedicineInfo("MED001", "Aspirin", 325, "Tablet", "Bayer AG", 4000, "Refiefs pain and inflammation"));
        registerMedicine(new MedicineInfo("MED008", "Ibuprofen", 200, "Liquid", "Pfizer", 2500, "Reduces pain and fever"));
        registerMedicine(new MedicineInfo("MED006", "Tylenol", 325, "Liquid", "Johnson and Johnson", 2000, "Pain relief and fever reducer"));
        registerMedicine(new MedicineInfo("MED002", "Metformin", 500, "Tablet", "Bristol Myers", 3000, "Diabetes blood sugar control"));
        registerMedicine(new MedicineInfo("MED007", "Delsym", 200, "Liquid", "Reckitt Benckiser", 3500, "Cough suppressant"));
        registerMedicine(new MedicineInfo("MED003", "Amoxicillin", 500, "Capsule", "Sandoz", 1800, "Bacterial infections"));
        registerMedicine(new MedicineInfo("MED005", "Omeprazole", 20, "Capsule", "AstraZeneca", 2200, "Treats acid reflux and ulcers"));
        registerMedicine(new MedicineInfo("MED004", "Atorvastatin", 40, "Tablet", "Ranbaxy", 1700, "Lowers cholesterol levels"));
        registerMedicine(new MedicineInfo("MED010", "Cetirizine", 10, "Tablet", "Sanofi", 1800, "Relieves allergy symptoms"));
        registerMedicine(new MedicineInfo("MED009", "Ciprofloxacin", 500, "Tablet", "Sun Pharma", 1400, "Treats bacterial infections"));
    }

    /**
     * This method takes the object of MedicineInfo and adds it to the table.
     *
     * @param medicine the object to be added to the table.
     */
    private void registerMedicine(MedicineInfo medicine) {
        // adding the object of MedicineInfo to the medicineList
        medicineList.add(medicine);

        // typecasting the table's model to DefaultTableModel
        DefaultTableModel table = (DefaultTableModel) tblMedicineDatabase.getModel();

        // adding the objects to the table using addRow method of DefaultTableModel.
        table.addRow(new Object[]{
            medicine.getMedId(),
            medicine.getMedName(),
            medicine.getMedStrength(),
            medicine.getMedDosageForm(),
            medicine.getMedManufacturer(),
            medicine.getMedPrice(),
            medicine.getMedUsage()
        });
    }

    /**
     * when clicked on home label, loads the homepage
     * 
     * @param evt the mouse event triggered by clicking the home label on the menu bar
     */
    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // changes the page to home page.
        loadHomePage();
    }//GEN-LAST:event_lblHomeMouseClicked

    /**
     * when clicked on admin label, loads the admin page
     * 
     * @param evt the mouse event triggered by clicking the admin label on the menu bar
     */
    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        // loads the admin page with default admin dashboard page
        loadAdminPage();
    }//GEN-LAST:event_lblAdminMouseClicked

    /**
     * when hovered on home label, changes the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters home label
     */
    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        // change cursor to hand cursor
        lblHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // change background color to orange
        setOrangeBgColor(lblHome);
    }//GEN-LAST:event_lblHomeMouseEntered

    /**
     * when hovered on admin label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters admin label
     */
    private void lblAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseEntered
        // change cursor to hand cursor
        lblAdmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // change background color to orange
        setOrangeBgColor(lblAdmin);
    }//GEN-LAST:event_lblAdminMouseEntered

    /**
     * When stop hovering on home label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits home label
     */
    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        removeOrangeBgColor(lblHome);
    }//GEN-LAST:event_lblHomeMouseExited

    /**
     * when stop hovering on admin label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits admin label 
     */
    private void lblAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseExited
        removeOrangeBgColor(lblAdmin);
    }//GEN-LAST:event_lblAdminMouseExited

    /**
     * Update the UI by switching to login page and switching the system to default
     * 
     * @param evt the mouse event triggered by clicking on the logout label 
     */
    private void lblLogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutBtnMouseClicked
        // ask for confirmation
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", 
                "CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // if deletion confirmed then
        if (response == JOptionPane.YES_OPTION) {
            changeBodyPanels("HomePage");
            addBottomColor(lblHome);
            removeBottomColor(lblAdmin);
            changeAdminPanels("AdminDashboard");
            clearDashboardTxts();
            clearDashboardErrors();
            clearAddTxts();
            clearAddErrors();
            clearUpdateErrors();
            comboxSortItems.setSelectedItem("ID: A - Z");
            changeMainPanels("LoginPanel");
        }
    }//GEN-LAST:event_lblLogoutBtnMouseClicked

    /**
     * when hovered on logout label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters logout label
     */
    private void lblLogoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutBtnMouseEntered
        lblLogoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setRedBgColor(lblLogoutBtn);
    }//GEN-LAST:event_lblLogoutBtnMouseEntered

    /**
     * When stop hovering on logout label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits logout label 
     */
    private void lblLogoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutBtnMouseExited
        removeRedBgColor(lblLogoutBtn);
    }//GEN-LAST:event_lblLogoutBtnMouseExited

    /**
     * Authenticating user by validating credentials entered by the user
     * 
     * @param evt the mouse event triggered after clicking on login label
     */
    private void lblLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginButtonMouseClicked
        // extracting username and password from the fields
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        //Setting the errors to empty
        lblUsernameError.setText("");
        lblPasswordError.setText("");
        // validating if username field empty
        if (ValidationUtil.checkNullorEmpty(username)) {
            lblUsernameError.setText("Username Required");
        }
        // validating if password field empty
        if (ValidationUtil.checkNullorEmpty(password)) {
            lblPasswordError.setText("Password Required");
        }
        // validating username and password
        if (!ValidationUtil.checkNullorEmpty(username) && !ValidationUtil.checkNullorEmpty(password)) {
            // if correct username and correct password, changes page to home page.
            if (username.equals("admin") && password.equals("admin")) {
                txtUsername.setText("");
                txtPassword.setText("");
                changeMainPanels("MainPanel");
            } else {
                // if incorrect username, displays error
                if (!username.equals("admin")) {
                    lblUsernameError.setText("Username not found");
                }
                // after correct username is entered, if incorrect password, displays error
                if (username.equals("admin")) {
                    if (!password.equals("admin")) {
                        lblPasswordError.setText("Password Incorrect");
                    }
                }
            }
        }
    }//GEN-LAST:event_lblLoginButtonMouseClicked

    /**
     * when hovered on login label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters login label
     */
    private void lblLoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginButtonMouseEntered
        lblLoginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setGreenBgColor(lblLoginButton);
    }//GEN-LAST:event_lblLoginButtonMouseEntered

    /**
     * When stop hovering on Login label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits Login label 
     */
    private void lblLoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginButtonMouseExited
        removeGreenBgColor(lblLoginButton);
    }//GEN-LAST:event_lblLoginButtonMouseExited

    /**
     * when hovered on Update label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters Update label
     */
    private void lblUpdateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateBtnMouseEntered
        lblUpdateBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setGreenBgColor(lblUpdateBtn);
    }//GEN-LAST:event_lblUpdateBtnMouseEntered

    /**
     * When stop hovering on Update label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits Update label 
     */
    private void lblUpdateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateBtnMouseExited
        removeGreenBgColor(lblUpdateBtn);
    }//GEN-LAST:event_lblUpdateBtnMouseExited

    /**
     * Sets the text of selected row of the table in the respected fields in the update page
     * 
     * @param evt the mouse event triggered after clicking update information label
     */
    private void lblUpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateBtnMouseClicked
        clearDashboardErrors();
        // getting the seleted table row
        int tableIndex = tblMedicineDatabase.getSelectedRow();

        // if no row is seleted, then show error message
        if (tableIndex == -1) {
            lblAdminError.setText("One row from the table should be selected to Update");
        } else {
            // in case of sorted data, extract the index of the seleted data from the sorted arraylist
            int arrayListIndex = tblMedicineDatabase.convertRowIndexToModel(tableIndex);

            // get the object object of the MedicineInfo from the arraylist
            MedicineInfo medicine = medicineList.get(arrayListIndex);

            // using getter methods to extract values from the arraylist
            String medId = medicine.getMedId();
            String medName = medicine.getMedName();
            String medStrength = String.valueOf(medicine.getMedStrength());
            String medDosageForm = medicine.getMedDosageForm();
            String medManufacturer = medicine.getMedManufacturer();
            String medPrice = String.valueOf(medicine.getMedPrice());
            String medUse = medicine.getMedUsage();

            // Clearing errors in the update page
            clearUpdateErrors();

            // setting the getting values from the selected object of MedicineInfo 
            changeAdminPanels("AdminUpdate");
            txtUpdateMedId.setText(medId);
            txtUpdateMedName.setText(medName);
            txtUpdateMedStrength.setText(medStrength);
            txtUpdateMedDosageForm.setText(medDosageForm);
            txtUpdateMedManufacturer.setText(medManufacturer);
            txtUpdateMedPrice.setText(medPrice);
            txtUpdateMedUsage.setText(medUse);
        }
    }//GEN-LAST:event_lblUpdateBtnMouseClicked

    /**
     * when hovered on Delete label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters Delete label
     */
    private void lblDeleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteBtnMouseEntered
        lblDeleteBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setGreenBgColor(lblDeleteBtn);
    }//GEN-LAST:event_lblDeleteBtnMouseEntered

    /**
     * When stop hovering on Delete label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits Delete label 
     */
    private void lblDeleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteBtnMouseExited
        removeGreenBgColor(lblDeleteBtn);
    }//GEN-LAST:event_lblDeleteBtnMouseExited

    /**
     * Deletes the instance of MedicineInfo of selected row from the table and the array list
     * 
     * @param evt the mouse event triggered after clicking on the delete button
     */
    private void lblDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteBtnMouseClicked
        clearDashboardErrors();
        // extracting the index of selected row from the table
        int tableIndex = tblMedicineDatabase.getSelectedRow();

        // if no row is selected, display error message
        if (tableIndex == -1) {
            lblAdminError.setText("One row from the table should be selected to Delete");
        } else {
            // ask for confirmation of row deletion 
            int response = JOptionPane.showConfirmDialog(this, "Do you want to proceed?",
                    "CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            // if deletion confirmed then
            if (response == JOptionPane.YES_OPTION) {
                // in case of table being sorted, extract the index of the sorted list
                int arrayListIndex = tblMedicineDatabase.convertRowIndexToModel(tableIndex);

                // remove the element from the arraylist
                medicineList.remove(arrayListIndex);

                // typecasting the table to DefaultTableModel
                DefaultTableModel table = (DefaultTableModel) tblMedicineDatabase.getModel();
                // removing the row from the table
                table.removeRow(tableIndex);

                lblConfirmationMsg.setForeground(new Color(100, 255, 200));
                // sort the table after deletion
                performSorting();
                // display confirmation message
                lblConfirmationMsg.setText("Medicine information has been succesfully deleted");
                lblAdminError.setText("");
            } else {
                // data deletion cancelletion message
                lblConfirmationMsg.setText("Medicine information deletion has been cancelled");
                // error color to red
                lblConfirmationMsg.setForeground(new Color(200, 90, 0));
                lblAdminError.setText("");
            }
        }
    }//GEN-LAST:event_lblDeleteBtnMouseClicked

    /**
     * when hovered on lblAdminAddBtn label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters lblAdminAddBtn label
     */
    private void lblAdminAddBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminAddBtnMouseEntered
        lblAdminAddBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setGreenBgColor(lblAdminAddBtn);
    }//GEN-LAST:event_lblAdminAddBtnMouseEntered

    /**
     * When stop hovering on lblAdminAddBtn label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits lblAdminAddBtn label 
     */
    private void lblAdminAddBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminAddBtnMouseExited
        removeGreenBgColor(lblAdminAddBtn);
        lblAddError.setText("");
    }//GEN-LAST:event_lblAdminAddBtnMouseExited

    /**
     * updates the UI by switching to add panel
     * 
     * @param evt the mouse event triggered after clicking on lblAdminAddBtn label
     */
    private void lblAdminAddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminAddBtnMouseClicked
        changeAdminPanels("AdminAddMed");
    }//GEN-LAST:event_lblAdminAddBtnMouseClicked

    /**
     * when hovered on lblAddMedBtn label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters lblAddMedBtn label
     */
    private void lblAddMedBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMedBtnMouseEntered
        lblAddMedBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setGreenBgColor(lblAddMedBtn);
    }//GEN-LAST:event_lblAddMedBtnMouseEntered

    /**
     * When stop hovering on lblAddMedBtn label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits lblAddMedBtn label 
     */
    private void lblAddMedBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMedBtnMouseExited
        removeGreenBgColor(lblAddMedBtn);
    }//GEN-LAST:event_lblAddMedBtnMouseExited

    /**
     * when hovered on lblAddCancel label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters lblAddCancel label
     */
    private void lblAddCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddCancelMouseEntered
        lblAddCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setRedBgColor(lblAddCancel);
    }//GEN-LAST:event_lblAddCancelMouseEntered

    /**
     * When stop hovering on lblAddCancel label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits lblAddCancel label 
     */
    private void lblAddCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddCancelMouseExited
        removeRedBgColor(lblAddCancel);
    }//GEN-LAST:event_lblAddCancelMouseExited

    /**
     * Asks confirmation and cancels creation of data if confirmed
     * 
     * @param evt the mouse event triggered after clicking on lblAddCancel label
     */
    private void lblAddCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddCancelMouseClicked
        // ask for confirmation of cancel adding
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel adding?",
                "CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // if confirmed to cancel then
        if (response == JOptionPane.YES_OPTION) {
            changeAdminPanels("AdminDashboard");
            clearAddTxts();
            clearAddErrors();
            lblConfirmationMsg.setForeground(new Color(200, 90, 0));
            lblConfirmationMsg.setText("New medicine data creation has been cancelled.");
        }
    }//GEN-LAST:event_lblAddCancelMouseClicked

    /**
     * Asks confirmation and cancels updating of data if confirmed
     * 
     * @param evt the mouse event triggered after clicking on lblUpdateCancel label
     */
    private void lblUpdateCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateCancelMouseClicked
        // ask for confirmation of cancel updating
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel updating?",
                "CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        // if confirmed to cancel then
        if (response == JOptionPane.YES_OPTION) {
            // change the page to admin page
            changeAdminPanels("AdminDashboard");
            clearUpdateErrors();
            // change error color to red
            lblConfirmationMsg.setForeground(new Color(200, 90, 0));
            lblConfirmationMsg.setText("Medicine data modification has been cancelled.");
        }
    }//GEN-LAST:event_lblUpdateCancelMouseClicked

    /**
     * when hovered on lblUpdateCancel label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters lblUpdateCancel label
     */
    private void lblUpdateCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateCancelMouseEntered
        lblUpdateCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setRedBgColor(lblUpdateCancel);
    }//GEN-LAST:event_lblUpdateCancelMouseEntered

    /**
     * When stop hovering on lblUpdateCancel label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits lblUpdateCancel label 
     */
    private void lblUpdateCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateCancelMouseExited
        removeRedBgColor(lblUpdateCancel);
    }//GEN-LAST:event_lblUpdateCancelMouseExited

    /**
     * when hovered on lblUpdateMedBtn label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters lblUpdateMedBtn label
     */
    private void lblUpdateMedBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMedBtnMouseEntered
        lblUpdateMedBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setGreenBgColor(lblUpdateMedBtn);
    }//GEN-LAST:event_lblUpdateMedBtnMouseEntered

    /**
     * When stop hovering on lblUpdateMedBtn label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits lblUpdateMedBtn label 
     */
    private void lblUpdateMedBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMedBtnMouseExited
        removeGreenBgColor(lblUpdateMedBtn);
    }//GEN-LAST:event_lblUpdateMedBtnMouseExited
    
    /**
     * This method clears all the text fields in the admin dashboard page.
     */
    private void clearDashboardTxts() {
        txtSearchBar.setText("");
    }

    /**
     * This method clears all the error messages in the admin dashboard page.
     */
    private void clearDashboardErrors() {
        lblAdminError.setText("");
        lblAddInfoVerification.setText("");
        lblConfirmationMsg.setText("");
        lblSearchError.setText("");
    }

    /**
     * This method clears text fields in the add panel
     */
    private void clearAddTxts() {
        // clearing the text fields in the add page
        txtAddMedId.setText("");
        txtAddMedName.setText("");
        txtAddMedStrength.setText("");
        txtAddMedDosageForm.setText("");
        txtAddMedManufacturer.setText("");
        txtAddMedPrice.setText("");
        txtAddMedUsage.setText("");
    }

    /**
     * This method clears the error messages in the add panel
     */
    private void clearAddErrors() {
        // clearing errors in the add page
        lblAddIdError.setText("");
        lblAddDosageFormError.setText("");
        lblAddNameError.setText("");
        lblAddStrengthError.setText("");
        lblAddManufacturerError.setText("");
        lblAddPriceError.setText("");
        lblAddUsageError.setText("");
        lblAddError.setText("");
    }

    /**
     * This method clears the errors messages in the text field
     */
    private void clearUpdateErrors() {
        // clearing errors in the update page
        lblUpdateIdError.setText("");
        lblUpdateDosageFormError.setText("");
        lblUpdateNameError.setText("");
        lblUpdatePriceError.setText("");
        lblUpdateStrengthError.setText("");
        lblUpdateManufacturerError.setText("");
        lblUpdateUsageError.setText("");
        lblUpdateError.setText("");
    }

    /**
     * Validates text fields input, id change and updates the medicine data if valid
     * 
     * @param evt the mouse event triggered by clicking on the update label
     */
    private void lblUpdateMedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateMedBtnMouseClicked
        // clear all errors after clicking the button
        clearUpdateErrors();
        try {
            // Get the updated data from the text fields
            String medId = txtUpdateMedId.getText();
            String medName = txtUpdateMedName.getText();
            String medForm = txtUpdateMedDosageForm.getText();
            String medStrength = String.valueOf(txtUpdateMedStrength.getText());
            String medManufacturer = txtUpdateMedManufacturer.getText();
            String medPrice = String.valueOf(txtUpdateMedPrice.getText());
            String medUsage = txtUpdateMedUsage.getText();

            boolean empty = false;
            boolean valid = true;
            // if any text fields are empty, give warning according to that.
            // validating medId
            if (ValidationUtil.checkNullorEmpty(medId)) {
                lblUpdateIdError.setText("Medicine id required");
                empty = true;
            } else if (!ValidationUtil.checkId(medId)) {
                lblUpdateIdError.setText("Invalid. Eg: MED001, MED200");
                valid = false;
            }

            // validating medName
            if (ValidationUtil.checkNullorEmpty(medName)) {
                lblUpdateNameError.setText("Medicine name required");
                empty = true;
            } else if (!ValidationUtil.checkName(medName)) {
                lblUpdateNameError.setText("Invalid. Should be Alphabets");
                valid = false;
            }

            // validating medForm
            if (ValidationUtil.checkNullorEmpty(medForm)) {
                lblUpdateDosageFormError.setText("Medicine form required");
                empty = true;
            } else if (!ValidationUtil.checkForm(medForm)) {
                lblUpdateDosageFormError.setText("Invalid. Should be Alphabets eg. Pill");
                valid = false;
            }

            //validating medManufacturer
            if (ValidationUtil.checkNullorEmpty(medManufacturer)) {
                lblUpdateManufacturerError.setText("Medicine manufacturer required");
                empty = true;
            } else if (!ValidationUtil.checkManufacturer(medManufacturer)) {
                lblUpdateManufacturerError.setText("Invalid. Should contain only alphabets");
                valid = false;
            }

            // validating medPrice
            if (ValidationUtil.checkNullorEmpty(medPrice)) {
                lblUpdatePriceError.setText("Medicine price required.");
                empty = true;
            } else {
                // using try-catch for NumberFormatException of price
                try {
                    // parsing medPrice as integer
                    int numMedPrice = Integer.parseInt(medPrice);
                    if (!ValidationUtil.checkPrice(numMedPrice)) {
                        lblUpdatePriceError.setText("Invalid. Should be more than 0");
                        valid = false;
                    }
                } catch (NumberFormatException ex) {
                    lblUpdatePriceError.setText("Should be a number.");
                }
            }

            // validating medStrength
            if (ValidationUtil.checkNullorEmpty(medStrength)) {
                lblUpdateStrengthError.setText("Medicine strength required");
                empty = true;
            } else {
                // using try-catch for NumberFormatException of strength
                try {
                    // parsing medStength as integer
                    int numMedStrength = Integer.parseInt(medStrength);
                    if (!ValidationUtil.checkStrength(numMedStrength)) {
                        lblUpdateStrengthError.setText("Invalid. Should be between 0 to 2000");
                        valid = false;
                    }
                } catch (NumberFormatException ex) {
                    lblUpdateStrengthError.setText("Should be a number.");
                }
            }

            // validating medUsage
            if (ValidationUtil.checkNullorEmpty(medUsage)) {
                lblUpdateUsageError.setText("Medicine usage required.");
                empty = true;
            } else if (!ValidationUtil.checkUsage(medUsage)) {
                lblUpdateUsageError.setText("Invalid. Should contain only alphabets.");
                valid = false;
            }

            // if any textfields are empty or validation error, stop the process
            if (empty || !valid) {
                return;
            }
            
            // get the index of the object in the table
            int tableIndex = tblMedicineDatabase.getSelectedRow();
            // Convert the table row index to model index in case of sorting
            int listIndex = tblMedicineDatabase.convertRowIndexToModel(tableIndex);
            // Retrieve the MedicineInfo object from the ArrayList using the table index
            MedicineInfo medicine = medicineList.get(listIndex);

            // While udpating the data, the medicine id should be the same
            if (medicine.getMedId().equals(medId)) {
                if (medicine.getMedName().equals(medName)
                        && medicine.getMedDosageForm().equals(medForm)
                        && medicine.getMedStrength() == Integer.parseInt(medStrength)
                        && medicine.getMedManufacturer().equals(medManufacturer)
                        && medicine.getMedPrice() == Integer.parseInt(medPrice)
                        && medicine.getMedUsage().equals(medUsage)) {
                    lblUpdateError.setText("Please alter something to update.");
                } else {
                    // ask for confirmation for updating the  data
                    int response = JOptionPane.showConfirmDialog(this,
                            "Are you sure you want to update for med id: " + medId + " ?"
                            + "\nName: " + medName + "\nDosage form: " + medForm
                            + "\nStrength: " + medStrength + "\nManufacturer: " + medManufacturer
                            + "\nPrice: " + medPrice + "\nUsuage: " + medUsage,
                            "CONFIRMATION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                    // if confirmed to update then
                    if (response == JOptionPane.YES_OPTION) {
                        // Update the MedicineInfo object with the new values from the text fields
                        medicine.setMedId(medId);
                        medicine.setMedName(medName);
                        medicine.setMedDosageForm(medForm);
                        medicine.setMedStrength(Integer.parseInt(medStrength));
                        medicine.setMedManufacturer(medManufacturer);
                        medicine.setMedPrice(Integer.parseInt(medPrice));
                        medicine.setMedUsage(medUsage);

                        // Updating the corresponding table row with the new updated values
                        tblMedicineDatabase.setValueAt(medId, tableIndex, 0);
                        tblMedicineDatabase.setValueAt(medName, tableIndex, 1);
                        tblMedicineDatabase.setValueAt(medStrength, tableIndex, 2);
                        tblMedicineDatabase.setValueAt(medForm, tableIndex, 3);
                        tblMedicineDatabase.setValueAt(medManufacturer, tableIndex, 4);
                        tblMedicineDatabase.setValueAt(medPrice, tableIndex, 5);
                        tblMedicineDatabase.setValueAt(medUsage, tableIndex, 6);

                        // sort the data after updating according to the selected item in the combo box
                        performSorting();

                        // Refresh the table to ensure it displays the updated content
                        tblMedicineDatabase.revalidate();

                        clearDashboardTxts();
                        clearDashboardErrors();
                        // Switch back to the dashboard panel and display the success message
                        changeAdminPanels("AdminDashboard");
                        lblConfirmationMsg.setForeground(new Color(100, 255, 200));
                        lblConfirmationMsg.setText("Medicine Information has been successfully updated.");
                    }
                }
            } else {
                lblUpdateError.setText("Medicine Id cannot be changed.");
            }
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_lblUpdateMedBtnMouseClicked

    /**
     * Validates text field inputs, duplicate ids and registers new medicine if valid
     * 
     * @param evt the mouse event triggered after clicking the add button
     */
    private void lblAddMedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMedBtnMouseClicked
        // clearing all the errors in the add page
        clearAddErrors();

        // using try catch for checking strength and price is a number or not
        try {
            // extracting texts from the textfields
            String medId = txtAddMedId.getText();
            String medName = txtAddMedName.getText();
            String medForm = txtAddMedDosageForm.getText();
            String medStrength = txtAddMedStrength.getText();
            String medManufacturer = txtAddMedManufacturer.getText();
            String medPrice = txtAddMedPrice.getText();
            String medUsage = txtAddMedUsage.getText();

            // declaring and initializing emtpy and valid as false and true
            boolean empty = false;
            boolean valid = true;
            // if any text fields are empty or not valid, give warning according to that
            // validating medId
            if (ValidationUtil.checkNullorEmpty(medId)) {
                lblAddIdError.setText("Medicine id required.");
                empty = true;
            } else if (!ValidationUtil.checkId(medId)) {
                lblAddIdError.setText("Invalid. Eg: MED001, MED200");
                valid = false;
            }

            // validating medName
            if (ValidationUtil.checkNullorEmpty(medName)) {
                lblAddNameError.setText("Medicine name required.");
                empty = true;
            } else if (!ValidationUtil.checkName(medName)) {
                lblAddNameError.setText("Invalid. Should contain only Alphabets.");
                valid = false;
            }

            // validating medForm
            if (ValidationUtil.checkNullorEmpty(medForm)) {
                lblAddDosageFormError.setText("Medicine form required.");
                empty = true;
            } else if (!ValidationUtil.checkForm(medForm)) {
                lblAddDosageFormError.setText("Invalid. Should be words. eg. Pill");
                valid = false;
            }

            // validating medManufacturer
            if (ValidationUtil.checkNullorEmpty(medManufacturer)) {
                lblAddManufacturerError.setText("Medicine manufacturer required.");
                empty = true;
            } else if (!ValidationUtil.checkManufacturer(medManufacturer)) {
                lblAddManufacturerError.setText("Invalid. Should contain only alphabets");
                valid = false;
            }

            // validating medStrength
            if (ValidationUtil.checkNullorEmpty(medStrength)) {
                lblAddStrengthError.setText("Medicine strength required.");
                empty = true;
            } else {
                // try-catch for NumberFormatException for Strength
                try {
                    // parsing medStrength as integer
                    int numMedStrength = Integer.parseInt(medStrength);
                    if (!ValidationUtil.checkStrength(numMedStrength)) {
                        lblAddStrengthError.setText("Invalid. Should be between 0 to 2000.");
                        valid = false;
                    }
                } catch (NumberFormatException ex) {
                    lblAddStrengthError.setText("Should be a number");
                    valid = false;
                }
            }

            // validating medPrice
            if (ValidationUtil.checkNullorEmpty(medPrice)) {
                lblAddPriceError.setText("Medicine price is required.");
                empty = true;
            } else {
                //try-catch for NumberFormatException for price
                try {
                    // parsing medPrice as integer
                    int numMedPrice = Integer.parseInt(medPrice);
                    if (!ValidationUtil.checkPrice(numMedPrice)) {
                        lblAddPriceError.setText("Invalid. Should be more than 0.");
                        valid = false;
                    }
                } catch (NumberFormatException ex) {
                    lblAddPriceError.setText("Should be a number");
                    valid = false;
                }
            }

            // validating medUsage
            if (ValidationUtil.checkNullorEmpty(medUsage)) {
                lblAddUsageError.setText("Medicine usage required.");
                empty = true;
            } else if (!ValidationUtil.checkUsage(medUsage)) {
                lblAddUsageError.setText("Invalid. Should contain only alphabets");
                valid = false;
            }

            // if any textfields are empty or validation error, stop the process
            if (empty || !valid) {
                return;
            }

            // if the Id is already present in the list, dont add to the list otherwise add.
            boolean found = false;
            // searching the medicine id entered by the user by looping through the array list.
            for (MedicineInfo medicine : medicineList) {
                if (medicine.getMedId().equals(medId)) {
                    // if the medicine id is found, set found to true
                    found = true;
                    // break the loop if found
                    break;
                }
            }

            // if the medicine is not found, then add the medicine to the arraylist and also to the table.
            if (!found) {
                // creating new object of MedicineInfo
                MedicineInfo newMedicine = new MedicineInfo(
                        medId,
                        medName,
                        Integer.parseInt(medStrength),
                        medForm,
                        medManufacturer,
                        Integer.parseInt(medPrice),
                        medUsage);
                // registering or adding the object to the table and array list
                registerMedicine(newMedicine);

                // clearing text fields in add page
                clearAddTxts();
                // clearing errors in add page
                clearAddErrors();

                // Changing admin panels to admin dashboard
                changeAdminPanels("AdminDashboard");
                // sorting the table according to the currently selected item in the sort combobox.
                performSorting();
                lblConfirmationMsg.setText("Medicine Information has been successfully Added");
            } else if (found && valid) {
                // display already exists message if the medicine id is found.
                lblAddError.setText("This medicine id already exists.");
            }
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_lblAddMedBtnMouseClicked

    /**
     * when hovered on lblSearchIcon label, change the mouse cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters lblSearchIcon label
     */
    private void lblSearchIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchIconMouseEntered
        lblSearchIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblSearchIconMouseEntered
    
    /**
     * clears the text fields and error messages from the add page
     * 
     * @param evt the mouse event triggered after clicking the clear label on add page
     */
    private void lblAddMedClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMedClearMouseClicked
        // clearing textfields and error in add panel
        clearAddTxts();
        clearAddErrors();
    }//GEN-LAST:event_lblAddMedClearMouseClicked

    /**
     * when hovered on lblAddMedClear label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters lblAddMedClear label
     */
    private void lblAddMedClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMedClearMouseEntered
        lblAddMedClear.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setRedBgColor(lblAddMedClear);
    }//GEN-LAST:event_lblAddMedClearMouseEntered

    /**
     * When stop hovering on lblAddMedClear label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits lblAddMedClear label 
     */
    private void lblAddMedClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMedClearMouseExited
        removeRedBgColor(lblAddMedClear);
    }//GEN-LAST:event_lblAddMedClearMouseExited

    /**
     * when hovered on lblAdminLink label, change the background color and cursor
     * 
     * @param evt the mouse event triggered after mouse cursor enters lblAdminLink label
     */
    private void lblAdminLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminLinkMouseEntered
        lblAdminLink.repaint();
        lblAdminLink.setForeground(new Color(230, 230, 230));
        lblAdminLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblAdminLinkMouseEntered

    /**
     * When stop hovering on lblAdminLink label, reset the background color
     * 
     * @param evt the mouse event triggered after mouse cursor exits lblAdminLink label 
     */
    private void lblAdminLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminLinkMouseExited
        lblAdminLink.setForeground(new Color(255, 240, 0));
        lblAdminLink.repaint();
    }//GEN-LAST:event_lblAdminLinkMouseExited

    /**
     * switches and displays admin page in the UI
     * 
     * @param evt the mouse event triggered after clicking on the label on the home page body
     */
    private void lblAdminLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminLinkMouseClicked
        // loads the admin page
        loadAdminPage();
    }//GEN-LAST:event_lblAdminLinkMouseClicked

    /**
     * This method sorts the table according to the selected item from the combo box.
     */
    public void performSorting() {
        // extracting selected item from the combo box
        String selectedItem = comboxSortItems.getSelectedItem().toString();
        // conditions for when to use the sorts according to the selected item
        switch (selectedItem) {
            case "Name: A - Z":
            case "Name: Z - A":
                // using insertion sort for name
                InsertionSort.performInsertionSort(medicineList, selectedItem);
                break;
            case "ID: A - Z":
            case "ID: Z - A":
            case "Manufacturer: A - Z":
            case "Manufacturer: Z - A":
                // using selction sort for Id and Manufacturer
                SelectionSort.performSelectionSort(medicineList, selectedItem);
                break;
            case "Price: High - Low":
            case "Price: Low - High":
            case "Strength: High - Low":
            case "Strength: Low - High":
                // using merge sort for price and strength
                MergeSort.performMergeSort(medicineList, selectedItem);
                break;
        }
        DefaultTableModel table = (DefaultTableModel) tblMedicineDatabase.getModel();
        // clearing the table
        table.setRowCount(0);
        // adding the sorted rows to the table
        for (MedicineInfo medicine : medicineList) {
            table.addRow(new Object[]{
                medicine.getMedId(),
                medicine.getMedName(),
                medicine.getMedStrength(),
                medicine.getMedDosageForm(),
                medicine.getMedManufacturer(),
                medicine.getMedPrice(),
                medicine.getMedUsage()
            });
            // revalidating the table
            tblMedicineDatabase.revalidate();
        }
    }

    /**
     * when the selected item is changed in the combo box, then the sorting is performed
     * 
     * @param evt action event triggered after changes made to the combo box
     */
    private void comboxSortItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxSortItemsActionPerformed
        // sorts the data in the medcine list and table
        performSorting();
    }//GEN-LAST:event_comboxSortItemsActionPerformed

    /**
     * sorts the data in medicineList and searches for the value entered by the user
     * 
     * @param evt the mouse event triggered after clicking on lblSerachIcon label
     */
    private void lblSearchIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchIconMouseClicked
        clearDashboardErrors();
        tblMedicineDatabase.clearSelection();
        // sorting the elements in the medicineList by name ascending
        List<MedicineInfo> sortedList = InsertionSort.performInsertionSort(medicineList, "Name: A - Z");

        // extracting text from the search field
        String searchedValue = txtSearchBar.getText();
        // using binary search to find the value
        MedicineInfo value = BinarySearch.findName(searchedValue, sortedList, 0, sortedList.size() - 1);

        if (ValidationUtil.checkNullorEmpty(searchedValue)) {
            lblSearchError.setText("Search field cannot be left empty");
            return;
        }
        // if value is not null then highlight the value in the table
        if (value != null) {
            DefaultTableModel table = (DefaultTableModel) tblMedicineDatabase.getModel();
            // loops until it gets the row where the medicine name is present.
            for (int i = 0; i < table.getRowCount(); i++) {
                String rowName = (String) table.getValueAt(i, 1);
                // after finding the medicine name
                if (rowName.equals(value.getMedName())) {
                    // Selects the row having seached value in the table
                    tblMedicineDatabase.setRowSelectionInterval(i, i);
                    // Scroll to the row having searched value in the table
                    tblMedicineDatabase.scrollRectToVisible(tblMedicineDatabase.getCellRect(i, 0, true));
                    break;
                }
            }
        } else {
            lblSearchError.setText("Medicine not found in the database");
        }
    }//GEN-LAST:event_lblSearchIconMouseClicked

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
            java.util.logging.Logger.getLogger(MedicineIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicineIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicineIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicineIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicineIS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboxSortItems;
    private javax.swing.JLabel lblAddCancel;
    private javax.swing.JLabel lblAddDosageFormError;
    private javax.swing.JLabel lblAddError;
    private javax.swing.JLabel lblAddIdError;
    private javax.swing.JLabel lblAddInfo;
    private javax.swing.JLabel lblAddInfoVerification;
    private javax.swing.JLabel lblAddManufacturerError;
    private javax.swing.JLabel lblAddMedBtn;
    private javax.swing.JLabel lblAddMedClear;
    private javax.swing.JLabel lblAddNameError;
    private javax.swing.JLabel lblAddPriceError;
    private javax.swing.JLabel lblAddStrengthError;
    private javax.swing.JLabel lblAddUsageError;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAdminAddBtn;
    private javax.swing.JLabel lblAdminDesc;
    private javax.swing.JLabel lblAdminError;
    private javax.swing.JLabel lblAdminLink;
    private javax.swing.JLabel lblBodyHeading;
    private javax.swing.JLabel lblConfirmationMsg;
    private javax.swing.JLabel lblDatabasePageLogo;
    private javax.swing.JLabel lblDeleteBtn;
    private javax.swing.JLabel lblHeadingLogin;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHomePagePhoto;
    private javax.swing.JLabel lblHomePhoto;
    private javax.swing.JLabel lblLinkHelper;
    private javax.swing.JLabel lblLoginButton;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoutBtn;
    private javax.swing.JLabel lblMainHead;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblSearchError;
    private javax.swing.JLabel lblSearchIcon;
    private javax.swing.JLabel lblSortText;
    private javax.swing.JLabel lblSubHeading1Login;
    private javax.swing.JLabel lblSubHeading2Login;
    private javax.swing.JLabel lblUpdateBtn;
    private javax.swing.JLabel lblUpdateCancel;
    private javax.swing.JLabel lblUpdateDosageFormError;
    private javax.swing.JLabel lblUpdateError;
    private javax.swing.JLabel lblUpdateIdError;
    private javax.swing.JLabel lblUpdateManufacturerError;
    private javax.swing.JLabel lblUpdateMedBtn;
    private javax.swing.JLabel lblUpdateNameError;
    private javax.swing.JLabel lblUpdatePriceError;
    private javax.swing.JLabel lblUpdateStrengthError;
    private javax.swing.JLabel lblUpdateUsageError;
    private javax.swing.JLabel lblUsernameError;
    private javax.swing.JLabel lblWebDesc;
    private javax.swing.JPanel pnlAddMedicine;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlAdminDashboard;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNestedBody;
    private javax.swing.JPanel pnlUpdateMedicine;
    private javax.swing.JScrollPane scrPaneTable;
    private javax.swing.JTable tblMedicineDatabase;
    private javax.swing.JTextField txtAddMedDosageForm;
    private javax.swing.JTextField txtAddMedId;
    private javax.swing.JTextField txtAddMedManufacturer;
    private javax.swing.JTextField txtAddMedName;
    private javax.swing.JTextField txtAddMedPrice;
    private javax.swing.JTextField txtAddMedStrength;
    private javax.swing.JTextField txtAddMedUsage;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearchBar;
    private javax.swing.JTextField txtUpdateMedDosageForm;
    private javax.swing.JTextField txtUpdateMedId;
    private javax.swing.JTextField txtUpdateMedManufacturer;
    private javax.swing.JTextField txtUpdateMedName;
    private javax.swing.JTextField txtUpdateMedPrice;
    private javax.swing.JTextField txtUpdateMedStrength;
    private javax.swing.JTextField txtUpdateMedUsage;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
