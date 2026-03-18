/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billingsystemoop;

import static billingsystemoop.BillingSystemOOP.pickUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Mickey
 */
class MonthPage extends JFrame implements ActionListener {
    private JLabel lblPage, lblPick, lblDrop, lblMonthPick, lblMonthDrop, lblDayPick, lblDayDrop;
    private JComboBox comboDayPick, comboDayDrop, comboMonthPick, comboMonthDrop;
    private JButton btnCalculate;
    
    MonthPage (){
        setSize(600,600);
        setTitle("Billing System");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        String [] month = {"January", "February", "March", "April", "May", "June",
                 "July ", "August", "September","October", "November", "December"};
        int [] day = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        lblPage = new JLabel ("PAYMENT PORTAL");
        lblPage.setBounds(230,25,200,100);
        add(lblPage);
        
        lblPick = new JLabel ("Pick-Up Date");
        lblPick.setBounds(250,75,200,100);
        add(lblPick);
        
        lblMonthPick = new JLabel ("Month: ");
        lblMonthPick.setBounds(80,160,100,30);
        add(lblMonthPick);
        comboDayPick = new JComboBox (month);
        comboDayPick.setBounds(50,200,100,25);
        add(comboDayPick);
        
        String monthSelected = (String)comboDayPick.getSelectedItem();
        if (monthSelected.matches("January")){
            //Tuloy mo nalang to tom nhak umaga
        }
        lblDayPick = new JLabel ("Day: ");
        lblDayPick.setBounds(150,125,100,100);
        add(lblDayPick);
//        txtMonthPick = new JTextField ();
//        txtMonthPick.setBounds(250,150,225,50);
//        add(txtMonthPick);
//        lblMonthPick = new JLabel ("Year: ");
//        lblMonthPick.setBounds(150,125,100,100);
//        add(lblMonthPick);
//        txtMonthPick = new JTextField ();
//        txtMonthPick.setBounds(250,150,225,50);
//        add(txtMonthPick);
//        
        lblDrop = new JLabel ("Drop-Off Date");
        lblDrop.setBounds(250,250,200,100);
        add(lblDrop);
        
        lblDayDrop = new JLabel ("Day: ");
        lblDayDrop.setBounds(150,375,100,100);
        add(lblDayDrop);
//        txtDayDrop = new JTextField ();
//        txtDayDrop.setBounds(250,400,225,50);
//        add(txtDayDrop);
//        lblMonthDrop = new JLabel ("Month: ");
//        lblMonthDrop.setBounds(150,300,100,100);
//        add(lblMonthDrop);
//        txtMonthDrop = new JTextField ();
//        txtMonthDrop.setBounds(250,325,225,50);
//        add(txtMonthDrop);
//        lblMonthPick = new JLabel ("Year: ");
//        lblMonthPick.setBounds(150,125,100,100);
//        add(lblMonthPick);
//        txtMonthPick = new JTextField ();
//        txtMonthPick.setBounds(250,150,225,50);
//        add(txtMonthPick);
        
        btnCalculate = new JButton ("CALCULATE");
        btnCalculate.setBounds(200,475,175,50);
        add(btnCalculate);
        
        btnCalculate.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnCalculate){
//            String monthPick = txtMonthPick.getText().trim();
//            String monthDrop = txtMonthDrop.getText().trim();
//            String dayPick = txtDayPick.getText().trim();
//            String dayDrop = txtMonthDrop.getText().trim();
//            
            
        }
    }
    
}
