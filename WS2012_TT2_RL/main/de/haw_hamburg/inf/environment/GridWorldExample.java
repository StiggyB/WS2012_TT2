package de.haw_hamburg.inf.environment;

/* Grid World v. 0.1
 * Author: Carlo Comin carlo.comin@studenti.unimi.it
 * 
 * This code is released under GPL3
 * 
 *  Date: Sept 24 2010 4:06pm
 * */

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class GridWorldExample {

    private Integer gridsize;
    
    private JFrame frame;
    private static JTable table;
    private JTable table2;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GridWorldExample window = new GridWorldExample();
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
    public GridWorldExample() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(276, 10, 514, 263);
        frame.getContentPane().add(scrollPane);
        
        final JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(276, 305, 514, 263);
        frame.getContentPane().add(scrollPane_1);
        
        textField = new JTextField();
        gridsize = new Integer(5);
        textField.setText(Integer.toString(gridsize));
        textField.setBounds(77, 57, 67, 22);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        
        final JButton btnPolicy = new JButton("Compute Policy");
        btnPolicy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent argo0) {
                Object[][] rewardTable = getRewardTable();
                Object[][] policyTable = ValueIteration(rewardTable);
                
                
                String[] columnNames = new String[gridsize]; 
                for(int i=0; i < gridsize; i++) columnNames[i] = "";
                table2 = new JTable(policyTable, columnNames);
                table2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                scrollPane_1.setViewportView(table2);
                
            }
        });
        btnPolicy.setEnabled(false);
        btnPolicy.setBounds(140, 305, 130, 29);
        frame.getContentPane().add(btnPolicy);
        
        JButton btnCreate = new JButton("Create Grid");
        btnCreate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                gridsize = Integer.parseInt(textField.getText());
                
                String[] columnNames = new String[gridsize];
                Object[][] data = new Object[gridsize][gridsize];
                for(int i=0; i < gridsize; i++){
                    columnNames[i] = "";
                    for(int j=0; j < gridsize; j++){
                        data[i][j] = "*";
                    }
                }
                
                table = new JTable(data,columnNames);
                table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                scrollPane.setViewportView(table);
                
                
                
                btnPolicy.setEnabled(true);             
            }
        });
        
        Box verticalBox = Box.createVerticalBox();
        verticalBox.setBounds(0, 0, 1, 1);
        frame.getContentPane().add(verticalBox);
        btnCreate.setBounds(169, 53, 101, 29);
        frame.getContentPane().add(btnCreate);
        
        
        JLabel lblGridSize = new JLabel("Grid Size");
        lblGridSize.setBounds(10, 60, 61, 16);
        frame.getContentPane().add(lblGridSize);
        
        JLabel lblGridWorld = new JLabel("Grid World 0.1");
        lblGridWorld.setBounds(10, 10, 90, 22);
        frame.getContentPane().add(lblGridWorld);
        
        JLabel lblByCarlocharlie = new JLabel("by Charlie #754846");
        lblByCarlocharlie.setBounds(106, 13, 164, 16);
        frame.getContentPane().add(lblByCarlocharlie);
        
        JTextPane txtpnGridCellLegend = new JTextPane();
        txtpnGridCellLegend.setEnabled(false);
        txtpnGridCellLegend.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        txtpnGridCellLegend.setEditable(false);
        txtpnGridCellLegend.setText("Grid Cell Legend\r* = Normal cell\rT = Terminal cell\rO = Obstacle cell\r\rYou can add as many Terminal and Obstacles cells as you want.\rThen click Compute Policy.\rEnjoy!");
        txtpnGridCellLegend.setBounds(23, 96, 232, 159);
        frame.getContentPane().add(txtpnGridCellLegend);
        
        JTextPane txtpnPolicyLegendL = new JTextPane();
        txtpnPolicyLegendL.setEnabled(false);
        txtpnPolicyLegendL.setText("Policy Legend\rL = Left\tR = Right\rU = Up\tD = Down\rT = Terminal O = Obstacle");
        txtpnPolicyLegendL.setEditable(false);
        txtpnPolicyLegendL.setBounds(23, 349, 232, 72);
        frame.getContentPane().add(txtpnPolicyLegendL);
        
        
        initDataBindings();
    }
    protected void initDataBindings() {
    }
    
    private Object[][] getRewardTable(){
        Object [][] ret = new Object[gridsize][gridsize];
        
        for(int i=0; i < gridsize; i++){
            for(int j=0; j < gridsize; j++){
                String val = (String)table.getValueAt(i, j);
                if(val.matches("O")||val.matches("o")) ret[i][j] = new Integer(-10000);
                else ret[i][j]= new Integer(-1);
            }
        }
        
        return ret;
    }
    
    private int reward(int i, int j, Object [][] rewardTable){
        int ret = (Integer)rewardTable[i][j];
        return ret;
    }
    
    private int[] UpdatedValue(int i, int j, int [][] Value, Object [][] rewardTable){
        int []ret = new int[2]; //ret[0]=value ret[1]=action
        String temp = (String)table.getValueAt(i, j);
        if(temp.matches("T")||temp.matches("t")){ 
            ret[0]=0;
            ret[1]=0;
            return ret;
        }
        
        int max=-32000;
        
        /* action:  code    meaning
         *          0       left
         *          1       right
         *          2       up
         *          3       down
         * */
        
        for(int action=0; action < 4; action++){
            int next_i=i, next_j=j;
            if(action==0 && j!=0) { next_i=i; next_j=j-1; }
            else if(action==1 && j!=gridsize-1){ next_i=i; next_j=j+1; }
            else if(action==2 && i!=0){ next_i=i-1; next_j=j; }
            else if(action==3 && i!=gridsize-1){ next_i=i+1; next_j=j; }
            
            int oldmax=max; 
             max=Math.max(max, reward(next_i, next_j, rewardTable) + Value[next_i][next_j]);
            if (oldmax!=max) ret[1] = action;
        }
        ret[0]=max;
        
        return ret;
    
    }
    
    private Object [][] ComputePolicy(int [][] Value, Object [][] rewardTable){
        Object [][] policy = new Object[gridsize][gridsize];
        for(int i=0; i < gridsize; i++)
            for(int j=0; j < gridsize; j++){        
                String temp = (String)table.getValueAt(i, j);
                if(temp.matches("T")||temp.matches("t")) policy[i][j]="T";
                else if(temp.matches("O")||temp.matches("o")) policy[i][j]="O";
                else{
                    if(UpdatedValue(i,j,Value, rewardTable)[1]==0) policy[i][j] = "L";
                    if(UpdatedValue(i,j,Value, rewardTable)[1]==1) policy[i][j] = "R"; 
                    if(UpdatedValue(i,j,Value, rewardTable)[1]==2) policy[i][j] = "U";
                    if(UpdatedValue(i,j,Value, rewardTable)[1]==3) policy[i][j] = "D";
                }
            }
        return policy;
    }
    
    private Object [][] ValueIteration(Object[][] rewardTable){
        int [][] Value = new int[gridsize][gridsize]; //Value function
        String [][] policy = new String[gridsize][gridsize]; //policy to be computed
        float delta, tetha;
        
        //init V(s) := 0
        for(int i=0; i < gridsize; i++)
            for(int j=0; j < gridsize; j++)
                Value[i][j]=0;
        
        tetha=0.1f;
        
        do{
            delta = 0;
            for(int i = 0; i< gridsize; i++)
                for(int j=0; j< gridsize; j++){
                    int v=Value[i][j];
                    Value[i][j] = UpdatedValue(i, j, Value, rewardTable)[0];
                    delta = Math.max(delta, Math.abs(v-Value[i][j]));
                }
        }while(delta > tetha);
        
        return ComputePolicy(Value, rewardTable);
    } 
}
