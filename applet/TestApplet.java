/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TestApplet.java
 *
 * Created on Nov 6, 2010, 10:18:23 PM
 */

import java.awt.*;

/**
 *
 * @author gmcwhirt
 */
public class TestApplet extends javax.swing.JApplet {

    /** Initializes the applet TestApplet */
    @Override
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.blue);
        g.drawLine(600,0,600,1000); // x-axis
        g.drawLine(0,350,1400,350);// y-axis

        for (int i=0;i<=100;i++)
        {
            g.drawLine(i,(int)Math.sin(100 * i),i+2,(int)Math.sin(100 * (i+2)));//Suppose to give me a graph
            //even tho at random location
        }
    }

}