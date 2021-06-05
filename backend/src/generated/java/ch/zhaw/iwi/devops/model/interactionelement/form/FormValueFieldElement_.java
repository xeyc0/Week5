package ch.zhaw.iwi.devops.model.interactionelement.form;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FormValueFieldElement.class)
public abstract class FormValueFieldElement_ extends ch.zhaw.iwi.devops.model.interactionelement.InteractionElement_ {

	public static volatile SingularAttribute<FormValueFieldElement, Boolean> visible;
	public static volatile SingularAttribute<FormValueFieldElement, String> exportKey;
	public static volatile SingularAttribute<FormValueFieldElement, String> name;
	public static volatile SingularAttribute<FormValueFieldElement, Integer> width;
	public static volatile SingularAttribute<FormValueFieldElement, Boolean> labelVisible;
	public static volatile SingularAttribute<FormValueFieldElement, Boolean> required;

	public static final String VISIBLE = "visible";
	public static final String EXPORT_KEY = "exportKey";
	public static final String NAME = "name";
	public static final String WIDTH = "width";
	public static final String LABEL_VISIBLE = "labelVisible";
	public static final String REQUIRED = "required";

}

