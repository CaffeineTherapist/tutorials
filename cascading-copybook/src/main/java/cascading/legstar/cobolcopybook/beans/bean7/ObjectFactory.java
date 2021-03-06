package cascading.legstar.cobolcopybook.beans.bean7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean7 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory
  {

  private final static QName _Kcp01V05AccountDetails_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean7", "kcp01V05AccountDetails" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean7
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp01V05BankAccountData }
   */
  public Kcp01V05BankAccountData createKcp01V05BankAccountData()
    {
    return new Kcp01V05BankAccountData();
    }

  /**
   * Create an instance of {@link Kcp01V05NationalInsuranNo1 }
   */
  public Kcp01V05NationalInsuranNo1 createKcp01V05NationalInsuranNo1()
    {
    return new Kcp01V05NationalInsuranNo1();
    }

  /**
   * Create an instance of {@link Kcp01V05NationalInsuranNo2 }
   */
  public Kcp01V05NationalInsuranNo2 createKcp01V05NationalInsuranNo2()
    {
    return new Kcp01V05NationalInsuranNo2();
    }

  /**
   * Create an instance of {@link Kcp01V05AccountDetails }
   */
  public Kcp01V05AccountDetails createKcp01V05AccountDetails()
    {
    return new Kcp01V05AccountDetails();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp01V05AccountDetails }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean7", name = "kcp01V05AccountDetails")
  public JAXBElement<Kcp01V05AccountDetails> createKcp01V05AccountDetails( Kcp01V05AccountDetails value )
    {
    return new JAXBElement<Kcp01V05AccountDetails>( _Kcp01V05AccountDetails_QNAME, Kcp01V05AccountDetails.class, null, value );
    }

  }
