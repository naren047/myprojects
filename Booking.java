import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Booking {
    
    public Booking(){
        
        // frame 
        
        JFrame f = new JFrame();
        f.setSize(1050,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
        // top panel
        
        JPanel p = new JPanel();
        Color toppanel = new Color(0,53,128);
        p.setBackground(toppanel);
        p.setSize(800,300);
        ImageIcon icon = new ImageIcon(this.getClass().getClassLoader().getResource("plane.png"));
        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH);   
        icon = new ImageIcon(newimg);
        JLabel title = new JLabel(" Book Flights ",icon,JLabel.CENTER);
        title.setFont(new Font("Inter",Font.BOLD,36));
        title.setForeground(Color.WHITE);
        title.setVerticalAlignment(JLabel.CENTER);
                
        //inner panel
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
                
        
        Color inputgray = new Color(53,54,59);
        Color infogray = new Color(100,100,100);

        //from panel 
        
        JPanel p3 = new JPanel();
        p3.setBackground(Color.LIGHT_GRAY);
        p3.setBounds(50,36,210,80);
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2.add(p3);
        JLabel from = new JLabel("  From");
        from.setForeground(infogray);
        from.setFont(new Font("Inter",Font.BOLD,16));
        p3.add(from);
        JTextField from_input = new JTextField();
        from_input.setFont(new Font("Inter",Font.BOLD,20));
        from_input.setForeground(inputgray);
        from_input.setBounds(64,128,190,30);
        from_input.setBackground(Color.LIGHT_GRAY);
        from_input.setBorder(BorderFactory.createEmptyBorder());
        f.add(from_input);
        
        //to panel
        
        JPanel p4 = new JPanel();
        p4.setBackground(Color.LIGHT_GRAY);
        p4.setBounds(300,36,210,80);
        p4.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2.add(p4);
        JLabel to = new JLabel("  To");
        to.setForeground(infogray);
        to.setFont(new Font("Inter",Font.BOLD,16));
        p4.add(to);
        JTextField to_input = new JTextField();
        to_input.setFont(new Font("Inter",Font.BOLD,20));
        to_input.setForeground(inputgray);
        to_input.setBounds(314,128,190,30);
        to_input.setBackground(Color.LIGHT_GRAY);
        to_input.setBorder(BorderFactory.createEmptyBorder());
        f.add(to_input);
        
        //departure
        
        JPanel p5 = new JPanel();
        p5.setBackground(Color.LIGHT_GRAY);
        p5.setBounds(550,36,210,80);
        p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2.add(p5);
        JLabel departure = new JLabel("  Departure");
        departure.setForeground(infogray);
        departure.setFont(new Font("Inter",Font.BOLD,16));
        p5.add(departure);
        JTextField departure_input = new JTextField();
        departure_input.setFont(new Font("Inter",Font.BOLD,20));
        departure_input.setForeground(inputgray);
        departure_input.setBounds(564,128,190,30);
        departure_input.setBackground(Color.LIGHT_GRAY);
        departure_input.setBorder(BorderFactory.createEmptyBorder());
        f.add(departure_input);
        
        // class
        
        JPanel p6 = new JPanel();
        p6.setBackground(Color.LIGHT_GRAY);
        p6.setBounds(800,36,210,80);
        p6.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2.add(p6);
        JLabel flightclass = new JLabel("  Class");
        flightclass.setForeground(infogray);
        flightclass.setFont(new Font("Inter",Font.BOLD,16));
        p6.add(flightclass);
        String fltclass[] = {"Economy","Business","Premium"};
        JComboBox flightclass_input = new JComboBox(fltclass);
        flightclass_input.setFont(new Font("Inter",Font.BOLD,20));
        flightclass_input.setForeground(inputgray);
        flightclass_input.setBounds(814,128,190,30);
        flightclass_input.setBackground(Color.LIGHT_GRAY);
        DefaultListCellRenderer listrenderer = new DefaultListCellRenderer();
        listrenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        flightclass_input.setRenderer(listrenderer);
        flightclass_input.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        f.add(flightclass_input);
        
        // no. of passengers
        
        JPanel p7 = new JPanel();
        p7.setBackground(Color.LIGHT_GRAY);
        p7.setBounds(50,136,960,80);
        p7.setLayout(new BoxLayout(p7, BoxLayout.X_AXIS));
        p2.add(p7);
        JLabel adults = new JLabel("  Adults");
        adults.setForeground(infogray);
        adults.setFont(new Font("Inter",Font.BOLD,16));
        p7.add(adults);
        p7.add(Box.createGlue());
        p7.add(Box.createGlue());
        JLabel children = new JLabel("  Children");
        children.setForeground(infogray);
        children.setFont(new Font("Inter",Font.BOLD,16));
        p7.add(children);
        p7.add(Box.createGlue());
        p7.add(Box.createGlue());
        JLabel infants = new JLabel("  Infants");
        infants.setForeground(infogray);
        infants.setFont(new Font("Inter",Font.BOLD,16));
        p7.add(infants);
        p7.add(Box.createGlue());
        p7.add(Box.createGlue());
        p7.add(Box.createGlue());
        p7.add(Box.createGlue());
        
        JSpinner adultspinner = new JSpinner();
        adultspinner.setFont(new Font("Inter",Font.BOLD,20));
        adultspinner.setForeground(inputgray);
        adultspinner.setBounds(120,220,130,30);
        adultspinner.setBackground(Color.LIGHT_GRAY);
        adultspinner.setBorder(BorderFactory.createEmptyBorder());
        f.add(adultspinner);
        
        JSpinner childrenspinner = new JSpinner();
        childrenspinner.setFont(new Font("Inter",Font.BOLD,20));
        childrenspinner.setForeground(inputgray);
        childrenspinner.setBounds(380,220,130,30);
        childrenspinner.setBackground(Color.LIGHT_GRAY);
        childrenspinner.setBorder(BorderFactory.createEmptyBorder());
        f.add(childrenspinner);
        
        JSpinner infantspinner = new JSpinner();
        infantspinner.setFont(new Font("Inter",Font.BOLD,20));
        infantspinner.setForeground(inputgray);
        infantspinner.setBounds(630,220,130,30);
        infantspinner.setBackground(Color.LIGHT_GRAY);
        infantspinner.setBorder(BorderFactory.createEmptyBorder());
        f.add(infantspinner);
        
        // search flights
        
        JPanel p8 = new JPanel();
        p8.setBackground(toppanel);
        p8.setBounds(800,196,210,80);
        p8.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(p8);
        JButton search = new JButton("Search Flights");
        search.setPreferredSize(new Dimension(200,70));
        search.setForeground(Color.WHITE);
        search.setFont(new Font("Inter",Font.BOLD,20));
        search.setBackground(toppanel);
        search.setBorderPainted(false);
        search.setFocusPainted(false);
        p8.add(search);
        
        // available flights table
        
        String data[][] ={{"AirIndia","10:00 AM","12:00 AM","5500"},
            {"Vistara","10:30 AM","2:00 PM","6200"},
            {"SpiceJet","12:00 AM","3:45 PM","4500"},
            {"IndiGo","1:00 PM","2:15 PM","3000"},
            {"AirIndia","10:00 AM","12:00 AM","5500"},
            {"Vistara","10:30 AM","2:00 PM","6200"},
            {"SpiceJet","12:00 AM","3:45 PM","4500"},
            {"IndiGo","1:00 PM","2:15 PM","3000"},
            {"AirIndia","10:00 AM","12:00 AM","5500"},
            {"Vistara","10:30 AM","2:00 PM","6200"},
            {"SpiceJet","12:00 AM","3:45 PM","4500"},
            {"IndiGo","1:00 PM","2:15 PM","3000"},
            {"AirIndia","10:00 AM","12:00 AM","5500"},
            {"Vistara","10:30 AM","2:00 PM","6200"},
            {"SpiceJet","12:00 AM","3:45 PM","4500"},
            {"IndiGo","1:00 PM","2:15 PM","3000"}
        }; 
        String columns[] = {"Airlines","Departure","Arrival","Price"};
        JTable table = new JTable(data,columns);
        table.setSize(600,225);
        table.setLocation(50,300);
        table.setBackground(Color.LIGHT_GRAY);
        table.getTableHeader().setFont(new Font("Inter",Font.BOLD,24));
        table.getTableHeader().setBackground(toppanel);
        table.getTableHeader().setForeground(Color.WHITE);
        table.getTableHeader().setBorder(BorderFactory.createLineBorder(toppanel,1));
        table.setRowHeight(40);
        table.setFont(new Font("Inter",Font.BOLD,15));;
        //table.setShowGrid(false);
        //table.setShowVerticalLines(false);
        table.setShowHorizontalLines(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<table.getColumnCount();i++){
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        JScrollPane sp = new JScrollPane(table);
        sp.setSize(table.getSize());
        sp.setLocation(50,300);
        sp.getViewport().setBackground(Color.LIGHT_GRAY);
        sp.setBorder(BorderFactory.createEmptyBorder());
        f.add(sp);
        
        Centerframe cf = new Centerframe();
        cf.center(f);
        p.add(title);
        f.add(p2);
        f.add(p,BorderLayout.NORTH);
        f.setVisible(true);
        f.revalidate();
    }
}
