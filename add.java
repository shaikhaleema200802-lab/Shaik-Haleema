import java.awt.*;
import java.awt.event.*;
class AdditionGUI extends Frame implements ActionListener 
{
Button b;
Label L1, L2,L3;
TextField t1,t2,t3;
AdditionGUI()
{
setSize(400,350);
SetLayout(new FlowLayout());
L1=new Label("enter first no:");
L2=new Label("enter second no:");
L3=new Label("result:");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b=new Button("ADD");
b.addActionListener(this);
add(L1);
add(t1);
add(L2);
add(t2);
add(b);
add(L3);
add(t3);
setvisible(true);
}
public void actionperformed(ActionEvent e)
{
 int x=Integer.parseInt(t1.getText());
int y=Integer.parseInt(t2.getText());
int z=x+y;
t3.setText(String.valueOf(z));
}
public static void main (String[] args)
{
 new AdditionGUI();
}
}
