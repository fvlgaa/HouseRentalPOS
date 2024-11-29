package tabs;

import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class AddItemTab extends Tab {
    private static AddItemTab instance;

    public AddItemTab() {
        this.setText("Add Item");
        BorderPane root = new BorderPane();
        Text sample = new Text("get your bread up lil vro" +
                "");
        root.setCenter(sample);
        this.setContent(root);
    }

    public static AddItemTab getInstance() {
        if(instance == null){
            instance = new AddItemTab();
        }
        return instance;
    }
}


