package org.fun.test;

import org.w3c.dom.*;
import org.w3c.dom.Node;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.net.URL;

/**
 * @author <a href="mailto:saikat@escenic.com">Kazi Abdullah Saikat</a>
 * @version $Revision: #4 $ $Date: 2008/04/22 $
 */
public class SOAPClient {

  public static void main(String [] argv) throws Exception {
    final SOAPConnectionFactory connFactory = SOAPConnectionFactory.newInstance();
    System.out.println("connFactory = " + connFactory);
    final SOAPConnection connection = connFactory.createConnection();
    System.out.println("connection = " + connection);
    final MessageFactory messageFactory = MessageFactory.newInstance();
    System.out.println("messageFactory = " + messageFactory);
    final SOAPMessage message = createMessage(messageFactory);
    System.out.println("message = " + message);
    final URL personManagerURL = new URL("http://localhost:8080/web-services-webapp/person-manager");
    final SOAPMessage responseMessage = connection.call(message, personManagerURL);
    dumpResponse(responseMessage);
  }

  private static void dumpResponse(final SOAPMessage message) throws Exception {
    System.out.println("responseMessage = " + message);
    final SOAPHeader soapHeader = message.getSOAPHeader();
    System.out.println("soapHeader = " + soapHeader);
    final SOAPPart soapPart = message.getSOAPPart();
    System.out.println("soapPart = " + soapPart);
    final SOAPBody soapBody = message.getSOAPBody();
    System.out.println("soapBody = " + soapBody);
    final SOAPFault fault = soapBody.getFault();
    if (fault != null) {
      System.out.println("soapBody.getFault() = " + fault.getFaultCode());
      System.out.println("soapBody.getFault() = " + fault.getFaultString());
    } else {
      printRecurssive(soapBody.getChildNodes(), "");
    }
  }

  private static void printRecurssive(final NodeList nodeList, final String prefix) {
    for (int i = 0; i < nodeList.getLength(); i++) {
      Node element = nodeList.item(i);
      if (element.getNodeType() != Node.TEXT_NODE) {
        System.out.print(prefix + "<" + element.getNodeName() + ">");
      }
      if (element.hasChildNodes()) {
        final NodeList lovelyChildren = element.getChildNodes();
        if (lovelyChildren.getLength() > 1 && lovelyChildren.item(0).getNodeType() != Node.TEXT_NODE) {
          System.out.println();
        }
        printRecurssive(lovelyChildren, prefix + "  ");
      } else {
        System.out.print(element.getNodeValue());
      }
      if (element.getNodeType() != Node.TEXT_NODE) {
        System.out.println("</" + element.getNodeName() + ">");
      }
    }
  }



  /*
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                      xmlns:test="http://test.fun.org/">
       <soapenv:Header/>
       <soapenv:Body>
          <test:getPerson>
             <arg0>20</arg0>
          </test:getPerson>
       </soapenv:Body>
    </soapenv:Envelope>
   */
  private static SOAPMessage createMessage(final MessageFactory pMessageFactory) throws SOAPException {
    final SOAPMessage message = pMessageFactory.createMessage();
    final SOAPBody soapBody = message.getSOAPBody();
    System.out.println("[source] soapBody = " + soapBody);
    final QName getPersonQName = new QName("http://test.fun.org/", "getPerson");
    final SOAPElement soapElement = soapBody.addBodyElement(getPersonQName);
    /*soapElement.addChildElement(new QName("", "arg0"))
            .addTextNode("20");*/
    return message;
  }
}
