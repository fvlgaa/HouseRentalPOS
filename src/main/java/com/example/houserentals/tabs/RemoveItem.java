package tabs;


import javafx.scene.control.Tab;

public class RemoveItem extends Tab {

    private static RemoveItem instance;

    public RemoveItem() {
        this.setText("Remove Item");
    }

    public static RemoveItem getInstance() {
        if(instance == null){
            instance = new RemoveItem();
        }
        return instance;
    }
}
