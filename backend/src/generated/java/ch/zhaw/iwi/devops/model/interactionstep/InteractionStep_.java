package ch.zhaw.iwi.devops.model.interactionstep;

import ch.zhaw.iwi.devops.model.interactionelement.InteractionElement;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InteractionStep.class)
public abstract class InteractionStep_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<InteractionStep, String> name;
	public static volatile SetAttribute<InteractionStep, InteractionElement> interactionElements;

	public static final String NAME = "name";
	public static final String INTERACTION_ELEMENTS = "interactionElements";

}

