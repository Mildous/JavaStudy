package test;

import java.awt.Font;
import java.util.Enumeration;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class test1 {

	public static void main(String[] args) {
		// 모든 글꼴 통일
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("굴림", Font.PLAIN, 14));
        }
 
        // 프레임 생성
        JFrame frm = new JFrame();
 
        // 프레임 제목 설정
        frm.setTitle("슬라임 퇴치하기");
 
        // 프레임 크기 설정
        frm.setSize(350, 300);
 
        // 프레임을 화면 가운데에 배치
        frm.setLocationRelativeTo(null);
 
        // 프레임을 닫았을 때 프로그램이 종료되도록 설정
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // 레이아웃 설정
        frm.getContentPane().setLayout(null);
 
        // 버튼 생성
        JButton btn1 = new JButton("슬라삐");
        JButton btn2 = new JButton("슬라디");
 
        // 버튼 위치와 크기 설정
        btn1.setBounds(30, 170, 122, 30);
        btn2.setBounds(182, 170, 122, 30);
 
        // 프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);
        frm.getContentPane().add(btn2);
 
        // 라벨 설정
        JLabel lbl = new JLabel();
        lbl.setBounds(30, 200, 274, 50);
        lbl.setText("게임을 시작합니다");
        lbl.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 정렬
        frm.getContentPane().add(lbl);
 
        // 버튼이 눌렸을때
        btn1.addActionListener(event -> {
            lbl.setText("나는 슬라삐");
        });
 
        btn2.addActionListener(event -> {
            lbl.setText("나는 슬라디");
        });
 
        // 라벨 생성
        JLabel imgLbl = new JLabel();
 
        // 라벨에 넣을 아이콘 생성
        //ImageIcon bsImg = new ImageIcon(test1.class.getResource("/study/img/slime(blue).png"));
 
        // 라벨에 아이콘 설정
        //imgLbl.setIcon(bsImg);
 
        // 기타 설정
        imgLbl.setBounds(30, 30, 122, 130);
        imgLbl.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(imgLbl);
 
        // ★ 라벨2 생성
        JLabel imgLbl2 = new JLabel();
 
        // ★ 라벨2에 아이콘 설정
        //imgLbl2.setIcon(bsImg);
 
        // ★ 기타 설정
        imgLbl2.setBounds(182, 30, 122, 130);
        imgLbl2.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(imgLbl2);
 
        // 프레임이 보이도록 설정
        frm.setVisible(true);

	}

}
