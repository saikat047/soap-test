package org.fun.test;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;

/**
 * @author <a href="mailto:saikat@escenic.com">Kazi Abdullah Saikat</a>
 * @version $Revision: #4 $ $Date: 2008/04/22 $
 */
@WebService(serviceName = "person-manager")
public class PersonManager {

  @WebMethod
  public Person getPerson(final int personId) {
    Person person = new Person();
    person.setPersonId(personId);
    person.setFirstName("Saikat");
    person.setLastName("Family: " + System.currentTimeMillis());
    person.setDateOfBirth(new Date());
    return person;
  }
}
