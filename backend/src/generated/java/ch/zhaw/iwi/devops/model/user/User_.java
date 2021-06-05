package ch.zhaw.iwi.devops.model.user;

import ch.zhaw.iwi.devops.model.user.permission.PermissionRole;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ extends ch.zhaw.iwi.devops.model.AbstractEntity_ {

	public static volatile SingularAttribute<User, String> firstName;
	public static volatile SingularAttribute<User, String> lastName;
	public static volatile SingularAttribute<User, String> comments;
	public static volatile SingularAttribute<User, Date> evtCreationDate;
	public static volatile SingularAttribute<User, Date> evtClosingDate;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SetAttribute<User, PermissionRole> permissionRoles;
	public static volatile SingularAttribute<User, byte[]> encryptedPassword;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String COMMENTS = "comments";
	public static final String EVT_CREATION_DATE = "evtCreationDate";
	public static final String EVT_CLOSING_DATE = "evtClosingDate";
	public static final String EMAIL = "email";
	public static final String PERMISSION_ROLES = "permissionRoles";
	public static final String ENCRYPTED_PASSWORD = "encryptedPassword";

}

