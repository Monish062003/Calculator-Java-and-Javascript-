import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Package{
    JFrame frame;
    JLabel label,label1;
    JPanel panel;
    Container c;
    JButton[] button=new JButton[10];
    JButton[] funcbutton=new JButton[10];
    JButton buttonadd,buttonsub,buttonmul,buttondiv,buttonminus,buttonstring,buttonequ;
    JButton buttondec,buttonclr;
    JTextField t1,t2,t3;
    JCheckBox check1;
    Font fi,fj,fk,fl;
    int j=30,k=35,l=110,m=100,n=40,x=38,y=110,jk=0;
    double result;
    double [] arr=new double[100];
    String [] operator=new String[100];
    char dec='.',add='+',mul='*',div='/',sub='-',equ='=';
    ActionListener Morningstar,Morningstar1;
}

class Calcy extends Package implements ActionListener
{
public void numbers()
{
    frame=new JFrame();

    c=frame.getContentPane();
    c.setLayout(null);
    panel=new JPanel();
    panel.setBounds(30, 100, 320, 400);
    panel.setBackground(Color.GRAY);

    allText();
    allButtons();
    allCheckBoxes();

    c.add(check1);
    c.add(t3);
    c.add(t1);
    c.add(t2);

    c.add(buttonstring);

    for (int i = 0; i < button.length; i++) {
        c.add(button[i]);
    }

    c.add(buttonadd);
    c.add(buttonsub);
    c.add(buttonmul);
    c.add(buttondiv);

    c.add(buttonminus);
    c.add(buttondec);
    c.add(buttonequ);
    c.add(buttonclr);

    

    frame.add(panel);
    frame.setSize(400,550);
    frame.setVisible(true);
}

private void allCheckBoxes() {
    allFonts();
    check1=new JCheckBox("Scientific");
    check1.setBounds(5,15,100,10);
    check1.setFont(fk);
    check1.setSelected(true);
    check1.setFocusable(false);
    
    check1.addActionListener(this);
}

public void allButtons() {
allFonts();

for (int i = 0; i < button.length; i++) {
    
    button[i]=new JButton(String.valueOf(i));
    button[i].setFont(fj);
    button[i].addActionListener(this);
    button[i].setBounds(x, y, 85, 25);

    if(i==2 || i==5 || i==8)
    {
        button[i].setBounds(x, y, 85, 25);
        y=y+40;
        x=x-330;
    }
    
    x=x+110;
}

buttonadd=new JButton("+");
buttonsub=new JButton("-");
buttonmul=new JButton("*");
buttondiv=new JButton("/");

buttonadd.setFont(fj);
buttonsub.setFont(fj);
buttonmul.setFont(fj);
buttondiv.setFont(fj);

buttonadd.addActionListener(this);
buttonsub.addActionListener(this);
buttonmul.addActionListener(this);
buttondiv.addActionListener(this);

buttonadd.setBounds(x, y, 85, 25);
buttonsub.setBounds(x+110, y, 85, 25);
buttonmul.setBounds(x-110, y+40, 85, 25);
buttondiv.setBounds(x, y+40, 85, 25);


buttonminus=new JButton("<-");
buttondec=new JButton(".");
buttonequ=new JButton("=");
buttonclr=new JButton("Clear");

buttonminus.setFont(fj);
buttondec.setFont(fj);
buttonequ.setFont(fj);
buttonclr.setFont(fl);

buttonminus.addActionListener(this);
buttondec.addActionListener(this);
buttonequ.addActionListener(this);
buttonclr.addActionListener(this);

buttonminus.setBounds(x-110, y+80, 85, 25);
buttondec.setBounds(x, y+80, 85, 25);
buttonequ.setBounds(x+110, y+40, 85, 25);
buttonclr.setBounds(x+110, y+80, 85, 25);


buttonstring=new JButton("Converter");
buttonstring.setBounds(45,l+n+n+n+n+n+n+n,290,40);
buttonstring.setFont(fj);
buttonstring.addActionListener(Morningstar);

}
public void allFonts() {
    fi=new Font("Times New Roman",Font.BOLD,j);
    fk=new Font("Times New Roman",Font.BOLD,15);
    fj=new Font("Times New Roman",Font.BOLD,j-5);
    fl=new Font("Times New Roman",Font.BOLD,21);
}

public void allText()
{
    allFonts();

    t3=new JTextField();
    t3.setBounds(j, j, 220, 60);
    t3.setFont(fi);
    t3.setEditable(false);

    t1=new JTextField();
    t1.setBounds(j, j, 220, 60);
    t1.setFont(fi);
    t1.setEditable(false);

    t2=new JTextField();
    t2.setBounds(j+230, j, 90, 60);
    t2.setFont(fi);
    t2.setEditable(false);
}

 ActionListener Morningstar=new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
        Dotthraki Atlantis= new Dotthraki();
        Atlantis.GOT();
    }
};

public void actionPerformed(ActionEvent e) {
    if(check1.isSelected())
    {
        for (int i = 0; i < button.length; i++) {
            if(e.getSource()==button[i])
            {
                t1.setText(t1.getText().concat(String.valueOf(i)));
                t3.setText(t3.getText().concat(String.valueOf(i)));
            } 
        }
        if(e.getSource()==buttondec)
        {
            t1.setText(t1.getText().concat(String.valueOf(dec)));
            t3.setText(t3.getText().concat(String.valueOf(dec)));
        }
    
        if (e.getSource()==buttonadd) {
            for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                arr[i]=Double.parseDouble(t1.getText());
                operator[i]="+";
            
                execute(i);
                break;
            }
            }
        
            t1.setText("");
            t3.setText(t3.getText().concat(String.valueOf(add)));
        }
    
        if (e.getSource()==buttonsub) {
            for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                arr[i]=Double.parseDouble(t1.getText());
                operator[i]="-";
            
                execute(i);
                break;
            }
            }
        
            t1.setText("");
            t3.setText(t3.getText().concat(String.valueOf(sub)));
        }
    
        if (e.getSource()==buttonmul) {
            for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                arr[i]=Double.parseDouble(t1.getText());
                operator[i]="*";
            
                execute(i);
                break;
            }
            }
        
            t1.setText("");
            t3.setText(t3.getText().concat(String.valueOf(mul)));
        }
    
        if (e.getSource()==buttondiv) {
            for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                arr[i]=Double.parseDouble(t1.getText());
                operator[i]="/";
            
                execute(i);
                break;
            }
            }
        
            t1.setText("");
            t3.setText(t3.getText().concat(String.valueOf(div)));
        } 
    
        if(e.getSource()==buttonequ)
        {      
           for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                arr[i]=Double.parseDouble(t1.getText());
                operator[i]="=";
            
                execute(i);
                break;
            }
           }
        
           t1.setText("");
           t3.setText(t3.getText().concat(String.valueOf(equ)));
        }
        if(e.getSource()==buttonclr)
        {
            t3.setText("");
            t2.setText("");
        }
        if(e.getSource()==buttonminus)
        {
            String str=t1.getText();
            String str1=t3.getText();
            t1.setText("");
            t3.setText("");
            for (int i = 0; i < str.length()-1; i++) {
                t1.setText(t1.getText()+str.charAt(i));
            }
            for (int i = 0; i < str1.length()-1; i++) {
                t3.setText(t3.getText()+str1.charAt(i));
            }
        }
        jk=1;
    }
    else
    {
    for (int i = 0; i < button.length; i++) {
        if(e.getSource()==button[i])
        {
            t1.setText(t1.getText().concat(String.valueOf(i)));
            t3.setText(t3.getText().concat(String.valueOf(i)));
        } 
    }
    if(e.getSource()==buttondec)
    {
        t1.setText(t1.getText().concat(String.valueOf(dec)));
        t3.setText(t3.getText().concat(String.valueOf(dec)));
    }

    if (e.getSource()==buttonadd) {
        for (int i = 0; i < arr.length; i++) {
        if(arr[i]==0)
        {
            arr[i]=Double.parseDouble(t1.getText());
            operator[i]="+";
        
            execute(i);
            break;
        }
        }
    
        t1.setText("");
        t3.setText(t3.getText().concat(String.valueOf(add)));
    }

    if (e.getSource()==buttonsub) {
        for (int i = 0; i < arr.length; i++) {
        if(arr[i]==0)
        {
            arr[i]=Double.parseDouble(t1.getText());
            operator[i]="-";
        
            execute(i);
            break;
        }
        }
    
        t1.setText("");
        t3.setText(t3.getText().concat(String.valueOf(sub)));
    }

    if (e.getSource()==buttonmul) {
        for (int i = 0; i < arr.length; i++) {
        if(arr[i]==0)
        {
            arr[i]=Double.parseDouble(t1.getText());
            operator[i]="*";
        
            execute(i);
            break;
        }
        }
    
        t1.setText("");
        t3.setText(t3.getText().concat(String.valueOf(mul)));
    }

    if (e.getSource()==buttondiv) {
        for (int i = 0; i < arr.length; i++) {
        if(arr[i]==0)
        {
            arr[i]=Double.parseDouble(t1.getText());
            operator[i]="/";
        
            execute(i);
            break;
        }
        }
    
        t1.setText("");
        t3.setText(t3.getText().concat(String.valueOf(div)));
    } 

    if(e.getSource()==buttonequ)
    {      
       for (int i = 0; i < arr.length; i++) {
        if (arr[i]==0) {
            arr[i]=Double.parseDouble(t1.getText());
            operator[i]="=";
        
            execute(i);
            break;
        }
       }
    
       t1.setText("");
       t3.setText(t3.getText().concat(String.valueOf(equ)));
    }
    if(e.getSource()==buttonclr)
    {
        t3.setText("");
        t2.setText("");
    }
    jk=2;
}
}

void execute(int i) {
    i=i-1;
    try {
        if(jk==2)
        {
            if(arr[i]!=0 && arr[i+1]!=0) {
            if (operator[i]=="+")
            {
                t2.setText("");
                result=arr[i]+arr[i+1];
                arr[i+1]=result;
                t2.setText(t2.getText().concat(String.valueOf(result)));
            }
        }
        if(arr[i]!=0 && arr[i+1]!=0) {
            if (operator[i]=="-")
            {
                t2.setText("");
                result=arr[i]-arr[i+1];
                arr[i+1]=result;
                t2.setText(t2.getText().concat(String.valueOf(result)));
            }
        }
        if(arr[i]!=0 && arr[i+1]!=0) {
            if (operator[i]=="*")
            {
                t2.setText("");
                result=arr[i]*arr[i+1];
                arr[i+1]=result;
                t2.setText(t2.getText().concat(String.valueOf(result)));
            }
        }
        if(arr[i]!=0 && arr[i+1]!=0) {
            if (operator[i]=="/")
            {
                t2.setText("");
                result=arr[i]/arr[i+1];
                arr[i+1]=result;
                t2.setText(t2.getText().concat(String.valueOf(result)));
            }
        }
        if(operator[i+1]=="=")
        {
            if(arr[i]!=0 && arr[i+1]!=0) {
                if (operator[i]=="+")
                {
                    t2.setText("");
                    result=arr[i]+arr[i+1];
                    arr[i+1]=result;
                    t2.setText(t2.getText().concat(String.valueOf(arr[i+1]-arr[i])));
                }
            }
            if(arr[i]!=0 && arr[i+1]!=0) {
                if (operator[i]=="-")
                {
                    t2.setText("");
                    result=arr[i]-arr[i+1];
                    arr[i+1]=result;
                    t2.setText(t2.getText().concat(String.valueOf(arr[i]-arr[i+1])));
                }
            }
            if(arr[i]!=0 && arr[i+1]!=0) {
                if (operator[i]=="*")
                {
                    t2.setText("");
                    result=arr[i]*arr[i+1];
                    arr[i+1]=result;
                    t2.setText(t2.getText().concat(String.valueOf(arr[i+1]/arr[i])));
                }
            }
            if(arr[i]!=0 && arr[i+1]!=0) {
                if (operator[i]=="/")
                {
                    t2.setText("");
                    result=arr[i]/arr[i+1];
                    arr[i+1]=result;
                    t2.setText(t2.getText().concat(String.valueOf(arr[i]/arr[i+1])));
                }
                jk=0;
            }
        }
        }
        if(jk==1)
        {

        if(operator[i+1]=="=")
        {
            int d=i+2;

            
                   for (int b = 0; b < 5; b++) {
                    for (i = 0; i < arr.length; i++) {
                        if(operator[i]=="/")
                           {
                               arr[i+1]=arr[i]/arr[i+1];
                               t2.setText("");
                               t2.setText(t2.getText().concat(String.valueOf(arr[i+1])));
                               for(int j=i;j<d-1;j++)
                               {
                                   arr[j]=arr[j+1];
                                   operator[j]=operator[j+1];
                                   if(arr[j]==arr[d-1])
                                   {
                                       d--;
                                   }
                               }       
                           }
                       }
    
                       for (i = 0; i < arr.length; i++) {
                        if(operator[i]=="*")
                           {
                               arr[i+1]=arr[i]*arr[i+1];
                               t2.setText("");
                               t2.setText(t2.getText().concat(String.valueOf(arr[i+1])));
                               for(int j=i;j<d-1;j++)
                               {
                                   arr[j]=arr[j+1];
                                   operator[j]=operator[j+1];
                                   if(arr[j]==arr[d-1])
                                   {
                                       d--;
                                   }
                               }       
                           }
                       }
    
                   }
                  
                 
                for ( i = 0; i < d; i++) {
                    if (operator[i]=="+")
                    {
                        arr[i+1]=arr[i]+arr[i+1];
                        t2.setText("");
                       t2.setText(t2.getText().concat(String.valueOf(arr[i+1])));
                    }
            
                    if (operator[i]=="-")
                    {
                        arr[i+1]=arr[i]-arr[i+1];
                        t2.setText("");
                       t2.setText(t2.getText().concat(String.valueOf(arr[i+1])));
                    }   
                    jk=0;
                }
            }  
        }
} 
        catch (Exception ev) {
            // TODO: handle exception
        } 
    } 
}




public class Calculator2 {
    public static void main(String[] args) {
        Calcy cal=new Calcy();
        cal.numbers();
    }
}
