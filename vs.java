import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
class OnlineVotingSystem{
    static HashMap<String, String>map = new HashMap<>();
    static int A =0;
    static int B =0;
    static int C = 0;
    static String out;

    public static void main(String[]args){
        JFrame f =new JFrame(title:"Online Votingg system");
        JPanel p = new JPanel();
        JLabel head =  new JLabel(text:"Online Voting System");
        JLabel l1 =  new JLabel(text:"Enter Name");
        JLabel l2 =  new JLabel(text:"Enter Phone Number");
        JLabel l3 =  new JLabel(text:"Cast your vote here");
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JRadioButton r1= new JRadioButton(text:"BJP");
        JRadioButton r2= new JRadioButton(text:"TDP");
        JRadioButton r3= new JRadioButton(text:"TRS");
        JRadioButton r4= new JRadioButton(text:"CPI");
        JButton b1 = new JButton(text:"Submit your vote");
        JButton b2 = new JButton(text:"check results");
        ButtonGroup bg = new ButtonGroup();
        Font fs1 = new Font(name:"",Font.BOLD,size:40);
        Font fs1 = new Font(name:"",Font.BOLD,size:40);
        Font fs1 = new Font(name:"",Font.BOLD,size:40);
        P.setLayout(mgr:null);
        head.setBounds(x:60,y:0,width:400,height:50);
        l1.setBounds(x:0,y:40,width:220,height:50);
        l2.setBounds(x:0,y:90,width:220,height:50);
        tf1.setBounds(x:210,y:50,width:300,height:30);
        tf2.setBounds(x:210,y:100,width:300,height:30);
        







    }

}
