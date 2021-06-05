package ch.zhaw.iwi.devops.model.user.permission;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PermissionRole.class)
public abstract class PermissionRole_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SetAttribute<PermissionRole, PermissionFunction> permissionFunctions;
	public static volatile SingularAttribute<PermissionRole, String> name;

	public static final String PERMISSION_FUNCTIONS = "permissionFunctions";
	public static final String NAME = "name";

}

