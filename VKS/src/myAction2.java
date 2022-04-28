import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class myAction2 extends JFrame{
    public JFrame myFrame;
    public JButton myButton;
    public JTextField myText1;
    public JCheckBox myCheck;
    public JRadioButton myRButton;
    public static JLabel myLabel; //static нужно, чтобы этот объект был доступен для других классов
    public static void main(String[] args) {
        new myAction2();
    }
    public myAction2(){
        myFrame=new JFrame("Окно");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myButton=new JButton("1"); //создаем разные объекты
        myCheck=new JCheckBox("2");
        myRButton=new JRadioButton("3");
        myText1=new JTextField();
        myLabel=new JLabel(" ");
        JPanel myPanel=new JPanel();
        myPanel.add(myButton);
        myPanel.add(myCheck);
        myPanel.add(myRButton);
        myButton.addMouseListener(new MyMouseListener());//регистрируем для всех объектов
        myCheck.addMouseListener(new MyMouseListener()); //в качестве обработчика событий мыши
        myRButton.addMouseListener(new MyMouseListener());//безымянный объект типа MyMouseListener
        myText1.addMouseListener(new MyMouseListener());
        myFrame.add(myText1,BorderLayout.NORTH);
        myFrame.add(myPanel,BorderLayout.CENTER);
        myFrame.add(myLabel,BorderLayout.SOUTH);//сюда будем выводить информацию
        myFrame.setMinimumSize(new Dimension(200,100));//минимальный размер делаем 200 на 100
        myFrame.setVisible(true);
    }
}
class MyMouseListener implements MouseListener{//создаем свой класс-слушатель, реализующий
    //интерфейс MouseListener и поэтому нужно переопределить все методы
    public void mouseClicked(MouseEvent e) { } // интерфейса MouseListener, даже если нам нужен
    // всего один из них
    public void mouseEntered(MouseEvent e) {
//обращаемся к объекту myLabel класса myAction2, и устанавливаем на него текст, который
//состоит из названия класса компонента, который вызвал обрабатываемое событие
        myAction2.myLabel.setText(e.getComponent().getClass().toString());
    }
    //ненужные нам методы просто оставляем пустыми
    public void mouseExited(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }
}