import java.awt.*;
import java.awt.event.*;
class MF13 extends Frame implements ActionListener 
{
Button bAdd,bSub,bDiv,bMul;
Label L1,L2,L3;
TextField t1,t2,t3;
MF13()
{
 setSize(450,300);
 SetLayout(new FlowLayout());
 L1=new Label("enter first no");
 L2=new Label("enter second no");
 L3=new Label("result");
 t1=new TextField(10);
 t2=new TextField(10);
 t3=new TextField(10);
 bAdd=new Button("ADD");
 bSub=new Button("SUB");
 bDiv=new Button("DIV");
 bMul=new Button("MUL");
 bAdd.addActionListener(this);
 bSub.addActionListener(this);
 bDiv.addActionListener(this);
 bMul.addActionListener(this);
 add(L1);
 add(t1);
 add(l2);
 add(t2);
 add(bAdd);
 add(bSub);
 add(bDiv);
 add(bMul);
 add(L3);
 add(t3);
 setvisible(true);
}
}
public void actionperformed(ActionEvent e)
{
 int x=Integer.parseInt(t1.getText());
int y=Integer.parseInt(t2.getText());
int res=0;
if(e.getSource()==bAdd)
{
 res=x+y;
}
else if(e.getSource()==bSub) {
 res=x-y;
}
else if(e.getSource()==bDiv) {
 res=x/y;
else if(e.getSource()==bMul) {
 res=x*y;
}
else {
 t3.getText("error");
  return;
}
}
public static void main (String[] ARGS) {
  new MF13();
}
} 

 
 
 
 
 
 
 
 