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

public class Speaker2 {

    public static void main(String[] args) {
        Speaker2 s = new Speaker2(Action.POWER_ON);
        s.performAction();

        s = new Speaker2(Action.POWER_OFF);
        s.performAction();

        s = new Speaker2(Action.SOUND_UP);
        s.performAction();

        s = new Speaker2(Action.SOUND_DOWN);
        s.performAction();
    }

    private Action action;

    public Speaker2(Action action) {
        this.action = action;
    }

    void performAction() {
        switch (action) {
            case POWER_ON:
                System.out.println("전원 On");
                break;
            case POWER_OFF:
                System.out.println("전원 Off");
                break;
            case SOUND_UP:
                System.out.println("볼륨 Up");
                break;
            case SOUND_DOWN:
                System.out.println("볼륨 Down");
                break;
            default:
                System.out.println("알 수 없는 동작");
        }
    }

    enum Action {
        POWER_ON,
        POWER_OFF,
        SOUND_UP,
        SOUND_DOWN
    }
}
