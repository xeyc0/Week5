package ch.zhaw.iwi.devops.model.interactionelement.button;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ButtonSelectionElement.class)
public abstract class ButtonSelectionElement_ extends ch.zhaw.iwi.devops.model.interactionelement.InteractionElement_ {

	public static volatile SingularAttribute<ButtonSelectionElement, String> color;
	public static volatile SingularAttribute<ButtonSelectionElement, String> exportKey;
	public static volatile SetAttribute<ButtonSelectionElement, ButtonSelectionElementValue> values;
	public static volatile SingularAttribute<ButtonSelectionElement, String> name;
	public static volatile SingularAttribute<ButtonSelectionElement, String> tooltip;
	public static volatile SingularAttribute<ButtonSelectionElement, String> icon;
	public static volatile SingularAttribute<ButtonSelectionElement, Integer> width;
	public static volatile SingularAttribute<ButtonSelectionElement, String> valueDescription;
	public static volatile SingularAttribute<ButtonSelectionElement, String> value;

	public static final String COLOR = "color";
	public static final String EXPORT_KEY = "exportKey";
	public static final String VALUES = "values";
	public static final String NAME = "name";
	public static final String TOOLTIP = "tooltip";
	public static final String ICON = "icon";
	public static final String WIDTH = "width";
	public static final String VALUE_DESCRIPTION = "valueDescription";
	public static final String VALUE = "value";

}

