import java.awt.*;
import java.applet.*;
import java.io.*;

/*
<applet code="maximum" width=500 height=500>
<param name="a" value="25">
<param name="b" value="50">
<param name="c" value="30">
</applet>
*/

public class maximum extends Applet
{
	int a;
	int b;
	int c;
        int d;
	String str;

	public void start()
	{
		String s1;

		s1 = getParameter("a");
		a = Integer.parseInt(s1);

		s1 = getParameter("b");
		b = Integer.parseInt(s1);
                
                s1 = getParameter("c");
		c = Integer.parseInt(s1);
	}

	public void paint(Graphics g)
	{
		if( a >= b && a >= c)
			d = a;
		else if (b >= a && b >= c)
                        d=b;
                else
                       d=c;
                g.setColor(Color.blue);
                g.drawString("First Number:   " + a, 100, 50);
		g.drawString("Second Number:   " + b, 100, 100);
                g.drawString("Third Number:   " + c, 100, 150);
		g.drawString("Maximum of 3 Numbers are :  " + d, 100, 200);
	}
}