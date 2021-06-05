package ch.zhaw.iwi.devops.model.questionnaireresponse.value;

import ch.zhaw.iwi.devops.model.interactionelement.InteractionElement;
import ch.zhaw.iwi.devops.model.questionnaireresponse.QuestionnaireResponse;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InteractionElementValue.class)
public abstract class InteractionElementValue_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<InteractionElementValue, InteractionElement> interactionElement;
	public static volatile SingularAttribute<InteractionElementValue, QuestionnaireResponse> questionnaireResponse;

	public static final String INTERACTION_ELEMENT = "interactionElement";
	public static final String QUESTIONNAIRE_RESPONSE = "questionnaireResponse";

}

