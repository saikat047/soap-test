package org.fun.test;

import org.fun.test.generated.Person;
import org.fun.test.generated.PersonManager;
import org.fun.test.generated.PersonManager_Service;

/**
 * @author <a href="mailto:saikat@escenic.com">Kazi Abdullah Saikat</a>
 * @version $Revision: #4 $ $Date: 2008/04/22 $
 */
public class PersonManagerClient {

  // @WebServiceRef(wsdlLocation="http://localhost:8080/helloservice/hello?wsdl")

  public static void main(String [] argv) throws Exception {
    final PersonManager personManager = new PersonManager_Service().getPersonManagerPort();
    System.out.println("personManager = " + personManager);
    final Person person = personManager.getPerson(123);
    System.out.println("person = " + person);
    System.out.println("personManager.getClass() = " + personManager.getClass());
  }
}
