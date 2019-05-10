package pbaris;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("color-picker")
@HtmlImport("bower_components/color-picker/color-picker.html")
public class ColorPicker extends AbstractSinglePropertyField<ColorPicker, String> {

	private static final PropertyDescriptor<Boolean, Boolean> nativeProperty =
		PropertyDescriptors.propertyWithDefault("native", false);

	private static final PropertyDescriptor<Boolean, Boolean> autoConfirmProperty =
		PropertyDescriptors.propertyWithDefault("autoConfirm", false);

	private static final PropertyDescriptor<Boolean, Boolean> withoutAlphaProperty =
		PropertyDescriptors.propertyWithDefault("withoutAlpha", false);

	private static final PropertyDescriptor<Boolean, Boolean> hideRandomButtonProperty =
		PropertyDescriptors.propertyWithDefault("hideRandomButton", false);

	public ColorPicker() {
		this("#000000");
	}

	public ColorPicker(final String defaultValue) {
		super("value", defaultValue, false);
		getElement().setProperty("format", "hex");
		getElement().setProperty("default", getEmptyValue());
		setAutoConfirm(true);
		setAlpha(false);
		setRandomButtonHidden(true);
	}

	public boolean isNative() {
		return nativeProperty.get(this);
	}

	public void setNative(final boolean useNative) {
		nativeProperty.set(this, useNative);
	}

	public ColorPicker withNative(final boolean useNative) {
		setNative(useNative);
		return this;
	}

	public boolean isAutoConfirm() {
		return autoConfirmProperty.get(this);
	}

	public void setAutoConfirm(final boolean autoConfirm) {
		autoConfirmProperty.set(this, autoConfirm);
	}

	public ColorPicker withAutoConfirm(final boolean autoConfirm) {
		setAutoConfirm(autoConfirm);
		return this;
	}

	public boolean isAlpha() {
		return !withoutAlphaProperty.get(this);
	}

	public void setAlpha(final boolean alpha) {
		withoutAlphaProperty.set(this, !alpha);
	}

	public ColorPicker withAlpha(final boolean alpha) {
		setAlpha(alpha);
		return this;
	}

	public boolean isRandomButtonHidden() {
		return hideRandomButtonProperty.get(this);
	}

	public void setRandomButtonHidden(final boolean hideRandomButton) {
		hideRandomButtonProperty.set(this, hideRandomButton);
	}

	public ColorPicker withRandomButtonHidden(final boolean hideRandomButton) {
		setRandomButtonHidden(hideRandomButton);
		return this;
	}
}
