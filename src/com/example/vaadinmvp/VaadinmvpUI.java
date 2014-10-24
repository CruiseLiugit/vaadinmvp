package com.example.vaadinmvp;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("vaadinmvp")
public class VaadinmvpUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		// Have a Panel where to put the custom layout.
		Panel panel = new Panel("Login");
		panel.setSizeUndefined();
		panel.setWidth(400, Unit.PIXELS);
		this.setContent(panel);


		// Create custom layout from "layoutname.html" template.
		CustomLayout custom = new CustomLayout("loginlayout");
		//custom.addStyleName("customlayoutexample");


		// Use it as the layout of the Panel.
		panel.setContent(custom);


		// Create a few components and bind them to the location tags
		// in the custom layout.
		TextField username = new TextField();
		custom.addComponent(username, "username");


		TextField password = new TextField();
		custom.addComponent(password, "password");


		Button ok = new Button("Login");
		custom.addComponent(ok, "okbutton");
	}

}