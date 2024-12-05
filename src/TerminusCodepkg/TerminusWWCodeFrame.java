/*
NOTES:

    -UI works

    -->Issues
        -you should not have two/three of the same symbol selected
    -->SOLVED!!!
        -x, y, & z values do NOT pass, thus the results are always the same
        -Solution labels need to display a default value of 0 / null
*/
package TerminusCodepkg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.abs;

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

    public int xVal;
    public int yVal;
    public int zVal;

    TerminusWWCodeFrame(){

        frame = new JFrame("Terminus Code Calculator");

        //Add panels to frame and set the layout
        frame.add(xPanel);
        frame.add(yPanel);
        frame.add(zPanel);
        frame.add(solutionPanel);
        frame.setLayout(new GridLayout(4,1));

        ImageIcon symbol0 = new ImageIcon("ValueIs0.png");
        ImageIcon num0 = new ImageIcon("num0.png");
        ImageIcon symbol10 = new ImageIcon("ValueIs10.png");
        ImageIcon num10 = new ImageIcon("num10.png");
        ImageIcon symbol11 = new ImageIcon("ValueIs11.png");
        ImageIcon num11 = new ImageIcon("num11.png");
        ImageIcon symbol20 = new ImageIcon("ValueIs20.png");
        ImageIcon num20 = new ImageIcon("num20.png");
        ImageIcon symbol21 = new ImageIcon("ValueIs21.png");
        ImageIcon num21 = new ImageIcon("num21.png");
        ImageIcon symbol22 = new ImageIcon("ValueIs22.png");
        ImageIcon num22 = new ImageIcon("num22.png");

        //Setting up X label, panels, and buttons
        xLabel = new JLabel("X");
        xLabel.setFont(new Font("Calibri", Font.PLAIN, 200));
        xButton0 = new JButton(symbol0);
        xButton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xButton0.getIcon() == symbol0)
                {
                    xVal = 0;
                    xButton0.setIcon(num0);
                    xButton10.setIcon(symbol10);
                    xButton11.setIcon(symbol11);
                    xButton20.setIcon(symbol20);
                    xButton21.setIcon(symbol21);
                    xButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    xButton0.setIcon(symbol0);
                }
            }
        });
        xButton10 = new JButton(symbol10);
        xButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xButton10.getIcon() == symbol10)
                {
                    xVal = 10;
                    xButton10.setIcon(num10);
                    xButton0.setIcon(symbol0);
                    xButton11.setIcon(symbol11);
                    xButton20.setIcon(symbol20);
                    xButton21.setIcon(symbol21);
                    xButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    xButton10.setIcon(symbol10);
                }
            }
        });
        xButton11 = new JButton(symbol11);
        xButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xButton11.getIcon() == symbol11)
                {
                    xVal = 11;
                    xButton11.setIcon(num11);
                    xButton0.setIcon(symbol0);
                    xButton10.setIcon(symbol10);
                    xButton20.setIcon(symbol20);
                    xButton21.setIcon(symbol21);
                    xButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    xButton11.setIcon(symbol11);
                }
            }
        });
        xButton20 = new JButton(symbol20);
        xButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xButton20.getIcon() == symbol20)
                {
                    xVal = 20;
                    xButton20.setIcon(num20);
                    xButton0.setIcon(symbol0);
                    xButton10.setIcon(symbol10);
                    xButton11.setIcon(symbol11);
                    xButton21.setIcon(symbol21);
                    xButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    xButton20.setIcon(symbol20);
                }
            }
        });
        xButton21 = new JButton(symbol21);
        xButton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xButton21.getIcon() == symbol21)
                {
                    xVal = 21;
                    xButton21.setIcon(num21);
                    xButton0.setIcon(symbol0);
                    xButton10.setIcon(symbol10);
                    xButton11.setIcon(symbol11);
                    xButton20.setIcon(symbol20);
                    xButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    xButton21.setIcon(symbol21);
                }
            }
        });
        xButton22 = new JButton(symbol22);
        xButton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(xButton22.getIcon() == symbol22)
                {
                    xVal = 22;
                    xButton22.setIcon(num22);
                    xButton0.setIcon(symbol0);
                    xButton10.setIcon(symbol10);
                    xButton11.setIcon(symbol11);
                    xButton20.setIcon(symbol20);
                    xButton21.setIcon(symbol21);
                    updateSolutions();
                } else
                {
                    xButton22.setIcon(symbol22);
                }
            }
        });
        xPanel.setLayout(new GridLayout(1,7));

        //Setting up Y labels, panels, and buttons
        yLabel = new JLabel("Y");
        yLabel.setFont(new Font("Calibri", Font.PLAIN, 200));
        yButton0 = new JButton(symbol0);
        yButton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(yButton0.getIcon() == symbol0)
                {
                    yVal = 0;
                    yButton0.setIcon(num0);
                    yButton10.setIcon(symbol10);
                    yButton11.setIcon(symbol11);
                    yButton20.setIcon(symbol20);
                    yButton21.setIcon(symbol21);
                    yButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    yButton0.setIcon(symbol0);
                }
            }
        });
        yButton10 = new JButton(symbol10);
        yButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(yButton10.getIcon() == symbol10)
                {
                    yVal = 10;
                    yButton10.setIcon(num10);
                    yButton0.setIcon(symbol0);
                    yButton11.setIcon(symbol11);
                    yButton20.setIcon(symbol20);
                    yButton21.setIcon(symbol21);
                    yButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    yButton10.setIcon(symbol10);
                }
            }
        });
        yButton11 = new JButton(symbol11);
        yButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(yButton11.getIcon() == symbol11)
                {
                    yVal = 11;
                    yButton11.setIcon(num11);
                    yButton0.setIcon(symbol0);
                    yButton10.setIcon(symbol10);
                    yButton20.setIcon(symbol20);
                    yButton21.setIcon(symbol21);
                    yButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    yButton11.setIcon(symbol11);
                }
            }
        });
        yButton20 = new JButton(symbol20);
        yButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(yButton20.getIcon() == symbol20)
                {
                    yVal = 20;
                    yButton20.setIcon(num20);
                    yButton0.setIcon(symbol0);
                    yButton10.setIcon(symbol10);
                    yButton11.setIcon(symbol11);
                    yButton21.setIcon(symbol21);
                    yButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    yButton20.setIcon(symbol20);
                }
            }
        });
        yButton21 = new JButton(symbol21);
        yButton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(yButton21.getIcon() == symbol21)
                {
                    yVal = 21;
                    yButton21.setIcon(num21);
                    yButton0.setIcon(symbol0);
                    yButton10.setIcon(symbol10);
                    yButton11.setIcon(symbol11);
                    yButton20.setIcon(symbol20);
                    yButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    yButton21.setIcon(symbol21);
                }
            }
        });
        yButton22 = new JButton(symbol22);
        yButton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(yButton22.getIcon() == symbol22)
                {
                    yVal = 22;
                    yButton22.setIcon(num22);
                    yButton0.setIcon(symbol0);
                    yButton10.setIcon(symbol10);
                    yButton11.setIcon(symbol11);
                    yButton20.setIcon(symbol20);
                    yButton21.setIcon(symbol21);
                    updateSolutions();
                } else
                {
                    yButton22.setIcon(symbol22);
                }
            }
        });
        yPanel.setLayout(new GridLayout(1,7));

        //Setting up Z labels, panels and buttons
        zLabel = new JLabel("Z");
        zLabel.setFont(new Font("Calibri", Font.PLAIN, 200));
        zButton0 = new JButton(symbol0);
        zButton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zButton0.getIcon() == symbol0)
                {
                    zVal = 0;
                    zButton0.setIcon(num0);
                    zButton10.setIcon(symbol10);
                    zButton11.setIcon(symbol11);
                    zButton20.setIcon(symbol20);
                    zButton21.setIcon(symbol21);
                    zButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    zButton0.setIcon(symbol0);
                }
            }
        });
        zButton10 = new JButton(symbol10);
        zButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zButton10.getIcon() == symbol10)
                {
                    zVal = 10;
                    zButton10.setIcon(num10);
                    zButton0.setIcon(symbol0);
                    zButton11.setIcon(symbol11);
                    zButton20.setIcon(symbol20);
                    zButton21.setIcon(symbol21);
                    zButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    zButton10.setIcon(symbol10);
                }
            }
        });
        zButton11 = new JButton(symbol11);
        zButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zButton11.getIcon() == symbol11)
                {
                    zVal = 11;
                    zButton11.setIcon(num11);
                    zButton0.setIcon(symbol0);
                    zButton10.setIcon(symbol10);
                    zButton20.setIcon(symbol20);
                    zButton21.setIcon(symbol21);
                    zButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    zButton11.setIcon(symbol11);
                }
            }
        });
        zButton20 = new JButton(symbol20);
        zButton20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zButton20.getIcon() == symbol20)
                {
                    zVal = 20;
                    zButton20.setIcon(num20);
                    zButton0.setIcon(symbol0);
                    zButton10.setIcon(symbol10);
                    zButton11.setIcon(symbol11);
                    zButton21.setIcon(symbol21);
                    zButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    zButton20.setIcon(symbol20);
                }
            }
        });
        zButton21 = new JButton(symbol21);
        zButton21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zButton21.getIcon() == symbol21)
                {
                    zVal = 21;
                    zButton21.setIcon(num21);
                    zButton0.setIcon(symbol0);
                    zButton10.setIcon(symbol10);
                    zButton11.setIcon(symbol11);
                    zButton20.setIcon(symbol20);
                    zButton22.setIcon(symbol22);
                    updateSolutions();
                } else
                {
                    zButton21.setIcon(symbol21);
                }
            }
        });
        zButton22 = new JButton(symbol22);
        zButton22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zButton22.getIcon() == symbol22)
                {
                    zVal = 22;
                    zButton22.setIcon(num22);
                    zButton0.setIcon(symbol0);
                    zButton10.setIcon(symbol10);
                    zButton11.setIcon(symbol11);
                    zButton20.setIcon(symbol20);
                    zButton21.setIcon(symbol21);
                    updateSolutions();
                } else
                {
                    zButton22.setIcon(symbol22);
                }
            }
        });
        zPanel.setLayout(new GridLayout(1,7));

        //Setting up the solution panel and labels
        solution = new JLabel("The Answer is: ");
        solution.setFont(new Font("Calibri", Font.PLAIN, 125));

        solution1 = new JLabel(" 0 ");
        solution1.setFont(new Font("Calibri", Font.PLAIN, 125));
        solution2 = new JLabel(" 0 ");
        solution2.setFont(new Font("Calibri", Font.PLAIN, 125));
        solution3 = new JLabel(" 0 ");
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

        //updateSolutions(); //So default values are co

        frame.setVisible(true);
        frame.setSize(1720, 960);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void updateSolutions() {
        //Recalculate the solutions
        int solution1num = ((2 * xVal) + 11);
        int solution2num = (((2 * zVal) + yVal) - 5);
        int solution3num = abs(((yVal + zVal) - xVal));

        //Update the labels
        solution1.setText(" " + solution1num + " ");
        solution2.setText(" " + solution2num + " ");
        solution3.setText(" " + solution3num + " ");
    }

    public static void main(String[] args){
        //UI Runner
        TerminusWWCodeFrame terminusWWCodeUI = new TerminusWWCodeFrame();
    }

}
