package ch.zhaw.iwi.devops.model.patient;

import ch.zhaw.iwi.devops.model.sport.Sport;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Patient.class)
public abstract class Patient_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<Patient, String> firstName;
	public static volatile SingularAttribute<Patient, String> lastName;
	public static volatile SingularAttribute<Patient, String> currentJob;
	public static volatile SetAttribute<Patient, Sport> sports;
	public static volatile SingularAttribute<Patient, String> originalJob;
	public static volatile SingularAttribute<Patient, String> highestEducation;
	public static volatile SingularAttribute<Patient, String> email;
	public static volatile SingularAttribute<Patient, Long> numberOfPersonsInHousehold;
	public static volatile SingularAttribute<Patient, CivilStatusEnum> civilStatus;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String CURRENT_JOB = "currentJob";
	public static final String SPORTS = "sports";
	public static final String ORIGINAL_JOB = "originalJob";
	public static final String HIGHEST_EDUCATION = "highestEducation";
	public static final String EMAIL = "email";
	public static final String NUMBER_OF_PERSONS_IN_HOUSEHOLD = "numberOfPersonsInHousehold";
	public static final String CIVIL_STATUS = "civilStatus";

}

