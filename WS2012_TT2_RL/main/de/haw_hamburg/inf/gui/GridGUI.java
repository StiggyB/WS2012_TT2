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

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import de.haw_hamburg.inf.environment.GWorld;
import de.haw_hamburg.inf.rl.Agent;
import de.haw_hamburg.inf.rl.RLPolicy;
import javax.swing.ButtonGroup;

public class GridGUI implements Observer {

    private JFrame            frame;
    private JPanel            gridPanel;
    JPanel[][]                grid;

    private int[]             dimension   = { 10, 5, 4 };
    private int               xDim        = dimension[0];
    private int               yDim        = dimension[1];
    private GWorld            gw          = new GWorld(dimension);
    private Agent             agent       = new Agent(gw);
    private GridControl       gc          = new GridControl(gw, agent);

    /**
     * Launch the application.
     */
    static GridGUI            window;
    private JTextField        txtTargethoptime;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private int[]             agentPos    = new int[2];

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
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gridPanel = new JPanel();
        gridPanel.setBounds(248, 13, 522, 262);
        frame.getContentPane().add(gridPanel);
        gridPanel.setLayout(new GridLayout(dimension[1],
                dimension[0], 0, 0));

        // INIT GRID
        grid = new JPanel[dimension[0]][dimension[1]];
        JLabel[] Qvalues = new JLabel[4 * dimension[0] * dimension[1]];
        int boundCnt = -1;
        for (int i = 0; i < Qvalues.length; i++) {
            Qvalues[i] = new JLabel("0");
            Qvalues[i].setFont(new Font("Tahoma", Font.PLAIN, 10));
            Qvalues[i].setHorizontalAlignment(SwingConstants.CENTER);
            boundCnt++;
            switch (boundCnt) {
                case 0:
                    Qvalues[i].setBounds(1, 1, 13, 51);
                    break;
                case 1:
                    Qvalues[i].setBounds(39, 1, 13, 51);
                    break;
                case 2:
                    Qvalues[i].setBounds(0, 1, 52, 16);
                    break;
                case 3:
                    Qvalues[i].setBounds(1, 36, 51, 16);
                    boundCnt = -1;
                    break;
            }
        }

        int x, y, i, l = 0;
        for (y = 0; y < dimension[1]; y++) {
            for (x = 0; x < dimension[0]; x++) {
                System.out.println("grid[" + x + "]" + "[" + y + "]");
                grid[x][y] = new JPanel();
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
                    grid[x][y]
                            .setName(Integer.toString((y + 1) * 10));
                    setUpTargetLabel(lblTarget);
                    if (y == dimension[1] - 1)
                        lblTarget.setEnabled(true);
                }
                gridPanel.add(grid[x][y]);
            }
        }

        final JToggleButton btnStartRandomTarget = new JToggleButton(
                "Random target");
        // btnStartRandomTarget.setBackground(Color.GREEN);

        btnStartRandomTarget.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gc.setMovingTarget(true);
                if (!gc.isRunning()) {
                    // btnStartRandomTarget.setBackground(Color.RED);
                    btnStartRandomTarget
                            .setText("Stop random target");
                } else {
                    gc.terminate();
                    // btnStartRandomTarget.setBackground(Color.GREEN);
                    btnStartRandomTarget
                            .setText("Start random target");
                }
            }
        });
        btnStartRandomTarget.setBounds(12, 256, 162, 25);
        frame.getContentPane().add(btnStartRandomTarget);

        txtTargethoptime = new JTextField();
        txtTargethoptime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gc.setTargetHopTime(Integer.parseInt(txtTargethoptime
                        .getText()));
            }
        });
        txtTargethoptime.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTargethoptime.setText("2");
        txtTargethoptime.setBounds(422, 301, 59, 22);
        frame.getContentPane().add(txtTargethoptime);
        txtTargethoptime.setColumns(10);

        JLabel lblTargetHopTime = new JLabel("Target hop Time");
        lblTargetHopTime.setBounds(422, 282, 116, 16);
        frame.getContentPane().add(lblTargetHopTime);

        JLabel lblSeconds = new JLabel("Seconds");
        lblSeconds.setBounds(482, 304, 56, 16);
        frame.getContentPane().add(lblSeconds);

        final JToggleButton btnStart = new JToggleButton("Start");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnStart.isSelected()) {
                    btnStart.setText("Stop");
                    gc.reset();
                    gc.addObserver(window);
                    agent.addObserver(window);
                    Thread t = new Thread(gc);
                    t.start();
                } else {
                    gc.terminate();
                    btnStart.setText("Start");
                }
            }
        });
        btnStart.setBounds(12, 300, 97, 25);
        frame.getContentPane().add(btnStart);

        JRadioButton rdbtnFixedTarget = new JRadioButton(
                "fixed target");
        buttonGroup.add(rdbtnFixedTarget);
        rdbtnFixedTarget.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gc.setMovingTarget(false);
                gc.setCirclingTarget(false);
            }
        });
        rdbtnFixedTarget.setBounds(248, 284, 127, 25);
        rdbtnFixedTarget.setSelected(true);
        frame.getContentPane().add(rdbtnFixedTarget);

        JRadioButton rdbtnCirclingTarget = new JRadioButton(
                "circling target");
        buttonGroup.add(rdbtnCirclingTarget);
        rdbtnCirclingTarget.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gc.setCirclingTarget(true);
            }
        });
        rdbtnCirclingTarget.setBounds(248, 310, 127, 25);
        frame.getContentPane().add(rdbtnCirclingTarget);
    }

    /**
     * @param lblTarget
     */
    private void setUpTargetLabel(final JLabel lblTarget) {
        lblTarget.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    gc.terminate();
                    togglePanel(Integer.parseInt(lblTarget
                            .getParent().getName()));
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
        switch (panelNr) {
            case 10:
                grid[9][0].getComponent(4)
                        .setEnabled(
                                grid[9][0].getComponent(4)
                                        .isEnabled() ? false : true);
                break;
            case 20:
                grid[9][1].getComponent(4)
                        .setEnabled(
                                grid[9][1].getComponent(4)
                                        .isEnabled() ? false : true);
                break;
            case 30:
                grid[9][2].getComponent(4)
                        .setEnabled(
                                grid[9][2].getComponent(4)
                                        .isEnabled() ? false : true);
                break;
            case 40:
                grid[9][3].getComponent(4)
                        .setEnabled(
                                grid[9][3].getComponent(4)
                                        .isEnabled() ? false : true);
                break;
            case 50:
                grid[9][4].getComponent(4)
                        .setEnabled(
                                grid[9][4].getComponent(4)
                                        .isEnabled() ? false : true);
                break;
            default:
                break;
        }
    }

    private void turnOtherPanelOff() {
        System.out.println(grid[9].length);
        for (int y = 0; y < grid[9].length; y++) {
            System.out.println(grid[9][y].getName());
            if (grid[9][y].getComponent(4).isEnabled()) {
                grid[9][y].getComponent(4).setEnabled(false);
            }
        }
    }

    public Component getFrame() {
        return frame;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("NOTIFY");
        if (o instanceof GridControl) {
            togglePanel((int) arg);
        } else {
            moveAgent((int[]) arg);
        }
    }

    private void moveAgent(int[] arg) {
        grid[agentPos[0]][agentPos[1]].setBackground(Color.WHITE);
        agentPos = arg;
        grid[arg[0]][arg[1]].setBackground(Color.BLUE);
    }
}
