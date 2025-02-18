import javax.swing.*;
import java.awt.*;

public class MyForm {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyForm().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Máy Tính Đơn Giản");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        // Panel hiển thị biểu thức và kết quả
        JPanel displayPanel = new JPanel(new GridLayout(2, 1));
        JTextField expressionField = new JTextField();
        JTextField resultField = new JTextField();
        expressionField.setEditable(false);
        resultField.setEditable(false);
        expressionField.setFont(new Font("Arial", Font.BOLD, 18));
        resultField.setFont(new Font("Arial", Font.BOLD, 20));
        displayPanel.add(expressionField);
        displayPanel.add(resultField);
        
        // Panel chứa các nút bấm
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "÷",
            "4", "5", "6", "×",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            buttonPanel.add(button);
        }

        // Thêm các panel vào frame
        frame.add(displayPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
}