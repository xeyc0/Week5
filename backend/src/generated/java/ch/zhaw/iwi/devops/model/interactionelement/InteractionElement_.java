package ch.zhaw.iwi.devops.model.interactionelement;

import ch.zhaw.iwi.devops.model.interactionstep.InteractionStep;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InteractionElement.class)
public abstract class InteractionElement_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<InteractionElement, Boolean> newRow;
	public static volatile SingularAttribute<InteractionElement, InteractionStep> nextInteractionStep;
	public static volatile SingularAttribute<InteractionElement, InteractionStep> interactionStep;
	public static volatile SingularAttribute<InteractionElement, Long> sortOrder;

	public static final String NEW_ROW = "newRow";
	public static final String NEXT_INTERACTION_STEP = "nextInteractionStep";
	public static final String INTERACTION_STEP = "interactionStep";
	public static final String SORT_ORDER = "sortOrder";

}

