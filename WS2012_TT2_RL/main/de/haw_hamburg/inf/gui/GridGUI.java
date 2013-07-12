package de.haw_hamburg.inf.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import de.haw_hamburg.inf.control.GridControl;
import de.haw_hamburg.inf.control.Target;
import de.haw_hamburg.inf.environment.GWorld;
import de.haw_hamburg.inf.rl.Agent;
import de.haw_hamburg.inf.rl.Agent.Orientation;

public class GridGUI implements Observer {

    private JFrame            frmReinforcementLearning;
    private JPanel            gridPanel;
    JPanel[][]                grid;

    private int[]             dimension   = { 10, 5, 4 };
    private GWorld            gw          = new GWorld(dimension);
    private Agent             agent       = new Agent(gw);
    private Target            target      = new Target(gw);
    private GridControl       gc          = new GridControl(agent,
                                                  target);

    /**
     * Launch the application.
     */
    static GridGUI            window;
    private JButton           btnStart;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private int[]             agentPos    = { 0, 0 };

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    window = new GridGUI();
                    window.frmReinforcementLearning.setVisible(true);
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
        frmReinforcementLearning = new JFrame();
        frmReinforcementLearning
                .setTitle("Q-Learning Agent in Grid World searches Moving Target");
        frmReinforcementLearning.setResizable(false);
        frmReinforcementLearning.getContentPane().setLayout(null);
        frmReinforcementLearning.setSize(800, 700);
        frmReinforcementLearning
                .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gridPanel = new JPanel();
        gridPanel.setBounds(248, 13, 522, 262);
        frmReinforcementLearning.getContentPane().add(gridPanel);
        gridPanel.setLayout(new GridLayout(dimension[1],
                dimension[0], 0, 0));

        grid = new JPanel[dimension[0]][dimension[1]];
        // INIT GRID
        initGrid(grid);

        btnStart = new JButton("Start");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int ep, exp;
                double a, g;
                gc.addObserver(window);
                target.addObserver(window);
                agent.addObserver(window);
                agent.setExplorationRate(exp = Integer
                        .parseInt(txtExploration.getText()));
                agent.setAlpha(a = Double.parseDouble(txtAlpha
                        .getText()));
                agent.setGamma(g = Double.parseDouble(txtGamma
                        .getText()));
                gc.setEpisodes(ep = Integer.parseInt(txtEpisodes
                        .getText()));

                setTableValues(ep, a, g);

                Thread t = new Thread(gc);
                t.start();
            }
        });
        btnStart.setBounds(383, 288, 97, 25);
        frmReinforcementLearning.getContentPane().add(btnStart);

        JButton btnStop = new JButton("Stop");
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gc.terminate();
            }
        });
        btnStop.setBounds(492, 288, 97, 25);
        frmReinforcementLearning.getContentPane().add(btnStop);

        JRadioButton rdbtnFixedTarget = new JRadioButton(
                "fixed target");
        buttonGroup.add(rdbtnFixedTarget);
        rdbtnFixedTarget.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                target.setMovingTarget(false);
                target.setCirclingTarget(false);
            }
        });
        rdbtnFixedTarget.setBounds(12, 288, 127, 25);
        rdbtnFixedTarget.setSelected(true);
        frmReinforcementLearning.getContentPane().add(
                rdbtnFixedTarget);

        JRadioButton rdbtnCirclingTarget = new JRadioButton(
                "circling target");
        buttonGroup.add(rdbtnCirclingTarget);
        rdbtnCirclingTarget.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                target.setCirclingTarget(true);
            }
        });
        rdbtnCirclingTarget.setBounds(143, 288, 127, 25);
        frmReinforcementLearning.getContentPane().add(
                rdbtnCirclingTarget);

        txtEpisodes = new JTextField();
        txtEpisodes.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEpisodes.setText("1");
        txtEpisodes.setBounds(69, 13, 156, 16);
        frmReinforcementLearning.getContentPane().add(txtEpisodes);
        txtEpisodes.setColumns(10);

        JLabel lblEpisodes = new JLabel("Episodes");
        lblEpisodes.setBounds(12, 13, 56, 16);
        frmReinforcementLearning.getContentPane().add(lblEpisodes);

        txtAlpha = new JTextField();
        txtAlpha.setToolTipText("learning rate");
        txtAlpha.setText("1");
        txtAlpha.setHorizontalAlignment(SwingConstants.RIGHT);
        txtAlpha.setBounds(69, 42, 156, 16);
        frmReinforcementLearning.getContentPane().add(txtAlpha);
        txtAlpha.setColumns(10);

        JLabel lblAlpha = new JLabel("Alpha");
        lblAlpha.setBounds(12, 42, 56, 16);
        frmReinforcementLearning.getContentPane().add(lblAlpha);

        txtGamma = new JTextField();
        txtGamma.setToolTipText("discount factor");
        txtGamma.setText("0.9");
        txtGamma.setHorizontalAlignment(SwingConstants.RIGHT);
        txtGamma.setBounds(69, 71, 156, 16);
        frmReinforcementLearning.getContentPane().add(txtGamma);
        txtGamma.setColumns(10);

        JLabel lblGamma = new JLabel("Gamma");
        lblGamma.setBounds(12, 71, 56, 16);
        frmReinforcementLearning.getContentPane().add(lblGamma);

        JSlider sliderSpeed = new JSlider();
        sliderSpeed.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider) e.getSource();
                if (!source.getValueIsAdjusting()) {
                    int speed = (int) source.getValue();
                    agent.setLearningSpeed(speed * -100);
                    target.setTargetHopTime(speed * -100);
                }
            }
        });
        sliderSpeed.setValue(-10);
        sliderSpeed.setMinorTickSpacing(1);
        sliderSpeed.setMaximum(0);
        sliderSpeed.setMinimum(-10);
        sliderSpeed.setBounds(12, 129, 212, 26);
        frmReinforcementLearning.getContentPane().add(sliderSpeed);

        JLabel lblLearningSpeed = new JLabel("Learning speed");
        lblLearningSpeed.setBounds(12, 100, 97, 16);
        frmReinforcementLearning.getContentPane().add(
                lblLearningSpeed);

        JLabel lblBestSteps = new JLabel("Best episode:");
        lblBestSteps.setBounds(12, 182, 97, 16);
        frmReinforcementLearning.getContentPane().add(lblBestSteps);

        txtBSteps = new JTextField();
        txtBSteps.setHorizontalAlignment(SwingConstants.CENTER);
        txtBSteps.setEditable(false);
        txtBSteps.setBounds(12, 201, 97, 16);
        frmReinforcementLearning.getContentPane().add(txtBSteps);
        txtBSteps.setColumns(10);

        JButton btnResetLearning = new JButton("Reset learning");
        btnResetLearning.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gc.terminate();
                gw.resetState();
                gw.resetWalls();
                agent.resetAgent();
                agent.resetLearning();
                resetGrid();
                txtBSteps.setText("0");
                txtTSteps.setText("0");
                totalStepCnt = 0;
                bestStepCnt = 0;
            }
        });
        btnResetLearning.setBounds(631, 288, 139, 25);
        frmReinforcementLearning.getContentPane().add(
                btnResetLearning);

        txtExploration = new JTextField();
        txtExploration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agent.setExplorationRate(Integer
                        .parseInt(txtExploration.getText()));
            }
        });
        txtExploration.setHorizontalAlignment(SwingConstants.RIGHT);
        txtExploration.setText("15");
        txtExploration.setBounds(121, 259, 97, 16);
        frmReinforcementLearning.getContentPane().add(txtExploration);
        txtExploration.setColumns(10);

        JLabel lblExplorationRate = new JLabel("Exploration rate");
        lblExplorationRate.setBounds(12, 259, 97, 16);
        frmReinforcementLearning.getContentPane().add(
                lblExplorationRate);

        JLabel label = new JLabel("%");
        label.setBounds(219, 259, 12, 16);
        frmReinforcementLearning.getContentPane().add(label);

        JSeparator separator = new JSeparator();
        separator.setBounds(12, 95, 212, 2);
        frmReinforcementLearning.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(12, 157, 212, 2);
        frmReinforcementLearning.getContentPane().add(separator_1);

        JLabel lblSteps = new JLabel("Steps");
        lblSteps.setBounds(96, 168, 37, 16);
        frmReinforcementLearning.getContentPane().add(lblSteps);

        JLabel lblTotalSteps = new JLabel("Total:");
        lblTotalSteps.setBounds(145, 182, 56, 16);
        frmReinforcementLearning.getContentPane().add(lblTotalSteps);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(13, 230, 212, 2);
        frmReinforcementLearning.getContentPane().add(separator_2);

        txtTSteps = new JTextField();
        txtTSteps.setEditable(false);
        txtTSteps.setHorizontalAlignment(SwingConstants.CENTER);
        txtTSteps.setBounds(120, 201, 105, 16);
        frmReinforcementLearning.getContentPane().add(txtTSteps);
        txtTSteps.setColumns(10);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 322, 758, 291);
        frmReinforcementLearning.getContentPane().add(scrollPane);

        ftTable = new JTable();
        scrollPane.setViewportView(ftTable);
        ftTable.setEnabled(false);
        ftTable.setModel(new DefaultTableModel(new Object[][] {
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null },
                { null, null, null, null, null, null, null }, },
                new String[] { "Target", "Episodes", "Alpha",
                        "Gamma", "Best", "Total", "Nr" }));

        JButton btnResetTable = new JButton("Reset table");
        btnResetTable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ((DefaultTableModel) ftTable.getModel())
                        .setRowCount(0);
                r = 0;
                tsRow = 0;
                bsRow = 0;
            }
        });
        btnResetTable.setBounds(329, 626, 111, 25);
        frmReinforcementLearning.getContentPane().add(btnResetTable);

        JLabel[] xLabels = new JLabel[dimension[0]];
        int xpos = 196;
        for (int i = 0; i < dimension[0]; i++) {
            xLabels[i] = new JLabel(Integer.toString(i));
            xLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            xLabels[i].setBounds(xpos = xpos + 52, 0, 56, 16);
            frmReinforcementLearning.getContentPane().add(xLabels[i]);
        }
        JLabel[] yLabels = new JLabel[dimension[1]];
        int ypos = -33;
        for (int i = 0; i < dimension[1]; i++) {
            yLabels[i] = new JLabel(Integer.toString(i));
            yLabels[i].setHorizontalAlignment(SwingConstants.CENTER);
            yLabels[i].setBounds(237, ypos = ypos + 52, 12, 45);
            frmReinforcementLearning.getContentPane().add(yLabels[i]);
        }
    }

    int r = 0;

    protected void setTableValues(int ep, double a, double g) {
        DefaultTableModel t = (DefaultTableModel) ftTable.getModel();
        if (r > t.getRowCount() - 1) {
            t.addRow(new Object[] { "", "", "", "", "" });
        }
        ftTable.setValueAt(
                target.isCircling() ? "circling" : "fixed", r, 0);
        ftTable.setValueAt(ep, r, 1);
        ftTable.setValueAt(a, r, 2);
        ftTable.setValueAt(g, r, 3);
        ftTable.setValueAt(r + 1, r, 6);
        r++;
    }

    /**
     * 
     */
    JLabel[] Qvalues = new JLabel[4 * dimension[0] * dimension[1]];

    private void initGrid(JPanel[][] grid) {
        int boundCnt = -1;
        for (int i = 0; i < Qvalues.length; i++) {
            Qvalues[i] = new JLabel();
            Qvalues[i].setFont(new Font("Tahoma", Font.PLAIN, 10));
            Qvalues[i].setHorizontalAlignment(SwingConstants.CENTER);
            boundCnt++;
            switch (boundCnt) {
                case 0:
                    Qvalues[i].setName("N");
                    Qvalues[i].setText("N");
                    Qvalues[i].setBounds(0, 1, 52, 16);
                    break;
                case 1:
                    Qvalues[i].setName("E");
                    Qvalues[i].setText("E");
                    Qvalues[i].setBounds(39, 1, 13, 51);
                    break;
                case 2:
                    Qvalues[i].setName("S");
                    Qvalues[i].setText("S");
                    Qvalues[i].setBounds(1, 36, 51, 16);
                    break;
                case 3:
                    Qvalues[i].setName("W");
                    Qvalues[i].setText("W");
                    Qvalues[i].setBounds(1, 1, 13, 51);
                    boundCnt = -1;
                    break;
            }
        }

        int x, y, i, l = 0;
        for (y = 0; y < dimension[1]; y++) {
            for (x = 0; x < dimension[0]; x++) {
                grid[x][y] = new JPanel();
                setGridAction(grid[x][y], x, y);
                grid[x][y].setLayout(null);
                grid[x][y].setForeground(Color.BLACK);
                grid[x][y].setBorder(new LineBorder(
                        new Color(0, 0, 0)));
                grid[x][y].setBackground(Color.WHITE);
                for (i = 0; i < 4; i++) {
                    grid[x][y].add(Qvalues[l++]);
                }
                if (x == dimension[0] - 1) {
                    grid[x][y].setBackground(Color.GREEN);
                    final JLabel lblTarget = new JLabel("T");
                    grid[x][y].add(lblTarget);
                    grid[x][y].setName(Integer.toString(y));
                    setUpTargetLabel(lblTarget);
                    if (y == dimension[1] - 1)
                        lblTarget.setEnabled(true);
                }
                gridPanel.add(grid[x][y]);
            }
        }

        // agentPos: BLUE
        grid[agentPos[0]][agentPos[1]].setBackground(Color.BLUE);
    }

    private void resetGrid() {
        int x, y = 0;
        for (y = 0; y < dimension[1]; y++) {
            for (x = 0; x < dimension[0]; x++) {
                setGridAction(grid[x][y], x, y);
                grid[x][y].setLayout(null);
                grid[x][y].setForeground(Color.BLACK);
                grid[x][y].setBorder(new LineBorder(
                        new Color(0, 0, 0)));
                grid[x][y].setBackground(Color.WHITE);
                if (grid[x][y].getComponentCount() != 0) {
                    for (int i = 0; i < 4; i++) {
                        grid[x][y].getComponent(i).setFont(
                                new Font("Tahoma", Font.PLAIN, 10));
                        grid[x][y].getComponent(i).setForeground(
                                Color.BLACK);
                    }
                } else {
                    for (int i = 0; i < 4; i++) {
                        Qvalues[x * 4 + y * 10 * 4 + i]
                                .setFont(new Font("Tahoma",
                                        Font.PLAIN, 10));
                        Qvalues[x * 4 + y * 10 * 4 + i]
                                .setForeground(Color.BLACK);
                        grid[x][y]
                                .add(Qvalues[x * 4 + y * 10 * 4 + i]);
                    }
                }
                if (x == dimension[0] - 1) {
                    grid[x][y].setBackground(Color.GREEN);
                    final JLabel lblTarget = new JLabel("T");
                    grid[x][y].add(lblTarget);
                    grid[x][y].setName(Integer.toString(y));
                    setUpTargetLabel(lblTarget);
                    if (y == dimension[1] - 1)
                        lblTarget.setEnabled(true);
                }
            }
        }
    }

    private void setGridAction(final JPanel jPanel, final int x,
            final int y) {
        jPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int xi = x, yi = y;
                if (e.getButton() == MouseEvent.BUTTON1) {
                    if (jPanel.getBackground().equals(Color.WHITE)) {
                        gw.setWall(xi, yi);
                        jPanel.setBackground(Color.BLACK);
                        jPanel.removeAll();
                    } else {
                        gw.unSetWall(xi, yi);
                        jPanel.setBackground(Color.WHITE);
                        for (int i = 0; i < 4; i++) {
                            jPanel.add(Qvalues[xi * 4 + yi * 10 * 4
                                    + i]);
                        }
                    }
                }
            }
        });
    }

    /**
     * @param lblTarget
     */
    private void setUpTargetLabel(final JLabel lblTarget) {
        lblTarget.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    int t;
                    gc.terminate();
                    togglePanel(t = Integer.parseInt(lblTarget
                            .getParent().getName()));
                    gw.setTarget(t);
                }
            }
        });
        lblTarget.setEnabled(false);
        lblTarget.setHorizontalAlignment(SwingConstants.CENTER);
        lblTarget.setForeground(Color.RED);
        lblTarget.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        lblTarget.setBackground(Color.ORANGE);
        lblTarget.setBounds(10, 17, 30, 16);
    }

    /**
     * TARGET PANEL LIST FOR SWITCH
     * 
     * @param panelNr
     */
    public void togglePanel(int panelNr) {
        turnOtherPanelOff();
        grid[9][panelNr].getComponent(4).setEnabled(
                grid[9][panelNr].getComponent(4).isEnabled() ? false
                        : true);
    }

    private void turnOtherPanelOff() {
        for (int y = 0; y < grid[9].length; y++) {
            if (grid[9][y].getComponent(4).isEnabled()) {
                grid[9][y].getComponent(4).setEnabled(false);
            }
        }
    }

    public Component getFrame() {
        return frmReinforcementLearning;
    }

    Color              savedColor     = Color.WHITE;
    private JTextField txtEpisodes;
    private JTextField txtAlpha;
    private JTextField txtGamma;
    private int        bestStepCnt    = 0;
    private int        bestStep       = Integer.MAX_VALUE;
    private int        totalStepCnt   = 0;
    private JTextField txtBSteps;
    private JTextField txtExploration;
    private int        episodeCounter = 0;

    Orientation        orient         = null;
    private JTextField txtTSteps;
    private JTable     ftTable;
    private int        tsColumn       = 5;
    private int        tsRow          = 0;
    private int        bsRow          = 0;
    private String     bestSE;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Agent && arg instanceof Orientation) {
            orient = (Orientation) arg;
            System.out.println(orient);
        } else if (o instanceof Target) {
            togglePanel((int) arg);
        } else {
            if (orient != null)
                moveAgent((int[]) arg, orient);
            if (((Agent) o).episodeEnded() && bestStepCnt != 0) {
                episodeCounter++;
                savedColor = Color.WHITE;
                grid[9][4].setBackground(Color.GREEN);
                grid[9][3].setBackground(Color.GREEN);
                grid[9][2].setBackground(Color.GREEN);
                grid[9][1].setBackground(Color.GREEN);
                grid[9][0].setBackground(Color.GREEN);
                if (bestStep > bestStepCnt) {
                    bestStep = bestStepCnt;
                    txtBSteps.setText(Integer.toString(bestStep)
                            + " (" + episodeCounter + ")");
                    bestSE = Integer.toString(bestStep) + " (after "
                            + episodeCounter + " e.)";
                    txtBSteps.setVisible(true);
                } else {
                    // Steps in last episode
                }
                txtTSteps.setText(Integer.toString(totalStepCnt));

                // TABLE UPDATE
                if (episodeCounter == Integer.parseInt(txtEpisodes
                        .getText())) {
                    ftTable.setValueAt(totalStepCnt, tsRow++,
                            tsColumn);
                    ftTable.setValueAt(bestSE, bsRow++, 4);
                    bestStep = Integer.MAX_VALUE;
                    episodeCounter = 0;
                    totalStepCnt = 0;
                }
                bestStepCnt = 0;
            } else {
                totalStepCnt++;
                bestStepCnt++;
            }
        }
    }

    private void moveAgent(int[] arg, Orientation orient) {
        grid[agentPos[0]][agentPos[1]].setBackground(savedColor);
        for (int i = 0; i < 4; i++) {
            ((JLabel) grid[agentPos[0]][agentPos[1]].getComponents()[i])
                    .setForeground(Color.BLACK);
            ((JLabel) grid[agentPos[0]][agentPos[1]].getComponents()[i])
                    .setFont(new Font("Tahoma", Font.PLAIN, 10));
        }
        ((JLabel) grid[agentPos[0]][agentPos[1]].getComponents()[orient
                .value()]).setForeground(Color.ORANGE);
        ((JLabel) grid[agentPos[0]][agentPos[1]].getComponents()[orient
                .value()]).setFont(new Font("Tahoma", Font.BOLD, 13));
        savedColor = grid[arg[0]][arg[1]].getBackground();
        agentPos = arg;
        grid[arg[0]][arg[1]].setBackground(Color.BLUE);
    }
}
