import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MyGraph extends JFrame implements ActionListener {
    private JMyPanel myPanel = new JMyPanel();//объявляем и создаем нашу панель для рисования

    public static void main(String[] args) {
        new MyGraph("Окно с графикой");//создаем окно
    }

    public MyGraph(String s) { //конструктор с параметром для заголовка окна


        super(s);//вызываем конструктор суперкласса и передаем ему параметр
        //String[] sog = {"К","Л","М","Ш","Н"};
        String[] gl = {"И"};
        JMenuBar myMenuBar = new JMenuBar();// создаем строку меню
        JMenu menu1 = new JMenu("Буквы");//создаем первый пункт меню
        JMenu first = new JMenu("Согласные"); //создаем подпункт меню
        menu1.add(first);//добавляем подпункт в первый пункт меню
        JMenuItem[] first_1 = new JMenuItem[5];// создаем массив из трех подпунктов меню
        for (int i = 0; i < 5; i++) { //в цикле создается каждый подпункт, добавляется в нужное место меню
            first_1[i] = new JMenuItem(JMyPanel.Figure.values()[(i+5)].toString());
            first.add(first_1[i]);
            first_1[i].addActionListener(this);//и к нему подключаем слушатель, описанный в конце
        } //класса
        JMenu second = new JMenu("Гласные"); //создаем подпункт меню
        menu1.add(second); //добавляем его в меню
        JMenuItem[] second_1 = new JMenuItem[1]; // создаем массив из трех подпунктов меню
        for (int i = 0; i < 1; i++) { // и т.д.
            second_1[i] = new JMenuItem(JMyPanel.Figure.values()[10].toString());
            second.add(second_1[i]);
            second_1[i].addActionListener(this);
        }
        JMenu menu2 = new JMenu("Фигуры"); //создаем второй пункт меню и далее аналогично первому
        for (int i = 0; i < 4; i++) {
            JMenuItem fig =new JMenuItem(JMyPanel.Figure.values()[i].toString());
            menu2.add(fig);
            fig.addActionListener(this);
        }
        JButton clear = new JButton(JMyPanel.Figure.values()[4].toString());
        clear.addActionListener(this);
        /**JMenu first2 = new JMenu("Пункт2_1");
        menu2.add(first2);
        JMenuItem[] first2_1 = new JMenuItem[3];
        for (int i = 0; i < 3; i++) {
            first2_1[i] = new JMenuItem("Пункт2_1_" + (i + 1));
            first2.add(first2_1[i]);
            first2_1[i].addActionListener(this);
        }
        JMenu second2 = new JMenu("Пункт2_2");
        menu2.add(second2);
        JMenuItem[] second2_1 = new JMenuItem[3];
        for (int i = 0; i < 3; i++) {
            second2_1[i] = new JMenuItem("Пункт2_2_" + (i + 1));
            second2.add(second2_1[i]);
            second2_1[i].addActionListener(this);
        }*/
        myMenuBar.add(menu1); //в строку меню добавляем главные пункты меню
        myMenuBar.add(menu2);
        myMenuBar.add(Box.createHorizontalGlue());
        myMenuBar.add(clear);
        setJMenuBar(myMenuBar); //устанавливаем для окна созданное меню
        /**Box myBox = new Box(BoxLayout.X_AXIS);//создаем компоновку в виде горизонтального ящика
        JButton[] figs = new JButton[5]; //массив кнопок
        for (int i = 0; i < 5; i++) {
//каждая кнопка создается с параметром надписи на ней, надпись берется из перечисления,
//объявленного в классе JMyPanel, values()[i].toString() переводит в текст название i-го
// параметра из Figure
            figs[i] = new JButton(JMyPanel.Figure.values()[i].toString());
            figs[i].addActionListener(this); //добавляем слушатель, который реализуется в конце
//описания класса
            myBox.add(figs[i]);//добавляем кнопку в компоновку
            if (i != 4) { //для всех кнопок кроме последней вставляем пружину после кнопки
                myBox.add(Box.createHorizontalGlue());
            }
        }
        myBox.setAlignmentX(CENTER_ALIGNMENT);//устанавливаем для компоновки выравнивание по центру
//хотя в нашем случае это не важно, т.к. мы используем пружины
        */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add(myBox, BorderLayout.NORTH);
        add(myPanel, BorderLayout.CENTER);
        Dimension size = getSize();//записываем в переменную size текущий размер окна
        size.setSize(size.width+500, size.height + 200);//устанавливаем новый размер окна, увеличивая
//текущий по высоте на 200
        setMinimumSize(size);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { //при нажатии на одну из кнопок
        myPanel.ris(e.getActionCommand());//вызываем метод ris нашей панели (см. JMyPanel.java)
    } //и передаем в качестве параметра название нажатой кнопки (e.getActionCommand())
}