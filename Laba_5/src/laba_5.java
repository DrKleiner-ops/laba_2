import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.event.ChangeListener;

//Выписать все классы и методы, использованные в примере, и их описание из справки, и еще несколько полезных методов для каждого класса.

public class laba_5 {
    public static JLabel myLabel;
    public static JTextArea area = new JTextArea(13, 13);

    public static void main(String[] args) {
        new laba_5();

    }

    public laba_5() {

        JFrame frame = new JFrame("FrameDemo");// создаем окно с заголовком FrameDemo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);//задаем размер окна
        setNorth(frame); //вызываем метод для заполнения верхней области
        //JTextArea area = new JTextArea(13, 13);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        frame.add(area, BorderLayout.WEST);
        area.addMouseListener(new MyMouseAdapter2());
        // setWest(frame); //вызываем метод для заполнения левой области
        //setEast(frame); //вызываем метод для заполнения правой области
        setCenter(frame); //вызываем метод для заполнения центральной области
        //setSouth(frame); //вызываем метод для заполнения нижней области
        myLabel = new JLabel(" ");
        frame.add(myLabel, BorderLayout.SOUTH);
        myLabel.addMouseListener(new MyMouseAdapter2());
        frame.addWindowListener(new MyWindowListener());
        /**frame.addWindowListener(new WindowListener() {
        @Override public void windowOpened(WindowEvent e) {
        area.setText("Приложение открыто");
        }

        @Override public void windowClosing(WindowEvent e) {

        }

        @Override public void windowClosed(WindowEvent e) {

        }

        @Override public void windowIconified(WindowEvent e) {

        }

        @Override public void windowDeiconified(WindowEvent e) {

        }

        @Override public void windowActivated(WindowEvent e) {
        area.setText("Окно развернуто");

        }

        @Override public void windowDeactivated(WindowEvent e) {
        area.setText("Окно свернуто");

        }
        });*/
        frame.setVisible(true);//делаем окно видимым
        frame.pack(); //упаковываем его
        frame.setMinimumSize(frame.getSize());
    }

    public static void setNorth(JFrame fr) { //метод для заполнения верхней области
        Box myBox = new Box(BoxLayout.X_AXIS);
        myBox.add(Box.createHorizontalGlue());
        myBox.add(new JLabel("Лаба 5"));
        myBox.add(Box.createHorizontalGlue());
        fr.add(myBox, BorderLayout.NORTH);
        myBox.addMouseListener(new MyMouseAdapter2());
        /**JPanel myPanel1=new JPanel();
         myPanel1.setLayout(new FlowLayout());
         myPanel1.add(new JButton("Кнопка 1"));
         JButton myButton2 = new JButton("Кнопка 1");
         myButton2.setPreferredSize(new Dimension(90,54));
         //("<html><b><font color=\"red\" size=14>Кнопка 2</font></b></html>");
         Component horizontalStrut = Box.createHorizontalStrut(40);
         myPanel1.add(horizontalStrut);
         myPanel1.add(myButton2);
         fr.add(myPanel1,BorderLayout.NORTH);*/
    }

    /**public static void setWest(JFrame fr) { //метод для заполнения левой области
     JTextArea area = new JTextArea(13, 13);
     area.setLineWrap(true);
     area.setWrapStyleWord(true);
     fr.add(area, BorderLayout.WEST);
     area.addMouseListener(new MyMouseAdapter2());*/


    /**
     * Box myBox1=new Box(BoxLayout.Y_AXIS);
     * myBox1.add(Box.createVerticalStrut(20));
     * myBox1.add(new JLabel("Метка1"));
     * myBox1.add(Box.createVerticalGlue());
     * myBox1.add(new JLabel("Метка2"));
     * myBox1.add(Box.createVerticalGlue());
     * myBox1.add(new JCheckBox("Выбор"));
     * myBox1.add(Box.createVerticalStrut(20));
     * fr.add(myBox1,BorderLayout.WEST);
     * }
     */

    public static void setEast(JFrame fr) { //метод для заполнения правой области
        /**ButtonGroup myGroup=new ButtonGroup();
         JPanel myPanel2=new JPanel();
         ArrayList<JRadioButton> masRB=new ArrayList<JRadioButton>();
         myPanel2.setLayout(new GridLayout(3,2));
         for (int i=0;i<6;i++){
         masRB.add(new JRadioButton("Выбор "+(i+1)));
         myGroup.add(masRB.get(i));
         myPanel2.add(masRB.get(i));
         }
         masRB.get(0).setSelected(true);
         fr.add(myPanel2,BorderLayout.EAST);*/
    }

    public static void setCenter(JFrame fr) { //метод для заполнения центральной области
        /**JTextArea area = new JTextArea(13, 13);
         area.setLineWrap(true);
         area.setWrapStyleWord(true);
         fr.add(area, BorderLayout.WEST);
         area.addMouseListener(new MyMouseAdapter2());*/
        ButtonGroup myGroup = new ButtonGroup();
        JPanel myPanel2 = new JPanel();
        ArrayList<JButton> masRB = new ArrayList<JButton>();
        myPanel2.setLayout(new GridLayout(5, 3));

        myPanel2.addMouseListener(new MyMouseAdapter2());
        for (int i = 0; i < 8; i++) {
            JButton myButton = new JButton("Кнопка " + (i + 1));
            myButton.setPreferredSize(new Dimension(90, 54));
            masRB.add(myButton);
            myGroup.add(masRB.get(i));
            myPanel2.add(masRB.get(i));
            myButton.addMouseListener(new MyMouseAdapter2());
            myButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    area.append("\n" + e.getActionCommand());

                }
            });
            if (i == 7) break;
            myPanel2.add(Box.createHorizontalStrut(54));
        }
        masRB.get(0).setSelected(true);
        fr.add(myPanel2, BorderLayout.CENTER);
        //fr.add(new JTextArea(),BorderLayout.CENTER);
    }

    /**
     * public static void setSouth(JFrame fr) { //метод для заполнения нижней области
     * Box myBox = new Box(BoxLayout.X_AXIS);
     * myBox.add(Box.createHorizontalGlue());
     * myBox.add(new JLabel("Метка1"));
     * myBox.add(Box.createHorizontalGlue());
     * fr.add(myBox, BorderLayout.SOUTH);
     * <p>
     * }
     */

    public static void setCombo(JFrame fr) {  //Creates default data model as empty list of objects.
        JComboBox myCombo = new JComboBox();
        for (int i = 0; i < 5; i++) {
            myCombo.addItem("Элемент списка " + (i + 1));

        }
    }

    public static void setList(JFrame fr) {  //Constructs a JList that displays the elements in the specified array.
        String[] data = {"one", "two", "three", "four"};
        JList myList = new JList(data);
    }

    public static void setPassword(JFrame fr) {  //Метод для добавления скрытого поля ввода текста.
        JPasswordField myPass = new JPasswordField();
    }

    public static void setProgBar(JFrame fr) {  //A component that visually displays the progress of some task.
        // As the task progresses towards completion, the progress bar displays the task's percentage of completion.
        JProgressBar myProgress = new JProgressBar();
    }

    public static void setSlider(JFrame fr) {    //A component that lets the user graphically select a value by sliding a knob within a bounded interval.
        JSlider mySlider = new JSlider();
    }

    public static void setSpinner(JFrame fr) {   //A single line input field that lets the user select a number or an object value from an ordered sequence.
        JSpinner mySpinner = new JSpinner();
    }

    public static void setTable(JFrame fr) {     //he JTable is used to display and edit regular two-dimensional tables of cells.
        JTable myTable = new JTable();
    }

    public static void setTree(JFrame fr) {
        JTree myTree = new JTree();
    }


}

class MyWindowListener extends WindowAdapter {

    @Override
    public void windowOpened(WindowEvent e) {
        laba_5.area.setText("Приложение открыто");
    }


    @Override
    public void windowDeiconified(WindowEvent e) {
        laba_5.area.setText("Окно было свернуто");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        //laba_5.area.setText("Окно развернуто");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        laba_5.area.setText("Окно перестало быть активным");

    }


}

class MyMouseAdapter2 extends MouseAdapter { //создаем свой класс-слушатель, наследуя его от
    //MouseAdapter, что позволяет нам переопределить только нужный нам метод
    public void mouseEntered(MouseEvent e) {
        laba_5.myLabel.setText(e.getComponent().getClass().toString());
    }
}