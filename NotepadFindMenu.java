import java.awt.*;
import java.awt.event.*;

public class NotepadFindMenu extends Frame implements ActionListener {
    private TextArea textArea;
    private MenuBar menuBar;
    private Menu fileMenu, editMenu;
    private MenuItem openItem, saveItem, exitItem, findItem;
    private Dialog findDialog;
    private Label findLabel;
    private TextField findTextField;
    private Button findNextButton, findCancelButton;
    private int searchIndex = 0;

    public NotepadFindMenu() {
        super("Notepad");

        // TextArea
        textArea = new TextArea();
        add(textArea, BorderLayout.CENTER);

        // MenuBar
        menuBar = new MenuBar();
        setMenuBar(menuBar);

        // File Menu
        fileMenu = new Menu("File");
        menuBar.add(fileMenu);

        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        exitItem = new MenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Edit Menu
        editMenu = new Menu("Edit");
        menuBar.add(editMenu);

        findItem = new MenuItem("Find");
        editMenu.add(findItem);

        findItem.addActionListener(this);

        // Find Dialog
        findDialog = new Dialog(this, "Find", false);
        findDialog.setLayout(new FlowLayout());
        findDialog.setSize(300, 100);

        findLabel = new Label("Find:");
        findTextField = new TextField(20);
        findNextButton = new Button("Find Next");
        findCancelButton = new Button("Cancel");

        findNextButton.addActionListener(this);
        findCancelButton.addActionListener(this);

        findDialog.add(findLabel);
        findDialog.add(findTextField);
        findDialog.add(findNextButton);
        findDialog.add(findCancelButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == findItem) {
            findDialog.setVisible(true);
        } else if (e.getSource() == findNextButton) {
            String text = textArea.getText();
            String searchStr = findTextField.getText().toLowerCase();
            String searchText = text.toLowerCase();
            int index = searchText.indexOf(searchStr, searchIndex);

            if (index == -1) {
                // Not found, show a dialog
                Dialog notFoundDialog = new Dialog(this, "Not Found", true);
                notFoundDialog.setLayout(new FlowLayout());
                notFoundDialog.setSize(200, 100);

                Label notFoundLabel = new Label("Text not found.");
                Button okButton = new Button("OK");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        notFoundDialog.dispose();
                    }
                });

                notFoundDialog.add(notFoundLabel);
                notFoundDialog.add(okButton);
                notFoundDialog.setVisible(true);
            } else {
                // Scroll to the found text
                textArea.requestFocus();
                textArea.select(index, index + searchStr.length());
                searchIndex = index + searchStr.length();
            }
        } else if (e.getSource() == findCancelButton) {
            searchIndex = 0; // Reset the search index
            findDialog.dispose();
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        NotepadFindMenu notepad = new NotepadFindMenu();
        notepad.setSize(800, 600);
        notepad.setVisible(true);
    }
}