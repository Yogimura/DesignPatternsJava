package DP.Creational.LookNFeel.Widget;

import DP.Creational.LookNFeel.Client;
import DP.Creational.LookNFeel.ScrollBar.ScrollBar;
import DP.Creational.LookNFeel.Window.Window;

public abstract class WidgetFactory {
    Client client;
    abstract ScrollBar CreateScrollBar();
    abstract Window CreateWindow();
}
