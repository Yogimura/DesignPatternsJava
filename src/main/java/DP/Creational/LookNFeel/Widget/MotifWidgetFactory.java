package DP.Creational.LookNFeel.Widget;

import DP.Creational.LookNFeel.ScrollBar.MotifScrollBar;
import DP.Creational.LookNFeel.ScrollBar.ScrollBar;
import DP.Creational.LookNFeel.Window.MotifWindow;
import DP.Creational.LookNFeel.Window.Window;

public class MotifWidgetFactory extends WidgetFactory{
    private MotifWidgetFactory instance = null;

    @Override
    ScrollBar CreateScrollBar() {
        return new MotifScrollBar();
    }

    @Override
    Window CreateWindow() {
        return new MotifWindow();
    }

    public MotifWidgetFactory getInstance() {
        if(instance == null) {
            instance = new MotifWidgetFactory();
        }

        return instance;
    }
}
