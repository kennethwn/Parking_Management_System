package com.mycompany.parkingmanagement;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

interface cta {
  void changeColor(JPanel hover, Color rand);
  void changeColor(JLabel label, Color rand);
}

public class CtaButton implements cta {
  @Override
  public void changeColor(JPanel hover, Color rand) {
    hover.setBackground(rand);
  }
  
  @Override
  public void changeColor(JLabel label, Color rand) {
    label.setBackground(rand);
  }
}
