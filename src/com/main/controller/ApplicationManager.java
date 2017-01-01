package com.main.controller;

import com.birosoft.liquid.LiquidLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.main.ui.LoginFrame;
import com.main.ui.SplashScreen;
import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import java.util.Properties;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class ApplicationManager {

    private static LoginFrame mainWindow;

    public ApplicationManager() throws Exception {
        mainWindow = new LoginFrame();
    }

    public void start() {
        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Properties props = new Properties();
                    props.put("logoString", " ");
                    UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
                    SplashScreen splashScreen = new SplashScreen(mainWindow, true);
                    splashScreen.setVisible(true);
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    JDialog.setDefaultLookAndFeelDecorated(true);
                    ApplicationManager applicationManager = new ApplicationManager();
                    applicationManager.start();
                } catch (Exception e) {
                    System.out.println("e = " + e);
                }
            }
        });
    }

    public void exitApplication() {
        System.exit(0);
    }
}
