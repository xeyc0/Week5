package ch.zhaw.iwi.devops.model.interactionelement.button;

import java.util.ArrayList;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ButtonSelectionElementValue.class)
public abstract class ButtonSelectionElementValue_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<ButtonSelectionElementValue, String> name;
	public static volatile SingularAttribute<ButtonSelectionElementValue, String> icon;
	public static volatile SingularAttribute<ButtonSelectionElementValue, ArrayList> details;
	public static volatile SingularAttribute<ButtonSelectionElementValue, String> value;
	public static volatile SingularAttribute<ButtonSelectionElementValue, ButtonSelectionElement> buttonSelectionElement;

	public static final String NAME = "name";
	public static final String ICON = "icon";
	public static final String DETAILS = "details";
	public static final String VALUE = "value";
	public static final String BUTTON_SELECTION_ELEMENT = "buttonSelectionElement";

}

