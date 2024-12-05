package TerminusCodepkg;

import javax.swing.*;
import java.awt.*;

public class TerminusWWCodeFrame {

    JFrame frame;

    JPanel xPanel = new JPanel();
    JPanel yPanel = new JPanel();
    JPanel zPanel = new JPanel();
    JPanel solutionPanel = new JPanel();

    JLabel xLabel;
    JButton xButton0;
    JButton xButton10;
    JButton xButton11;
    JButton xButton20;
    JButton xButton21;
    JButton xButton22;

    JLabel yLabel;
    JButton yButton0;
    JButton yButton10;
    JButton yButton11;
    JButton yButton20;
    JButton yButton21;
    JButton yButton22;

    JLabel zLabel;
    JButton zButton0;
    JButton zButton10;
    JButton zButton11;
    JButton zButton20;
    JButton zButton21;
    JButton zButton22;

    JLabel solution;
    JLabel solution1;
    JLabel solution2;
    JLabel solution3;

    TerminusWWCodeFrame(){

        frame = new JFrame("Terminus Code Calculator");

        //Add panels to frame and set the layout
        frame.add(xPanel);
        frame.add(yPanel);
        frame.add(zPanel);
        frame.add(solutionPanel);
        frame.setLayout(new GridLayout(4,1));

        //Setting up X label, panels, and buttons
        xLabel = new JLabel("X");
        xLabel.setFont(new Font("Calibri", Font.PLAIN, 200));
        ImageIcon x0 = new ImageIcon("ValueIs0.png");
        xButton0 = new JButton(x0);
        ImageIcon x10 = new ImageIcon("ValueIs10.png");
        xButton10 = new JButton(x10);
        ImageIcon x11 = new ImageIcon("ValueIs11.png");
        xButton11 = new JButton(x11);
        ImageIcon x20 = new ImageIcon("ValueIs20.png");
        xButton20 = new JButton(x20);
        ImageIcon x21 = new ImageIcon("ValueIs21.png");
        xButton21 = new JButton(x21);
        ImageIcon x22 = new ImageIcon("ValueIs22.png");
        xButton22 = new JButton(x22);
        xPanel.setLayout(new GridLayout(1,7));

        //Setting up Y labels, panels, and buttons
        yLabel = new JLabel("Y");
        yLabel.setFont(new Font("Calibri", Font.PLAIN, 200));
        ImageIcon y0 = new ImageIcon("ValueIs0.png");
        yButton0 = new JButton(y0);
        ImageIcon y10 = new ImageIcon("ValueIs10.png");
        yButton10 = new JButton(y10);
        ImageIcon y11 = new ImageIcon("ValueIs11.png");
        yButton11 = new JButton(y11);
        ImageIcon y20 = new ImageIcon("ValueIs20.png");
        yButton20 = new JButton(y20);
        ImageIcon y21 = new ImageIcon("ValueIs21.png");
        yButton21 = new JButton(y21);
        ImageIcon y22 = new ImageIcon("ValueIs22.png");
        yButton22 = new JButton(y22);
        yPanel.setLayout(new GridLayout(1,7));

        //Setting up Z labels, panels and buttons
        zLabel = new JLabel("Z");
        zLabel.setFont(new Font("Calibri", Font.PLAIN, 200));
        ImageIcon z0 = new ImageIcon("ValueIs0.png");
        zButton0 = new JButton(z0);
        ImageIcon z10 = new ImageIcon("ValueIs10.png");
        zButton10 = new JButton(z10);
        ImageIcon z11 = new ImageIcon("ValueIs11.png");
        zButton11 = new JButton(z11);
        ImageIcon z20 = new ImageIcon("ValueIs20.png");
        zButton20 = new JButton(z20);
        ImageIcon z21 = new ImageIcon("ValueIs21.png");
        zButton21 = new JButton(z21);
        ImageIcon z22 = new ImageIcon("ValueIs22.png");
        zButton22 = new JButton(z22);
        zPanel.setLayout(new GridLayout(1,7));

        //Setting up the solution panel and labels
        solution = new JLabel("The Answer is: ");
        solution.setFont(new Font("Calibri", Font.PLAIN, 125));
        solution1 = new JLabel("Null");
        solution1.setFont(new Font("Calibri", Font.PLAIN, 125));
        solution2 = new JLabel("Null");
        solution2.setFont(new Font("Calibri", Font.PLAIN, 125));
        solution3 = new JLabel("Null");
        solution3.setFont(new Font("Calibri", Font.PLAIN, 125));

        //Adding the buttons and labels to the layouts
        //X layout
        xPanel.add(xLabel);
        xPanel.add(xButton0);
        xPanel.add(xButton10);
        xPanel.add(xButton11);
        xPanel.add(xButton20);
        xPanel.add(xButton21);
        xPanel.add(xButton22);

        //Y layout
        yPanel.add(yLabel);
        yPanel.add(yButton0);
        yPanel.add(yButton10);
        yPanel.add(yButton11);
        yPanel.add(yButton20);
        yPanel.add(yButton21);
        yPanel.add(yButton22);

        //Z layout
        zPanel.add(zLabel);
        zPanel.add(zButton0);
        zPanel.add(zButton10);
        zPanel.add(zButton11);
        zPanel.add(zButton20);
        zPanel.add(zButton21);
        zPanel.add(zButton22);

        //Adding the solution panel
        solutionPanel.add(solution);
        solutionPanel.add(solution1);
        solutionPanel.add(solution2);
        solutionPanel.add(solution3);


        frame.setVisible(true);
        frame.setSize(1720, 960);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        TerminusWWCodeFrame UI = new TerminusWWCodeFrame();
    }

}
