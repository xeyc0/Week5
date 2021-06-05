package ch.zhaw.iwi.devops.model.interactionelement.button;

import java.util.ArrayList;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ButtonElement.class)
public abstract class ButtonElement_ extends ch.zhaw.iwi.devops.model.interactionelement.InteractionElement_ {

	public static volatile SingularAttribute<ButtonElement, String> color;
	public static volatile SingularAttribute<ButtonElement, String> exportKey;
	public static volatile SingularAttribute<ButtonElement, String> name;
	public static volatile SingularAttribute<ButtonElement, String> tooltip;
	public static volatile SingularAttribute<ButtonElement, String> icon;
	public static volatile SingularAttribute<ButtonElement, Integer> width;
	public static volatile SingularAttribute<ButtonElement, ArrayList> details;
	public static volatile SingularAttribute<ButtonElement, String> valueDescription;
	public static volatile SingularAttribute<ButtonElement, String> value;

	public static final String COLOR = "color";
	public static final String EXPORT_KEY = "exportKey";
	public static final String NAME = "name";
	public static final String TOOLTIP = "tooltip";
	public static final String ICON = "icon";
	public static final String WIDTH = "width";
	public static final String DETAILS = "details";
	public static final String VALUE_DESCRIPTION = "valueDescription";
	public static final String VALUE = "value";

}

