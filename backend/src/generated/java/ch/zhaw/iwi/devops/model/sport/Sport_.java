package ch.zhaw.iwi.devops.model.sport;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Sport.class)
public abstract class Sport_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<Sport, String> name;
	public static volatile SingularAttribute<Sport, String> icon;
	public static volatile SingularAttribute<Sport, String> description;

	public static final String NAME = "name";
	public static final String ICON = "icon";
	public static final String DESCRIPTION = "description";

}

