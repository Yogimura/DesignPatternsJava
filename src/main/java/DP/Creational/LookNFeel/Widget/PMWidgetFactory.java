package DP.Creational.LookNFeel.Widget;

import DP.Creational.LookNFeel.ScrollBar.PMScrollBar;
import DP.Creational.LookNFeel.ScrollBar.ScrollBar;
import DP.Creational.LookNFeel.Window.PMWindow;
import DP.Creational.LookNFeel.Window.Window;

public class PMWidgetFactory extends WidgetFactory{
    PMWidgetFactory instance = null;

    @Override
    ScrollBar CreateScrollBar() {
        return new PMScrollBar();
    }

    @Override
    Window CreateWindow() {
        return new PMWindow();
    }

    public PMWidgetFactory getInstance() {
        if (instance == null) {
            this.instance = new PMWidgetFactory();
        }

        return instance;
    }
}
