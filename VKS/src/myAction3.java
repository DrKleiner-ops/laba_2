import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;

public class myAction3 extends JFrame{
    public JFrame myFrame;
    public JButton myButton;
    public JTextField myText1;
    public JCheckBox myCheck;
    public JRadioButton myRButton;
    public static JLabel myLabel;
    public static void main(String[] args) {
        new myAction3();
    }
    public myAction3(){
        myFrame=new JFrame("Окно");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myButton=new JButton("1");
        myCheck=new JCheckBox("2");
        myRButton=new JRadioButton("3");
        myText1=new JTextField();
        myLabel=new JLabel(" ");
        JPanel myPanel=new JPanel();
        myPanel.add(myButton);
        myPanel.add(myCheck);
        myPanel.add(myRButton);
        myButton.addMouseListener(new MyMouseAdapter());
        myCheck.addMouseListener(new MyMouseAdapter());
        myRButton.addMouseListener(new MyMouseAdapter());
        myText1.addMouseListener(new MyMouseAdapter());
        myFrame.add(myText1,BorderLayout.NORTH);
        myFrame.add(myPanel,BorderLayout.CENTER);
        myFrame.add(myLabel,BorderLayout.SOUTH);
        myFrame.setMinimumSize(new Dimension(200,100));
        myFrame.setVisible(true);
    }
}
class MyMouseAdapter extends MouseAdapter{ //создаем свой класс-слушатель, наследуя его от
    //MouseAdapter, что позволяет нам переопределить только нужный нам метод
    public void mouseEntered(MouseEvent e) {
        myAction3.myLabel.setText(e.getComponent().getClass().toString());
    }
}

//ChangeListener указывает на изменение каких-либо свойств кнопки.

//A mouse wheel event is generated when the mouse wheel is rotated.
// When a mouse wheel event occurs, that object's mouseWheelMoved method is invoked.