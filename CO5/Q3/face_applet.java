import java.applet.*;
import java.awt.*;
import java.awt.Graphics; 
import java.awt.event.*;


public class face_applet extends Applet implements ActionListener {
	Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b;
    public void init(){
    	l1 = new Label("MARK 1:"); 
    	t1 = new TextField();  
    	l2 = new Label("MARK 2:");  
    	t2 = new TextField();  
    	l3 = new Label("MARK 3:");  
    	t3 = new TextField();
    	l4 = new Label("MARK 4:");  
    	t4 = new TextField(); 
    	l5 = new Label("PERCENTAGE:");  
    	t5 = new TextField(); 
       
    
    	b = new Button("STATUS");  

    	setLayout(null);

    	l1.setBounds(450,50,70,20);
        t1.setBounds(520,50,100,20);
        l2.setBounds(450,80,70,20);
        t2.setBounds(520,80,100,20);
        l3.setBounds(450,110,70,20);
        t3.setBounds(520,110,100,20);
    	l4.setBounds(450,140,70,20);
    	t4.setBounds(520,140,100,20);
    	l5.setBounds(450,170,70,20);
    	t5.setBounds(520,170,100,20);
    

    	b.setBounds(450,290,80,30);
                  
        add(l1);
        add(l2);
        add(l3);
        add(l4);
    	add(l5);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(b);        
        b.addActionListener(this);   

    }
    public void actionPerformed(ActionEvent e){
    	float m1, m2,m3, m4,percent;
       
        m1= Float.parseFloat(t1.getText());
        m2= Float.parseFloat(t2.getText());
        m3= Float.parseFloat(t3.getText());
        m4= Float.parseFloat(t4.getText());
        
        percent=((m1+m2+m3+m4)*100)/400;
        
        t5.setText(String.valueOf(percent));
        repaint();
    }

    @Override
    public void paint(Graphics g){
       
        float p;
        p= Float.parseFloat(t5.getText());
        
        if(p> 50.0) {
        	g.setColor(Color.green);
        	g.fillOval(0,0,300,300);
        	g.setColor(Color.RED);
        	g.fillOval(80,75,30,30);
        	g.fillOval(190,75,30,30);
        	g.setColor(Color.black);
        	g.fillArc (75,100,150,150,0,-180);
        }
        else {
        	g.setColor(Color.green);
            g.fillOval(0,0,300,300);
            g.setColor(Color.red );
            g.fillOval(80,75,30,30);
            g.fillOval(190,75,30,30);
            g.setColor(Color.black);
            g.drawArc(75,150,150,150,0,180);

        }
    }
}
/* 
<applet code="face_applet.class" border="2" width="500" height="500"> 
</applet> 
*/