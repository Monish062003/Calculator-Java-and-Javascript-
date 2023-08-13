import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Pack
{
    JFrame frame;
    JButton button;
    JLabel label,label1,label2,label3,background;
    ImageIcon Images;
    Container c;
    JTextField text,text1;
    JComboBox combo,combo1;
    Font f1;
    int a,b=1001,d=1001;
    float ce;
}
class Dotthraki extends Pack implements ActionListener
{
    void GOT()
    {
        frame=new JFrame();
       
        c=frame.getContentPane();
        c.setLayout(null);

        labels();
        text();
        button();
        allCombos();


        c.add(combo);
        c.add(combo1);

        button.addActionListener(this);

        c.add(label);
        c.add(label1);
        c.add(label2);
        c.add(label3);


        c.add(text);
        c.add(button);
        c.add(background);

        frame.setSize(500,500);
        frame.setVisible(true);
    }
   void allFonts()
   {
    f1=new Font("Times New Roman",Font.BOLD,20);
   }

    void allCombos()
    {
        String[] Convertfrom = {"Centimeter","Meter","Kilometers"};
        combo=new JComboBox<>(Convertfrom);
        combo.setBounds(151, 40, 100, 20);

        String[] Convertto = {"Centimeter","Meter","Kilometers"};
        combo1=new JComboBox<>(Convertto);
        combo1.setBounds(151, 70, 100, 20);
    }
    void text()
    {
        text=new JTextField();
        text.setBounds(151,10,100,20);

        text1=new JTextField();
        text1.setBounds(151,158,100,20);
    }
    void labels()
    {
        allFonts();
        label=new JLabel("Enter a number :");
        label.setBounds(5,10,200,20); 
        label.setFont(f1);
        label.setForeground(Color.RED); 

        label1=new JLabel("Convert from    :");
        label1.setBounds(5,40,150,20);   
        label1.setFont(f1);
        label1.setForeground(Color.RED); 

        label2=new JLabel("Convert to        :");
        label2.setBounds(5,70,150,20);  
        label2.setFont(f1);
        label2.setForeground(Color.RED); 

        label3=new JLabel();
        label3.setBounds(5,158,150,20);
        label3.setFont(f1);
        label3.setForeground(Color.RED); 
        
        Images=new ImageIcon("desert.jpg");
        Image img= Images.getImage();
        Image temp=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);

        Images=new ImageIcon(temp);

        background=new JLabel("",Images,JLabel.CENTER);
        background.setBounds(0, 0, 500, 500);
    }
    void button()
    {
        button=new JButton("Click");
        button.setBounds(5, 117, 90, 20);
    }

    
    public void actionPerformed(ActionEvent e)
    {          
        try {
            b=combo.getSelectedIndex();
        } catch (Exception ev) {
            b=0;
        }
        try {
            d=combo1.getSelectedIndex();
        } catch (Exception ev) {
            d=0;
        }
        try {
            a=Integer.parseInt(text.getText());
        } catch (Exception ev) {
            a=1;
        }
        if(b!=1001 && d!=1001 && a!=0)
        {
            elves(b,d,a);
            display();
        }
    }
    void display()
    {
        c.add(text1);
    }
    
    void elves(int a,int b,int c)
    {
          switch (a) {
            case 0:
            switch (b) 
            {
                case 0:
                    zerotozero(a,b,c);
                break;

                case 1:
                    zerotoone(a,b,c);
                break;

                case 2:
                    zerototwo(a,b,c);
                break;
            }   
            break;

            case 1:
            switch (b) 
            {
                case 0:
                    onetozero(a,b,c);
                break;

                case 1:
                    onetoone(a,b,c);
                break;

                case 2:
                    onetotwo(a,b,c);
                break;
            }
            
            case 2:
            switch (b) 
            {
                case 0:
                    twotozero(a,b,c);
                break;

                case 1:
                    twotoone(a,b,c);
                break;

                case 2:
                    twototwo(a,b,c);
                break;
            }
        }
    }

    void zerotoone(int a,int b,int c)
    {
        float d;
        d=100;
        ce=c/d;      

        label3.setText("The result is :");
        text1.setText(""+ce);
        
    }

    void zerotozero(int a,int b,int c)
    {
        ce=c;

        label3.setText("The result is :");
        text1.setText(""+ce);
        
    }

    void onetoone(int a,int b,int c)
    {
        ce=c;

        label3.setText("The result is :");
        text1.setText(""+ce);
        
    }

    void onetozero(int a,int b,int c)
    {
        float d;
        d=100;
        ce=c*d;

        label3.setText("The result is :");
        text1.setText(""+ce);
        
    }

    void zerototwo(int a,int b,int c)
    {
        float d;
        d=100000;
        ce=c/d;

        label3.setText("The result is :");
        text1.setText(""+ce);
    }

    void onetotwo(int a,int b,int c)
    {
        float d;
        d=1000;
        ce=c/d;

        label3.setText("The result is :");
        text1.setText(""+ce);
    }

    void twotozero(int a,int b,int c)
    {
        float d;
        d=100000;
        ce=c*d;

        label3.setText("The result is :");
        text1.setText(""+ce);
    }

    void twotoone(int a,int b,int c)
    {
        float d;
        d=1000;
        ce=c*d;

        label3.setText("The result is :");
        text1.setText(""+ce);
    }

    void twototwo(int a,int b,int c)
    {
        ce=c;

        label3.setText("The result is :");
        text1.setText(""+ce);
    }
}
