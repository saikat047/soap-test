package org.fun.test.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for person complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
        "dateOfBirth",
        "firstName",
        "lastName",
        "personId"
})
public class Person {

  protected XMLGregorianCalendar dateOfBirth;
  protected String firstName;
  protected String lastName;
  protected long personId;

  /**
   * Gets the value of the dateOfBirth property.
   *
   * @return possible object is
   *         {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * Sets the value of the dateOfBirth property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setDateOfBirth(XMLGregorianCalendar value) {
    this.dateOfBirth = value;
  }

  /**
   * Gets the value of the firstName property.
   *
   * @return possible object is
   *         {@link String }
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the firstName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setFirstName(String value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the lastName property.
   *
   * @return possible object is
   *         {@link String }
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the lastName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLastName(String value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the personId property.
   */
  public long getPersonId() {
    return personId;
  }

  /**
   * Sets the value of the personId property.
   */
  public void setPersonId(long value) {
    this.personId = value;
  }

  @Override
  public String toString() {
    return "Person{" +
            "dateOfBirth=" + dateOfBirth +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", personId=" + personId +
            '}';
  }
}
