package ch.zhaw.iwi.devops.model.questionnaireresponse;

import ch.zhaw.iwi.devops.model.interactionelement.button.ButtonSelectionElementValue;
import ch.zhaw.iwi.devops.model.patient.Patient;
import ch.zhaw.iwi.devops.model.questionnaire.Questionnaire;
import ch.zhaw.iwi.devops.model.questionnaireresponse.value.InteractionElementValue;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(QuestionnaireResponse.class)
public abstract class QuestionnaireResponse_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<QuestionnaireResponse, Date> date;
	public static volatile SingularAttribute<QuestionnaireResponse, Questionnaire> questionnaire;
	public static volatile SetAttribute<QuestionnaireResponse, ButtonSelectionElementValue> selectedButtonSelectionElementValues;
	public static volatile SingularAttribute<QuestionnaireResponse, Patient> patient;
	public static volatile ListAttribute<QuestionnaireResponse, InteractionElementValue> values;

	public static final String DATE = "date";
	public static final String QUESTIONNAIRE = "questionnaire";
	public static final String SELECTED_BUTTON_SELECTION_ELEMENT_VALUES = "selectedButtonSelectionElementValues";
	public static final String PATIENT = "patient";
	public static final String VALUES = "values";

}

