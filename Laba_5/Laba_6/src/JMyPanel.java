import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class JMyPanel extends JPanel { // наш класс является наследником класса JPanel
    //создаем перечисление используемых параметров
    public static enum Figure {LINE, OVAL, RECT, ROUNDRECT, CLEAR}

    private Figure vibor = Figure.CLEAR; //объявляем переменную типа созданного перечисления

    //и присваиваем ей значение CLEAR
    public JMyPanel() {
    } //конструктор нашего класса

    public void ris(String s) {//метод, вызов которого приводит к перерисовке панели
//параметр s принимает значение во время вызова данного метода (см. MyGraph.java)
        vibor = Figure.valueOf(s); //устанавливаем, что нужно нарисовать
        repaint(); //перерисовываем нашу панель, т.е. вызываем метод paintComponent
    }

    public void paintComponent(Graphics gr){
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D)gr;
        BasicStroke pen;//создаем перо, параметры которого будут определять стиль линий
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        switch (vibor){
            case LINE:
//определяем перо толщиной 20 точек, с закругленными концами линий и закругленными стыками линий
                pen=new BasicStroke(20,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
                g.setStroke(pen);//делаем текущим пером созданное нами
                g.setColor(Color.blue);//задаем цвет пера
                g.drawLine(20, 20, 100, 100); break;
            case OVAL:
//задаем массив, определяющий вид линии
// элементы массива с четными индексами задают длину штриха в пикселах, элементы с нечетными
//индексами — длину промежутка; массив перебирается циклически;
                float[] dash = {10, 30};
//определяем перо толщиной 10 точек, с квадратными концами линий, закругленными стыками линий,
//расстоянием в 10 точек, с которого начинает действовать закругление, массив, определяющий вид
//линии, и с какого элемента массива начинать узор
                pen=new BasicStroke(10,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_ROUND,10, dash,0 );
                g.setStroke(pen);
                g.setColor(Color.red);
//устанавливаем стиль заливки, в качестве параметра задаем градиент от красного к зеленому,
//30, 30 – начальная точка первого цвета, 50, 50 – начальная точка второго цвета, true –
//цикличность градиента
                g.setPaint(new GradientPaint(30, 30, Color.red, 50, 50, Color.green, true));
//g.fill – создание объекта с заливкой, в качестве параметра задается объект из пакета Graphics2D,
//в нашем случае – эллипс
                g.fill(new Ellipse2D.Double(20, 20, 100, 100)); break;
            case RECT:
                float[] dash2 = {20, 20};
                pen=new BasicStroke(5,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_BEVEL,1, dash2,0 );
                g.setStroke(pen);
                g.setColor(Color.magenta);
                g.drawRect(20, 20, 100, 100); break;
            case ROUNDRECT:
                float[] dash3 = {20, 20,2,20,2,20};
                pen=new BasicStroke(10,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL,1, dash3,0 );
                g.setStroke(pen);
                g.setColor(Color.yellow);
                g.drawRoundRect(20, 20, 100, 100,60,60); break;
            case CLEAR: g.clearRect(0, 0, getSize().width, getSize().height);break;
        }
    }

}