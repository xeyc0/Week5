package ch.zhaw.iwi.devops.model.file;

import ch.zhaw.iwi.devops.model.questionnaireresponse.value.InteractionElementFileValue;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(File.class)
public abstract class File_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<File, Long> size;
	public static volatile SingularAttribute<File, String> name;
	public static volatile SingularAttribute<File, String> mimetype;
	public static volatile SingularAttribute<File, byte[]> content;
	public static volatile SingularAttribute<File, InteractionElementFileValue> interactionElementFileValue;

	public static final String SIZE = "size";
	public static final String NAME = "name";
	public static final String MIMETYPE = "mimetype";
	public static final String CONTENT = "content";
	public static final String INTERACTION_ELEMENT_FILE_VALUE = "interactionElementFileValue";

}

