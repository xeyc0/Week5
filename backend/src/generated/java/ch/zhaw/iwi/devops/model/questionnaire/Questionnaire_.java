package ch.zhaw.iwi.devops.model.questionnaire;

import ch.zhaw.iwi.devops.model.interactionstep.InteractionStep;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Questionnaire.class)
public abstract class Questionnaire_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<Questionnaire, String> name;
	public static volatile SingularAttribute<Questionnaire, String> icon;
	public static volatile SingularAttribute<Questionnaire, Boolean> active;
	public static volatile SingularAttribute<Questionnaire, InteractionStep> firstInteractionStep;
	public static volatile SingularAttribute<Questionnaire, Boolean> patientRequired;

	public static final String NAME = "name";
	public static final String ICON = "icon";
	public static final String ACTIVE = "active";
	public static final String FIRST_INTERACTION_STEP = "firstInteractionStep";
	public static final String PATIENT_REQUIRED = "patientRequired";

}

