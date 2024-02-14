package ex01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Speaker extends JFrame {

	private int volume = 0; // 초기 불륨값 설정

	public Speaker() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("전원");

		setLayout(new FlowLayout());

		JButton b1 = new JButton("전원 ON");
		JButton b2 = new JButton("전원 OFF");
		JButton b3 = new JButton("볼륨 UP");
		JButton b4 = new JButton("볼륨 DOWN");

		b1.addActionListener(new PowerOnAction());
		b2.addActionListener(new PowerOffAction());
		b3.addActionListener(new VolumeUpAction());
		b4.addActionListener(new VolumeDownAction());

		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Speaker();
	}

	class PowerOnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("전원을 켭니다.");
		}
	}

	class PowerOffAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("전원을 끕니다.");
		}
	}

	class VolumeUpAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			volume += 1;
			System.out.println("볼륨을 높입니다. 현재 볼륨: " + volume);
		}
	}

	class VolumeDownAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			volume -= 1;
			System.out.println("볼륨을 낮춥니다. 현재 볼륨: " + volume);
		}
	}
}
