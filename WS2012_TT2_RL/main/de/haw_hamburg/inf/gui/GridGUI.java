package de.haw_hamburg.inf.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

public class GridGUI implements Observer {

    private JFrame frame;
    private JPanel panel;
    private JPanel panel_37;
    private JPanel panel_26;
    private JPanel panel_24;
    private JPanel panel_17;
    private JPanel panel_33;
    private JPanel panel_19;
    private JPanel panel_9;
    private JPanel panel_39;
    private JPanel panel_11;
    private JPanel panel_36;
    private JPanel panel_32;
    private JPanel panel_16;
    private JPanel panel_4;
    private JPanel panel_5;
    private JPanel panel_34;
    private JPanel panel_18;
    private JPanel panel_30;
    private JPanel panel_21;
    private JPanel panel_25;
    private JPanel panel_12;
    private JPanel panel_8;
    private JPanel panel_45;
    private JPanel panel_20;
    private JPanel panel_43;
    private JPanel panel_15;
    private JPanel panel_10;
    private JPanel panel_7;
    private JPanel panel_44;
    private JPanel panel_2;
    private JPanel panel_35;
    private JPanel panel_13;
    private JPanel panel_31;
    private JPanel panel_22;
    private JPanel panel_1;
    private JPanel panel_28;
    private JPanel panel_41;
    private JPanel panel_42;
    private JPanel panel_46;
    private JPanel panel_40;
    private JPanel panel_50;
    private JPanel panel_49;
    private JPanel panel_29;
    private JPanel panel_27;
    private JPanel panel_48;
    private JPanel panel_23;
    private JPanel panel_38;
    private JPanel panel_47;
    private JPanel panel_3;
    private JPanel panel_6;

    /**
     * Launch the application.
     */
    static GridGUI window;
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    window = new GridGUI();
                    
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GridGUI() {
        initialize();
    }

    
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(800, 600);
        
        panel = new JPanel();
        panel.setBounds(248, 13, 522, 262);
        frame.getContentPane().add(panel);
        panel.setLayout(new GridLayout(5, 10, 0, 0));
        
        panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setForeground(Color.BLACK);
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_1.setBackground(Color.WHITE);
        panel.add(panel_1);
        
        JLabel label_1 = new JLabel("1");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_1.setBounds(1, 1, 13, 51);
        panel_1.add(label_1);
        
        JLabel label_2 = new JLabel("1");
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_2.setHorizontalAlignment(SwingConstants.RIGHT);
        label_2.setBounds(39, 1, 13, 51);
        panel_1.add(label_2);
        
        JLabel label_3 = new JLabel("1");
        label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        label_3.setBounds(0, 1, 52, 16);
        panel_1.add(label_3);
        
        JLabel label_4 = new JLabel("1");
        label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        label_4.setBounds(1, 36, 51, 16);
        panel_1.add(label_4);
        
        panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setForeground(Color.BLACK);
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.setBackground(Color.WHITE);
        panel.add(panel_2);
        
        JLabel label = new JLabel("1");
        label.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label.setBounds(1, 1, 13, 51);
        panel_2.add(label);
        
        JLabel label_5 = new JLabel("1");
        label_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_5.setHorizontalAlignment(SwingConstants.RIGHT);
        label_5.setBounds(39, 1, 13, 51);
        panel_2.add(label_5);
        
        JLabel label_6 = new JLabel("1");
        label_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_6.setHorizontalAlignment(SwingConstants.CENTER);
        label_6.setBounds(0, 1, 52, 16);
        panel_2.add(label_6);
        
        JLabel label_7 = new JLabel("1");
        label_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_7.setHorizontalAlignment(SwingConstants.CENTER);
        label_7.setBounds(1, 36, 51, 16);
        panel_2.add(label_7);
        
        panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setForeground(Color.BLACK);
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_3.setBackground(Color.WHITE);
        panel.add(panel_3);
        
        JLabel label_8 = new JLabel("1");
        label_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_8.setBounds(1, 1, 13, 51);
        panel_3.add(label_8);
        
        JLabel label_9 = new JLabel("1");
        label_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_9.setHorizontalAlignment(SwingConstants.RIGHT);
        label_9.setBounds(39, 1, 13, 51);
        panel_3.add(label_9);
        
        JLabel label_10 = new JLabel("1");
        label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_10.setHorizontalAlignment(SwingConstants.CENTER);
        label_10.setBounds(0, 1, 52, 16);
        panel_3.add(label_10);
        
        JLabel label_11 = new JLabel("1");
        label_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_11.setHorizontalAlignment(SwingConstants.CENTER);
        label_11.setBounds(1, 36, 51, 16);
        panel_3.add(label_11);
        
        panel_4 = new JPanel();
        panel_4.setLayout(null);
        panel_4.setForeground(Color.BLACK);
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_4.setBackground(Color.WHITE);
        panel.add(panel_4);
        
        JLabel label_12 = new JLabel("1");
        label_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_12.setBounds(1, 1, 13, 51);
        panel_4.add(label_12);
        
        JLabel label_13 = new JLabel("1");
        label_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_13.setHorizontalAlignment(SwingConstants.RIGHT);
        label_13.setBounds(39, 1, 13, 51);
        panel_4.add(label_13);
        
        JLabel label_14 = new JLabel("1");
        label_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_14.setHorizontalAlignment(SwingConstants.CENTER);
        label_14.setBounds(0, 1, 52, 16);
        panel_4.add(label_14);
        
        JLabel label_15 = new JLabel("1");
        label_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_15.setHorizontalAlignment(SwingConstants.CENTER);
        label_15.setBounds(1, 36, 51, 16);
        panel_4.add(label_15);
        
        panel_5 = new JPanel();
        panel_5.setLayout(null);
        panel_5.setForeground(Color.BLACK);
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_5.setBackground(Color.WHITE);
        panel.add(panel_5);
        
        JLabel label_16 = new JLabel("1");
        label_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_16.setBounds(1, 1, 13, 51);
        panel_5.add(label_16);
        
        JLabel label_17 = new JLabel("1");
        label_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_17.setHorizontalAlignment(SwingConstants.RIGHT);
        label_17.setBounds(39, 1, 13, 51);
        panel_5.add(label_17);
        
        JLabel label_18 = new JLabel("1");
        label_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_18.setHorizontalAlignment(SwingConstants.CENTER);
        label_18.setBounds(0, 1, 52, 16);
        panel_5.add(label_18);
        
        JLabel label_19 = new JLabel("1");
        label_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_19.setHorizontalAlignment(SwingConstants.CENTER);
        label_19.setBounds(1, 36, 51, 16);
        panel_5.add(label_19);
        
        panel_6 = new JPanel();
        panel_6.setLayout(null);
        panel_6.setForeground(Color.BLACK);
        panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_6.setBackground(Color.WHITE);
        panel.add(panel_6);
        
        JLabel label_20 = new JLabel("1");
        label_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_20.setBounds(1, 1, 13, 51);
        panel_6.add(label_20);
        
        JLabel label_21 = new JLabel("1");
        label_21.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_21.setHorizontalAlignment(SwingConstants.RIGHT);
        label_21.setBounds(39, 1, 13, 51);
        panel_6.add(label_21);
        
        JLabel label_22 = new JLabel("1");
        label_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_22.setHorizontalAlignment(SwingConstants.CENTER);
        label_22.setBounds(0, 1, 52, 16);
        panel_6.add(label_22);
        
        JLabel label_23 = new JLabel("1");
        label_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_23.setHorizontalAlignment(SwingConstants.CENTER);
        label_23.setBounds(1, 36, 51, 16);
        panel_6.add(label_23);
        
        panel_7 = new JPanel();
        panel_7.setLayout(null);
        panel_7.setForeground(Color.BLACK);
        panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_7.setBackground(Color.WHITE);
        panel.add(panel_7);
        
        JLabel label_24 = new JLabel("1");
        label_24.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_24.setBounds(1, 1, 13, 51);
        panel_7.add(label_24);
        
        JLabel label_25 = new JLabel("1");
        label_25.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_25.setHorizontalAlignment(SwingConstants.RIGHT);
        label_25.setBounds(39, 1, 13, 51);
        panel_7.add(label_25);
        
        JLabel label_26 = new JLabel("1");
        label_26.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_26.setHorizontalAlignment(SwingConstants.CENTER);
        label_26.setBounds(0, 1, 52, 16);
        panel_7.add(label_26);
        
        JLabel label_27 = new JLabel("1");
        label_27.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_27.setHorizontalAlignment(SwingConstants.CENTER);
        label_27.setBounds(1, 36, 51, 16);
        panel_7.add(label_27);
        
        panel_8 = new JPanel();
        panel_8.setLayout(null);
        panel_8.setForeground(Color.BLACK);
        panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_8.setBackground(Color.WHITE);
        panel.add(panel_8);
        
        JLabel label_28 = new JLabel("1");
        label_28.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_28.setBounds(1, 1, 13, 51);
        panel_8.add(label_28);
        
        JLabel label_29 = new JLabel("1");
        label_29.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_29.setHorizontalAlignment(SwingConstants.RIGHT);
        label_29.setBounds(39, 1, 13, 51);
        panel_8.add(label_29);
        
        JLabel label_30 = new JLabel("1");
        label_30.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_30.setHorizontalAlignment(SwingConstants.CENTER);
        label_30.setBounds(0, 1, 52, 16);
        panel_8.add(label_30);
        
        JLabel label_31 = new JLabel("1");
        label_31.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_31.setHorizontalAlignment(SwingConstants.CENTER);
        label_31.setBounds(1, 36, 51, 16);
        panel_8.add(label_31);
        
        panel_9 = new JPanel();
        panel_9.setLayout(null);
        panel_9.setForeground(Color.BLACK);
        panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_9.setBackground(Color.WHITE);
        panel.add(panel_9);
        
        JLabel label_32 = new JLabel("1");
        label_32.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_32.setBounds(1, 1, 13, 51);
        panel_9.add(label_32);
        
        JLabel label_33 = new JLabel("1");
        label_33.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_33.setHorizontalAlignment(SwingConstants.RIGHT);
        label_33.setBounds(39, 1, 13, 51);
        panel_9.add(label_33);
        
        JLabel label_34 = new JLabel("1");
        label_34.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_34.setHorizontalAlignment(SwingConstants.CENTER);
        label_34.setBounds(0, 1, 52, 16);
        panel_9.add(label_34);
        
        JLabel label_35 = new JLabel("1");
        label_35.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_35.setHorizontalAlignment(SwingConstants.CENTER);
        label_35.setBounds(1, 36, 51, 16);
        panel_9.add(label_35);
        
        panel_10 = new JPanel();
        panel_10.setLayout(null);
        panel_10.setForeground(Color.BLACK);
        panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_10.setBackground(Color.GREEN);
        panel.add(panel_10);
        
        JLabel label_36 = new JLabel("1");
        label_36.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_36.setBounds(1, 1, 13, 51);
        panel_10.add(label_36);
        
        JLabel label_37 = new JLabel("1");
        label_37.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_37.setHorizontalAlignment(SwingConstants.RIGHT);
        label_37.setBounds(39, 1, 13, 51);
        panel_10.add(label_37);
        
        JLabel label_38 = new JLabel("1");
        label_38.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_38.setHorizontalAlignment(SwingConstants.CENTER);
        label_38.setBounds(0, 1, 52, 16);
        panel_10.add(label_38);
        
        JLabel label_39 = new JLabel("1");
        label_39.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_39.setHorizontalAlignment(SwingConstants.CENTER);
        label_39.setBounds(1, 36, 51, 16);
        panel_10.add(label_39);
        
        final JLabel lblTarget10 = new JLabel("T");
        lblTarget10.setEnabled(false);
        lblTarget10.setHorizontalAlignment(SwingConstants.CENTER);
        lblTarget10.setForeground(Color.RED);
        lblTarget10.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblTarget10.setBackground(Color.ORANGE);
        lblTarget10.setBounds(10, 17, 30, 16);
        panel_10.add(lblTarget10);
        
        panel_11 = new JPanel();
        panel_11.setLayout(null);
        panel_11.setForeground(Color.BLACK);
        panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_11.setBackground(Color.WHITE);
        panel.add(panel_11);
        
        JLabel label_40 = new JLabel("1");
        label_40.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_40.setBounds(1, 1, 13, 51);
        panel_11.add(label_40);
        
        JLabel label_41 = new JLabel("1");
        label_41.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_41.setHorizontalAlignment(SwingConstants.RIGHT);
        label_41.setBounds(39, 1, 13, 51);
        panel_11.add(label_41);
        
        JLabel label_42 = new JLabel("1");
        label_42.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_42.setHorizontalAlignment(SwingConstants.CENTER);
        label_42.setBounds(0, 1, 52, 16);
        panel_11.add(label_42);
        
        JLabel label_43 = new JLabel("1");
        label_43.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_43.setHorizontalAlignment(SwingConstants.CENTER);
        label_43.setBounds(1, 36, 51, 16);
        panel_11.add(label_43);
        
        panel_12 = new JPanel();
        panel_12.setLayout(null);
        panel_12.setForeground(Color.BLACK);
        panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_12.setBackground(Color.WHITE);
        panel.add(panel_12);
        
        JLabel label_44 = new JLabel("1");
        label_44.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_44.setBounds(1, 1, 13, 51);
        panel_12.add(label_44);
        
        JLabel label_45 = new JLabel("1");
        label_45.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_45.setHorizontalAlignment(SwingConstants.RIGHT);
        label_45.setBounds(39, 1, 13, 51);
        panel_12.add(label_45);
        
        JLabel label_46 = new JLabel("1");
        label_46.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_46.setHorizontalAlignment(SwingConstants.CENTER);
        label_46.setBounds(0, 1, 52, 16);
        panel_12.add(label_46);
        
        JLabel label_47 = new JLabel("1");
        label_47.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_47.setHorizontalAlignment(SwingConstants.CENTER);
        label_47.setBounds(1, 36, 51, 16);
        panel_12.add(label_47);
        
        panel_13 = new JPanel();
        panel_13.setLayout(null);
        panel_13.setForeground(Color.BLACK);
        panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_13.setBackground(Color.WHITE);
        panel.add(panel_13);
        
        JLabel label_48 = new JLabel("1");
        label_48.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_48.setBounds(1, 1, 13, 51);
        panel_13.add(label_48);
        
        JLabel label_49 = new JLabel("1");
        label_49.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_49.setHorizontalAlignment(SwingConstants.RIGHT);
        label_49.setBounds(39, 1, 13, 51);
        panel_13.add(label_49);
        
        JLabel label_50 = new JLabel("1");
        label_50.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_50.setHorizontalAlignment(SwingConstants.CENTER);
        label_50.setBounds(0, 1, 52, 16);
        panel_13.add(label_50);
        
        JLabel label_51 = new JLabel("1");
        label_51.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_51.setHorizontalAlignment(SwingConstants.CENTER);
        label_51.setBounds(1, 36, 51, 16);
        panel_13.add(label_51);
        
        JPanel panel_14 = new JPanel();
        panel_14.setLayout(null);
        panel_14.setForeground(Color.BLACK);
        panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_14.setBackground(Color.WHITE);
        panel.add(panel_14);
        
        JLabel label_52 = new JLabel("1");
        label_52.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_52.setBounds(1, 1, 13, 51);
        panel_14.add(label_52);
        
        JLabel label_53 = new JLabel("1");
        label_53.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_53.setHorizontalAlignment(SwingConstants.RIGHT);
        label_53.setBounds(39, 1, 13, 51);
        panel_14.add(label_53);
        
        JLabel label_54 = new JLabel("1");
        label_54.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_54.setHorizontalAlignment(SwingConstants.CENTER);
        label_54.setBounds(0, 1, 52, 16);
        panel_14.add(label_54);
        
        JLabel label_55 = new JLabel("1");
        label_55.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_55.setHorizontalAlignment(SwingConstants.CENTER);
        label_55.setBounds(1, 36, 51, 16);
        panel_14.add(label_55);
        
        panel_15 = new JPanel();
        panel_15.setLayout(null);
        panel_15.setForeground(Color.BLACK);
        panel_15.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_15.setBackground(Color.WHITE);
        panel.add(panel_15);
        
        JLabel label_56 = new JLabel("1");
        label_56.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_56.setBounds(1, 1, 13, 51);
        panel_15.add(label_56);
        
        JLabel label_57 = new JLabel("1");
        label_57.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_57.setHorizontalAlignment(SwingConstants.RIGHT);
        label_57.setBounds(39, 1, 13, 51);
        panel_15.add(label_57);
        
        JLabel label_58 = new JLabel("1");
        label_58.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_58.setHorizontalAlignment(SwingConstants.CENTER);
        label_58.setBounds(0, 1, 52, 16);
        panel_15.add(label_58);
        
        JLabel label_59 = new JLabel("1");
        label_59.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_59.setHorizontalAlignment(SwingConstants.CENTER);
        label_59.setBounds(1, 36, 51, 16);
        panel_15.add(label_59);
        
        panel_16 = new JPanel();
        panel_16.setLayout(null);
        panel_16.setForeground(Color.BLACK);
        panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_16.setBackground(Color.WHITE);
        panel.add(panel_16);
        
        JLabel label_60 = new JLabel("1");
        label_60.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_60.setBounds(1, 1, 13, 51);
        panel_16.add(label_60);
        
        JLabel label_61 = new JLabel("1");
        label_61.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_61.setHorizontalAlignment(SwingConstants.RIGHT);
        label_61.setBounds(39, 1, 13, 51);
        panel_16.add(label_61);
        
        JLabel label_62 = new JLabel("1");
        label_62.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_62.setHorizontalAlignment(SwingConstants.CENTER);
        label_62.setBounds(0, 1, 52, 16);
        panel_16.add(label_62);
        
        JLabel label_63 = new JLabel("1");
        label_63.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_63.setHorizontalAlignment(SwingConstants.CENTER);
        label_63.setBounds(1, 36, 51, 16);
        panel_16.add(label_63);
        
        panel_17 = new JPanel();
        panel_17.setLayout(null);
        panel_17.setForeground(Color.BLACK);
        panel_17.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_17.setBackground(Color.WHITE);
        panel.add(panel_17);
        
        JLabel label_64 = new JLabel("1");
        label_64.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_64.setBounds(1, 1, 13, 51);
        panel_17.add(label_64);
        
        JLabel label_65 = new JLabel("1");
        label_65.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_65.setHorizontalAlignment(SwingConstants.RIGHT);
        label_65.setBounds(39, 1, 13, 51);
        panel_17.add(label_65);
        
        JLabel label_66 = new JLabel("1");
        label_66.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_66.setHorizontalAlignment(SwingConstants.CENTER);
        label_66.setBounds(0, 1, 52, 16);
        panel_17.add(label_66);
        
        JLabel label_67 = new JLabel("1");
        label_67.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_67.setHorizontalAlignment(SwingConstants.CENTER);
        label_67.setBounds(1, 36, 51, 16);
        panel_17.add(label_67);
        
        panel_18 = new JPanel();
        panel_18.setLayout(null);
        panel_18.setForeground(Color.BLACK);
        panel_18.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_18.setBackground(Color.WHITE);
        panel.add(panel_18);
        
        JLabel label_68 = new JLabel("1");
        label_68.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_68.setBounds(1, 1, 13, 51);
        panel_18.add(label_68);
        
        JLabel label_69 = new JLabel("1");
        label_69.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_69.setHorizontalAlignment(SwingConstants.RIGHT);
        label_69.setBounds(39, 1, 13, 51);
        panel_18.add(label_69);
        
        JLabel label_70 = new JLabel("1");
        label_70.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_70.setHorizontalAlignment(SwingConstants.CENTER);
        label_70.setBounds(0, 1, 52, 16);
        panel_18.add(label_70);
        
        JLabel label_71 = new JLabel("1");
        label_71.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_71.setHorizontalAlignment(SwingConstants.CENTER);
        label_71.setBounds(1, 36, 51, 16);
        panel_18.add(label_71);
        
        panel_19 = new JPanel();
        panel_19.setLayout(null);
        panel_19.setForeground(Color.BLACK);
        panel_19.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_19.setBackground(Color.WHITE);
        panel.add(panel_19);
        
        JLabel label_72 = new JLabel("1");
        label_72.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_72.setBounds(1, 1, 13, 51);
        panel_19.add(label_72);
        
        JLabel label_73 = new JLabel("1");
        label_73.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_73.setHorizontalAlignment(SwingConstants.RIGHT);
        label_73.setBounds(39, 1, 13, 51);
        panel_19.add(label_73);
        
        JLabel label_74 = new JLabel("1");
        label_74.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_74.setHorizontalAlignment(SwingConstants.CENTER);
        label_74.setBounds(0, 1, 52, 16);
        panel_19.add(label_74);
        
        JLabel label_75 = new JLabel("1");
        label_75.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_75.setHorizontalAlignment(SwingConstants.CENTER);
        label_75.setBounds(1, 36, 51, 16);
        panel_19.add(label_75);
        
        panel_20 = new JPanel();
        panel_20.setLayout(null);
        panel_20.setForeground(Color.BLACK);
        panel_20.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_20.setBackground(Color.GREEN);
        panel.add(panel_20);
        
        JLabel label_76 = new JLabel("1");
        label_76.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_76.setBounds(1, 1, 13, 51);
        panel_20.add(label_76);
        
        JLabel label_77 = new JLabel("1");
        label_77.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_77.setHorizontalAlignment(SwingConstants.RIGHT);
        label_77.setBounds(39, 1, 13, 51);
        panel_20.add(label_77);
        
        JLabel label_78 = new JLabel("1");
        label_78.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_78.setHorizontalAlignment(SwingConstants.CENTER);
        label_78.setBounds(0, 1, 52, 16);
        panel_20.add(label_78);
        
        JLabel label_79 = new JLabel("1");
        label_79.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_79.setHorizontalAlignment(SwingConstants.CENTER);
        label_79.setBounds(1, 36, 51, 16);
        panel_20.add(label_79);
        
        JLabel lblTarget20 = new JLabel("T");
        lblTarget20.setEnabled(false);
        lblTarget20.setHorizontalAlignment(SwingConstants.CENTER);
        lblTarget20.setForeground(Color.RED);
        lblTarget20.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblTarget20.setBackground(Color.ORANGE);
        lblTarget20.setBounds(10, 17, 30, 16);
        panel_20.add(lblTarget20);
        
        panel_21 = new JPanel();
        panel_21.setLayout(null);
        panel_21.setForeground(Color.BLACK);
        panel_21.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_21.setBackground(Color.WHITE);
        panel.add(panel_21);
        
        JLabel label_80 = new JLabel("1");
        label_80.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_80.setBounds(1, 1, 13, 51);
        panel_21.add(label_80);
        
        JLabel label_81 = new JLabel("1");
        label_81.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_81.setHorizontalAlignment(SwingConstants.RIGHT);
        label_81.setBounds(39, 1, 13, 51);
        panel_21.add(label_81);
        
        JLabel label_82 = new JLabel("1");
        label_82.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_82.setHorizontalAlignment(SwingConstants.CENTER);
        label_82.setBounds(0, 1, 52, 16);
        panel_21.add(label_82);
        
        JLabel label_83 = new JLabel("1");
        label_83.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_83.setHorizontalAlignment(SwingConstants.CENTER);
        label_83.setBounds(1, 36, 51, 16);
        panel_21.add(label_83);
        
        panel_22 = new JPanel();
        panel_22.setLayout(null);
        panel_22.setForeground(Color.BLACK);
        panel_22.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_22.setBackground(Color.WHITE);
        panel.add(panel_22);
        
        JLabel label_84 = new JLabel("1");
        label_84.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_84.setBounds(1, 1, 13, 51);
        panel_22.add(label_84);
        
        JLabel label_85 = new JLabel("1");
        label_85.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_85.setHorizontalAlignment(SwingConstants.RIGHT);
        label_85.setBounds(39, 1, 13, 51);
        panel_22.add(label_85);
        
        JLabel label_86 = new JLabel("1");
        label_86.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_86.setHorizontalAlignment(SwingConstants.CENTER);
        label_86.setBounds(0, 1, 52, 16);
        panel_22.add(label_86);
        
        JLabel label_87 = new JLabel("1");
        label_87.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_87.setHorizontalAlignment(SwingConstants.CENTER);
        label_87.setBounds(1, 36, 51, 16);
        panel_22.add(label_87);
        
        panel_23 = new JPanel();
        panel_23.setLayout(null);
        panel_23.setForeground(Color.BLACK);
        panel_23.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_23.setBackground(Color.WHITE);
        panel.add(panel_23);
        
        JLabel label_88 = new JLabel("1");
        label_88.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_88.setBounds(1, 1, 13, 51);
        panel_23.add(label_88);
        
        JLabel label_89 = new JLabel("1");
        label_89.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_89.setHorizontalAlignment(SwingConstants.RIGHT);
        label_89.setBounds(39, 1, 13, 51);
        panel_23.add(label_89);
        
        JLabel label_90 = new JLabel("1");
        label_90.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_90.setHorizontalAlignment(SwingConstants.CENTER);
        label_90.setBounds(0, 1, 52, 16);
        panel_23.add(label_90);
        
        JLabel label_91 = new JLabel("1");
        label_91.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_91.setHorizontalAlignment(SwingConstants.CENTER);
        label_91.setBounds(1, 36, 51, 16);
        panel_23.add(label_91);
        
        panel_24 = new JPanel();
        panel_24.setLayout(null);
        panel_24.setForeground(Color.BLACK);
        panel_24.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_24.setBackground(Color.WHITE);
        panel.add(panel_24);
        
        JLabel label_92 = new JLabel("1");
        label_92.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_92.setBounds(1, 1, 13, 51);
        panel_24.add(label_92);
        
        JLabel label_93 = new JLabel("1");
        label_93.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_93.setHorizontalAlignment(SwingConstants.RIGHT);
        label_93.setBounds(39, 1, 13, 51);
        panel_24.add(label_93);
        
        JLabel label_94 = new JLabel("1");
        label_94.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_94.setHorizontalAlignment(SwingConstants.CENTER);
        label_94.setBounds(0, 1, 52, 16);
        panel_24.add(label_94);
        
        JLabel label_95 = new JLabel("1");
        label_95.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_95.setHorizontalAlignment(SwingConstants.CENTER);
        label_95.setBounds(1, 36, 51, 16);
        panel_24.add(label_95);
        
        panel_25 = new JPanel();
        panel_25.setLayout(null);
        panel_25.setForeground(Color.BLACK);
        panel_25.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_25.setBackground(Color.WHITE);
        panel.add(panel_25);
        
        JLabel label_96 = new JLabel("1");
        label_96.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_96.setBounds(1, 1, 13, 51);
        panel_25.add(label_96);
        
        JLabel label_97 = new JLabel("1");
        label_97.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_97.setHorizontalAlignment(SwingConstants.RIGHT);
        label_97.setBounds(39, 1, 13, 51);
        panel_25.add(label_97);
        
        JLabel label_98 = new JLabel("1");
        label_98.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_98.setHorizontalAlignment(SwingConstants.CENTER);
        label_98.setBounds(0, 1, 52, 16);
        panel_25.add(label_98);
        
        JLabel label_99 = new JLabel("1");
        label_99.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_99.setHorizontalAlignment(SwingConstants.CENTER);
        label_99.setBounds(1, 36, 51, 16);
        panel_25.add(label_99);
        
        panel_26 = new JPanel();
        panel_26.setLayout(null);
        panel_26.setForeground(Color.BLACK);
        panel_26.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_26.setBackground(Color.WHITE);
        panel.add(panel_26);
        
        JLabel label_100 = new JLabel("1");
        label_100.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_100.setBounds(1, 1, 13, 51);
        panel_26.add(label_100);
        
        JLabel label_101 = new JLabel("1");
        label_101.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_101.setHorizontalAlignment(SwingConstants.RIGHT);
        label_101.setBounds(39, 1, 13, 51);
        panel_26.add(label_101);
        
        JLabel label_102 = new JLabel("1");
        label_102.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_102.setHorizontalAlignment(SwingConstants.CENTER);
        label_102.setBounds(0, 1, 52, 16);
        panel_26.add(label_102);
        
        JLabel label_103 = new JLabel("1");
        label_103.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_103.setHorizontalAlignment(SwingConstants.CENTER);
        label_103.setBounds(1, 36, 51, 16);
        panel_26.add(label_103);
        
        panel_27 = new JPanel();
        panel_27.setLayout(null);
        panel_27.setForeground(Color.BLACK);
        panel_27.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_27.setBackground(Color.WHITE);
        panel.add(panel_27);
        
        JLabel label_104 = new JLabel("1");
        label_104.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_104.setBounds(1, 1, 13, 51);
        panel_27.add(label_104);
        
        JLabel label_105 = new JLabel("1");
        label_105.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_105.setHorizontalAlignment(SwingConstants.RIGHT);
        label_105.setBounds(39, 1, 13, 51);
        panel_27.add(label_105);
        
        JLabel label_106 = new JLabel("1");
        label_106.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_106.setHorizontalAlignment(SwingConstants.CENTER);
        label_106.setBounds(0, 1, 52, 16);
        panel_27.add(label_106);
        
        JLabel label_107 = new JLabel("1");
        label_107.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_107.setHorizontalAlignment(SwingConstants.CENTER);
        label_107.setBounds(1, 36, 51, 16);
        panel_27.add(label_107);
        
        panel_28 = new JPanel();
        panel_28.setLayout(null);
        panel_28.setForeground(Color.BLACK);
        panel_28.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_28.setBackground(Color.WHITE);
        panel.add(panel_28);
        
        JLabel label_108 = new JLabel("1");
        label_108.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_108.setBounds(1, 1, 13, 51);
        panel_28.add(label_108);
        
        JLabel label_109 = new JLabel("1");
        label_109.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_109.setHorizontalAlignment(SwingConstants.RIGHT);
        label_109.setBounds(39, 1, 13, 51);
        panel_28.add(label_109);
        
        JLabel label_110 = new JLabel("1");
        label_110.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_110.setHorizontalAlignment(SwingConstants.CENTER);
        label_110.setBounds(0, 1, 52, 16);
        panel_28.add(label_110);
        
        JLabel label_111 = new JLabel("1");
        label_111.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_111.setHorizontalAlignment(SwingConstants.CENTER);
        label_111.setBounds(1, 36, 51, 16);
        panel_28.add(label_111);
        
        panel_29 = new JPanel();
        panel_29.setLayout(null);
        panel_29.setForeground(Color.BLACK);
        panel_29.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_29.setBackground(Color.WHITE);
        panel.add(panel_29);
        
        JLabel label_112 = new JLabel("1");
        label_112.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_112.setBounds(1, 1, 13, 51);
        panel_29.add(label_112);
        
        JLabel label_113 = new JLabel("1");
        label_113.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_113.setHorizontalAlignment(SwingConstants.RIGHT);
        label_113.setBounds(39, 1, 13, 51);
        panel_29.add(label_113);
        
        JLabel label_114 = new JLabel("1");
        label_114.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_114.setHorizontalAlignment(SwingConstants.CENTER);
        label_114.setBounds(0, 1, 52, 16);
        panel_29.add(label_114);
        
        JLabel label_115 = new JLabel("1");
        label_115.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_115.setHorizontalAlignment(SwingConstants.CENTER);
        label_115.setBounds(1, 36, 51, 16);
        panel_29.add(label_115);
        
        panel_30 = new JPanel();
        panel_30.setLayout(null);
        panel_30.setForeground(Color.BLACK);
        panel_30.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_30.setBackground(Color.GREEN);
        panel.add(panel_30);
        
        JLabel label_116 = new JLabel("1");
        label_116.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_116.setBounds(1, 1, 13, 51);
        panel_30.add(label_116);
        
        JLabel label_117 = new JLabel("1");
        label_117.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_117.setHorizontalAlignment(SwingConstants.RIGHT);
        label_117.setBounds(39, 1, 13, 51);
        panel_30.add(label_117);
        
        JLabel label_118 = new JLabel("1");
        label_118.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_118.setHorizontalAlignment(SwingConstants.CENTER);
        label_118.setBounds(0, 1, 52, 16);
        panel_30.add(label_118);
        
        JLabel label_119 = new JLabel("1");
        label_119.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_119.setHorizontalAlignment(SwingConstants.CENTER);
        label_119.setBounds(1, 36, 51, 16);
        panel_30.add(label_119);
        
        JLabel lblTarget30 = new JLabel("T");
        lblTarget30.setEnabled(false);
        lblTarget30.setHorizontalAlignment(SwingConstants.CENTER);
        lblTarget30.setForeground(Color.RED);
        lblTarget30.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblTarget30.setBackground(Color.ORANGE);
        lblTarget30.setBounds(10, 17, 30, 16);
        panel_30.add(lblTarget30);
        
        panel_31 = new JPanel();
        panel_31.setLayout(null);
        panel_31.setForeground(Color.BLACK);
        panel_31.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_31.setBackground(Color.WHITE);
        panel.add(panel_31);
        
        JLabel label_120 = new JLabel("1");
        label_120.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_120.setBounds(1, 1, 13, 51);
        panel_31.add(label_120);
        
        JLabel label_121 = new JLabel("1");
        label_121.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_121.setHorizontalAlignment(SwingConstants.RIGHT);
        label_121.setBounds(39, 1, 13, 51);
        panel_31.add(label_121);
        
        JLabel label_122 = new JLabel("1");
        label_122.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_122.setHorizontalAlignment(SwingConstants.CENTER);
        label_122.setBounds(0, 1, 52, 16);
        panel_31.add(label_122);
        
        JLabel label_123 = new JLabel("1");
        label_123.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_123.setHorizontalAlignment(SwingConstants.CENTER);
        label_123.setBounds(1, 36, 51, 16);
        panel_31.add(label_123);
        
        panel_32 = new JPanel();
        panel_32.setLayout(null);
        panel_32.setForeground(Color.BLACK);
        panel_32.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_32.setBackground(Color.WHITE);
        panel.add(panel_32);
        
        JLabel label_124 = new JLabel("1");
        label_124.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_124.setBounds(1, 1, 13, 51);
        panel_32.add(label_124);
        
        JLabel label_125 = new JLabel("1");
        label_125.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_125.setHorizontalAlignment(SwingConstants.RIGHT);
        label_125.setBounds(39, 1, 13, 51);
        panel_32.add(label_125);
        
        JLabel label_126 = new JLabel("1");
        label_126.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_126.setHorizontalAlignment(SwingConstants.CENTER);
        label_126.setBounds(0, 1, 52, 16);
        panel_32.add(label_126);
        
        JLabel label_127 = new JLabel("1");
        label_127.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_127.setHorizontalAlignment(SwingConstants.CENTER);
        label_127.setBounds(1, 36, 51, 16);
        panel_32.add(label_127);
        
        panel_33 = new JPanel();
        panel_33.setLayout(null);
        panel_33.setForeground(Color.BLACK);
        panel_33.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_33.setBackground(Color.WHITE);
        panel.add(panel_33);
        
        JLabel label_128 = new JLabel("1");
        label_128.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_128.setBounds(1, 1, 13, 51);
        panel_33.add(label_128);
        
        JLabel label_129 = new JLabel("1");
        label_129.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_129.setHorizontalAlignment(SwingConstants.RIGHT);
        label_129.setBounds(39, 1, 13, 51);
        panel_33.add(label_129);
        
        JLabel label_130 = new JLabel("1");
        label_130.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_130.setHorizontalAlignment(SwingConstants.CENTER);
        label_130.setBounds(0, 1, 52, 16);
        panel_33.add(label_130);
        
        JLabel label_131 = new JLabel("1");
        label_131.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_131.setHorizontalAlignment(SwingConstants.CENTER);
        label_131.setBounds(1, 36, 51, 16);
        panel_33.add(label_131);
        
        panel_34 = new JPanel();
        panel_34.setLayout(null);
        panel_34.setForeground(Color.BLACK);
        panel_34.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_34.setBackground(Color.WHITE);
        panel.add(panel_34);
        
        JLabel label_132 = new JLabel("1");
        label_132.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_132.setBounds(1, 1, 13, 51);
        panel_34.add(label_132);
        
        JLabel label_133 = new JLabel("1");
        label_133.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_133.setHorizontalAlignment(SwingConstants.RIGHT);
        label_133.setBounds(39, 1, 13, 51);
        panel_34.add(label_133);
        
        JLabel label_134 = new JLabel("1");
        label_134.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_134.setHorizontalAlignment(SwingConstants.CENTER);
        label_134.setBounds(0, 1, 52, 16);
        panel_34.add(label_134);
        
        JLabel label_135 = new JLabel("1");
        label_135.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_135.setHorizontalAlignment(SwingConstants.CENTER);
        label_135.setBounds(1, 36, 51, 16);
        panel_34.add(label_135);
        
        panel_35 = new JPanel();
        panel_35.setLayout(null);
        panel_35.setForeground(Color.BLACK);
        panel_35.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_35.setBackground(Color.WHITE);
        panel.add(panel_35);
        
        JLabel label_136 = new JLabel("1");
        label_136.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_136.setBounds(1, 1, 13, 51);
        panel_35.add(label_136);
        
        JLabel label_137 = new JLabel("1");
        label_137.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_137.setHorizontalAlignment(SwingConstants.RIGHT);
        label_137.setBounds(39, 1, 13, 51);
        panel_35.add(label_137);
        
        JLabel label_138 = new JLabel("1");
        label_138.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_138.setHorizontalAlignment(SwingConstants.CENTER);
        label_138.setBounds(0, 1, 52, 16);
        panel_35.add(label_138);
        
        JLabel label_139 = new JLabel("1");
        label_139.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_139.setHorizontalAlignment(SwingConstants.CENTER);
        label_139.setBounds(1, 36, 51, 16);
        panel_35.add(label_139);
        
        panel_36 = new JPanel();
        panel_36.setLayout(null);
        panel_36.setForeground(Color.BLACK);
        panel_36.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_36.setBackground(Color.WHITE);
        panel.add(panel_36);
        
        JLabel label_140 = new JLabel("1");
        label_140.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_140.setBounds(1, 1, 13, 51);
        panel_36.add(label_140);
        
        JLabel label_141 = new JLabel("1");
        label_141.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_141.setHorizontalAlignment(SwingConstants.RIGHT);
        label_141.setBounds(39, 1, 13, 51);
        panel_36.add(label_141);
        
        JLabel label_142 = new JLabel("1");
        label_142.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_142.setHorizontalAlignment(SwingConstants.CENTER);
        label_142.setBounds(0, 1, 52, 16);
        panel_36.add(label_142);
        
        JLabel label_143 = new JLabel("1");
        label_143.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_143.setHorizontalAlignment(SwingConstants.CENTER);
        label_143.setBounds(1, 36, 51, 16);
        panel_36.add(label_143);
        
        panel_37 = new JPanel();
        panel_37.setLayout(null);
        panel_37.setForeground(Color.BLACK);
        panel_37.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_37.setBackground(Color.WHITE);
        panel.add(panel_37);
        
        JLabel label_144 = new JLabel("1");
        label_144.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_144.setBounds(1, 1, 13, 51);
        panel_37.add(label_144);
        
        JLabel label_145 = new JLabel("1");
        label_145.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_145.setHorizontalAlignment(SwingConstants.RIGHT);
        label_145.setBounds(39, 1, 13, 51);
        panel_37.add(label_145);
        
        JLabel label_146 = new JLabel("1");
        label_146.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_146.setHorizontalAlignment(SwingConstants.CENTER);
        label_146.setBounds(0, 1, 52, 16);
        panel_37.add(label_146);
        
        JLabel label_147 = new JLabel("1");
        label_147.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_147.setHorizontalAlignment(SwingConstants.CENTER);
        label_147.setBounds(1, 36, 51, 16);
        panel_37.add(label_147);
        
        panel_38 = new JPanel();
        panel_38.setLayout(null);
        panel_38.setForeground(Color.BLACK);
        panel_38.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_38.setBackground(Color.WHITE);
        panel.add(panel_38);
        
        JLabel label_148 = new JLabel("1");
        label_148.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_148.setBounds(1, 1, 13, 51);
        panel_38.add(label_148);
        
        JLabel label_149 = new JLabel("1");
        label_149.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_149.setHorizontalAlignment(SwingConstants.RIGHT);
        label_149.setBounds(39, 1, 13, 51);
        panel_38.add(label_149);
        
        JLabel label_150 = new JLabel("1");
        label_150.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_150.setHorizontalAlignment(SwingConstants.CENTER);
        label_150.setBounds(0, 1, 52, 16);
        panel_38.add(label_150);
        
        JLabel label_151 = new JLabel("1");
        label_151.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_151.setHorizontalAlignment(SwingConstants.CENTER);
        label_151.setBounds(1, 36, 51, 16);
        panel_38.add(label_151);
        
        panel_39 = new JPanel();
        panel_39.setLayout(null);
        panel_39.setForeground(Color.BLACK);
        panel_39.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_39.setBackground(Color.WHITE);
        panel.add(panel_39);
        
        JLabel label_152 = new JLabel("1");
        label_152.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_152.setBounds(1, 1, 13, 51);
        panel_39.add(label_152);
        
        JLabel label_153 = new JLabel("1");
        label_153.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_153.setHorizontalAlignment(SwingConstants.RIGHT);
        label_153.setBounds(39, 1, 13, 51);
        panel_39.add(label_153);
        
        JLabel label_154 = new JLabel("1");
        label_154.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_154.setHorizontalAlignment(SwingConstants.CENTER);
        label_154.setBounds(0, 1, 52, 16);
        panel_39.add(label_154);
        
        JLabel label_155 = new JLabel("1");
        label_155.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_155.setHorizontalAlignment(SwingConstants.CENTER);
        label_155.setBounds(1, 36, 51, 16);
        panel_39.add(label_155);
        
        panel_40 = new JPanel();
        panel_40.setLayout(null);
        panel_40.setForeground(Color.BLACK);
        panel_40.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_40.setBackground(Color.GREEN);
        panel.add(panel_40);
        
        JLabel label_156 = new JLabel("1");
        label_156.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_156.setBounds(1, 1, 13, 51);
        panel_40.add(label_156);
        
        JLabel label_157 = new JLabel("1");
        label_157.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_157.setHorizontalAlignment(SwingConstants.RIGHT);
        label_157.setBounds(39, 1, 13, 51);
        panel_40.add(label_157);
        
        JLabel label_158 = new JLabel("1");
        label_158.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_158.setHorizontalAlignment(SwingConstants.CENTER);
        label_158.setBounds(0, 1, 52, 16);
        panel_40.add(label_158);
        
        JLabel label_159 = new JLabel("1");
        label_159.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_159.setHorizontalAlignment(SwingConstants.CENTER);
        label_159.setBounds(1, 36, 51, 16);
        panel_40.add(label_159);
        
        JLabel lblTarget40 = new JLabel("T");
        lblTarget40.setEnabled(false);
        lblTarget40.setHorizontalAlignment(SwingConstants.CENTER);
        lblTarget40.setForeground(Color.RED);
        lblTarget40.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblTarget40.setBackground(Color.ORANGE);
        lblTarget40.setBounds(10, 17, 30, 16);
        panel_40.add(lblTarget40);
        
        panel_41 = new JPanel();
        panel_41.setLayout(null);
        panel_41.setForeground(Color.BLACK);
        panel_41.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_41.setBackground(Color.WHITE);
        panel.add(panel_41);
        
        JLabel label_160 = new JLabel("1");
        label_160.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_160.setBounds(1, 1, 13, 51);
        panel_41.add(label_160);
        
        JLabel label_161 = new JLabel("1");
        label_161.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_161.setHorizontalAlignment(SwingConstants.RIGHT);
        label_161.setBounds(39, 1, 13, 51);
        panel_41.add(label_161);
        
        JLabel label_162 = new JLabel("1");
        label_162.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_162.setHorizontalAlignment(SwingConstants.CENTER);
        label_162.setBounds(0, 1, 52, 16);
        panel_41.add(label_162);
        
        JLabel label_163 = new JLabel("1");
        label_163.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_163.setHorizontalAlignment(SwingConstants.CENTER);
        label_163.setBounds(1, 36, 51, 16);
        panel_41.add(label_163);
        
        panel_42 = new JPanel();
        panel_42.setLayout(null);
        panel_42.setForeground(Color.BLACK);
        panel_42.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_42.setBackground(Color.WHITE);
        panel.add(panel_42);
        
        JLabel label_164 = new JLabel("1");
        label_164.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_164.setBounds(1, 1, 13, 51);
        panel_42.add(label_164);
        
        JLabel label_165 = new JLabel("1");
        label_165.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_165.setHorizontalAlignment(SwingConstants.RIGHT);
        label_165.setBounds(39, 1, 13, 51);
        panel_42.add(label_165);
        
        JLabel label_166 = new JLabel("1");
        label_166.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_166.setHorizontalAlignment(SwingConstants.CENTER);
        label_166.setBounds(0, 1, 52, 16);
        panel_42.add(label_166);
        
        JLabel label_167 = new JLabel("1");
        label_167.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_167.setHorizontalAlignment(SwingConstants.CENTER);
        label_167.setBounds(1, 36, 51, 16);
        panel_42.add(label_167);
        
        panel_43 = new JPanel();
        panel_43.setLayout(null);
        panel_43.setForeground(Color.BLACK);
        panel_43.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_43.setBackground(Color.WHITE);
        panel.add(panel_43);
        
        JLabel label_168 = new JLabel("1");
        label_168.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_168.setBounds(1, 1, 13, 51);
        panel_43.add(label_168);
        
        JLabel label_169 = new JLabel("1");
        label_169.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_169.setHorizontalAlignment(SwingConstants.RIGHT);
        label_169.setBounds(39, 1, 13, 51);
        panel_43.add(label_169);
        
        JLabel label_170 = new JLabel("1");
        label_170.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_170.setHorizontalAlignment(SwingConstants.CENTER);
        label_170.setBounds(0, 1, 52, 16);
        panel_43.add(label_170);
        
        JLabel label_171 = new JLabel("1");
        label_171.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_171.setHorizontalAlignment(SwingConstants.CENTER);
        label_171.setBounds(1, 36, 51, 16);
        panel_43.add(label_171);
        
        panel_44 = new JPanel();
        panel_44.setLayout(null);
        panel_44.setForeground(Color.BLACK);
        panel_44.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_44.setBackground(Color.WHITE);
        panel.add(panel_44);
        
        JLabel label_172 = new JLabel("1");
        label_172.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_172.setBounds(1, 1, 13, 51);
        panel_44.add(label_172);
        
        JLabel label_173 = new JLabel("1");
        label_173.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_173.setHorizontalAlignment(SwingConstants.RIGHT);
        label_173.setBounds(39, 1, 13, 51);
        panel_44.add(label_173);
        
        JLabel label_174 = new JLabel("1");
        label_174.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_174.setHorizontalAlignment(SwingConstants.CENTER);
        label_174.setBounds(0, 1, 52, 16);
        panel_44.add(label_174);
        
        JLabel label_175 = new JLabel("1");
        label_175.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_175.setHorizontalAlignment(SwingConstants.CENTER);
        label_175.setBounds(1, 36, 51, 16);
        panel_44.add(label_175);
        
        panel_45 = new JPanel();
        panel_45.setLayout(null);
        panel_45.setForeground(Color.BLACK);
        panel_45.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_45.setBackground(Color.WHITE);
        panel.add(panel_45);
        
        JLabel label_176 = new JLabel("1");
        label_176.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_176.setBounds(1, 1, 13, 51);
        panel_45.add(label_176);
        
        JLabel label_177 = new JLabel("1");
        label_177.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_177.setHorizontalAlignment(SwingConstants.RIGHT);
        label_177.setBounds(39, 1, 13, 51);
        panel_45.add(label_177);
        
        JLabel label_178 = new JLabel("1");
        label_178.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_178.setHorizontalAlignment(SwingConstants.CENTER);
        label_178.setBounds(0, 1, 52, 16);
        panel_45.add(label_178);
        
        JLabel label_179 = new JLabel("1");
        label_179.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_179.setHorizontalAlignment(SwingConstants.CENTER);
        label_179.setBounds(1, 36, 51, 16);
        panel_45.add(label_179);
        
        panel_46 = new JPanel();
        panel_46.setLayout(null);
        panel_46.setForeground(Color.BLACK);
        panel_46.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_46.setBackground(Color.WHITE);
        panel.add(panel_46);
        
        JLabel label_180 = new JLabel("1");
        label_180.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_180.setBounds(1, 1, 13, 51);
        panel_46.add(label_180);
        
        JLabel label_181 = new JLabel("1");
        label_181.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_181.setHorizontalAlignment(SwingConstants.RIGHT);
        label_181.setBounds(39, 1, 13, 51);
        panel_46.add(label_181);
        
        JLabel label_182 = new JLabel("1");
        label_182.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_182.setHorizontalAlignment(SwingConstants.CENTER);
        label_182.setBounds(0, 1, 52, 16);
        panel_46.add(label_182);
        
        JLabel label_183 = new JLabel("1");
        label_183.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_183.setHorizontalAlignment(SwingConstants.CENTER);
        label_183.setBounds(1, 36, 51, 16);
        panel_46.add(label_183);
        
        panel_47 = new JPanel();
        panel_47.setLayout(null);
        panel_47.setForeground(Color.BLACK);
        panel_47.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_47.setBackground(Color.WHITE);
        panel.add(panel_47);
        
        JLabel label_184 = new JLabel("1");
        label_184.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_184.setBounds(1, 1, 13, 51);
        panel_47.add(label_184);
        
        JLabel label_185 = new JLabel("1");
        label_185.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_185.setHorizontalAlignment(SwingConstants.RIGHT);
        label_185.setBounds(39, 1, 13, 51);
        panel_47.add(label_185);
        
        JLabel label_186 = new JLabel("1");
        label_186.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_186.setHorizontalAlignment(SwingConstants.CENTER);
        label_186.setBounds(0, 1, 52, 16);
        panel_47.add(label_186);
        
        JLabel label_187 = new JLabel("1");
        label_187.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_187.setHorizontalAlignment(SwingConstants.CENTER);
        label_187.setBounds(1, 36, 51, 16);
        panel_47.add(label_187);
        
        panel_48 = new JPanel();
        panel_48.setLayout(null);
        panel_48.setForeground(Color.BLACK);
        panel_48.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_48.setBackground(Color.WHITE);
        panel.add(panel_48);
        
        JLabel label_188 = new JLabel("1");
        label_188.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_188.setBounds(1, 1, 13, 51);
        panel_48.add(label_188);
        
        JLabel label_189 = new JLabel("1");
        label_189.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_189.setHorizontalAlignment(SwingConstants.RIGHT);
        label_189.setBounds(39, 1, 13, 51);
        panel_48.add(label_189);
        
        JLabel label_190 = new JLabel("1");
        label_190.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_190.setHorizontalAlignment(SwingConstants.CENTER);
        label_190.setBounds(0, 1, 52, 16);
        panel_48.add(label_190);
        
        JLabel label_191 = new JLabel("1");
        label_191.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_191.setHorizontalAlignment(SwingConstants.CENTER);
        label_191.setBounds(1, 36, 51, 16);
        panel_48.add(label_191);
        
        panel_49 = new JPanel();
        panel_49.setLayout(null);
        panel_49.setForeground(Color.BLACK);
        panel_49.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_49.setBackground(Color.WHITE);
        panel.add(panel_49);
        
        JLabel label_192 = new JLabel("1");
        label_192.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_192.setBounds(1, 1, 13, 51);
        panel_49.add(label_192);
        
        JLabel label_193 = new JLabel("1");
        label_193.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_193.setHorizontalAlignment(SwingConstants.RIGHT);
        label_193.setBounds(39, 1, 13, 51);
        panel_49.add(label_193);
        
        JLabel label_194 = new JLabel("1");
        label_194.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_194.setHorizontalAlignment(SwingConstants.CENTER);
        label_194.setBounds(0, 1, 52, 16);
        panel_49.add(label_194);
        
        JLabel label_195 = new JLabel("1");
        label_195.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_195.setHorizontalAlignment(SwingConstants.CENTER);
        label_195.setBounds(1, 36, 51, 16);
        panel_49.add(label_195);
        
        panel_50 = new JPanel();
        panel_50.setLayout(null);
        panel_50.setForeground(Color.BLACK);
        panel_50.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_50.setBackground(Color.GREEN);
        panel.add(panel_50);
        
        JLabel label_196 = new JLabel("1");
        label_196.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_196.setBounds(1, 1, 13, 51);
        panel_50.add(label_196);
        
        JLabel label_197 = new JLabel("1");
        label_197.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_197.setHorizontalAlignment(SwingConstants.RIGHT);
        label_197.setBounds(39, 1, 13, 51);
        panel_50.add(label_197);
        
        JLabel label_198 = new JLabel("1");
        label_198.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_198.setHorizontalAlignment(SwingConstants.CENTER);
        label_198.setBounds(0, 1, 52, 16);
        panel_50.add(label_198);
        
        JLabel label_199 = new JLabel("1");
        label_199.setFont(new Font("Tahoma", Font.PLAIN, 10));
        label_199.setHorizontalAlignment(SwingConstants.CENTER);
        label_199.setBounds(1, 36, 51, 16);
        panel_50.add(label_199);
        
        JLabel lblTarget50 = new JLabel("T");
        lblTarget50.setHorizontalAlignment(SwingConstants.CENTER);
        lblTarget50.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblTarget50.setBackground(Color.ORANGE);
        lblTarget50.setForeground(Color.RED);
        lblTarget50.setBounds(10, 17, 30, 16);
        panel_50.add(lblTarget50);
        
        JButton btnStartRandomTarget = new JButton("Start random target");
        btnStartRandomTarget.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GUIControl gc = new GUIControl();
                gc.addObserver(window);
                Thread t = new Thread(gc);
                t.start();
                System.out.println("i have to get here...");
            }
        });
        btnStartRandomTarget.setBounds(248, 288, 162, 25);
        frame.getContentPane().add(btnStartRandomTarget);
        
        JLabel lblTestLabel = new JLabel("TEST LABEL");
        lblTestLabel.setBounds(110, 107, 79, 16);
        frame.getContentPane().add(lblTestLabel);
        
        JButton btnSomeBtn = new JButton("some btn");
        btnSomeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("i work!");
            }
        });
        btnSomeBtn.setBounds(422, 288, 97, 25);
        frame.getContentPane().add(btnSomeBtn);
    }
    
    public void togglePanel(int panelNr) {
        switch (panelNr) {
            /**
             * TODO: Nur ein Taget darf sein!
             */
            case 10:
                //x = BOOL_TEST ? TRUE_FALL : FALSE_FALL
                getPanel_10().getComponent(4).setEnabled(getPanel_10().getComponent(4).isEnabled() ? false : true);
                break;
            case 20:
                getPanel_20().getComponent(4).setEnabled(getPanel_20().getComponent(4).isEnabled() ? false : true);
                break;
            case 30:
                getPanel_30().getComponent(4).setEnabled(getPanel_30().getComponent(4).isEnabled() ? false : true);
                break;
            case 40:
                getPanel_40().getComponent(4).setEnabled(getPanel_40().getComponent(4).isEnabled() ? false : true);
                break;
            case 50:
                getPanel_50().getComponent(4).setEnabled(getPanel_50().getComponent(4).isEnabled() ? false : true);
                break;
            default:
                break;
        }
    }
    
    public JPanel getPanel() {
        return panel;
    }
    public JPanel getPanel_37() {
        return panel_37;
    }
    public JPanel getPanel_26() {
        return panel_26;
    }
    public JPanel getPanel_24() {
        return panel_24;
    }
    public JPanel getPanel_17() {
        return panel_17;
    }
    public JPanel getPanel_33() {
        return panel_33;
    }
    public JPanel getPanel_19() {
        return panel_19;
    }
    public JPanel getPanel_9() {
        return panel_9;
    }
    public JPanel getPanel_39() {
        return panel_39;
    }
    public JPanel getPanel_11() {
        return panel_11;
    }
    public JPanel getPanel_36() {
        return panel_36;
    }
    public JPanel getPanel_32() {
        return panel_32;
    }
    public JPanel getPanel_16() {
        return panel_16;
    }
    public JPanel getPanel_4() {
        return panel_4;
    }
    public JPanel getPanel_5() {
        return panel_5;
    }
    public JPanel getPanel_34() {
        return panel_34;
    }
    public JPanel getPanel_18() {
        return panel_18;
    }
    public JPanel getPanel_30() {
        return panel_30;
    }
    public JPanel getPanel_21() {
        return panel_21;
    }
    public JPanel getPanel_25() {
        return panel_25;
    }
    public JPanel getPanel_12() {
        return panel_12;
    }
    public JPanel getPanel_8() {
        return panel_8;
    }
    public JPanel getPanel_45() {
        return panel_45;
    }
    public JPanel getPanel_20() {
        return panel_20;
    }
    public JPanel getPanel_43() {
        return panel_43;
    }
    public JPanel getPanel_15() {
        return panel_15;
    }
    public JPanel getPanel_10() {
        return panel_10;
    }
    public JPanel getPanel_7() {
        return panel_7;
    }
    public JPanel getPanel_44() {
        return panel_44;
    }
    public JPanel getPanel_2() {
        return panel_2;
    }
    public JPanel getPanel_35() {
        return panel_35;
    }
    public JPanel getPanel_13() {
        return panel_13;
    }
    public JPanel getPanel_31() {
        return panel_31;
    }
    public JPanel getPanel_22() {
        return panel_22;
    }
    public JPanel getPanel_1() {
        return panel_1;
    }
    public JPanel getPanel_28() {
        return panel_28;
    }
    public JPanel getPanel_41() {
        return panel_41;
    }
    public JPanel getPanel_42() {
        return panel_42;
    }
    public JPanel getPanel_46() {
        return panel_46;
    }
    public JPanel getPanel_40() {
        return panel_40;
    }
    public JPanel getPanel_50() {
        return panel_50;
    }
    public JPanel getPanel_49() {
        return panel_49;
    }
    public JPanel getPanel_29() {
        return panel_29;
    }
    public JPanel getPanel_27() {
        return panel_27;
    }
    public JPanel getPanel_48() {
        return panel_48;
    }
    public JPanel getPanel_23() {
        return panel_23;
    }
    public JPanel getPanel_38() {
        return panel_38;
    }
    public JPanel getPanel_47() {
        return panel_47;
    }
    public JPanel getPanel_3() {
        return panel_3;
    }
    public JPanel getPanel_6() {
        return panel_6;
    }

    public Component getFrame() {
        return frame;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("NOTIFY");
        togglePanel((int) arg);
    }
}
