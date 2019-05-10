package pbaris;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {

		NumberField radiusField = new NumberField();
		ColorPicker colorPicker = new ColorPicker().withAlpha(true);

    	Circle circle = new Circle();
		Binder<Circle> binder = new Binder<>(Circle.class);
		binder.bind(radiusField, "radius");
		binder.bind(colorPicker, "color");
		binder.addValueChangeListener(e -> System.out.println(circle));
		binder.setBean(circle);

		add(radiusField);
		add(colorPicker);

		add(new HorizontalLayout(
			createButton("Toggle Native", event -> colorPicker.setNative(!colorPicker.isNative())),
			createButton("Toggle AutoConfirm", event -> colorPicker.setAutoConfirm(!colorPicker.isAutoConfirm())),
			createButton("Toggle Alpha", event -> colorPicker.setAlpha(!colorPicker.isAlpha()))
		));
    }

    private Button createButton(final String text, ComponentEventListener<ClickEvent<Button>> listener) {
    	Button button = new Button(text);
    	if (listener != null) {
			button.addClickListener(listener);
		}
    	return button;
	}
}
