package Kiosk.Version1;


import java.awt.event.*;
import javax.swing.*;

import Kiosk.Version1.ImageExample;

import java.awt.*;
 
public class BhcLogo extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
    private Image background=new ImageIcon(ImageExample.class.getResource("../image/logo300.jpg")).getImage();//배경이미지
	/*생성자*/
	
	
	public void homeframe() {
		setTitle("Chicken");//타이틀
		setSize(400,400);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);//창이 가운데 나오게
		setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		setVisible(true);//창이 보이게
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		
	;
				 
	}
	public void paint(Graphics g) {//그리는 함수
		g.drawImage(background, 0, 0, null);//background를 그려줌
	}  
 
    public BhcLogo() {
        icon = new ImageIcon("c:\\bhc.png");
       
        //배경 Panel 생성후 컨텐츠페인으로 지정      
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                // Approach 1: Dispaly image at at full size
                g.drawImage(icon.getImage(), 0, 0, null);
                // Approach 2: Scale image to size of component
                // Dimension d = getSize();
                // g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                // Approach 3: Fix the image position in the scroll pane
                // Point p = scrollPane.getViewport().getViewPosition();
                // g.drawImage(icon.getImage(), p.x, p.y, null);
                setOpaque(false); //그림을 표시하게 설정,투명하게 조절
                super.paintComponent(g);
            }
        };
       
       
       
        JButton button = new JButton("매장");
        background.add(button);
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
        JButton a = new JButton("포장");
        a.setBounds(30, 30, 30, 30);
      
        
        background.add(a);
     
        
        a.setSize(400,500);
        a.setLayout(null);
    
    }
 
    
    public static void main(String[] args) {
        BhcLogo frame = new BhcLogo();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
