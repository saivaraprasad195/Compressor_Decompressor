/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import comp_decomp.compressor;
import comp_decomp.decompressor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author saiva
 */
public class AppFrame extends JFrame implements ActionListener {
    
    JButton Compress;
    JButton Decompress;
    
    
    AppFrame()
    {
        
        Compress = new JButton("Select File to Compress");
        Decompress =  new JButton ("Select File to Decompress");
        
        Compress.setBounds(300,300,200,30);
        Compress.setBackground(Color.white);
        Compress.addActionListener(this);
        
        Decompress.setBounds(600,300, 200, 30);
        Decompress.setBackground(Color.white);
        Decompress.addActionListener(this);
        
        
        this.setTitle("Compressor_Decompressor");
        this.add(Compress);
        this.add(Decompress);
        this.setSize(800,800);
        this.getContentPane().setBackground(Color.white);
        this.setVisible(true);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if((e.getSource() == Compress)) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            
            if(response == JFileChooser.APPROVE_OPTION)
            {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                        }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
            
        } 
       if((e.getSource() == Decompress)) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            
            if(response == JFileChooser.APPROVE_OPTION)
            {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    decompressor.method(file);
                        }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
            
        } 
    
}}

