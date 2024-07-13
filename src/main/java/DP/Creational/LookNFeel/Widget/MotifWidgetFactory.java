package DP.Creational.LookNFeel.Widget;

import DP.Creational.LookNFeel.ScrollBar.MotifScrollBar;
import DP.Creational.LookNFeel.ScrollBar.ScrollBar;
import DP.Creational.LookNFeel.Window.MotifWindow;
import DP.Creational.LookNFeel.Window.Window;

public class MotifWidgetFactory extends WidgetFactory{
    @Override
    ScrollBar CreateScrollBar() {
        return new MotifScrollBar();
    }

    @Override
    Window CreateWindow() {
        return new MotifWindow();
    }
}
