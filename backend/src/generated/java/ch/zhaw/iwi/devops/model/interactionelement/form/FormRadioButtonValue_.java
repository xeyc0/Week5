package ch.zhaw.iwi.devops.model.interactionelement.form;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FormRadioButtonValue.class)
public abstract class FormRadioButtonValue_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<FormRadioButtonValue, String> name;
	public static volatile SingularAttribute<FormRadioButtonValue, FormRadioButtonListElement> radioButtonList;
	public static volatile SingularAttribute<FormRadioButtonValue, String> value;

	public static final String NAME = "name";
	public static final String RADIO_BUTTON_LIST = "radioButtonList";
	public static final String VALUE = "value";

}

