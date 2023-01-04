package com.mycompany.parkingmanagement;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

interface Style {
  void changeColor(JPanel hover, Color rand);
  void changeColor(JLabel label, Color rand);
  public void boldingFont(JLabel text);
  public void unboldFont(JLabel text);
}

public class StyleGuide implements Style {
  private Font f;
  
  @Override
  public void changeColor(JPanel hover, Color rand) {
    hover.setBackground(rand);
  }
  
  @Override
  public void changeColor(JLabel label, Color rand) {
    label.setForeground(rand);
  }
  
  public void changePanel(JPanel panel, JPanel target) {
    // remove current panel
    panel.removeAll();
    panel.repaint();
    panel.revalidate();
    // add panel
    panel.add(target);
    panel.repaint();
    panel.revalidate();
  }
  
  @Override
  public void boldingFont(JLabel text) {
    f = text.getFont();
    text.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
  }
  
  @Override
  public void unboldFont(JLabel text) {
    f = text.getFont();
    text.setFont(f.deriveFont(f.getStyle() | ~Font.BOLD));
  }
}
