package Hotel.hibernate;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class Interface {
    private int mode;
    // Объявления графических компонентов
    private JFrame FrameOrder;
    private DefaultTableModel model;
    private JButton adding;
    private JButton Edit;
    private JButton remove;
    private JToolBar toolBar;
    private JScrollPane scroll;
    private JTable Posts;
    private JComboBox Mode;
    private JTextField Searcher;
    private JButton filter;

    public void show() {
// Создание окна
        FrameOrder = new JFrame("Hotel");
        FrameOrder.setSize(1024, 680);
        FrameOrder.setLocation(100, 100);
        FrameOrder.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
// Создание кнопок и прикрепление иконок
        adding = new JButton(new ImageIcon("./img/add.png"));
        Edit = new JButton(new ImageIcon("./img/edit.png"));
        remove = new JButton(new ImageIcon("./img/remove.png"));

// Настройка подсказок для кнопок
        adding.setToolTipText("Add");
        Edit.setToolTipText("Edit");
        remove.setToolTipText("Delete");
// Добавление кнопок на панель инструментов
        toolBar = new JToolBar("Панель инструментов");
        toolBar.add(adding);
        toolBar.add(Edit);
        toolBar.add(remove);

// Размещение панели инструментов
        FrameOrder.setLayout(new BorderLayout());
        FrameOrder.add(toolBar, BorderLayout.NORTH);
// Создание таблицы с данными
        String [] columns = {"Worker ID", "Name", "Surname", "Date of birth", "Position", "Experience"};
        String [][] data = {

                {"1", "Alex", "Ovechkin", "1980-03-12", "Director", "15"},
                {"2", "Artem", "Volkov", "1965-08-29", "Concierge", "31"},
                {"3", "Olga", "Belova", "2000-10-01", "Maid", "3"},
                {"4", "Irina", "Dubova", "1995-12-31", "Manager", "2"},
                {"5", "Uriy", "Gusman", "1955-06-14", "Manager", "14"}


        };
        model= new DefaultTableModel(data, columns);
        Posts = new JTable(model);
        scroll = new JScrollPane(Posts);
// Размещение таблицы с данными
        FrameOrder.add(scroll, BorderLayout.CENTER);
// Подготовка компонентов поиска
        Mode = new JComboBox(new String[]{"Workers", "Clients", "Rooms", "Reports"});
        Searcher = new JTextField("Search");
        filter = new JButton("Change");
// Добавление компонентов на панель
        JPanel filterPanel = new JPanel();
        filterPanel.add(Mode);
        filterPanel.add(Searcher);
        filterPanel.add(filter);
// Размещение панели поиска внизу окна
        FrameOrder.add(filterPanel, BorderLayout.EAST);
// Визуализация экранной формы
        FrameOrder.setVisible(true);
        filter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Searcher, "Проверка");
            }
        });
        adding.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(adding, "Add new Worker?");
                model.addRow(new Object[]{"6", "Dmitriy", "Tutov", "1977-02-19", "Manager", "7"});
            }
        });
        Edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Edit, "Choose Worker to Edit");
            }
        });
        filter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameOrder.dispose();
                new SecondFrame();
            }
        });
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Posts.getSelectedRow() != -1){
                    model.removeRow(Posts.getSelectedRow());
                    JOptionPane.showMessageDialog(remove, "Row Removed!");
                }
                else{
                    JOptionPane.showMessageDialog(remove, "You Need to select row first");
                }
            }
        });
    }

    public static void main(String[] args) {

// Создание и отображение экранной формы
        new Interface().show();
    }
}

