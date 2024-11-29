package tabs;


import javafx.scene.control.Tab;

public class StatisticsTab extends Tab {

    private static StatisticsTab instance;

    public StatisticsTab() {
        this.setText("Statistics");
    }

    public static StatisticsTab getInstance() {
        if(instance == null){
            instance = new StatisticsTab();
        }
        return instance;
    }
}