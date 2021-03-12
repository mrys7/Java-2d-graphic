
package basicshapesex;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


class Surface extends JPanel {
    
    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
               RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);
        
        g2d.setPaint(new Color(200,200, 255));
        g2d.fillPolygon(new int[] {26, 25, 58}, new int[] {14, 86, 86},3);
        g2d.fillPolygon(new int[] {27, 60, 86}, new int[] {12, 85, 65},3);
        g2d.fillPolygon(new int[] {25, 58, 55}, new int[] {88, 88, 136},3);
        g2d.fillPolygon(new int[] {24, 16, 55}, new int[] {89, 145, 140},3);
        g2d.fillPolygon(new int[] {60, 56, 86}, new int[] {89, 140, 143},3);
        g2d.fillPolygon(new int[] {88, 60, 87}, new int[] {65, 88, 141},3);
        g2d.fillPolygon(new int[] {87, 86, 125}, new int[] {65, 141, 63},3);
        g2d.fillPolygon(new int[] {128, 166, 168}, new int[] {63, 65, 141},3);
        g2d.fillPolygon(new int[] {165, 167, 195}, new int[] {65, 141, 84},3);
        g2d.fillPolygon(new int[] {168, 227, 197}, new int[] {65, 10, 84},3);
        g2d.fillPolygon(new int[] {229, 199, 229}, new int[] {11, 84, 84},3);
        g2d.fillPolygon(new int[] {199, 229, 199}, new int[] {85, 85, 135},3);
        g2d.fillPolygon(new int[] {197, 169, 197}, new int[] {84, 142, 139},3);
        g2d.fillPolygon(new int[] {230, 199, 235}, new int[] {86, 139, 144},3);
        g2d.setPaint(new Color(172,219, 255));
        g2d.fillPolygon(new int[] {126, 100, 126}, new int[] {67, 121, 138},3);
        g2d.fillPolygon(new int[] {128, 156, 128}, new int[] {67, 121, 138},3);
        g2d.fillPolygon(new int[] {99, 126, 88}, new int[] {122, 140, 144},3);
        g2d.fillPolygon(new int[] {156, 128, 166}, new int[] {122, 140, 144},3);
        g2d.fillPolygon(new int[] {126, 88, 126}, new int[] {139, 143, 199},3);
        g2d.fillPolygon(new int[] {128, 166, 128}, new int[] {139, 143, 199},3);
        g2d.fillPolygon(new int[] {105, 110, 126}, new int[] {169, 202, 202},3);
        g2d.fillPolygon(new int[] {150, 142, 128}, new int[] {169, 202, 202},3);
        g2d.fillPolygon(new int[] {110, 105, 126}, new int[] {205, 235, 222},3);
        g2d.fillPolygon(new int[] {142, 148, 128}, new int[] {205, 235, 222},3);
        g2d.fillPolygon(new int[] {127,150, 127, 105}, new int[] {224,238, 244, 238},4);
        g2d.fillPolygon(new int[] {104, 108, 103, 87}, new int[] {170, 203, 236, 218},4);
        g2d.fillPolygon(new int[] {152, 144, 150, 169}, new int[] {170, 203, 236, 218},4);
        g2d.fillPolygon(new int[] {80, 102, 87}, new int[] {169, 169, 213},3);
        g2d.fillPolygon(new int[] {154, 172, 169}, new int[] {169, 169, 210},3);
        g2d.fillPolygon(new int[] {56, 43, 85, 77}, new int[] {143, 171, 216, 169},4);
        g2d.fillPolygon(new int[] {196, 174, 171, 211}, new int[] {143, 169, 215, 170},4);
        g2d.setPaint(new Color(200,200, 255));
        g2d.fillPolygon(new int[] {19, 53, 41}, new int[] {147, 142, 169},3);
        g2d.fillPolygon(new int[] {20, 35, 40}, new int[] {151, 181, 172},3);
        g2d.fillPolygon(new int[] {37, 41, 77}, new int[] {184, 174, 212},3);
        g2d.fillPolygon(new int[] {199, 213, 232}, new int[] {142, 168, 146},3);
        g2d.fillPolygon(new int[] {232, 220, 215}, new int[] {149, 179, 171},3);
        g2d.fillPolygon(new int[] {212, 218, 176}, new int[] {173, 182, 213},3);
   } 

    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        doDrawing(g);
    }    
}

public class BasicShapesEx extends JFrame {

    public BasicShapesEx() {

        initUI();
    }
    
    private void initUI() {
        
        add(new Surface());
        
        setTitle("Basic shapes");
        setSize(270, 300);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
                BasicShapesEx ex = new BasicShapesEx();
                ex.setVisible(true);
            }
        });
    }
}