package org.fun.test;

import java.util.Date;

/**
 * @author <a href="mailto:saikat@escenic.com">Kazi Abdullah Saikat</a>
 * @version $Revision: #4 $ $Date: 2008/04/22 $
 */
public class Person {

  private long personId;
  private String firstName;
  private String lastName;
  private Date dateOfBirth;

  public long getPersonId() {
    return personId;
  }

  public void setPersonId(final long pPersonId) {
    personId = pPersonId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String pFirstName) {
    firstName = pFirstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String pLastName) {
    lastName = pLastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(final Date pDateOfBirth) {
    dateOfBirth = pDateOfBirth;
  }
}
